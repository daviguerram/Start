package pagina5;
import java.util.Scanner;
public class Alg139 {

	public static void main(String[] args) {
Scanner leia=new Scanner(System.in);
System.out.println("Digite o nome do município: ");		
String mun=leia.nextLine();		
System.out.println("Digite a quantidade de eleitores aptos: ");	
int ele=leia.nextInt();	
System.out.println("Digite o número de votos do candidato mais votado: ");	
int vot=leia.nextInt();	
if(ele<=20.000) {
System.out.println("Não terá segundo turno em "+mun);	
}else {
double mei=ele/2;	
if(vot>mei) {
	System.out.println("Não terá segundo turno em "+mun);
}else {
System.out.println("Terá segundo turno em "+mun);	
}

}
	
	
	}

}
