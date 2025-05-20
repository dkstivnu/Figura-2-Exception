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

    public void setGeneratriz(double generatriz) {
        this.generatriz = generatriz;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }


    //Metodos


    @Override
    public double calcularArea() {
        return PI*radio*(radio+generatriz);

    }

    @Override
    public double calcularVolume() {
        return (1.0/3.0)*PI*Math.pow(radio,2)*altura;
    }
}
