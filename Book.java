import java.util.Random;
public class Book {

    private int id = 0;
    private String title = "";
    private String author = "";
    private boolean borrow = false;
    private Random ran = new Random();


    public Book( String title, String author) {
        this.id = ran.nextInt(9999)+1000;
        this.title = title;
        this.author = author;
    }

    public void setBorrow(boolean status){
        borrow = status;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public boolean isBorrow() {
        return borrow;
    }
}
