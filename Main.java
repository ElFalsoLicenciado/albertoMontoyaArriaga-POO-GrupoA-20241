import java.util.*;
public class Main {
    public static void main (String[] args) {
        Product p1 = new Product("Alberto", 300.5);
        System.out.println("");
       System.out.println(p1.getName());
       System.out.println(p1.getPrice());
       System.out.println(p1.getStock());
       p1.decreaseStock(60);
       p1.increaseStock(-5);
       p1.setName("Mauricio");
       p1.setPrice(69.69);
       p1.setStock(420);
        System.out.println("");
       
       Product p2 = new Product("Michael", 420.69,2);
        System.out.println("");
       System.out.println(p2.getName());
       System.out.println(p2.getPrice());
       System.out.println(p2.getStock());
       p2.decreaseStock(60);
       p2.increaseStock(-5);
       p2.setName("Mauricio");
       p2.setPrice(69.69);
       p2.setStock(420);  
        
    }

}