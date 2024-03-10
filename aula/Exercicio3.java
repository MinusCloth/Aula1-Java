package aula;

import java.util.Scanner;

public class Exercicio3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite os valores da base e da altura do triângulo");
		double base = sc.nextDouble();
		double altura = sc.nextDouble();
		
		System.out.println("A área do seu triângulo é: "+base*altura/2);
	
	}

}
