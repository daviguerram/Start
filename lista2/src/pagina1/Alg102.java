package pagina1;
import java.util.Scanner;
public class Alg102{

	public static void main(String[] args) {
Scanner leia=new Scanner(System.in);
System.out.println("Digite um número");
int num=leia.nextInt();
if(num>20) {
	System.out.println("maior do que 20");
}else if(num==20){
System.out.println("igual a 20");
}else {
	System.out.println("menor que 20");
}
}}