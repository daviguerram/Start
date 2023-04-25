package pagina2;
import java.util.Scanner;
public class Alg108{

	public static void main(String[] args) {
Scanner leia=new Scanner(System.in);
System.out.println("Digite seu nome completo:");
String nome=leia.nextLine();
String[] parte= nome.split(" ");
if (parte[0].equals("JOSE")) {
System.out.println(nome);	
} else if (parte[0].equals("Jose")) {
System.out.println(nome);
}else if (parte[0].equals("jose")) {
System.out.println(nome);

}


}}