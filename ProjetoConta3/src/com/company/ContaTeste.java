package com.company;

import java.util.Scanner;

public class ContaTeste {
  public Conta cc;
  public ContaTeste(){
      cc = new Conta();
  }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opc = 0;
       ContaTeste gc = new ContaTeste();
      do{
          System.out.println("Digite 1 para Cadastrar");
          System.out.println("Digite 2 para Depositar");
          System.out.println("Digite 3 para Sacar");
          System.out.println("Digite 4 para Consultar");
          System.out.println("Digite 5 para sair");
          opc = Integer.parseInt(sc.nextLine());
          switch (opc){
              case 1:
                  gc.execCadastrar();
                  break;
              case 2:
                  gc.execDepositar();
                  break;
              case 3:
                  gc.execSacar();
                  break;
              case 4:
                  gc.execConsultar();
                  break;
              case 5:
                  System.out.println("FIM");
                  break;
              default:
                  System.out.println("Opcao invalida");
          }


      }while(opc!=5);
    }
    public void execCadastrar(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a conta: ");
        cc.setConta(sc.nextLine());
        System.out.println("Digite o nome da agencia: ");
        cc.setAgencia(sc.nextLine());
        System.out.println("Digite o nome do cliente: ");
        cc.setNomeCliente(sc.nextLine());
        System.out.println("Cliente cadastrado com sucesso");

    }
    public void execConsultar(){
        cc.imprimir();

    }
    public void execSacar(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o Valor do saque");
        if(cc.sacar(Double.parseDouble(sc.nextLine())) == 1 ){
            System.out.println("saque efetuado com sucesso");
        }else{
            System.out.println("saldo insuficente");
        }

    }
    public void execDepositar(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o valor do deposito");
        cc.depositar(Double.parseDouble(sc.nextLine()));

    }
}
