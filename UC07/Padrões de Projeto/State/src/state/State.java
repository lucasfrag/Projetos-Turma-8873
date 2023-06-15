package state;

public class State {

    public static void main(String[] args) {
        ReprodutorMultimedia reprodutor = new ReprodutorMultimedia();
        
        reprodutor.reproduzir();
        reprodutor.pausar();
        reprodutor.parar();
        reprodutor.reproduzir();
        reprodutor.pausar();
        reprodutor.reproduzir();
        reprodutor.parar();
    }
    
}
