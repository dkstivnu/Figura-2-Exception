package LogicaNegocio;

public class Cilindro implements Figura{

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
        this.radio = radio;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    //Metodos
    @Override
    public double calcularArea() {
        return 2*PI*Math.pow(radio,2)+2*PI*radio*altura;

    }

    @Override
    public double calcularVolume() {
        return PI*Math.pow(radio,2)*altura ;
    }
    }

