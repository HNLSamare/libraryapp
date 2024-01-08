
import java.util.ArrayList;

public class Bookrespiratory {
    private ArrayList<Book> books = new ArrayList<>();


    public Bookrespiratory() {
        Book book1 = new Book("The Dead of Night", "83471", "Horror", "null", "S.K.Eleton",10,7);
        books.add(book1);
        Book book2 = new Book("The knight", "83472", "Adventure", "null", "S.S.Kevin",12,5);
        books.add(book2);
        Book book3 = new Book("The Great Kingdom", "83473", "Historical", "null", "M.W.Wiluam",15,15);
        books.add(book3);
        Book book4 = new Book("Last Time", "83474", "Horror", "null", "Sen Lora",20,1);
        books.add(book4);


    }

    public Book findByIsbn(String isbn) {

        for (Book book : books) {
            if (book.getIsbn().equals(isbn)) {

                return book;
            }
        }
        return null;
    }
public ArrayList<Book> findBytitle(String keyword){
        ArrayList<Book>bookfound=new ArrayList<>();
        for(Book book:books){
            if(book.getTitle().toLowerCase().contains(keyword.toLowerCase())){
                bookfound.add(book);

            }
        }
return bookfound;
}
}
