public class Product {
    private String name;
    private double price;
    private int stock;
    
    public Product(String name, double price){
        if(name.length()>=1){
            this.name = name;
            System.out.println("Product name: "+getName());
        } else {
            System.out.println("Name is empty");
            this.name="Unknown";
        }
        if(price>0){
            this.price = price;
            System.out.println("Current price: $"+getPrice());
        } else {
            System.out.println("Negative value");
        }
        this.stock=0;
        
        
    }
    
    public Product(String name, double price, int stock){
       if(name.length()>=1){
            this.name = name;
            System.out.println("Product name: "+getName());
        } else {
            System.out.println("Name is empty");
            this.name="Unknown";
        }
        if(price>0){
            this.price = price;
            System.out.println("Current price: $"+getPrice());
        } else {
            System.out.println("Negative value");
        }
        if(stock>0){
            this.stock = stock;
            System.out.println("Product stock: "+getStock());
        } else{
            System.out.println("Negative value");
        }
        
    }
    
    public String getName(){
        return name;
    }
    
    public void setName(String name){
        if(name.length()>=1){
            this.name = name;
            System.out.println("New name: "+name);
        } else {
            System.out.println("Name is empty");
        }
    }
    
     public double getPrice(){
        return price;
    }
    
    public void setPrice(double price){
        if(price>0){
            this.price = price;
            System.out.println("New price: $"+price);
        } else {
            System.out.println("Negative value");
        }
    }
    
    public int getStock(){
        return stock;
    }
    
    public void setStock(int stock){
        if(stock>0){
            this.stock = stock;
            System.out.println("New stock: "+stock);
        } else{
            System.out.println("Negative value");
        }
    }
    
    public void increaseStock(int q){
        if(q>0){
            stock = stock+q;
            System.out.println("New stock: "+getStock());
        }else{
            System.out.println("Negative value");
        }
    }
    
    public void decreaseStock(int q){
        if(q>0&&q<=stock){
            stock = stock-q;
            System.out.println("New stock: "+getStock());
        }else if (q<0){
            System.out.println("Negative value");
        }else if (q>stock){
            System.out.println("The quantity is major than the stock");
        }
    }
}
