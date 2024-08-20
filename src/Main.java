import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        int Mon20 = 0;
        int Mon50 = 0;
        int Mon100 = 0;
        int Mon200 = 0;
        int Mon500 = 0;

        while(true){
            for (int i = 0; i < 15; i++) {
                System.out.println();}

        System.out.println("-------------------------");
        System.out.println(" Alcancía Virtual ");
        System.out.println("Solo guardamos monedas de $20, $50, $100, $200 y $500");
        System.out.println(" 1 = Agregar moneda a la alcancía...");
        System.out.println(" 2 = Contar monedas de cada denominación...");
        System.out.println(" 3 = Ver el total ahorrado...");
        System.out.println(" 4 = Vaciar la alcancía...");
        System.out.println(" 5 = Salir del programa...");

        Scanner teclado = new Scanner(System.in);
        int Eleccion;

        System.out.println("Por favor elija su función: ");
        Eleccion = teclado.nextInt();

        switch (Eleccion){

            case 1:

                System.out.println("Agregando monedas...");
                System.out.println("¿Que moneda desea agregar?");
                System.out.println("1 = $20");
                System.out.println("2 = $50");
                System.out.println("3 = $100");
                System.out.println("4 = $200");
                System.out.println("5 = $500");
                System.out.println("Ingrese su opción: ");
                int Opcion = teclado.nextInt();

                if (Opcion == 1 || Opcion == 20){
                    Mon20++;
                    break;
                } else if (Opcion == 2 || Opcion == 50) {
                    Mon50++;
                    break;
                } else if (Opcion == 3 || Opcion == 100) {
                    Mon100++;
                    break;
                } else if (Opcion == 4 || Opcion == 200) {
                    Mon200++;
                    break;
                } else if (Opcion == 5 || Opcion == 500) {
                    Mon500++;
                    break;
                } else {
                    System.out.println("Número no valido vuelva a digitar un valor valido...");
                    break;
                }

            case 2:

                System.out.println("Contando cada moneda...");
                System.out.println("La cantidad de cada monedas en la alcancía son:");
                System.out.println("Monedas de $20: " + Mon20);
                System.out.println("Monedas de $50: " + Mon50);
                System.out.println("Monedas de $100: " + Mon100);
                System.out.println("Monedas de $200: " + Mon200);
                System.out.println("Monedas de $500: " + Mon500);
                break;

            case 3:

                System.out.println("Calculando el total...");
                System.out.println("El valor total de cada moneda es: ");
                System.out.println("Monedas de $20: " + (Mon20*20));
                System.out.println("Monedas de $50: " + (Mon50*50));
                System.out.println("Monedas de $100: " + (Mon100*100));
                System.out.println("Monedas de $200: " + (Mon200*200));
                System.out.println("Monedas de $500: " + (Mon500*500));
                int Total = Mon20*20 + Mon50*50 + Mon100*100 + Mon200*200 + Mon500*500;
                System.out.println("El valor total ahorrado de la alcancía es de: $" + Total);
                break;

            case 4:

                System.out.println("Vaciando la alcancía...");
                Mon20 = 0;
                Mon50 = 0;
                Mon100 = 0;
                Mon200 = 0;
                Mon500 = 0;
                Total = 0;
                System.out.println("La alcancía ha sido vaciada por favor vuelva a llenarla...");
                break;

            case 5:

                System.out.println("Saliendo del programa...");
                return;

            default:

                System.out.println("Esta no es una opción valida...");
                break;

            }
        }
    }
}