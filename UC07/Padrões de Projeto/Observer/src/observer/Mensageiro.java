package observer;

import java.util.ArrayList;
import java.util.List;

public class Mensageiro implements Assunto {
    private List<Observador> observadores;
    
    public Mensageiro() {
        this.observadores = new ArrayList();
    }
    
    @Override
    public void adicionarObservador(Observador observador) {
        observadores.add(observador);
    }
    
    @Override
    public void removerObservador(Observador observador) {
        observadores.remove(observador);
    }
    
    @Override
    public void notificarObservadores(String mensagem) {
        for (Observador observador : observadores) {
            observador.receberNotificacao(mensagem);
        }
    }
    
    public void receberMensagem(String mensagem) {
        System.out.println("Nova mensagem recebida: " + mensagem);
        notificarObservadores(mensagem);
    }
}
