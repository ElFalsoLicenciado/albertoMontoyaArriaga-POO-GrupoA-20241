public class Main {

    public static void main (String[] args) {
        
        Persona person1 = new Persona("Juan", 16, "hombre");
        Persona person2 = new Persona("Sofia", 30, "mujer");
        Persona person3 = new Persona("Jorge", 67, "hombre");
        Persona person4 = new Persona("Julieta", 29, "mujer");


        System.out.println();

        Libro libro1 = new Libro();
        System.out.println("El libro es: "+libro1.title+", escrito por: "+libro1.author+" y publicado en: "+libro1.publish);
        Libro libro2 = new Libro();
        libro2.title = "El arte de la guerra"; libro2.author = "Sun Tzu"; libro2.publish = 400;
        System.out.println("El libro es: "+libro2.title+", escrito por: "+libro2.author+" y publicado en: "+libro2.publish);
        Libro libro3 = new Libro();
        libro3.title = "Los miserables"; libro3.author = "Víctor Hugo"; libro3.publish = 1862;
        System.out.println("El libro es: "+libro3.title+", escrito por: "+libro3.author+" y publicado en: "+libro3.publish);
        Libro libro4 = new Libro();
        libro4.title = "Five Nights at Freddy's Los ojos de plata"; libro4.author = "Scott Cawthon"; libro4.publish = 2016;
        System.out.println("El libro es: "+libro4.title+", escrito por: "+libro4.author+" y publicado en: "+libro4.publish);
        
        
    }
}