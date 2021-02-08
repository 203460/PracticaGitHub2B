import java.util.Scanner;
public class Alimentos {
    
    static Scanner entrada = new Scanner(System.in);

    public static void menu(String nombre, String direccion){
        int alimento, cantidad, extra, descuento=0, precioTotal=0, total1=0, total2=0, total3=0;
        int iva;
        do {
            System.out.println("Menu:\n1.Ensalada $50\n2.Carnes $40\n3.Comida rapida $60\n4.Pagar");
            System.out.println("¿Que alimento desea llevar?");
            alimento = entrada.nextInt();
            switch(alimento){
                case 1:
                System.out.println("¿Que cantidad?");
                cantidad = entrada.nextInt();
                total1 = total1 + cantidad*50;
                descuento = descuento + (total1 * 10)/100;
                System.out.println("¿Desea agregar aderezo extra? El costo es de $25\n1.Si - 2.No");
                extra = entrada.nextInt();
                if(extra == 1) 
                    total1 = total1 + 25;
                break;
                case 2:
                System.out.println("¿Que cantidad?");
                cantidad = entrada.nextInt();
                total2 = total2 + cantidad*40; 
                descuento = descuento + (total2 * 10)/100;
                System.out.println("¿Desea agregar 1/2 orden de comida? El costo es de $50\n1.Si - 2.No");
                extra = entrada.nextInt();
                if(extra == 1) 
                    total2 = total2 + 50;                
                break;
                case 3:
                System.out.println("¿Que cantidad?");
                cantidad = entrada.nextInt();
                total3 = total3 + cantidad*60;
                descuento = descuento + (total3 * 5)/100;
                break;
                case 4:
                precioTotal = total1 + total2 + total3 - descuento;
                iva = (precioTotal*16)/100;
                precioTotal = precioTotal + iva;
                System.out.println("--------------------------------------------------");
                System.out.println("Nombre: " + nombre);
                System.out.println("Direccion: " + direccion);
                System.out.println("El precio total + iva es: " + precioTotal);
                System.out.println("Por aniversario del restaurante se aplica un descuento en sus alimentos");
                System.out.println("Gracias por su compra");
                System.out.println("--------------------------------------------------");
                break;
            }
        } while(alimento!=4);
    }
}
