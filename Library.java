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

        System.out.print("\nWrite the user's name: ");
        String uiString = sc.nextLine();
        int uiInt=0;

        do {
            try{
                System.out.print("Write the user's age: ");
                uiInt = sc.nextInt();
                flag = true;

            }catch (InputMismatchException e){
                System.out.println("\nInvalid Input.");
                sc.nextLine();
            }
        }while(!flag);
        flag = false;


        User user = new User(uiString, uiInt);
        this.userList.add(user);
        showUsers();
        sc.nextLine();
    }

    public void addUserAndBook(){

        System.out.print("\nWrite the user's name: ");
        String uiString = sc.nextLine();
        int uiInt=0;

        do {
            try{
                System.out.print("Write the user's age: ");
                uiInt = sc.nextInt();
                flag = true;
            }catch (InputMismatchException e){
                System.out.println("\nInvalid Input.");
                sc.nextLine();
            }
        }while(!flag);
        flag = false;

        User user = new User(uiString, uiInt);
        this.userList.add(user);
        rentBook(user);
        showUsers();
    }

    public void addBook (){
        System.out.print("\nWrite the book's title: ");
        String name = sc.nextLine();
        System.out.print("Write the book's author: ");
        String author = sc.nextLine();

        Book book = new Book(name,author);
        this.availableBooks.add(book);
        this.bookList.add(book);
    }


    public void rentBook(User user){
        int i=0;
        Book book;
        if(!(availableBooks.isEmpty())){
            do{
                do{
                    try{
                        showBooks();
                        System.out.print("Select a book: ");
                        i = sc.nextInt();
                        flag = true;
                    }catch (InputMismatchException e){
                        System.out.println("Invalid input.");
                        sc.nextLine();
                    }
                }while(!flag);
                flag = false;

                if ( i < 1 ||  i > availableBooks.size()){
                    System.out.println("Out of bonds");
                }else{
                    book = availableBooks.get(i-1);
                    user.borrowBook(book);
                    unavailableBooks.add(book);
                    availableBooks.remove(i-1);
                    showBooks();
                    flag = true; }

            }while (!flag);
            flag = false;
        }else{
            System.out.println("There's no books available");
        }
    }

    public void preOrder (){
        int i = 0;
        User user = null;

        if (!(userList.isEmpty())){
            do {
                do {
                    try {
                        System.out.print("\nAvailable users: ");
                        showUsers();
                        System.out.print("Select an user: ");
                        i = sc.nextInt();
                        flag = true;
                    } catch (InputMismatchException e) {
                        System.out.println("Invalid input.");
                        sc.nextLine();}

                } while (!flag);
                flag = false;

                if (i < 1 || i > availableBooks.size()) {
                    System.out.println("Out of bonds");
                }else{
                    user = userList.get(i - 1);
                    flag = true; }

            }while (!flag);
            flag = false;
            rentBook(user);
        }else{
            System.out.println("There's no user's registered.");
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
        System.out.println("\nUser list.");
        for(User us : userList){
            System.out.printf("ID: %s, name: %s & age: %s %n",us.getId(),us.getName(),us.getAge());
        }
    }

    public void showBooks(){
        if (!(bookList.isEmpty())) {
            showAvailableBooks();
            showUnavailableBooks();
        }else{
            System.out.println("There's no books registered");
        }
    }

    public void showUnavailableBooks(){
        if (!(unavailableBooks.isEmpty())) {
            System.out.println("\nBorrowed books: ");
            for (Book us : unavailableBooks) {
                System.out.printf("ID: %s, title: %s, author: %s & status: Unavailable %n", us.getId(), us.getTitle(), us.getAuthor());
            }
        }else{
            System.out.println("There's no borrowed books.");
        }
    }


    public void showAvailableBooks(){
        if (!(availableBooks.isEmpty())) {
            System.out.println("\nAvailable books: ");
            for (Book us : availableBooks) {
                System.out.printf("ID: %s, title: %s, author: %s & status: Available %n", us.getId(), us.getTitle(), us.getAuthor());
            }
        }else{
                System.out.println("There's no available books.");
            }
    }

}
