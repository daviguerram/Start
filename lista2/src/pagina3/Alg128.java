package pagina3;
import java.util.Scanner;
public class Alg128 {

	public static void main(String[] args) {
Scanner leia=new Scanner(System.in);
System.out.println("Digite um verbo no infinitivo: ");		
String verbo=leia.nextLine();		
leia.close();	
if(!verbo.endsWith("ar")&&!verbo.endsWith("er")&& !verbo.endsWith("ir")) {
	System.out.println("O verbo não está no infinitivo.");
} else if(verbo.endsWith("ar")) {
	System.out.println("O verbo é da 1ª conjugação.");
}else if(verbo.endsWith("er")) {
System.out.println("O verbo é da 2ª conjugação.");
}else {
	System.out.println("O verbo é da 3ª conjugação.");
}
	
	
	}

}
