package LogicaPresentacion;

import LogicaNegocio.Cilindro;
import LogicaNegocio.Cono;
import LogicaNegocio.Figura;

import java.util.Scanner;

public class Main {
    private Cono cono = null;
    private Cilindro cilindro = null;

    //Hacer los metodos de calcular área y volumen según la figura

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int opcion;

        do {

            System.out.println("------Menu------");
            System.out.println("1. Crear un Cilindro");
            System.out.println("2. Crear un Cono");
            System.out.println("0. Salir");


            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("* Agregar Cilindro");
                    System.out.print("Ingrese el radio: ");
                    double radio = getADouble(sc);
                    System.out.print("Ingrese la altura: ");
                    double altura = getADouble(sc);

                    Cilindro cilindro = new Cilindro(radio, altura);
                    System.out.println("----- Cilindro -----");
                    calcularOperaciones(cilindro);
                    break;

                case 2:
                    System.out.println("Cono");
                    System.out.print("Ingrese la generatriz: ");
                    double generatriz = getADouble(sc);
                    System.out.print("Ingrese la altura: ");
                    double alturaC = getADouble(sc);
                    System.out.print("Ingrese el radio: :");
                    double radioC = getADouble(sc);

                    Cono cono = new Cono(generatriz, alturaC, radioC);
                    System.out.println("Resultados:");
                    calcularOperaciones(cono);

                    break;

                case 0:
                    System.out.println("Salir");
                    break;

                default:
                    System.out.println("Opción no válida, intente de nuevo.");
            }

        } while (opcion != 0);

        sc.close();
    }

    private static double getADouble(Scanner sc) {
        // d of double
        double d;

        do {
            d = sc.nextDouble();

            if (d < 0) {
                System.out.println("El numero no puede ser negativo");
            }
            if (d == 0) {
                System.out.println("El numero no puede ser cero");
            }

        } while (d <= 0.0);

        return d;
    }

    public static void calcularOperaciones(Figura figura) {
        System.out.println("Area:" + figura.calcularArea());
        System.out.println("Volumen:" + figura.calcularVolumen());
    }
}