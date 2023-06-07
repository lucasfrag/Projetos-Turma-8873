package factory.method.exemplo;

public class FabricaInimigos {
    public Inimigo criarInimigo(String tipo) {
        if (tipo.equals("fraco")) {
            return new InimigoFraco();
        } else if(tipo.equals("forte")) {
            return new InimigoForte();
        } else {
            throw new IllegalArgumentException("Tipo de inimigo inválido!");
        }
    }
}
