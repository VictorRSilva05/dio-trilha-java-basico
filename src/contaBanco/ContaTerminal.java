package contaBanco;

import java.util.Scanner;

public class ContaTerminal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numero;
		String agencia, nomeCliente;
		double saldo;

		Scanner scanner = new Scanner(System.in);

		System.out.print("Digite o número da conta: ");
		numero = scanner.nextInt();

		System.out.print("Digite o número da agência: ");
		agencia = scanner.next();

		System.out.print("Insira seu nome: ");
		nomeCliente = scanner.next();

		System.out.print("Insira seu saldo atual: ");
		saldo = scanner.nextDouble();

		System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco," + " sua agência é "
				+ agencia + ", conta " + numero + "e seu saldo " + saldo + "já está disponível para saque");
	}

}
