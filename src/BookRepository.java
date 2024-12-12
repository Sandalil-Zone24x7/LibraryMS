import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BookRepository {
    private ArrayList<Book> bookArray;

    public BookRepository(){
        this.bookArray = new ArrayList<Book>(Arrays.asList(
                new Book("Charlotte Bronte", 1, "Jane Eyre", 5),
                new Book("Enid Blyton", 2, "Famous FIve", 4),
                new Book("R.K. Narayan", 3, "Vendor of Sweets",5)
        )
        );
    }
    public ArrayList<Book> getBookArray(){
        return this.bookArray;
    }

    public void addField(Book book){
        System.out.println("added to the library");
        this.bookArray.add(book);
    }
    public void removeField(){

    }

    public Book findBook(String name){
        for(Book book: bookArray){
            if(book.getTitle().equals(name)){
                return book;
            }
        }
        return null;
    }


}
