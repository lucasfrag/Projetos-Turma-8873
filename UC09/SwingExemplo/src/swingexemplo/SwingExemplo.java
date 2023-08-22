package swingexemplo;

import swingexemplo.telas.TelaInicial;

public class SwingExemplo {

    public static void main(String[] args) {

        try {
            TelaInicial tela = new TelaInicial();
            tela.setVisible(true);
        } catch(Exception ex) {
            System.out.println("Erro na operação.");
            System.out.println(ex);
        }
        
       
    }
    
}
