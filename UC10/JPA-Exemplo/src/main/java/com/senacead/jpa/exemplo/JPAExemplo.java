package com.senacead.jpa.exemplo;

import com.senacead.jpa.exemplo.model.JPAUtil;
import com.senacead.jpa.exemplo.model.Livro;
import com.senacead.jpa.exemplo.model.LivroJPA;
import java.util.List;

public class JPAExemplo {

    public static void main(String[] args) {
       /* Livro l = new Livro();
        l.setTitulo("Teste 2");
        l.setEditora("Teste  2");
        l.setAutor("Teste Autor 2");
        l.setLido(true);
        l.setDataPublicacao(Livro.converterParaFormatoBanco("25/10/2023"));
        
        LivroJPA.cadastrar(l);
*/

       List<Livro> lista = LivroJPA.listar();
       for( Livro l : lista ) {
            System.out.println(l.getTitulo());
        }
    }
}
