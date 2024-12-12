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
    public ArrayList<Book> getRepository(){
        return this.bookArray;
    }

    public void addField(Book book){
        this.bookArray.add(book);
    }
    public void removeField(){

    }
}
