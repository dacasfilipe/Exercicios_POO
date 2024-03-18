package Calculadora;

public class Main {
    public static void main(String[] args) {
        //Criando o objeto calculadora
        Calculadora calculadora = new Calculadora();
        double resultado = 0;
        //Chamando os métodos

        resultado = calculadora.somar(5,10);
        System.out.println("A soma é:"+resultado);
        resultado = calculadora.subtrair(5,10);
        System.out.println("A subtração é:"+resultado);
        resultado = calculadora.multiplicar(5,10);
        System.out.println("A multiplicação é:"+resultado);
        resultado = calculadora.dividir(5,10);
        System.out.println("A divisão é:"+resultado);

    }
}
