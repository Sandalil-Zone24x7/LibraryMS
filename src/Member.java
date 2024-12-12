import java.util.ArrayList;

public class Member extends Person{
    private ArrayList<Book> books;
    private String password;
    private String memberId;
    private boolean authenticated;

    public Member(String name, String memberId, String password){
        super(name);
        this.memberId = memberId;
        this.password = password;
        this.authenticated = false;
    }

    public void setPassword(String password){
        this.password  = password;
    }
    public String getPassword(){
        return this.password;

    }
    public String getMemberId(){
        return this.memberId;
    }
    public void setAuthenticated(boolean status){
        this.authenticated = true;
    }
    public boolean getAuthenticated(){
        return this.authenticated;
    }
    public void checkoutBook(){

    }
    public boolean checkAvailability(int Id){
        Library library = Library.getInstance();
        ArrayList<Book> bookList = library.getBooks();
        for(Book book: bookList){
            if(book.getAvailability()){
                System.out.println("The book is available");
                return true;
            }
        }
        return false;

    }
    public boolean checkAvailability(String name){
        Library library = Library.getInstance();
        ArrayList<Book> bookList = library.getBooks();
        for(Book book: bookList){
            if(book.getAvailability()){
                return true;
            }
        }
        return false;
    }

    public void displayListofBooks(){
        Library library = Library.getInstance();
        library.displayBooks();

    }
}
