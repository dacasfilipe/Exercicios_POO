package Carro;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Carro carro = new Carro();
        Scanner leia = new Scanner(System.in);
        System.out.println("Digite a marca:");
        carro.marca = leia.next();
        System.out.println("Digite a modelo:");
        carro.modelo = leia.next();
        System.out.println("Digite o Ano:");
        carro.ano = leia.nextInt();
        carro.exibirDetalhes();
    }
}
