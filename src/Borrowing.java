import java.time.LocalDate;
import java.util.Date;

public class Borrowing {
    private LocalDate borrowedDate;
    private LocalDate dueDate;
    private Book book;

    public Borrowing(LocalDate borrowedDate, Book book){
        this.borrowedDate = borrowedDate;
        this.dueDate =borrowedDate.plusDays(14);
        this.book = book;
    }
    public String getBookName(){
        return this.book.getTitle();
    }
}
