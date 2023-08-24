package swingexemplo;

import java.util.ArrayList;

public class ListaProduto {
    private static ArrayList<Produto> listaProduto = new ArrayList<>();
    
    public static void Adicionar(Produto p) {
        listaProduto.add(p);
        System.out.println("Produto adicionado a lista com sucesso");
    }

    public static ArrayList<Produto> Listar() {
        
        return listaProduto;
    }    
    
    public static void Excluir(int posicao) {
        listaProduto.remove(posicao);
    }
}
