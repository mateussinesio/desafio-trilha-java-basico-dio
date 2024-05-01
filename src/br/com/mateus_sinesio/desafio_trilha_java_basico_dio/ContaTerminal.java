package br.com.mateus_sinesio.desafio_trilha_java_basico_dio;

import java.util.Scanner;
import java.util.Locale;

public class ContaTerminal {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
		
		System.out.println("Digite o número da sua conta: ");
		int numeroDaConta = scanner.nextInt();
		scanner.nextLine();
		
		System.out.println("Digite o número da sua agência: ");
		String numeroDaAgencia = scanner.nextLine();
		
		System.out.println("Digite o seu nome: ");
		String nome = scanner.nextLine();
		
		System.out.println("Digite o seu saldo: ");
		double saldo = scanner.nextDouble();
		
		System.out.println("Olá, " + nome + ". Obrigado por criar uma conta em nosso banco. Sua agência é: " + numeroDaAgencia + ", o número da sua conta é: " + numeroDaConta + " e o seu saldo: " + saldo + " está disponível para saque.");
	}
}
