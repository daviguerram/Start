package pagina7;
import java.util.Scanner;
public class Alg148 {

	public static void main(String[] args) {
Scanner leia=new Scanner(System.in);		
System.out.println("Pra qual região você irá viajar? ");
System.out.println("Região norte - 1");	
System.out.println("Região nordeste - 2");
System.out.println("Região centro-oeste - 3");
System.out.println("Região sul - 4");
int reg=leia.nextInt();
int val;
switch (reg) {
	case 1:
		 val=500;
		System.out.println("É ida e volta?");
		System.out.println("1- sim");
		System.out.println("2 - não");
		int ida=leia.nextInt();
		if (ida==1) {
		val=900;
		}
		break;
	case 2:
		 val=350;
		System.out.println("É ida e volta?");
		System.out.println("1- sim");
        System.out.println("2- não");
        ida=leia.nextInt();
        if(ida==1) {
        	val=650;
        }
        break;
	case 3:
		val=350;
		System.out.println("É ida e volta?");
		System.out.println("1- sim");
		System.out.println("2- não");
		ida=leia.nextInt();
		if(ida==1) {
			val=600;
			
		}
		break;
	case 4:
		val=300;
		System.out.println("É ida e volta?");
		System.out.println("1- sim");
		System.out.println("2- não");
		ida=leia.nextInt();
		if(ida==1) {
			val=550;
			
		}
		break;
	default:
		System.out.println("Região inválida. ");
		return;
  }
 

System.out.println("Sua passagem custará: R$"+val);


}}