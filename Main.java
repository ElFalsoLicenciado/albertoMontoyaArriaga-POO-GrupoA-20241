import java.util.*;
public class Main {
    public static void main (String[] args) {
       Product p1 = new Product("", 300.5);
       System.out.println("");
       System.out.println("Current name: "+p1.getName());
       System.out.println("Current price: "+p1.getPrice());
       System.out.println("Current stock: "+p1.getStock());
       p1.decreaseStock(20);
       p1.increaseStock(-32);
       p1.setName("");
       p1.setName("Samanta");
       p1.setPrice(-493.39);
       p1.setPrice(30.2);
       p1.setStock(-3);
       p1.setStock(39);
       p1.decreaseStock(2);
       System.out.println("");
       
       Product p2 = new Product("Michael", 420.69,2);
       System.out.println("");
       System.out.println("Current name: "+p2.getName());
       System.out.println("Current price: "+p2.getPrice());
       System.out.println("Current stock: "+p2.getStock());
       p1.decreaseStock(14);
       p1.increaseStock(-41);
       p1.setName("");
       p1.setName("Martina");
       p1.setPrice(-321.42);
       p1.setPrice(680.9);
       p1.setStock(-7);
       p1.setStock(10);
       p1.decreaseStock(3);
       
    }

}