import java.util.Scanner;

public class LibrarianCommandHandler extends CommandHandler{
    private Librarian librarian;
    public LibrarianCommandHandler(Librarian librarian) {
        super(librarian);
        this.librarian = librarian;
    }
    public void execute(){

        while(true) {
            //Display commands
            System.out.print("Select the functionality.");
            System.out.println("\n 1. Display Books. \n 2. Check Availability. \n 3. Borrow book.\n 4. Add new member. \n 5. Add new Book.\n 6. Display Members");

            //take the command index as input
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
                case 4:
                    addNewMember();
                    break;
                case 5:
                    addNewBook();
                    break;
                case 6:
                    displayMembers();
                    break;
                default:
                    break;
            }
        }

    }

    public void addNewMember(){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Name:");
        String name = scanner.nextLine();
        System.out.println("Id:");
        int id = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Password:");
        String password = scanner.nextLine();

        librarian.registerNewMember(name, id, password);
    }

    public void addNewBook(){
        //Take information of the book as input
        Scanner scanner = new Scanner(System.in);
        System.out.println("Name of the author:");
        String author = scanner.nextLine();
        System.out.println("Title of the book:");
        String title = scanner.nextLine();
        System.out.println("Book id:");
        int bookId = scanner.nextInt();
        scanner.nextLine();

        librarian.addNewBook(author, title, bookId);
    }
    public void displayMembers(){

        librarian.getListofMembers();
    }



}
