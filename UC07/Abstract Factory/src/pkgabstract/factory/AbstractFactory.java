package pkgabstract.factory;

public class AbstractFactory {

    public static void main(String[] args) {
        FabricaPersonagem fabricaHeroi = new FabricaHeroi();
        Personagem heroi = fabricaHeroi.criarPersonagem();
        heroi.executarAcao();
        
        FabricaPersonagem fabricaMonstro = new FabricaMonstro();
        Personagem monstro = fabricaMonstro.criarPersonagem();
        monstro.executarAcao();
    }
    
}
