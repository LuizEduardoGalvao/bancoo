package com.senai;

public class Cliente {


    private CartaoCredito[] cartoes;

    private static int contador = 1;

    public Cliente(){
        cartoes = new CartaoCredito[2];
        Codigo = contador;
        contador++;
    }




    public int getCodigo() {
        return Codigo;
    }

    public void setCodigo(int codigo) {
        this.Codigo = Codigo;
    }



    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        this.Nome = nome;
    }

    private int Codigo;
    private String Nome;



}