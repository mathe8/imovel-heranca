package com.atividade.main;

import com.atividade.imovel.Novo;
import com.atividade.imovel.Velho;

public class Main {

    public static void main(String[] args) {

        // Crie a classe Imovel, que possui um endereço e um preço.
        // a. crie uma classe Novo, que herda Imovel e possui um adicional no preço. Crie métodos de acesso e impressão deste valor adicional.
        // b. crie uma classe Velho, que herda Imovel e possui um desconto no preço. Crie métodos de acesso e impressão para este desconto.
        
        // Imovel Novo
        Novo i1 = new Novo();

        i1.setEndereco("Brasil");
        i1.setPreco(10000.0);
        i1.atribuirAdicional(2000.0);

        i1.imprimirTipoImovel();
        i1.imprimirEndereco();
        i1.imprimirPreco();
        i1.imprimirAdicional();
        i1.imprimirValorComAdicional();

        System.out.print("\n");

        // Imovel Velho
        Velho i2 = new Velho();

        i2.setEndereco("Argentina");
        i2.setPreco(5000.0);
        i2.atribuirDesconto(500.0);

        i2.imprimirTipoImovel();
        i2.imprimirEndereco();
        i2.imprimirPreco();
        i2.imprimirDesconto();
        i2.imprimirValorComDesconto();
    }
}
