package Animal;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        System.out.println("Nome do Cachorro:");
        String nome = leia.next();
        System.out.println("Idade:");
        int idade = leia.nextInt();
        Cachorro pug = new Cachorro(nome,idade);
        pug.exibirDetalhes();
    }
}
