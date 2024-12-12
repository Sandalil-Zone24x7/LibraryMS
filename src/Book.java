import java.util.ArrayList;

public class Book {
    final int id;
    final String title;
    final String author;;
    private int bookCount;

    public Book(String author, int id, String title, int bookCount){
        this.id = id;
        this.author = author;
        this.title = title;
        this.bookCount = bookCount;

    }
    @Override
    public String toString() {
        return "Title: " + title + ", Author: " + author;
    }
    private void borrow(){

    }
    public boolean getAvailability(){
        if(bookCount > 0){
            return true;
        }
        return false;
    }

    public void incrementBookCount(boolean availability){
        this.bookCount = bookCount+1;
    }
    public void decrementBookCount(boolean availability){
        this.bookCount = bookCount-1;
    }

    public String getAuthor(){
        return this.author;
    }
    public int getBookCount(){
        return this.bookCount;
    }

}