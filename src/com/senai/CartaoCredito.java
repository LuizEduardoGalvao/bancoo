package com.senai;

public class CartaoCredito {

    private String Numeracao;
    private String Data;
    private String Validade;
    private int Codigo;
    private Cliente cliente;


    public String getNumeracao() {
        return Numeracao;
    }

    public void setNumeracao(String numeracao) {
        Numeracao = numeracao;
    }

    public String getData() {
        return Data;
    }

    public void setData(String data) {
        Data = data;
    }

    public String getValidade() {
        return Validade;
    }

    public void setValidade(String validade) {
        Validade = validade;
    }

    public int getCodigo() {
        return Codigo;
    }

    public void setCodigo(int codigo) {
        Codigo = codigo;
    }



    public CartaoCredito(Cliente cliente){
        this.cliente = cliente;

    }

    public CartaoCredito(String Nome){
        cliente = new Cliente();
        cliente.setNome(Nome);
    }

    public Cliente getCliente() {
        return cliente;
    }






}