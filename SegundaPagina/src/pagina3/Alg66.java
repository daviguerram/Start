package pagina3;
import java.util.Scanner;
public class Alg66 {

	public static void main(String[] args) {
Scanner leia= new Scanner(System.in);
System.out.println("Digite o tempo gasto na viagem em horas: ");		
double tempo= leia.nextDouble();		
System.out.println("Digite a velocidade média do veículo em km/h: ");
double vel=leia.nextDouble();
double dist= tempo*vel;	
double lit=dist/12;
System.out.println("Velocidade média em km/h: "+vel);
System.out.println("Tempo gasto na viagem em horas: "+tempo);
System.out.println("Distância percorrida em km: "+dist);
System.out.println("Quatidade de litros utilizada na viagem: "+lit);
	}

}
