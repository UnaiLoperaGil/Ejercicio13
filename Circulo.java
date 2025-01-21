public class Circulo {
    double radio;

    public Circulo(double radio) {
        if(radio>0.0) {
            this.radio = radio;
        }
        else{
            this.radio = 0.0;
        }
    }

    public double getRadio(){
        return this.radio;
    }

    public double getArea(){
        return this.radio*this.radio*Math.PI;
    }
}
