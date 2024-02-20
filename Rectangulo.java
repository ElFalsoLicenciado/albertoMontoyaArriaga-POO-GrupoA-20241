public class Rectangulo {
    
    float length;
    float heigth;


    public Rectangulo(float length, float heigth){
        this.length = length;
        this.heigth = heigth;
        Size();
        Area();
        Perimeter();
    }

    public void Size(){
        System.out.println("Rectángulo de base: "+length+" y altura de "+heigth);
    }


    public void Area(){
        System.out.print("La area es: ");
        System.out.print(length*heigth);     
    }
    public void Perimeter(){
        System.out.print("\t El perímetro es: ");
        System.out.print(length+length+heigth+heigth+"\n");
    }

}
