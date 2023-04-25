package pagina5;
import java.util.Scanner;
public class Alg136 {

	public static void main(String[] args) {
Scanner leia=new Scanner(System.in);
System.out.println("Digite seu nome: ");
String nome=leia.nextLine();
System.out.println("Digite sua idade: ");		
int ida=leia.nextInt();		
System.out.println("Nome: "+nome);
if(ida<=10) {
	System.out.println("Preço do plano de saúde: R$ 30,00 ");
}else if(ida>10 && ida<=29) {
	System.out.println("Preço do plano de saúde: R$ 60,00 ");
}else if(ida>29 && ida<=45) {
	System.out.println("Preço do plano de saúde: R$ 120,00 ");
}else if(ida>45 && ida<=59) {
	System.out.println("Preço do plano de saúde: R$ 150,00 ");
}else if(ida>59 && ida<=65){
	System.out.println("Preço do plano de saúde: R$ 250,00 ");
}else {
	System.out.println("Preço do plano de saúde: R$ 400,00 ");
}
	
	
	}

}