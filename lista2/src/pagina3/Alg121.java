package pagina3;
import java.util.Scanner;
import java.util.Arrays;
public class Alg121 {

	public static void main(String[] args) {
Scanner leia=new Scanner(System.in);
System.out.println("Digite 5 números: ");		
int[]numeros=new int[5];
for(int i=0;i<5;i++) {
numeros[i]=leia.nextInt();
	
}
Arrays.sort(numeros);
int menor=numeros[0];
int maior=numeros[numeros.length-1];
System.out.println("Maior valor: "+maior);
System.out.println("Menor valor: "+menor);
	}

}
