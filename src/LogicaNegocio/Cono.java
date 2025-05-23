package LogicaNegocio;

public class Cono implements Figura {

    //Atributos
    private double generatriz;
    private double altura;
    private double radio;

    //constructores

    public Cono(double generatriz, double altura, double radio) {
        this.generatriz = generatriz;
        this.altura = altura;
        this.radio = radio;
    }

    public Cono() {
        this.generatriz = 0;
        this.altura = 0;
        this.radio = 0;
    }
    //get y set

    public double getGeneratriz() {
        return generatriz;
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


    //Metodos


    @Override
    public double calcularArea() {
        return PI * radio * (radio + generatriz);
    }

    @Override
    public double calcularVolumen() {
        return (1.0 / 3.0) * PI *
                radio * radio * altura;
    }
}
