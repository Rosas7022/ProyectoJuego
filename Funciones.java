public class Funciones {

    public static int generarNumeroSecreto() {

        return (int)(Math.random() * 100) + 1;

    }

    public static void mostrarPista(int intento, int numeroSecreto) {

        if (intento < numeroSecreto) {

            System.out.println("El numero secreto es mayor.");

        } else if (intento > numeroSecreto) {

            System.out.println("El numero secreto es menor.");

        } else {

            System.out.println("Felicidades, adivinaste el numero.");

        }
    }
}