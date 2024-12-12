import java.util.ArrayList;

public class Library {
    private static Library library;
    private MemberRepository members;
    private BookRepository bookRepository;
    private Auth authSystem;

    private Library(){
        this.members = new MemberRepository();
        this.bookRepository = new BookRepository();
        this.authSystem = new Auth();
    }

    public static Library getInstance(){
        if(library == null){
            library = new Library();
        }
        return library;
    }

    public ArrayList<Book> getBookArray(){
        return this.bookRepository.getBookArray();
    }

    public ArrayList<Member> getMembers() {
        return this.members.getRepository();
    }


    public void addMember(Member member){
        this.members.addField(member);
    }

    public void addBook(Book book){
        this.bookRepository.addField(book);
    }
    public BookRepository getBookRepository(){
        return this.bookRepository;
    }
    public Auth getAuthSystem() {
        return authSystem;
    }
    public Book getBook(String name){
        return this.bookRepository.findBook(name);
    }

}
