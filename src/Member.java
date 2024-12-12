import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class Member extends Person{
    private ArrayList<Book> books;
    private String password;
    private int memberId;
    private ArrayList<Borrowing> borrowedBooks;
    private boolean authenticated;

    public Member(String name, int memberId, String password){
        super(name);
        this.memberId = memberId;
        this.password = password;
        this.authenticated = false;
        this.borrowedBooks = new ArrayList<Borrowing>();
    }

    @Override
    public String toString() {
        return "Name: " + getName() + ", Id: " + getMemberId();
    }

    public void setPassword(String password){
        this.password  = password;
    }
    public String getPassword(){
        return this.password;

    }
    public int getMemberId(){
        return this.memberId;
    }
    public void setAuthenticated(boolean status){
        this.authenticated = true;
    }

    public boolean getAuthenticated(){
        return this.authenticated;
    }
    //checkout a book from the library
    public void checkoutBook(String name){
        boolean available = checkAvailability(name);
        Library library = Library.getInstance();

        if(!available){
            System.out.println("The book is currently unavailable.");
        }else{
            System.out.println("Press 1 to Confirm borrowing.");
            Scanner scanner = new Scanner(System.in);
            int confirmed = scanner.nextInt();
            if(confirmed == 1) {
                System.out.println("You borrowed the book:" + name);
                Book checkoutBook = library.getBook(name);
                checkoutBook.decrementBookCount(name);
                addToBorrowedBook(new Borrowing(LocalDate.now(), checkoutBook));
            }
            else{
                System.out.println("Exiting.");
            }
        }
    }
    public void addToBorrowedBook(Borrowing borrowing){
        this.borrowedBooks.add(borrowing);
    }

    //Check availability using book name
    public boolean checkAvailability(String title){
        Library library = Library.getInstance();
        Book book = library.getBook(title);
        if(book != null){
            System.out.println("The Book is Available.");
            return true;
        }else{
            return false;
        }

    }
    //display the book list
    public void displayListofBooks(){
        Library library = Library.getInstance();
        for(Book book: library.getBookArray()){
            System.out.println(book);
        }

    }
    public void getBorrowedBooks(){
        System.out.println("These are the books you borrowed:");
        for(Borrowing borrowing: borrowedBooks){
            System.out.println(borrowing.getBookName());
        }
    }
}
