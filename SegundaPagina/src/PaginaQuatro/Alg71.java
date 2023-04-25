package PaginaQuatro;
import java.util.Scanner;
public class Alg71 {

	public static void main(String[] args) {
Scanner leia=new Scanner(System.in);		
System.out.println("Digite o horário atual arredondado em horas inteiras: ");		
double hora=leia.nextDouble();		
double fim = hora*60;		
System.out.println("Já se passaram hoje o total de"+fim+" minutos");	
	
	}

}
