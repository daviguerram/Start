package pagina4;
import java.util.Scanner;
public class Alg134 {

	public static void main(String[] args) {
Scanner leia=new Scanner(System.in);
System.out.println("Digite a idade do nadador: ");		
int ida=leia.nextInt();		
if(ida<5) {
	System.out.println("Muito novo para competir");
}else if(ida>=5 && ida<=7) {
	System.out.println("Categoria Infantil A");
}else if(ida>=8 && ida<=10) {
	System.out.println("Categoria Infantil B");
}else if(ida>=11 && ida<=13) {
	System.out.println("Categoria Juvenil A");
}else if(ida>=14 && ida<=17){
	System.out.println("Categoria Juvenil B");
}else {
	System.out.println("Categoria Sênior");
}
	
	
	}

}
