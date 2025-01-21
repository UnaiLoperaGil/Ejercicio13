public class Cilindro extends Circulo{
    double altura;

    public Cilindro(double radio, double altura) {
        super(radio);
        this.altura = altura;
        if(altura>0.0){
            this.altura = altura;
        }
        else{
            this.altura = 0.0;
        }
    }

    public double getAltura(){
        return this.altura;
    }

    public double getVolumen(){
        return this.altura*this.getArea();
    }
}
