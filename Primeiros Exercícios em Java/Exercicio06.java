package br.com.generation.exercicios01;

import java.util.Scanner;

/*6. Construa um programa em java que, tendo como dados de entrada dois pontos quaisquer no plano, 
	P(x1, y1) e P(x2, y2), escreva a dist�ncia entre eles. A f�rmula que efetua tal c�lculo �: 
	    d= Raizde (x2-x1)� + (y2-y1)� */

public class Exercicio06 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		
		double x1, x2, y1, y2, p1, p2, d;
		
		
		System.out.println("Digite o valor de x1: ");
		x1 = leia.nextDouble();
		
		System.out.println("Digite o valor de x2: ");
		x2 = leia.nextDouble();
		
		System.out.println("Digite o valor de y1: ");
		y1 = leia.nextDouble();
		
		System.out.println("Digite o valor de y2: ");
		y2 = leia.nextDouble();
		
		p1 = Math.pow((x2 - x1), 2);
		p2 = Math.pow((y2 - y1), 2);
		
		d = Math.sqrt(p1 + p2);

		System.out.println("A dist�ncia entre os dois pontos �: " + d);
		
		leia.close();
		
	}

}
