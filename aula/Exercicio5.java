package aula;

import java.util.Scanner;

public class Exercicio5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite os valores de A e B: ");
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		
		if(a==b) {System.out.println("A é igual a B");}
		else if(a>b) {System.out.println("A é maior q B");}
		else{System.out.println("B é maior q A");}
		
	}
}
