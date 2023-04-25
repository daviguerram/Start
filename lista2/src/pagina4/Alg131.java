package pagina4;
import java.util.Scanner;
public class Alg131 {

	public static void main(String[] args) {
Scanner leia=new Scanner(System.in);
System.out.println("Digite o nome de um aluno: ");		
String nome=leia.nextLine();		
char pri=nome.toUpperCase().charAt(0);		
String sala;
if (pri>='A' && pri<='K') {
sala="101";
} else if(pri>='L' && pri<='N') {
	sala="102";
} else if(pri>='O' && pri<='Z') {
	sala="103";		
} else {
	sala="Sala não encontrada";
}
System.out.println("O aluno "+nome+" fará a prova na sala "+ sala);
	
	
	}

}
