package composite;

import java.util.ArrayList;
import java.util.List;

public class Pasta implements Componente {
    private String nome;
    private List<Componente> componentes;
    
    public Pasta(String nome) {
        this.nome = nome;
        this.componentes = new ArrayList<>();
    }
    
    public void adicionarComponente(Componente componente) {
        componentes.add(componente);
    }
    
    public void removerComponente(Componente componente) {
        componentes.remove(componente);
    }
    
    @Override
    public void imprimir() {
        System.out.println("Pasta: " + nome);
        for(Componente componente : componentes) {
            componente.imprimir();
        }
        System.out.println("======================");
    }
}
