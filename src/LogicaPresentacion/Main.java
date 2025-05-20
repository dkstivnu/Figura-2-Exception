package LogicaPresentacion;

import LogicaNegocio.Cilindro;
import LogicaNegocio.Cono;
import LogicaNegocio.Figura;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    //Hacer los metdos de calcular area y volumen segun la figura

    public static void calcularOperacione(Figura figura){
        System.out.println("Area:" +figura.calcularArea());
        System.out.println("Volumen:" +figura.calcularVolume());
    }
    public static void main(String[] args) {

        java.util.Scanner scanner = new java.util.Scanner(System.in);
        int opcion;
        do {

            System.out.println("------Menu------");
            System.out.println("1. Crear un Cilindro");
            System.out.println("2. Crear un Cono");
            System.out.println("0. Salir");


            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Cilindro");
                    System.out.print("Ingrese el radio: ");
                    double radio= scanner.nextDouble();
                    System.out.print("Ingrese la altura: ");
                    double altura = scanner.nextDouble();

                    Cilindro cilindro = new Cilindro(radio, altura);
                    System.out.println("Resultado:");
                    calcularOperacione(cilindro);
                    break;

                case 2:
                    System.out.println("Cono");
                    System.out.print("Ingrese la generatriz: ");
                    double generatriz = scanner.nextDouble();
                    System.out.print("Ingrese la altura: ");
                    double alturaC = scanner.nextDouble();
                    System.out.print("Ingrese el radio: :");
                    double radioC = scanner.nextDouble();

                    Cono cono = new Cono(generatriz,alturaC, radioC);
                    System.out.println("Resultados:");
                    calcularOperacione(cono);

                    break;

                case 0:
                    System.out.println("Salir");
                    break;

                default:
                    System.out.println("Opción no válida, intente de nuevo.");
            }

        } while (opcion != 0);

        scanner.close();

        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.

    }
}