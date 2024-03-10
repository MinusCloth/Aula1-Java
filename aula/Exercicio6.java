package aula;
import java.util.Scanner;
public class Exercicio6 {
	public static void main(String [] args) {
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o seu sexo[m]asculino ou [f]eminino");
		String sexo = sc.nextLine();
		
		System.out.println("Digite a sua altura em metros: ");
		double altura = sc.nextDouble();
		double pIdeal;
		
		String masculino="m";
		String feminino = "f";
		if(sexo.toLowerCase().equals(masculino)) {
			pIdeal=(72.7*altura)-58;
			System.out.println("O seu peso ideal é "+pIdeal);
		}
		else if(sexo.toLowerCase().equals(feminino)) {
			pIdeal=(62.1*altura)-44.7;
			System.out.println("O seu peso ideal é "+pIdeal);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
