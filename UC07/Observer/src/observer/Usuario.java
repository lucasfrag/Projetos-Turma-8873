package observer;

public class Usuario implements Observador {
    private String nome;
    
    public Usuario(String nome) {
        this.nome = nome;
    }
    
    @Override
    public void receberNotificacao(String mensagem) {
        System.out.println(nome + " recebeu a notificação: " + mensagem);
    }
}
