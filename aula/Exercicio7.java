package aula;
import java.util.Scanner;
public class Exercicio7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o valor de a e b: ");
		int a =sc.nextInt();
		int b =sc.nextInt();
		int resultado = 0;
		if(a<b) {
			for(int i = a;i<=b;i++) {
				resultado+=i;
			}System.out.println(resultado);
		}
		else if(a>b) {
			for(int i=b;i==a;i++) {
				resultado+=i;
			}System.out.println(resultado);
		}
		else {System.out.println("Erro!!");}
		
		}
		
	}


