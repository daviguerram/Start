package pagina8;
import java.util.Scanner;
public class Alg154 {

	public static void main(String[] args) {
Scanner leia=new Scanner(System.in);
System.out.println("Digite a placa do carro (formato XXX-1234");
String placa=leia.nextLine();
char ultimoDigito=placa.charAt(7);
int mesRenovacao=0;
switch (ultimoDigito) {
	case '1':
	case '2':
		mesRenovacao=1;
		break;
	case'3':
	case'4':
		mesRenovacao=2;
		break;
	case'5':
	case'6':
		mesRenovacao=3;
		break;
	case'7':
	case'8':
		mesRenovacao=4;
		break;
	case'9':
	case'0':
		mesRenovacao=5;
		break;
	default:
		System.out.println("Placa inválida");
		return;
		
}
	System.out.println("O emplacamento deve ser renovado em "+ mesRenovacao+" meses. ");
	
	}

}
