package Contador;

public class Contador {
    int valor;
    //Adicione métodos incrementar e decrementar
    // que modificam o valor em uma unidade por vez.
    public void incrementar(){
        valor++; //valor = valor + 1;
    }
    public void decrementar(){
        valor--;
    }
    //Inclua um método exibirValor
    // para mostrar o valor atual do contador.
    public void exibirValor(){
        System.out.println("O valor atual é:"+valor);
    }
}
