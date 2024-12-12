import javax.xml.stream.events.Comment;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        System.out.println("Hello and Welcome!");
        Library library =  Library.getInstance();

        //Authenticate User
        Auth auth = library.getAuthSystem();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter memberId:");
        int memberId = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter password:");
        String password = scanner.nextLine();

        //Authenticate
        Member member = auth.authenticate(memberId, password);

        //exit if the returned member is null
        if(member == null){
            System.exit(0);
        }
        else if(member.getAuthenticated() && member instanceof Librarian){
            Librarian librarian = (Librarian) member;
            LibrarianCommandHandler commandHandler = new LibrarianCommandHandler(librarian);
            commandHandler.execute();
        }
        else if(member.getAuthenticated()){

            CommandHandler commandHandler = new CommandHandler(member);
            commandHandler.execute();
        }


    }
}