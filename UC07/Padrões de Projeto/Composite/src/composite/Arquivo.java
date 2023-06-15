
package composite;

public class Arquivo implements Componente {
    private String nome;
    
    public Arquivo(String nome) {
        this.nome = nome;
    }
    
    @Override
    public void imprimir() {
        System.out.println("Arquivo: " + nome);
    }
}
