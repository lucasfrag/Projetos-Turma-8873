package state;

public class EstadoPausado implements EstadoReproducao {
    
    @Override
    public void reproduzir() {
        System.out.println("Retomando a reprodução");
    }
    
    @Override
    public void pausar(){
        System.out.print("Já estou pausado.");
    }
    
    @Override
    public void parar() {
        System.out.print("Parando a reprodução.");
    }
}
