package factory.method.exemplo;

public class FactoryMethodExemplo {

    public static void main(String[] args) {
        FabricaInimigos fabrica = new FabricaInimigos();
        
        Inimigo inimigo1 = fabrica.criarInimigo("fraco");
        inimigo1.atacar();
        
        Inimigo inimigo2 = fabrica.criarInimigo("forte");
        inimigo2.atacar();
        
    }
    
}
