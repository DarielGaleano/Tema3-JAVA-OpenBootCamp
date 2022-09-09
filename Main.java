public class Main {

    public static void main(String[] args) {
        suma(10, 20, 30);

        Coche miCoche = new Coche();

        miCoche.agregarPuertas();
        miCoche.agregarPuertas();
        System.out.println("El numero de puertas del coche es: " + miCoche.Puertas);

    }

    public static void suma(int a, int b, int c){
        int resultado;
        resultado = a + b + c;
        System.out.println(resultado);
    }
}

class Coche {
    public int Puertas = 4;

    public void agregarPuertas(){

        this.Puertas++;
    }
}