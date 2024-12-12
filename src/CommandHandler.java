import java.util.Scanner;

public class CommandHandler {
    private final Member member;

    public CommandHandler(Member member){
        this.member = member;
    }
    public void execute(){
        while(true) {

            // Display the Menu
            System.out.print("Select the functionality.");
            System.out.println("\n 1.Display Books. \n 2.Check Availability. \n 3.Borrow book.");

            //Handle commands
            Scanner scanner = new Scanner(System.in);
            int command = scanner.nextInt();
            switch (command) {
                case 1:
                    displayListofBooks();
                    break;
                case 2:
                    checkBookAvailbility();
                    break;
                case 3:
                    borrowBook();
                    break;
                default:
                    System.out.println("Invalid command.");
                    break;
            }

        }
    }

    public void displayListofBooks(){
        member.displayListofBooks();
    }

    public void checkBookAvailbility(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the name of the book: ");
        String title = scanner.nextLine();
        member.checkAvailability(title);
    }

    public void borrowBook(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the name of the book: ");
        String name = scanner.nextLine();
        member.checkoutBook(name);
    }
}
