package ContaBancaria;

public class ContaBancaria {
    private String titular;
    private double saldo=0;
    //Método construtor do objeto
//   public ContaBancaria(){
//
//   }
    //Métodos Get e Set eles são métodos de acesso
    public String getTitular(){
        return this.titular;
    }
    public void setTitular(String titular){
        this.titular = titular;
    }


    public ContaBancaria(String titular,double saldo){
        this.titular = titular;
        this.saldo = saldo;
    }

    public void depositar(double valor){
        this.saldo = this.saldo + valor;
        System.out.println("Saldo Atual:"+this.saldo);
    }
    public void sacar(double valor){
        if(valor <= saldo){
            this.saldo = this.saldo - valor;
            System.out.println("Saque efetuado com sucesso!");
            System.out.println("Saldo Atual:"+this.saldo);
        }else{
            System.out.println("Saldo insuficiente.");
        }
    }

}
