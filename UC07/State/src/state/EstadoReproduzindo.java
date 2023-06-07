package state;

public class EstadoReproduzindo implements EstadoReproducao {
    @Override
    public void reproduzir() {
        System.out.println("Já estou reproduzindo.");
    }
    
    @Override
    public void pausar() {
        System.out.print("Pausando a reprodução.");
    }
    
    @Override
    public void parar() {
        System.out.print("Parando a reprodução");
    }
}
