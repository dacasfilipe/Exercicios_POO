package Produto;

public class Produto {
    String nome;
    double preco;
    int quantidade;
    //métodos
    //método para calcular o valor total em estoque
    public void calcularValorTotalEstoque(){
        double valorTotal = preco * quantidade;
        System.out.println("Valor total em estoque R$"+valorTotal);
    }
}
