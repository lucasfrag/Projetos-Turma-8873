package com.senacead.jpa.exemplo.model;

import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;
import java.util.ArrayList;
import java.util.List;

public class LivroJPA {
    // CRUD: Create, Read ,  Delete

    public static void cadastrar(Livro l) {
        EntityManager manager = JPAUtil.conectar();
        try {
            manager.getTransaction().begin();
            manager.persist(l);
            manager.getTransaction().commit();
        } catch (Exception e) {
            //System.out.println("O seguinte erro aconteceu: " + e);
            manager.getTransaction().rollback();
        } finally {
            JPAUtil.desconectar();
        }
    }

    public static List<Livro> buscar (String filtro) {
        List<Livro> lista = new ArrayList<Livro>();

        EntityManager manager = JPAUtil.conectar();
        try {
            Query consulta = manager.createQuery("SELECT l FROM livro l WHERE (:titulo is null OR l.titulo LIKE :titulo)");
            consulta.setParameter("titulo", filtro.isEmpty() ?null : "%" + filtro +"%");
            lista = consulta.getResultList();
        } catch (Exception e) {
            System.out.println("Ocorreu um erro ao listar os dados");
            System.out.println(e);
        } finally {
            JPAUtil.desconectar();
        }
        return lista;
    }
    
    public static List<Livro> listar() {
        List<Livro> lista = new ArrayList<Livro>();

        EntityManager manager = JPAUtil.conectar();
        try {
            Query consulta = manager.createQuery("SELECT l FROM livro l");
            lista = consulta.getResultList();
        } catch (Exception e) {
            System.out.println("Ocorreu um erro ao listar os dados");
            System.out.println(e);
        } finally {
            JPAUtil.desconectar();
        }
        return lista;
    }

    public static void excluir(int id) {
        EntityManager manager = JPAUtil.conectar();
        try {
            manager.getTransaction().begin();
            Livro l = manager.find(Livro.class, id);
            if(l != null) {
                manager.remove(l);
            }
            manager.getTransaction().commit();
            
        } catch (Exception e) {
            System.out.println("Ocorreu um erro ao remover o rgistro.");
            System.out.println(e);
        } finally {
            JPAUtil.desconectar();
        }
    }
}
