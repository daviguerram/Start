package pagina6;
import java.util.Scanner;
public class Alg143 {

	public static void main(String[] args) {
Scanner leia=new Scanner(System.in);
System.out.println("Digite uma palavra:");
String palavra=leia.nextLine();		
		
int tamanho=palavra.length();
int indiceCentral=tamanho/2;
if(tamanho%2==0) {
	String digrafo=palavra.substring(indiceCentral-1,indiceCentral+1);
    if(digrafo.equals("rr")|| digrafo.equals("ss")) {
    	System.out.println("A letra central é o dígrafo "+digrafo);
    }else {
    	System.out.println("A letra central não é vogal nem um dígrafo");
    }
}else {
	char letraCentral=palavra.charAt(indiceCentral);
if(letraCentral=='a' || letraCentral=='e' || letraCentral=='i' || letraCentral== 'o' || letraCentral== 'u') {
System.out.println("A letra central é a vogal "+ letraCentral);
}else {
	System.out.println("A letra central não é uma vogal nem um dígrafo");
}

	}

	}}
