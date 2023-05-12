package view;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		int nat=6;
		int soma = recursaoNat(nat);
		System.out.println(soma);
		
	}

	private static int recursaoNat(int nat) {
		if(nat<=0) { // condição de parada
			return 0;
		}else {
			return nat + recursaoNat(nat-1); // chamada de recursão
		}
	}
}
