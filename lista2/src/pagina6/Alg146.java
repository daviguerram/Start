package pagina6;
import java.util.Scanner;
public class Alg146 {

	public static void main(String[] args) {
Scanner leia=new Scanner(System.in);
System.out.println("Digite a distância percorrida em km: ");		
double dist=leia.nextDouble();
leia.nextLine();
System.out.println("Digite o tipo do carro: ");
String tipo=leia.nextLine();
if(tipo.equals("a") ) {
double lit=dist/12;
System.out.printf("Consumo estimado de combustível em litros: %.2f",lit);
}else if(tipo.equals("b")) {
double lit=dist/9;
System.out.printf("Consumo estimado de combustível em litros: %.2f",lit);
}else if(tipo.equals("c")) {
	double lit=dist/8;
	System.out.printf("Consumo estimado de combustível em litros: %.2f",lit);
}else {
	System.out.println("Tipo de carro inválido");
}
	}

}
