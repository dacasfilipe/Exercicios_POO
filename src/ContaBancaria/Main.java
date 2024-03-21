package ContaBancaria;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);
        System.out.println("Nome do Titular:");
        String titular = leia.next();
        System.out.println("Informe o saldo:");
        double saldo = leia.nextDouble();
        ContaBancaria contaBancaria = new ContaBancaria(titular,saldo);
        System.out.println("Titular:"+contaBancaria.getTitular());
        System.out.println("troca do titular");
        System.out.println("digite o nome do novo titular:");
        titular = leia.next();
        contaBancaria.setTitular(titular);
        System.out.println("Titular:"+contaBancaria.getTitular());
        //Depositar
        System.out.println("Informe o valor do Depósito:");
        double valor = leia.nextDouble();
        contaBancaria.depositar(valor);
        //Sacar
        System.out.println("Informe o valor do Saque:");
        valor = leia.nextDouble();
        contaBancaria.sacar(valor);

    }
}
