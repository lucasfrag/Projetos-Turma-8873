package observer;

public interface Assunto {
    void adicionarObservador(Observador observador);
    void removerObservador(Observador observador);
    void notificarObservadores(String mensagem);
}
