package observer;

public class Observer {

    public static void main(String[] args) {
        Mensageiro mensageiro = new Mensageiro();
        
        Usuario usuario1 = new Usuario("Samuel");
        Usuario usuario2 = new Usuario("Anael");
        
        mensageiro.adicionarObservador(usuario1);
        mensageiro.adicionarObservador(usuario2);
        
        mensageiro.receberMensagem("Olá! Seja bem-vindo!");
        mensageiro.removerObservador(usuario1);
        mensageiro.receberMensagem("Sabia que o Samuel saiu do grupo?");
       
    }
    
}
