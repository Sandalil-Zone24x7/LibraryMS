import java.util.Scanner;

public class Librarian extends Member{

    public Librarian(String name, int id, String password){
        super(name, id ,password);
    }

    public void registerNewMember(String name, int id, String password){
        Library library = Library.getInstance();
        Member member = new Member(name,id,password);
        library.addMember(member);
    }

    public void addNewBook(String author, String title, int id){
        Library library = Library.getInstance();
        Book book = library.getBook(title);
        if(book != null){
            int bookCount = book.getBookCount()+1;
            Book bookCopy = new Book(author, id, title, bookCount);
            library.addBook(bookCopy);

        }else{
            Book bookCopy = new Book(author, id, title, 1);
            library.addBook(bookCopy);
        }

    }

    public void getListofMembers(){
        Library library = Library.getInstance();
        for(Member member: library.getMembers()){
            System.out.println(member);
        }
    }


}
