package pagina2;
import java.util.Scanner;
public class Alg105{

	public static void main(String[] args) {
Scanner leia=new Scanner(System.in);
System.out.println("Digite a sigla do seu estado em letras maiuscúlas: ");
String estado=leia.nextLine();
if (estado.equals("RJ")) {
	System.out.println("Carioca");
}else if(estado.equals("SP")) {
	System.out.println("Paulista");
}else if(estado.equals("MG")){
	System.out.println("Mineiro");
}else {
	System.out.println("Outro estado");
}

}}