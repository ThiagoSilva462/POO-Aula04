package model;

public class Trapezio extends Quadrilatero {
    private float baseMenor;

    public Trapezio(float base, float altura, float baseMenor) {
        super(base, altura);
        this.baseMenor = baseMenor;
    }

    public float getBaseMenor() {
        return baseMenor;
    }

    public void setBaseMenor(float baseMenor) {
        this.baseMenor = baseMenor;
    }

    @Override
    public float calcArea() {
        return (getBase() + baseMenor) * getAltura() / 2;
    }
}
