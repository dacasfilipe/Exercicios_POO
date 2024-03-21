package ContaBancaria;

public class ContaBancaria {
    String titular;
    double saldo;
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
