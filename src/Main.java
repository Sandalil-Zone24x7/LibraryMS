import javax.xml.stream.events.Comment;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        System.out.println("Hello and Welcome!");

        Library library =  Library.getInstance();
        Auth auth = library.getAuthSystem();
        System.out.println("Enter memberId:");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.println("Enter password:");
        String password = scanner.nextLine();
        Member member = auth.login(name, password);

        //exit if the returned member is null
        if(member == null){
            System.exit(0);
        }
        else if(member.getAuthenticated() && member instanceof Librarian){
            System.out.print("Select the functionality.");
            System.out.println("\n 1.Display Books. \n 2.Check Availability. \n 3.Borrow book.\n 4. Add new member. \n 5. Remove member.");
            Librarian librarian = (Librarian) member;
            LibrarianCommandHandler commandHandler = new LibrarianCommandHandler(librarian);
            commandHandler.execute();
        }
        else if(member.getAuthenticated()){
            System.out.print("Select the functionality.");
            System.out.println("\n 1.Display Books. \n 2.Check Availability. \n 3.Borrow book.");
            CommandHandler commandHandler = new CommandHandler(member);
            commandHandler.execute();
        }
    }
}