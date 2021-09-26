package com.atividade.imovel;

public class Novo extends Imovel {

    private Double Adicional;
    private Double ValorComAdicional;

    public Double getAdicional() {
        return this.Adicional;
    }

    public Double getValorComAdicional() {
        return this.ValorComAdicional;
    }

    public void atribuirAdicional(Double Adicional) {
        this.Adicional = Adicional;
        this.ValorComAdicional = Preco + Adicional;
    }

    public void imprimirAdicional(){
        System.out.println("Adicional: "+this.Adicional);
    }

    public void imprimirValorComAdicional(){
        System.out.println("Valor com correção: "+this.ValorComAdicional);
    }

    public void imprimirTipoImovel(){
        System.out.println("- Novo -");
    }

}
