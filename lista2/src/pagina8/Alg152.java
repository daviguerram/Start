package pagina8;
import java.util.Scanner;
public class Alg152 {

	public static void main(String[] args) {
Scanner leia=new Scanner(System.in);
System.out.println("Digite a idade do paciente: ");
int idade=leia.nextInt();
System.out.println("Digite o peso do paciente em Kg: ");
int peso=leia.nextInt();
if(idade>=12) {
	if(peso>=60) {
	 double gotas=1000*0.04;
	 System.out.println("O paciente deve tomar "+gotas+" gotas do medicamento");
	}else {
		double gotas=875*0.04;
		System.out.println("O paciente deve tomar "+gotas+" gotas do medicamento");
	}
}else {
	if(peso<5) {
		System.out.println("Peso inválido para o uso do medicamento");
	}else if(peso<=9) {
		double gotas=125+0.04;
		System.out.println("O paciente deve tomar "+gotas+" gotas do medicamento");
	}else if(peso<=16) {
		double gotas=250*0.04;
		System.out.println("O paciente deve tomar "+gotas+" gotas do medicamento");
	}else if(peso<=24) {
		double gotas=375*0.04;
		System.out.println("O paciente deve tomar "+gotas+" gotas do medicamento");
	}else if(peso<=30) {
		double gotas=500*0.04;
		System.out.println("O paciente deve tomar "+gotas+" gotas do medicamento");
	}else {
		double gotas=750*0.04;
		System.out.println("O paciente deve tomar "+gotas+" gotas do medicamento");
	}

}
	
	}

}
