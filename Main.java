public class Main {

    public static void main (String[] args) {
      
        System.out.println("Exercise #1: Rectangle");
        Rectangulo rect1 = new Rectangulo(2,6);
        Rectangulo rect2 = new Rectangulo(9.1,4.2);
        Rectangulo rect3 = new Rectangulo(7,3);
        Rectangulo rect4 = new Rectangulo(8.33,5.97);
        System.out.println();

        System.out.println("Exercise #2: Employees and wages.");
        Empleado emp1 = new Empleado(605.23);
        Empleado emp2 = new Empleado(342.69, 123.3);
        Empleado emp3 = new Empleado(978.07, 287.92, 24);
        System.out.println();

        System.out.println("Exercise #3: Tax calculator.");
        CalculadoraImpuestos tax1 = new CalculadoraImpuestos(555);
        CalculadoraImpuestos tax2 = new CalculadoraImpuestos(1000, 25.6);
        CalculadoraImpuestos tax3 = new CalculadoraImpuestos(25.6, 650.45, 230.4);

    }

}