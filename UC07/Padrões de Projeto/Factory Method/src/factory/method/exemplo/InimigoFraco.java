package factory.method.exemplo;

public class InimigoFraco implements Inimigo {
    @Override
    public void atacar() {
        System.out.println("Inimigo fraco atacando de forma simples.");
    }
}
