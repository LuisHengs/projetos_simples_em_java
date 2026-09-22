package sistema;

import sistema.controller.BancoDeDados;
import sistema.model.Item;

import java.sql.SQLOutput;
import java.util.ArrayList;

public class Main {
    static void main(String[] args) {
        System.out.println("Sistema de Farmácia");

        BancoDeDados banco = new BancoDeDados();
        ArrayList<Item> itens = banco.ler();

        Item item = banco.pesquisar(2, itens);

        if (item != null)
            System.out.println(item.getNome());
        else
            System.out.println("Não tem medicamendo cadastrado com esse código");

        banco.editar(1, itens);

    }
}
