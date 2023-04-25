package pagina3;
import java.util.Scanner;
public class Alg126 {

	public static void main(String[] args) {
Scanner leia=new Scanner(System.in);
System.out.println("Digite um número:");		
int num=leia.nextInt();		
if (num==5) {
	System.out.println("O número é igual a 5");
}else if(num==200) {
	System.out.println("O número é igual a 200");
}else if(num==400) {
	System.out.println("O número é igual a 400");
	}else if(num>=500 && num<=1000) {
		System.out.println("O número está entre o intervalo de 500 e 1000");
	}else if(num<500) {
		System.out.println("O número está nos escopos anteriores a 500");
	}
	
	
	}

}
