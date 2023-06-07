package pkgabstract.factory;

public class FabricaMonstro implements FabricaPersonagem {
    @Override
    public Personagem criarPersonagem() {
        return new Monstro();
    }
}
