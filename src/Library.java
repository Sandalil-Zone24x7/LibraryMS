import java.util.ArrayList;

public class Library {
    private static Library library;
    private MemberRepository members;
    private BookRepository books;
    private Auth authSystem;

    private Library(){
        this.members = new MemberRepository();
        this.books = new BookRepository();
        this.authSystem = new Auth();
    }

    public static Library getInstance(){
        if(library == null){
            library = new Library();
        }
        return library;
    }

    public ArrayList<Book> getBooks(){
        return this.books.getRepository();
    }

    public void displayBooks(){
        for(Book book: this.getBooks()){
            System.out.println(book);
        }
    }
    public ArrayList<Member> getMembers() {
        return this.members.getRepository();
    }

    public void addMember(Member member){
        this.members.addField(member);
    }

    public void addBook(Book book){
        this.books.addField(book);
    }

    public Auth getAuthSystem() {
        return authSystem;
    }
}
