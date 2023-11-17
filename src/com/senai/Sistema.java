package com.senai;
import java.util.Scanner;
public class Sistema {

    public static void main(String[] args) {

        Cliente c1 = new Cliente();
        c1.setNome("Luizaaaum");

        Cliente c2 = new Cliente();
        c2.setNome("Galvao");



        CartaoCredito[] credito = new CartaoCredito[2];
        credito[0] = new CartaoCredito("Luiz");
        credito[1] = new CartaoCredito("Galvao");

        // primeira conta luiz

        CartaoCredito credito1 = new CartaoCredito(c1);
        credito1.setNumeracao("555");
        credito1.setCodigo(555);
        credito1.setData("10/20");
        credito1.setValidade("29/70");

        // segunda conta galvao

        CartaoCredito credito2 = new CartaoCredito(c2);
        credito2.setNumeracao("777");
        credito2.setCodigo(152);
        credito2.setData("13/22");
        credito2.setValidade("19/40");




        // atribuindo numero da agencia
        Agencia agencia1 = new Agencia(5);
        Agencia agencia2 = new Agencia(10);


        // dando valor para a conta ( dados do cliente / numero da conta / dados da agencia )
        Contas conta1 = new Contas(c1,12, agencia1);
        Contas conta2 = new Contas(c2, 20, agencia2);


        System.out.println("++++ CODIGO CONTA1: "+c1.getCodigo());
        System.out.println("++++ NOME CONTA1: "+c1.getNome());
        System.out.println("++++ NUMERO DE CARTAO CONTA1: " +credito1.getNumeracao());
        System.out.println("++++ CVV: "+credito1.getCodigo());
        System.out.println("++++ DATA: "+credito1.getData());
        System.out.println("++++ Validade: "+credito1.getValidade());
        System.out.println("");
        System.out.println("");
        System.out.println("++++ CODIGO CONTA2: "+c2.getCodigo());
        System.out.println("++++ NOME CONTA1: "+c2.getNome());
        System.out.println("++++ NUMERO DE CARTAO CONTA1: " +credito2.getNumeracao());
        System.out.println("++++ CVV: "+credito2.getCodigo());
        System.out.println("++++ DATA: "+credito2.getData());
        System.out.println("++++ Validade: "+credito2.getValidade());
        System.out.println("");
        System.out.println("");


        //Atribuindo valor ao saldo das contas
        conta1.Depositar(400);
        conta2.Depositar(400);

        System.out.println("Valor conta1 RS"+conta1.getSaldo());
        System.out.println("Valor conta2 RS"+conta2.getSaldo());
        System.out.println("");
        System.out.println("");
        //Transferindo valor
        System.out.println("Transferencia feita!");
        conta1.Transfere(conta2, 100);
        System.out.println("Saldo da conta que saiu o dinheiro: "+conta1.getSaldo());
        System.out.println("Saldo da conta que Recebeu o dinheiro o dinheiro: "+conta2.getSaldo());


        conta1.Sacar(900);


    }
}