package com.senacead.jpa.exemplo.model;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class JPAUtil {
    private static String PERSISTENCE_UNIT = "Livro-PU";
    private static EntityManager manager;
    private static EntityManagerFactory factory;
    
    public static EntityManager conectar() {
        if(factory == null || !factory.isOpen()) {
            factory = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT);
        }
        
        if(manager == null || !manager.isOpen()) {
            manager = factory.createEntityManager();
        }
        
        return manager;
    }
    
    public static void desconectar() {
        if(manager.isOpen() && manager != null) {
            manager.close();
            factory.close();
        }
    }
    
    
}
