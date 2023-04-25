package pagina3;
import java.util.Scanner;
public class Alg124 {

	public static void main(String[] args) {
Scanner leia=new Scanner(System.in);
System.out.println("Digite três lados de um triângulo:");		
double num=leia.nextDouble();		
double num2=leia.nextDouble();
double num3=leia.nextDouble();
if(num<num2+num3 && num2<num+num3 && num3<num+num2) {	
if (num*num + num2*num2==num3*num3 || num*num + num3*num3==num2*num2 || num2*num2+num3*num3==num*num) {
System.out.println("O triângulo é retângulo");	
}else if (num*num+num2*num2<num3*num3 || num*num + num3*num3<num2*num2 || num2*num2+num3*num3<num*num ) { 
System.out.println("O triângulo é obtusângulo");
} else {
	System.out.println("O triângulo é acutângulo");
}
}else {
	System.out.println("Esses valores não formam um triângulo.");
}
	
	
	
	
	}}