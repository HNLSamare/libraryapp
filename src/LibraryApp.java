import java.util.ArrayList;

public class LibraryApp {
    Bookrespiratory bookrespiratory = new Bookrespiratory();

    public void searchByIsbn(String isbn) {
        System.out.printf("Searching for books with ISBN %s. \n", isbn);
        Book book = bookrespiratory.findByIsbn(isbn);


        if (book != null) {
            System.out.printf("1 book found:\n\tTitle: %s\n\tGenre: %s\n\tAuthor: %s", book.getTitle(), book.getGenre(), book.getAuthor());
        } else {
            System.out.printf("Searching for books with ISBN %s. \n", isbn);
        }
    }

    public void searchByTitle(String keyword) {
        System.out.printf("Searching for books with '%s' in the title... \n", keyword);
        ArrayList<Book> books = bookrespiratory.findBytitle(keyword);
        System.out.printf("%s books found%s \n", books.size(), books.size());

        for (Book book : books) {
            System.out.printf("\tTitle: %s\n\tGenre: %s\n\tAuthor: %s\n\t---\n", book.getTitle(), book.getGenre(), book.getAuthor());

        }
        System.out.println();
    }

    public void checkOutBook(String isbn) {
        Book book = bookrespiratory.findByIsbn(isbn);
        if (book != null) {
            if(book.checkOut()){
                System.out.println("Book Checked out successfully");
                System.out.printf("\tTitle: %s\n\tGenre: %s\n\tAuthor: %s\n\t---\n", book.getTitle(), book.getGenre(), book.getAuthor());
            }
            else{
                System.out.println("check out failed.");
                System.out.printf("Reason:more books checked out than recorded quantity");

            }


        } else {
            System.out.println("Failed to check out book.");
            System.out.printf("Reason:There is no book with isbn %s on record.\n", isbn);
        }
        System.out.println();
    }
    public void checkInBook(String isbn) {
        Book book = bookrespiratory.findByIsbn(isbn);
        if (book != null) {
            book.checkOut();
            System.out.println("Book Checked In successfully");
            System.out.printf("\tTitle: %s\n\tGenre: %s\n\tAuthor: %s\n\t---\n", book.getTitle(), book.getGenre(), book.getAuthor());

        } else {
            System.out.println("Failed to check In book.");
            System.out.printf("Reason:There is no book with isbn %s on record.\n", isbn);
        }
        System.out.println();
    }
}