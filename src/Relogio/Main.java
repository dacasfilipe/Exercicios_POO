package Relogio;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Relogio relogio = new Relogio();
        Scanner leia = new Scanner(System.in);
        System.out.println("digite a hora atual:");
        relogio.hora = leia.nextInt();
        System.out.println("digite o minuto atual:");
        relogio.minuto = leia.nextInt();
        System.out.println("digite o segundo atual:");
        relogio.segundo = leia.nextInt();
        relogio.adicionarHora();
        relogio.exibirHorario();
        relogio.adicionarMinuto();
        relogio.exibirHorario();
        relogio.adicionarSegundo();
        relogio.exibirHorario();
    }
}
