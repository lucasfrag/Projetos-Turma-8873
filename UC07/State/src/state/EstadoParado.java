package state;


public class EstadoParado implements EstadoReproducao {
    @Override
    public void reproduzir() {
        System.out.println("Iniciando a reprodução.");
    }
    
    @Override
    public void pausar() {
        System.out.println("Não é possível pausar, a reprodução ainda não começou.");
    }
    
    @Override
    public void parar() {
        System.out.println("Já estou parado.");
    }
}
