import java.util.Scanner;

public class CommandHandler {
    private Member member;

    public CommandHandler(Member member){
        this.member = member;
    }
    public void execute(){

        Scanner scanner = new Scanner(System.in);
        int command = scanner.nextInt();
        switch (command) {
            case 1:
                member.displayListofBooks();
                break;
            case 2:
                System.out.print("Enter the name of the book: ");
                int id = scanner.nextInt();
                member.checkAvailability(id);
                break;
            default:
                System.out.println("Invalid command.");
                break;
        }


    }
}
