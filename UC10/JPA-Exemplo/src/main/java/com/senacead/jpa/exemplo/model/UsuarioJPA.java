package com.senacead.jpa.exemplo.model;

import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;
import java.util.List;

public class UsuarioJPA {
    public static Usuario validarUsuario(Usuario user) {
        EntityManager manager = JPAUtil.conectar();
        try {
            List<Usuario> usuariosEncontrados = manager
                    .createQuery("SELECT u FROM usuario u WHERE u.login = :login AND u.senha = :senha", Usuario.class)
                    .setParameter("login", user.getLogin())
                    .setParameter("senha", user.getSenha())
                    .getResultList();
            
            if (!usuariosEncontrados.isEmpty()) {
                System.out.println("Usuário encontrado!");
                return usuariosEncontrados.get(0);
            } else {
                System.out.println("Nenhum usuário encontrado");
            }
            
        } catch (Exception e) {
            System.out.println("Ocorreu um erro ao buscar o usuário");
            System.out.println(e);
        } finally {
            JPAUtil.desconectar();
        }

        return null;
    }
}
