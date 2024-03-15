import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class yovi {

    private boolean flag = false;
    private Scanner sc = new Scanner(System.in);
    private ArrayList<User> userList = new ArrayList<User>();
    private ArrayList<Book> bookList = new ArrayList<Book>();
    private ArrayList<Book> availableBooks = new ArrayList<Book>();
    private ArrayList<Book> unavailableBooks = new ArrayList<Book>();


    public void addUser(){

        System.out.print("\nWrite the name: ");
        String uiString = sc.nextLine();
        sc.nextLine(); // Esto es solamente necesario cuando usas nextInt()
        int uiInt=0;

        do {
            try{
                System.out.print("\nWrite the age: ");
                uiInt = sc.nextInt(); // Recomiendo parsear esto a string por validaciones y luego lo parseas a entero (intenta no colocar ningún valor y ve que pasa)
                flag = true; // Aqui también puedes usar un break; para salir del bucle, para que no tengas que hacer una variable flag. Solamente pones un true en la condición del bucle.

            }catch (InputMismatchException e){
                System.out.println("\nInvalid Input.");
                sc.nextLine();
            }
        }while(flag==false); // tip pro: si usas while(!flag) significa que flag es false. Si usas while(flag) significa que flag es true. (se suele hacer mucho más eso que lo que tienes escrito)
        flag = false; // Si usas break, puedes eliminar este código (mira el código que te envié de la otra tarea)


        User user = new User(uiString, uiInt);
        this.userList.add(user);
        showUsers();
    }

    public void addUserAndBook(){

        System.out.print("\nWrite the name: ");
        String uiString = sc.nextLine(); // Espero que tengas validaciones como.. evitar que el usuario ingrese un nombre vacío, que ingrese solo números, etc. (eso se valora mucho y aporta calidad) PD: Considera este comentario para todos los métodos que piden datos al usuario.
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
                System.out.print("\nSelect an book: "); // Normalmente en los catch no llevan este tipo de código. Lo que debe suceder acá, es que debes crear una función que imprima este input. De todas formas, funciona, pero es menos legible, ya que se espera que solamente agarre el error en el catch
                sc.nextLine();
            }
        }while(flag==false);
        flag = false;

        if (i<1 || i>availableBooks.size()){ // Los operadores se suelen colocar con espacios para que sea más legible (i < 1 || i > availableBooks.size()). Cuando se tienen muchas condiciones, te recomiendo también usar parentesis para separarlos.
            System.out.println("Out of bonds");
        }else{
            book = availableBooks.get(i-1); // Lo mismo, operadores deben llevar espacios para legibilidad. Mientras más entendible tu código, mejor. También de vez en cuando ve dejando comentarios por bloques, para explicar qué hace cada cosa (algunos dicen que no, otros que sí. En este caso, como es una tarea, lo leerá tu profesor y le servirá mucho)
            user.borrowBook(book);
            unavailableBooks.add(book);
            availableBooks.remove(i-1);
        }
    }

    public void showUsersWithBooks () {
        System.out.println("Users who at least have a book borrowed");
        for (User user : userList){
            if (!(user.getBorrowedBooks().isEmpty())){ // Excelente
                System.out.println(user.getName());
            }
        }
    }

    public void showUsers(){
        System.out.printf("\n| %3s  | %4s %3s| %3s %n","ID","Name","","Age"); // No sé que hace esto, si me lo puedes explicar, mejor.
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
