import java.util.Scanner;

import javax.swing.JOptionPane;

public class Exerciciocalculadora {
	
	public static void main(String[] args) {
		
	Scanner scanner = new Scanner(System.in);
	double v1, v2, soma, sub, mult, div;
	
	System.out.println("digite o primeiro valor: ");
	v1 = scanner.nextDouble();
	System.out.println("Digite o segundo valor: ");
	v2 = scanner.nextDouble();
	
	soma = v1 + v2;
	sub = v1 - v2;
	mult = v1 * v2;
	div = v1 / v2;
	
	System.out.println("O valor somado é: " + soma + ", o valor subtraído é: " + sub + 
			", o valor multiplicado é: " + mult + ", o valor dividido é: " + div);
	
	
	scanner.close();
	}
}
