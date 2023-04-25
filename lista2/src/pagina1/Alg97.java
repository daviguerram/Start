package pagina1;
import java.util.Scanner;
public class Alg97{

	public static void main(String[] args) {
Scanner leia=new Scanner(System.in);
System.out.println("Digite um número");
double num=leia.nextDouble();
if (num%10==0) {
System.out.println("É divisível por 10");
}else if  (num%5==0){
System.out.println("É divisível por 5");
}else if  (num%2==0){
System.out.println("É divisível por 2");
}else {
System.out.println("Não é divisível por nenhum");	
}


}}