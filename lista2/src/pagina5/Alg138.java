package pagina5;
import java.util.Scanner;
public class Alg138 {

	public static void main(String[] args) {
Scanner leia=new Scanner(System.in);
System.out.println("Digite o número do mês: ");
int mes=leia.nextInt();
switch (mes) {
case 1:
System.out.println("Janeiro");
break;
case 2:
System.out.println("Fevereiro");
break;
case 3:
System.out.println("Março");
break;
case 4:
System.out.println("Abril");
break;
case 5:
System.out.println("Maio");
break;
case 6:
System.out.println("Junho");
break;
case 7:
System.out.println("Julho");
break;
case 8:
System.out.println("Agosto");	
break;
case 9:
System.out.println("Setembro");
break;
case 10:
System.out.println("Outubro");	
break;
case 11:
System.out.println("Novembro");
case 12:
System.out.println("Dezembro");	
break;
default:
System.out.println("Não existe um mês com esse número");	
break;
}
	
	
	}

}
