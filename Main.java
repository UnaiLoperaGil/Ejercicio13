public class Main {
    public static void main(String[] args) {
        /*
        Alumno pepito = new Alumno();
        Dog dog = new Dog("Maxi", 2, 5, 2, 4, 1);

        dog.eat();
        dog.move();

        Pelicula pelicula = new Pelicula("Titulo", 120, "Director", 8);
        pelicula.mostrarInformacion();
        */

        /*
        Video ob1 = new Video("VHS", 90, 100);
        Pelicula ob2 = new Pelicula("ET", 120, 1000, "Spielberg", 10);
        VideoMusical ob3 = new VideoMusical("Clip Musical", 4, 10, "Artista", "Categoria");
        System.out.println(ob1.toString());
        System.out.println(ob2.toString());
        System.out.println(ob3.toString());
         */

        /*
        Vehiculo v = new Vehiculo("Vehiculo1", 40, true);
        v.mover();
        System.out.println(v.velocidad);
        v.acelerar_desacelerar();
        System.out.println(v.velocidad);

        Coche c = new Coche("Coche1", 30, false, 4);
        c.mover();
        System.out.println(c.velocidad);
        c.acelerar_desacelerar();
        System.out.println(c.velocidad);

        CocheCombustion cc = new CocheCombustion("CocheC1", 60, true, 5,4);
        cc.mover();
        System.out.println(cc.velocidad);
        cc.acelerar_desacelerar();
        System.out.println(cc.velocidad);
        System.out.println(cc.marchas);
        cc.cambiarMarcha();
        System.out.println(cc.marchas);
         */


        Circulo circulo = new Circulo(-1.0);
        System.out.println(circulo.getRadio());
        Circulo circulo2 = new Circulo (3.4);
        System.out.println(circulo2.getRadio());
        System.out.println(circulo2.getArea());

        Cilindro cilindro = new Cilindro(-3.0,2.3);
        System.out.println(cilindro.getAltura());
        System.out.println(cilindro.getRadio());
        Cilindro cilindro2 = new Cilindro (2.5, 5.6);
        System.out.println(cilindro2.getArea());
        System.out.println(cilindro2.getVolumen());
    }
}
