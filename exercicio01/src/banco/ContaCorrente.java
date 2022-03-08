package banco;

import java.util.Scanner;

public class ContaCorrente {

    // ATRIBUTOS
    private int numero;
    private String titular;
    private double saldo;
    private double valorDepositado;
    private int sacar;

    Scanner entrada = new Scanner(System.in);

    // MÉTODO CONSTRUTOR
    public ContaCorrente(int numero, String titular, double valorDepositado) {
        this.numero = numero;
        this.titular = titular;
        this.valorDepositado = valorDepositado;
    }

    // SOBRECARGA
    public ContaCorrente(int numero, String titular, int sacar) {
        this.numero = numero;
        this.titular = titular;
        this.sacar = sacar;
    }

    public ContaCorrente(int numero, String titular) {
        this.numero = numero;
        this.titular = titular;
    }
    public ContaCorrente(double valorDepositado) {
        this.valorDepositado = valorDepositado;
    }

    // MÉTODOS DE ACESSO A MINHA CLASSE

    // NUMERO
    private void setNumero(int numero) {
        this.numero = numero;
    }

    private int getNumero() {
        return numero;
    }

    // TITULAR
    public void setTitular(String titular) {
        this.titular = titular;
    }

    public String getTitular() {
        return titular;
    }

    // SALDO
    public void setSaldo(double valor) {
        this.saldo += valor;
    }

    public double getSaldo() {
        return this.saldo;
    }

    // DEPOSITAR
    public void setValorDepositado(double valor) {
        this.valorDepositado += valor;
    }

    public double getValorDepositado() {
        return valorDepositado;
    }

    // SACAR
    public void setSacar(double valor) {
        double saldo = getValorDepositado();
        double sac = valor + 5;
        this.saldo = saldo - sac;
    }

    public int getSacar() {
        return sacar;
    }

    public void entradaDeposito() {
        System.out.print("Desejar fazer um deposito (s/n)?");
        String conf = entrada.nextLine();
        if (conf.equals("S") || conf.equals("s")) {
            double dep = 0;
            System.out.println();
            System.out.print("Entre com um valor de depósito: R$");
            dep = Double.parseDouble(entrada.nextLine());
            setValorDepositado(dep);
        }

    }

    public void imprimir() {
        System.out.println("Entre com Número da Conta: " + getNumero() + "\n");
        System.out.println("Nome do Titular: " + getTitular() + "\n");
        entradaDeposito();

        System.out.println("Dados: \n");

        System.out.println("Conta " + getNumero() + ", " + "Titular: " + getTitular() + ", " + "Saldo: R$" + getValorDepositado() + "\n");
    }

    public void entreValorDep() {
        double dep = 0;
        System.out.print("Entre com um valor de depósito: R$");
        dep = Double.parseDouble(entrada.nextLine());
        setValorDepositado(dep);
    }


    public void dadosAtualizados() {
        System.out.println("Dados Atualizados: \n");
        System.out.println("Conta " + getNumero() + ", " + "Titular: " + getTitular() + ", " + "Saldo: R$" + getValorDepositado() + "\n");
    }

    public void entradaSaque() {
        double sac = 0;
        System.out.print("Entre com valor para Saque: R$");
        sac = Double.parseDouble(entrada.nextLine());
        setSacar(sac);
    }

    public void dadosAtualizados1() {
        System.out.println("Conta " + getNumero() + ", " + "Titular: " + getTitular() + ", " + "Saldo: R$" + getSaldo() + "\n");
    }
}

















