import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Library {

    private boolean flag = false;
    private Scanner sc = new Scanner(System.in);
    private ArrayList<User> userList = new ArrayList<User>();
    private ArrayList<Book> bookList = new ArrayList<Book>();
    private ArrayList<Book> availableBooks = new ArrayList<Book>();
    private ArrayList<Book> unavailableBooks = new ArrayList<Book>();


    public void addUser(){

        System.out.print("\nWrite the name: ");
        String uiString = sc.nextLine();
        sc.nextLine();
        int uiInt=0;

        do {
            try{
                System.out.print("\nWrite the age: ");
                uiInt = sc.nextInt();
                flag = true;

            }catch (InputMismatchException e){
                System.out.println("\nInvalid Input.");
                sc.nextLine();
            }
        }while(flag==false);
        flag = false;


        User user = new User(uiString, uiInt);
        this.userList.add(user);
        showUsers();
    }

    public void addUserAndBook(){

        System.out.print("\nWrite the name: ");
        String uiString = sc.nextLine();
        int uiInt=0;

        do {
            try{
                System.out.print("\nWrite the age: ");
                uiInt = sc.nextInt();
                flag = true;

            }catch (InputMismatchException e){
                System.out.println("\nInvalid Input.");
                sc.nextLine();
            }
        }while(flag==false);
        flag = false;

        User user = new User(uiString, uiInt);
        this.userList.add(user);
        rentBook(user);
        showUsers();
    }

    public void addBook (){
        System.out.print("\nWrite the book's title: ");
        String name = sc.nextLine();
        sc.nextLine();
        System.out.print("\nWrite the book's author: ");
        String author = sc.nextLine();

        Book book = new Book(name,author);
        this.bookList.add(book);
    }


    public  void rentBook(User user){
        int i=0;
        Book book;
        showBooks();
        do
        {
            try{
                i = sc.nextInt();
                flag = true;
            }catch (InputMismatchException e){
                System.out.println("Invalid input.");
                showBooks();
                System.out.print("\nSelect an book: ");
                sc.nextLine();
            }
        }while(flag==false);
        flag = false;

        if (i<1 || i>availableBooks.size()){
            System.out.println("Out of bonds");
        }else{
            book = availableBooks.get(i-1);
            user.borrowBook(book);
            unavailableBooks.add(book);
            availableBooks.remove(i-1);
        }
    }

    public void showUsersWithBooks () {
        System.out.println("Users who at least have a book borrowed");
        for (User user : userList){
            if (!(user.getBorrowedBooks().isEmpty())){
                System.out.println(user.getName());
            }
        }
    }

    public void showUsers(){
        System.out.printf("\n| %3s  | %4s %3s| %3s %n","ID","Name","","Age");
        for(User us : userList){
            System.out.printf("| %-3s | %-4s | %-5s %n",us.getId(),us.getName(),us.getAge());
        }
    }

    public void showBooks(){
        System.out.printf("\n| %3s  | %4s %3s| %3s | %3s %n","ID","Title","","Author","Status");

        for(Book us : availableBooks){
            System.out.printf("| %-3s | %-4s | %-5s | %-5s %n",us.getId(),us.getTitle(),us.getAuthor(),"Available");
        }

        for(Book us : unavailableBooks){
            System.out.printf("| %-3s | %-4s | %-5s | %-5s %n",us.getId(),us.getTitle(),us.getAuthor(),"Unvailable");
        }
    }

    public void showUnavailableBooks(){
        System.out.println("Borrowed books: ");
        System.out.printf("\n| %3s  | %4s %3s| %3s | %3s %n","ID","Title","","Author","Status");

        for(Book us : unavailableBooks){
            System.out.printf("| %-3s | %-4s | %-5s %n",us.getId(),us.getTitle(),us.getAuthor());
        }
    }

    public void showAvailableBooks(){
        System.out.println("Available books: ");
        System.out.printf("\n| %3s  | %4s %3s| %3s | %3s %n","ID","Title","","Author","Status");
        for(Book us : availableBooks){
            System.out.printf("| %-3s | %-4s | %-5s %n",us.getId(),us.getTitle(),us.getAuthor());
        }
    }

    public ArrayList<User> getUserList() {
        return userList;
    }

    public ArrayList<Book> getBookList() {
        return bookList;
    }
}
