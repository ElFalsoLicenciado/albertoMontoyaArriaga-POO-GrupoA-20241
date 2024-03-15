import java.util.ArrayList;
import java.util.Random;
public class User {
    private String name = "";
    private int id = 0;
    private int age = 0;

    private boolean borrowing = false;
    private ArrayList<Book> borrowedBooks = new ArrayList<Book>();



    private Random ran = new Random();

    public  User(String name, int age){
        this.name = name;
        this.age = age;
        this.id = ran.nextInt(10000)+1000;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public int getAge() {
        return age;
    }

    public void borrowBook(Book book){
        borrowedBooks.add(book);
        borrowing = true;
    }

    public ArrayList<Book> getBorrowedBooks(){
        return borrowedBooks;
    }
}
