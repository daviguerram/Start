package pagina4;
import java.util.Scanner;
public class Alg133 {

	public static void main(String[] args) {
Scanner leia=new Scanner(System.in);
System.out.println("Digite sua altura: ");		
double alt=leia.nextDouble();
leia.nextLine();
System.out.println("Digite seu sexo(m/f):");	
String sex=leia.nextLine();
if(sex.equals("m")) {	
double ide=(72.7*alt)-58;	
System.out.printf("Peso ideal: %.2f",ide);
}
else if(sex.equals("f")) {
double ide=(62.1*alt)-44.7;
System.out.printf("Peso ideal: %.2f",ide);
}
	}

}
