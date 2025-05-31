package LogicaNegocio;

public class Cilindro implements Figura {

    //Atributos
    private double radio;
    private double altura;

    //constructores
    public Cilindro(double radio, double altura) {
        this.radio = radio;
        this.altura = altura;
    }

    public Cilindro() {
        this.radio = 0.0;
        this.altura = 0.0;
    }

    //get y set
    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        if (radio == 0) {
            throw new IllegalArgumentException("El radio no debe ser cero");
        } else if (radio < 0) {
            throw new IllegalArgumentException("La generatriz no puede ser negativo");
        }
        this.radio = radio;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        if (altura == 0) {
            throw new IllegalArgumentException("La altura no debe ser cero");
        } else if (altura < 0) {
            throw new IllegalArgumentException("La altura no puede ser negativo");
        }
        this.altura = altura;
    }

    //Metodos
    @Override
    public double calcularArea() {
        return 2 * PI * radio * radio + 2 * PI * radio * altura;

    }

    @Override
    public double calcularVolumen() {
        return PI * radio * radio * altura;
    }
}

