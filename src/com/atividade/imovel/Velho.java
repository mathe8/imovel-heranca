package com.atividade.imovel;

public class Velho extends Imovel {

    private Double Desconto;
    private Double ValorComDesconto;

    public Double getDesconto() {
        return this.Desconto;
    }

    public Double getValorComDesconto() {
        return this.ValorComDesconto;
    }

    public void atribuirDesconto(Double Desconto) {
        this.Desconto = Desconto;
        this.ValorComDesconto = Preco - Desconto;
    }

    public void imprimirDesconto(){
        System.out.println("Desconto: "+this.Desconto);
    }

    public void imprimirValorComDesconto(){
        System.out.println("Valor com correção: "+ this.ValorComDesconto);
    }

    public void imprimirTipoImovel(){
        System.out.println("- Velho -");
    }

}
