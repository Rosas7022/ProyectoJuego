import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int numeroSecreto = Funciones.generarNumeroSecreto();
        int intento = 0;
        int contador = 0;

        System.out.println("=== ADIVINA EL NUMERO ===");
        System.out.println("Adivina un numero del 1 al 100");

        while (intento != numeroSecreto) {

            System.out.print("Ingresa un numero: ");
            intento = entrada.nextInt();

            contador++;

            Funciones.mostrarPista(intento, numeroSecreto);
        }

        System.out.println("Intentos realizados: " + contador);

        entrada.close();
    }
}