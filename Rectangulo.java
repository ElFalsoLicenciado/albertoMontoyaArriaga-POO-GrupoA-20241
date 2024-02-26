public class Rectangulo {
    

    public Rectangulo(int length, int heigth){
        System.out.printf("You've created a rectangle with a length of: %s  and height of: %s%n",length, heigth);
        AreaPerimeter(length, heigth);

    }

    public Rectangulo(double length, double heigth){
        System.out.printf("You've created a rectangle with a length of: %s  and height of: %s%n",length, heigth);
        AreaPerimeter(length, heigth);
    
    }

    public void AreaPerimeter(int length, int heigth){
        int area = length*heigth;
        int perimeter = (length*2)+(heigth*2);
        System.out.printf("The perimeter is equal to: %s and the area is equal to: %s%n",perimeter,area);
        System.out.println();
    }
    
    public void AreaPerimeter(double length, double heigth){
        double area = length*heigth;
        area = Math.round(area*100.0)/100.0;
        double perimeter = (length*2)+(heigth*2);
        perimeter = Math.round(perimeter*100.0)/100.0;
        System.out.printf("The perimeter is equal to: %s and the area is equal to: %s%n",perimeter,area);
        System.out.println();
    }

}
