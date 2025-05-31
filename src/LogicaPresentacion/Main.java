package LogicaPresentacion;

import LogicaNegocio.Cilindro;
import LogicaNegocio.Cono;
import LogicaNegocio.Figura;
import LogicaNegocio.FormatDotFloatException;

import java.util.Scanner;

public class Main {
    private static Cono cono = null;
    private static Cilindro cilindro = null;

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
                    double radio;
                    double altura;

                    try {
                        System.out.println("* Agregar Cilindro");
                        System.out.print("Ingrese el radio: ");
                        radio = getADouble(sc);
                        System.out.print("Ingrese la altura: ");
                        altura = getADouble(sc);
                    } catch (FormatDotFloatException e) {
                        System.out.println(e.getMessage());
                        radio = 0;
                        altura = 0;
                    }
                    if (radio == 0 && altura == 0) {
                        System.out.println("No se puede crear un Cilindro");
                    } else {
                        cilindro = new Cilindro(radio, altura);
                    }

                    try {
                        System.out.println("----- Cilindro -----");
                        calcularOperaciones(cilindro);
                    } catch (NullPointerException e) {
                        System.out.println(e.getMessage());
                    }

                    break;

                case 2:
                    double generatriz ;
                    double alturaC;
                    double radioC;
                    try {
                        System.out.println("Cono");
                        System.out.print("Ingrese la generatriz: ");
                        generatriz = getADouble(sc);
                        System.out.print("Ingrese la altura: ");
                        alturaC = getADouble(sc);
                        System.out.print("Ingrese el radio: :");
                        radioC = getADouble(sc);
                    } catch (FormatDotFloatException e) {
                        throw new FormatDotFloatException("Error: Entrada invalida");
                    }

                    try {
                        cono = new Cono(generatriz, alturaC, radioC);
                        System.out.println("Resultados:");
                        calcularOperaciones(cono);
                    } catch (NullPointerException e) {
                        throw new NullPointerException(e.getMessage());
                    }

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

    private static double getADouble(Scanner sc) throws FormatDotFloatException {
        // d of double
        double d;

        do {
            try{
            d = sc.nextDouble();
            } catch (NumberFormatException e) {
                throw new FormatDotFloatException("Error: Entrada invalida" +
                        " en el formato del signo de separacion decimal");
            }

            if (d < 0) {
                System.out.println("El numero no puede ser negativo");
            }
            if (d == 0) {
                System.out.println("El numero no puede ser cero");
            }

        } while (d <= 0.0);

        return d;
    }

    public static void calcularOperaciones(Figura figura) throws NullPointerException {
        if (figura == null) {
            throw new NullPointerException("El figura no puede ser nula");
        }

        String area = String.format("%.2f", figura.calcularArea());

        String volumen = String.format("%.2f", figura.calcularVolumen());

        System.out.println("Area: " + area);
        System.out.println("Volumen: " + volumen);
    }

    public Cono getCono() {
        return cono;
    }

    public void setCono(Cono cono) {
        this.cono = cono;
    }
}