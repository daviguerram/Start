package codigos2;
import java.util.Scanner;
public class Alg47 {

	public static void main(String[] args) {
Scanner leia = new Scanner(System.in);
System.out.println("Digite um número no formato CDU: ");
int cdu = leia.nextInt();
int udc = 0;
while(cdu>0) {
	int digito = cdu % 10;
	udc = udc*10 + digito;
	cdu/=10;
}
		System.out.println("O número invertido é: "+ udc);
		
	}

}
