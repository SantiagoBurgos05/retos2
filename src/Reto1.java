//reto 1 arrays notas de una materia
import java.util.Scanner;
public class Reto1{
    public static void main(String[] args) {
        try(Scanner lectura=new Scanner(System.in)){
            int acum=0,i,notas;
            double prom;
            System.out.println("Ingrese la cantidad de notas que se va a evaluar: ");
            notas=lectura.nextInt();
            double []vector=new double[notas];
            for(i=0;i<=notas;i++){
                System.out.println("Ingrese la nota "+i);
                vector[i]=lectura.nextDouble();
                acum+=vector[i];
            }
            prom=acum/notas;
            System.out.println("El promedio es: "+prom);
            if (prom<30) {
                System.out.println("Reprobaste");
            }else if(prom>30 & prom<40){
                System.out.println("Pasaste raspando");
            }else if (prom>40) {
                System.out.println("Aprobaste con buenos resultados");
            }
        }
    }
}