package pagina3;
import java.util.Scanner;
import java.util.Arrays;
public class Alg120 {

	public static void main(String[] args) {
Scanner leia=new Scanner(System.in);
System.out.println("Digite três números: ");	
int num1=leia.nextInt();
int num2=leia.nextInt();
int num3=leia.nextInt();
int maior, intermediario, menor;
if (num1>num2)	{
if(num1>num3) {
maior=num1;
if(num2>num3) {
intermediario=num2;
menor=num3;
}else {
	intermediario=num3;
	menor=num2;
}
}else {
	if (num2>num3) {
		maior=num2;
		if(num1>num3) {
		intermediario=num1;	
		menor=num3;
		}else {
			intermediario=num3;
			menor=num1;
		}
	}else {
		maior=num3;
		intermediario=num2;
		menor=num1;
	}
}
System.out.println("O maior número é: "+maior);
System.out.println("O número intermediário é: "+intermediario);
System.out.println("O menor número é: "+menor);

	
	
	}

}}
