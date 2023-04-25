package pagina6;
import java.util.Scanner;
public class Alg145 {

	public static void main(String[] args) {
Scanner leia=new Scanner(System.in);
System.out.println("Qual livro você deseja?");
String livro=leia.nextLine();
System.out.println("Você é aluno ou professor?");		
String alun=leia.nextLine();	
if(alun.equals("aluno")) {
	System.out.println(" Nome do livro: "+livro);	
System.out.println("Tipo de usuário: Aluno");	
System.out.println("Total de dias: 3");
}else if(alun.equals("professor")) {
	System.out.println(" Nome do livro: "+livro);
System.out.println("Tipo de usuário: Professor");
System.out.println("Total de dias: 10");
}else {
	System.out.println("Erro no tipo de usuário");
}
	
	}

}
