package pagina7;
import java.util.Scanner;
public class Alg149 {

	public static void main(String[] args) {
Scanner leia=new Scanner (System.in);
System.out.println("Digite o nome do produto: ");		
String nome=leia.nextLine();
System.out.println("Digite o valor da venda em R$: ");
double val=leia.nextDouble();
System.out.println("Nome do produto: "+nome);
if (val<10) {
	double por=val/100*70;
	val+=por;
	System.out.println("Valor da venda: R$"+val);
}else if(val>=10 && val<30) {
	double por=val/100*50;
    val+=por;
    System.out.println("Valor da venda: R$"+val);
}else if(val>=30 && val<50) {
	double por=val/100*40;
	val+=por;
	System.out.println("Valor da venda: R$"+val);
}else {
	double por=val/100*30;
	val+=por;
	System.out.println("Valor da venda: R$"+val);
}
	}

}
