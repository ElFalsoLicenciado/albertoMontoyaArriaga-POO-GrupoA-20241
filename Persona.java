public class Persona {
    
    String name= "";
    int age ;
    String gender;


    public Persona(String name, int age, String gender){
        this.name=name;
        this.age=age;
        this.gender=gender;
        Print();
    }
    
    public void Print (){
        System.out.println("Su nombre es: "+name+", tiene "+age+ " años de edad y es: "+gender);
    }

}

