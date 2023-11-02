package com.senacead.jpa.exemplo;

import com.senacead.jpa.exemplo.gui.TelaLogin;
import com.senacead.jpa.exemplo.model.JPAUtil;
import com.senacead.jpa.exemplo.model.Livro;
import com.senacead.jpa.exemplo.model.LivroJPA;
import com.senacead.jpa.exemplo.model.Usuario;
import com.senacead.jpa.exemplo.model.UsuarioJPA;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;
import java.util.List;

public class JPAExemplo {

    public static void main(String[] args) throws PrinterException {
        
        //DICA PARA IMPRESSÃO EM IMPRESSORAS 
        // Registrar a venda em um arquivo 2023-11-01 20-53.txt
        //String arquivo = "teste.txt";
        //Impressora.imprimir(arquivo);
        
        TelaLogin tela = new TelaLogin();
        tela.setVisible(true);
        
        /*
        Livro l = new Livro();
        l.setTitulo("Teste 2");
        l.setEditora("Teste  2");
        l.setAutor("Teste Autor 2");
        l.setLido(true);
        l.setDataPublicacao(Livro.converterParaFormatoBanco("25/10/2023"));
        
        LivroJPA.cadastrar(l);
*/
/*
       List<Livro> lista = LivroJPA.listar();
       for( Livro l : lista ) {
            System.out.println(l.getTitulo());
        }*/
    }
}
