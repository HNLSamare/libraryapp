public class Book {
// introducing variables
  private String title;
    private String isbn;
    private String genre;
    private String description;
    private String author;
    private int quantity;
    private int numCheckedOut;


   //constructor


    public Book(String title, String isbn, String genre, String description, String author, int quantity, int numCheckedOut) {
        this.title = title;
        this.isbn = isbn;
        this.genre = genre;
        this.description = description;
        this.author = author;
        this.quantity = quantity;
        this.numCheckedOut = numCheckedOut;
    }

//calling setters and getters because main class cannot access variables since they are private

    public String getTitle() {
        return title;
    }



    public String getIsbn() {
        return isbn;
    }



    public String getGenre() {
        return genre;
    }


    public String getDescription() {
        return description;
    }



    public String getAuthor() {
        return author;
    }
    public boolean checkOut(){
        if(numCheckedOut >= quantity){
            return false;
        }
        numCheckedOut++;
        return true;
    }
    public boolean checkIn(){
        if(numCheckedOut<=0){
            return false;
        }
        numCheckedOut--;
        return true;
    }

    public int getQuantity() {

        return quantity;
    }

    public int getNumCheckedOut() {
        return numCheckedOut;
    }
}
