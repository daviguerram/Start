package pagina3;
import java.util.Scanner;
import java.util.Arrays;
public class Alg119 {

	public static void main(String[] args) {
Scanner leia=new Scanner(System.in);
	System.out.println("Digite três números: ");	
	int[]numeros=new int[3];
	for (int i=0;i<3;i++) {
		numeros[i]=leia.nextInt();
		
	}
	Arrays.sort(numeros);
	for(int i=numeros.length-1;i>=0;i--) {
	System.out.println(numeros[i]+" ");	
	}
	}

}
