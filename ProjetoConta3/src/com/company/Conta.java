package com.company;

public class Conta {
    private String conta;
    private String agencia;
    private double saldo;
    private String nomeCliente;

    public String getConta() {
        return conta;
    }

    public void setConta(String conta) {
        this.conta = conta;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }




    
    public int  sacar(double valor){
        if(valor <= saldo ){
            saldo-=valor;
            return 1;

        }else{
            return 0;


        }

    }
    public void depositar(double valor){
        if(valor > 0){
            saldo+= valor;
            System.out.println("Deposito efetuado com sucesso");
        }

    }
    public void imprimir(){
        System.out.println("conta = " + conta);
        System.out.println("agencia = " + agencia);
        System.out.println("saldo = " + saldo);
        System.out.println("nomeCliente = " + nomeCliente);
    }


}
