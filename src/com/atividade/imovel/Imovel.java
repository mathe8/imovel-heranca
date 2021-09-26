package com.atividade.imovel;

public class Imovel {

    public String Endereco;
    public Double Preco;

    public String getEndereco() {
        return this.Endereco;
    }

    public Double getPreco() {
        return this.Preco;
    }

    public void setEndereco(String endereco) {
        this.Endereco = endereco;
    }

    public void setPreco(Double preco) {
       this.Preco = preco;
    }

    public void imprimirEndereco(){
        System.out.println("Endereço: "+this.Endereco);
    }

    public void imprimirPreco(){
        System.out.println("Preço: "+this.Preco);
    }


}
