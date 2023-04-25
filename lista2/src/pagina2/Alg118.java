package pagina2;
import java.util.Scanner;
import java.util.Arrays;
public class Alg118 {

	public static void main(String[] args) {
Scanner leia=new Scanner(System.in);
System.out.println("Digite três números:");
int[]numeros=new int[3];
for(int i=0;i<3;i++){
numeros[i]=leia.nextInt();
}
Arrays.sort(numeros);	
System.out.println("Os números em ordem crescente são: ");	
for (int i=0;i<3;i++) {
	System.out.print(numeros[i]+" ");
}
	
	}

}
