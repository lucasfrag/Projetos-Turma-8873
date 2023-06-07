package state;

public class ReprodutorMultimedia {
    private EstadoReproducao estadoAtual;
    
    public ReprodutorMultimedia() {
        this.estadoAtual = new EstadoParado();
    }
    
    public void setEstado(EstadoReproducao estado) {
        this.estadoAtual = estado;
    }
    
    public void reproduzir() {
        estadoAtual.reproduzir();
    }
    
    public void pausar() {
        estadoAtual.pausar();
    }
    
    public void parar() {
        estadoAtual.parar();
    }
}
