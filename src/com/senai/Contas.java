package com.senai;

public class Contas {

    public int getNumero() {
        return Numero;
    }

    public void setNumero(int numero) {
        Numero = numero;
    }

    public float getSaldo() {
        return Saldo;
    }

    public void setSaldo(float saldo) {
        Saldo = saldo;
    }

    public float getLimite() {
        return Limite;
    }

    public void setLimite(float limite) {
        Limite = limite;
    }

    private int Numero;
    private float Saldo;
    private float Limite;
    private Cliente cliente;
    private Agencia agencia;
    private Contas destino;


    public Contas(Cliente cliente, int Numero, Agencia agencia){
        this.Numero = Numero;
        this.Saldo = 0;
        this.Limite = 500;
        this.cliente = cliente;
        this.agencia= agencia;

    }

    public Contas(Cliente cliente){
        this.cliente = cliente;

    }

    public Contas(String Nome){
        cliente = new Cliente();
        cliente.setNome(Nome);
    }

    public Cliente getCliente() {
        return cliente;
    }



    public Contas(Agencia agencia){
        this.agencia = agencia;

    }

    public Contas(int Numero){
        agencia = new Agencia();
        agencia.getNumero();
    }

    public Agencia getAgencia() {
        return agencia;
    }



    public boolean Sacar(float valor){
        if(valor > Saldo){
            System.out.println("VOCÊ ESTA POBRE!");
        }
        else {
            Saldo = Saldo - valor;
            System.out.println("Novo Saldo em Conta: R$" +Saldo);
        }
        return false;
    }
    public void Depositar(float valor){

        Saldo = Saldo + valor;

    }

    public void Transfere(Contas destino, float valor) {

            //contas.Saldo = contas.Saldo + valor;
            //System.out.println("Novo Saldo da Conta: RS"+contas.Saldo);

                Sacar(valor);
                destino.Depositar(valor);


    }



}

