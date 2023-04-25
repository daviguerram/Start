package pagina6;
import java.util.Scanner;
public class Alg147{
public static void main(String[] args) {
Scanner scanner= new Scanner(System.in);
String prato, sobremesa, bebida;
int caloriasPrato=0, caloriasSobremesa=0, caloriasBebida=0;
System.out.println("Escolha um prato: ");
System.out.println("1- Vegetariano");
System.out.println("2- Peixe");
System.out.println("3- Frango");
System.out.println("4- Carne");
int opcaoPrato = scanner.nextInt();
switch (opcaoPrato) {
case 1:
	prato="Vegetariano";
	caloriasPrato=180;
	break;
case 2:
	prato= "Peixe";
	caloriasPrato=230;
	break;
case 3:
	prato= "Frango";
	caloriasPrato=250;
	break;
case 4:
	prato= "Carne";
	caloriasPrato=350;
	break;
default:
	System.out.println("Opcão inválida!");
	return;
	
}
System.out.println("Escolha uma sobremesa: ");
System.out.println("1- Abacaxi");
System.out.println("2- Sorvete diet");
System.out.println("3- Mousse diet");
System.out.println("4- Mousse chocolate");
int opcaoSobremesa=scanner.nextInt();
switch (opcaoSobremesa) {
	case 1:
		sobremesa="Abacaxi";
		caloriasSobremesa=75;
		break;
	case 2:
		sobremesa="Sorvete diet";
		caloriasSobremesa=110;
		break;
	case 3:
		sobremesa="Mousse diet";
		caloriasSobremesa=170;
		break;
	case 4:
		sobremesa="Mousse chocolate";
		caloriasSobremesa=200;
		break;
	default:
		System.out.println("Opção inválida!");
		return;
		
}
System.out.println("Escolha uma bebida: ");
System.out.println("1 - Chá");
System.out.println("2- Suco de laranja: ");
System.out.println("3- Suco de melão");
System.out.println("4- Refrigerante diet");
int opcaoBebida=scanner.nextInt();
switch (opcaoBebida) {
	case 1:
		bebida="Chá";
		caloriasBebida=20;
		break;
	case 2:
		bebida="Suco de laranja";
		caloriasBebida=70;
		break;
	case 3: 
		bebida="Suco de melão";
        caloriasBebida=100;
        break;
	case 4:
		bebida="Refrigerante diet";
		caloriasBebida=65;
		break;
	default:
		System.out.println("Opção inválida!");
    return;
}
int caloriasTotais= caloriasPrato+caloriasSobremesa+caloriasBebida;
System.out.println("Você escolheu como prato principal "+prato+"(" + caloriasPrato+" cal), como sobremesa "+sobremesa+" ("+caloriasSobremesa+" cal) e como bebida "+bebida+" ("+caloriasBebida+" cal).");
System.out.println("A quantidade total de calorias da sua refeição é de "+caloriasTotais+" cal.");
}
}