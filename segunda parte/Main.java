public class Main {
    public static void main(String[]args){
        Coche miCoche = new Coche();
        miCoche.AnadirPuerta();
        miCoche.AnadirPuerta();
        miCoche.AnadirPuerta();
        System.out.println(miCoche.puerta);
    }
    
    
}

class Coche {
    public int puerta = 5;

    public void AnadirPuerta() {
        this.puerta++;
    }
}