package PaginaCinco;
import java.util.Scanner;
public class Algs80 {

	public static void main(String[] args) {
Scanner leia= new Scanner(System.in);
System.out.println("Digite o número da conta corrente(3 dígitos): ");
int conta=leia.nextInt();	
int inverso = (conta%10)*100+((conta/10)%10)*10+(conta/100);	
int soma = 0;
int i;
for( i = 0;i<3;i++){
int digito = (conta%10)*(i+1);	
soma+=digito;	
conta/=10;
}
for( i=0;i<3;i++) {
int digito = (inverso%10)*(i+4);	
soma+=digito;
inverso/=10;
}
int dv=soma%10;
System.out.println("O dígito verificador da conta corrente é: "+dv);
	}
}