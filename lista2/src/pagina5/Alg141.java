package pagina5;
import java.util.Scanner;
public class Alg141{
public static void main(String[]args) {
Scanner sc=new Scanner(System.in);
String nome1, nome2, nome3;
int pontos1, pontos2, pontos3;
System.out.println("Digite o nome do primeiro finalista: ");
nome1=sc.nextLine();
System.out.println("Digite o total de pontos do primeiro finalista: ");
pontos1= sc.nextInt();
sc.nextLine();
System.out.println("Digite o nome do segundo finalista: ");
nome2=sc.nextLine();
System.out.println("Digite o total de pontos do segundo finalista:");
pontos2=sc.nextInt();
sc.nextLine();
System.out.println("Digite o nome do terceiro finalista: ");
nome3=sc.nextLine();
System.out.println("Digite o total de pontos do terceiro finalista: ");
pontos3=sc.nextInt();
sc.nextLine();
if(pontos1>=pontos2 && pontos1>= pontos3) {
	System.out.println("1° lugar: "+nome1);
if (pontos2>=pontos3){
	System.out.println("2° lugar: "+nome2);
    System.out.println("3° lugar: "+nome3);
}else {
	System.out.println("2° lugar: "+nome3);
    System.out.println("3° lugar: "+nome2);
}
}else if (pontos2>=pontos1 && pontos2>=pontos3) {
	System.out.println("1° lugar: "+nome2);
if(pontos1>=pontos3) {
	System.out.println("2° lugar: "+nome1);
    System.out.println("3° lugar: "+nome3);
    }else {
    	System.out.println("2° lugar: "+nome3);
        System.out.println("3° lugar: "+nome1);
    }
}else {
	System.out.println("1°lugar: "+nome3);
   if (pontos1>=pontos2) {
	   System.out.println("2° lugar: "+nome1);
	    System.out.println("3° lugar: "+nome2);
   }else {
	   System.out.println("2° lugar: "+nome2);
	    System.out.println("3° lugar: "+nome1);
   }




}

sc.close();
}
}