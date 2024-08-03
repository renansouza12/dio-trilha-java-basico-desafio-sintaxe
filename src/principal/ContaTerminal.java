package principal;

import java.util.Scanner;

public class ContaTerminal {
    private int numero;
    private String agencia;
    private String nomeCliente;
    private double saldo;

    Scanner sc = new Scanner(System.in);

    public ContaTerminal() {
        System.out.println("Por favor, insira o número da conta : ");
        this.numero = sc.nextInt();
        sc.nextLine();

        System.out.println("Por favor, insira o número da Agencia: ");
        this.agencia = sc.nextLine();

        System.out.println("Informe o nome do Cliente: ");
        this.nomeCliente = sc.nextLine();

        System.out.println("Por favor, insira o saldo: ");
        this.saldo = Double.parseDouble(sc.nextLine());

        System.out.printf("""
            "Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %.2f já está disponível para saque".
                """, this.nomeCliente, this.agencia, this.numero, this.saldo);
    }
}
