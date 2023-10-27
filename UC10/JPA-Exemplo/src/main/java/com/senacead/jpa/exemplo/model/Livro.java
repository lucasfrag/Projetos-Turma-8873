package com.senacead.jpa.exemplo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity(name="livro")
public class Livro {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    
    private String titulo;
    private String autor;
    private String editora;
    private boolean lido;
    private String dataPublicacao;
    //private int ativo;
    
    public Livro() {
        
    }

    public Livro(int id, String titulo, String autor, String editora, boolean lido, String dataPublicacao) {
        this.id = id;
        this.titulo = titulo;
        this.autor = autor;
        this.editora = editora;
        this.lido = lido;
        this.dataPublicacao = dataPublicacao;
    }
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public boolean isLido() {
        return lido;
    }

    public void setLido(boolean lido) {
        this.lido = lido;
    }

    public String getDataPublicacao() {
        return dataPublicacao;
    }

    public void setDataPublicacao(String dataPublicacao) {
        this.dataPublicacao = dataPublicacao;
    }
    
    
        
    
    /* Métodos para tratamento de datas */
    
    // Exemplo: 22/10/2023 para 2023-10-22
    public static String converterParaFormatoBanco(String dataAntiga) {
        String dataFormatoBanco;
        String[] partesData = dataAntiga.split("/");
        dataFormatoBanco = partesData[2] + "-" + partesData[1] + "-" + partesData[0];
        return dataFormatoBanco;
    }
    // Exemplo: 2023-10-22 para 22/10/2023 
    public static String converterParaFormatoJava(String dataAntiga) {
        String[] partesData = dataAntiga.split("-");
        String dataFormatoJava = partesData[2] + "/" + partesData[1] + "/" + partesData[0];
        return dataFormatoJava;
    }
    
}
