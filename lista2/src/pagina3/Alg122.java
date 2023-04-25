package pagina3;
import java.util.Scanner;
public class Alg122 {

	public static void main(String[] args) {
Scanner leia=new Scanner(System.in);
System.out.println("Digite três lados de um triângulo:");		
double num=leia.nextDouble();		
double num2=leia.nextDouble();
double num3=leia.nextDouble();
if(num<num2+num3 && num2<num+num3 && num3<num+num2) {
System.out.println("Esses lados formam um triângulo.");	
}else {
	System.out.println("Esses lados não formam um triângulo.");
}
	
	
	
	
	}

}
