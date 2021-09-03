package calculoDaArea;

import java.util.Scanner;

public class AreaCazinha {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner (System.in);
		
		String comodo;
		int largura;
		int comprimento;
		int total;
		
		System.out.println("Qual o nome do cômodo? ");
		comodo = leitor.next();
		
		System.out.println("Qual a largura? ");
		largura = leitor.nextInt();
		
		System.out.println("Qual o comprimento? ");
		comprimento = leitor.nextInt();
		
		total = (largura*comprimento);
		System.out.println("A(o) " + comodo + " tem " + total + " metros.");
		
		String resposta = "S"; //S != s
		
		

	}

}
