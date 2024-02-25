public class Rectangulo {
    

    public Rectangulo(int length, int heigth){
        System.out.printf("Has creado un rectángulo de base: %s  y altura %s%n",length, heigth);
        AreaPerimeter(length, heigth);

    }

    public Rectangulo(double length, double heigth){
        System.out.printf("Has creado un rectángulo de base: %s  y altura %s%n",length, heigth);
        AreaPerimeter(length, heigth);
    
    }

    public void AreaPerimeter(int length, int heigth){
        int area = length*heigth;
        int perimeter = (length*2)+(heigth*2);
        System.out.printf("El perímetro es: %s y el área es: %s%n",perimeter,area);
        System.out.println();
    }
    
    public void AreaPerimeter(double length, double heigth){
        double area = length*heigth;
        double perimeter = (length*2)+(heigth*2);
        System.out.printf("El perímetro es: %s y el área es: %s%n",perimeter,area);
        System.out.println();
    }

}
