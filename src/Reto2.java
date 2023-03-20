//reto 2 array, natacion
import java.util.Scanner;
public class Reto2 {
    public static void main(String[] args) {
        try(Scanner lectura = new Scanner(System.in)){
        int comp,i,gana=0;
        double tiempoGana=Integer.MAX_VALUE; 
        System.out.println("Ingrese la cantidad de competidores: ");
        comp=lectura.nextInt();
        String[] nombre = new String[comp];
        double[] tiempo = new double[comp];
        for (i=0;i<comp; i++) {
            System.out.println("Ingrese el nombre del competidor "+(i+1)+": ");
            nombre[i] = lectura.next();
            System.out.println("Ingrese el tiempo del competidor "+(i+1)+": ");
            tiempo[i] = lectura.nextDouble();
            if (tiempo[i]<tiempoGana) {
                tiempoGana=tiempo[i];
                gana=i;
            }
        }
            System.out.println(nombre[i]+" con un tiempo de: "+tiempo[i] +" segundos");
            System.out.println("El ganador es "+gana+" con un tiempo de "+tiempoGana+" segundos");
        }
    }
}