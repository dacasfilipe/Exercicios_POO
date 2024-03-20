package Carro;

public class Carro {
    String marca;
    String modelo;
    int ano;

    public void exibirDetalhes(){
        System.out.println("Marca:"+this.marca);
        System.out.println("Modelo:"+this.modelo);
        System.out.println("Ano:"+this.ano);
    }
}
