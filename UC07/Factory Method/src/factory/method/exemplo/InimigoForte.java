package factory.method.exemplo;

public class InimigoForte implements Inimigo {
    @Override
    public void atacar() {
        System.out.println("Inimigo forte atacando de forma poderosa!");
    }
}
