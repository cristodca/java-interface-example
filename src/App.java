// * Cristopher D. Chavez Alfaro - 19310146

import java.util.Scanner;

// Para este programa usé el patrón de Facade, esto porque en un sistema con pagos reales se buscaría a toda costa ocultar la complejidad del sistema.

// Para ello lo que se hace es llamar a la función menu(), que  su vez llama a la función metodoPago(), que es donde se llamarían a las funciones finales para el pago, ocultando en cierta medida las funciones importantes del programa principal a través de la interfaz Pagar.java que depende de Pago.java.

public class App {
    public static void main(String[] args) throws Exception {
        menu();
    }

    public static void menu() {
        float cantidad = 0;

        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese la cantidad a pagar:");
        cantidad = leer.nextFloat();

        metodoPago(cantidad);
    }

    public static void metodoPago(float cantidad) {
        int opt;

        Scanner read = new Scanner(System.in);

        System.out.println("=============================");
        System.out.println("SELECCIONE EL METODO DE PAGO:");
        System.out.println("1. Tarjeta de Credito");
        System.out.println("2. PayPal");
        System.out.println("3. Credito Personal");
        System.out.println("4. Transferencia bancaria");
        System.out.println("9. Cancelar");
        System.out.println("=============================");

        System.out.print("SELECCIONE OPCION:");
        opt = read.nextInt();

        Pagar pago = new Pagar(cantidad);

        switch (opt) {
            case 1:
                pago.pagarTC();
                break;
            case 2:
                pago.pagarPaypal();
                break;
            case 3:
                pago.pagarPersonal();
                break;
            case 4:
                pago.pagarTransferencia();
                break;
            default:
                System.out.println("Cancelando...");
                System.exit(0);
        }
    }
}