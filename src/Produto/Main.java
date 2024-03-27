package Produto;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Produto produto = new Produto();
        Scanner leia = new Scanner(System.in);
        System.out.println("informe o nome do produto:");
        produto.nome = leia.next();
        System.out.println("Informe o preço:");
        produto.preco = leia.nextDouble();
        System.out.println("Informe a Quantidade:");
        produto.quantidade = leia.nextInt();
        produto.calcularValorTotalEstoque();
    }
}
