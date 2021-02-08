import java.util.Scanner;
public class Cliente {

    static Scanner entrada = new Scanner(System.in);
    static Alimentos productos = new Alimentos();

    public static void datos() {
        String nombre, direccion;
        System.out.println("Bienvenido al restaurante");
        System.out.println("¿Cual es su nombre?");
        nombre = entrada.nextLine();
        System.out.println("¿Cual es su direccion?");
        direccion = entrada.nextLine();
        productos.menu(nombre, direccion);        
    }    
}
