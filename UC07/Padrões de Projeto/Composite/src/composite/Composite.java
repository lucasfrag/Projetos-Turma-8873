package composite;

public class Composite {

    public static void main(String[] args) {
        Pasta pasta1 = new Pasta("Documentos");
        Pasta pasta2 = new Pasta("Imagens");
        
        Componente arquivo1 = new Arquivo("Relatorio.docx");
        Componente arquivo2 = new Arquivo("Foto1.jpg");
        Componente arquivo3 = new Arquivo("Foto2.png");
        
        pasta1.adicionarComponente(arquivo1);
        pasta2.adicionarComponente(arquivo2);
        pasta2.adicionarComponente(arquivo3);
        
        Pasta pastaPrincipal = new Pasta("Desktop");
        pastaPrincipal.adicionarComponente(pasta1);
        pastaPrincipal.adicionarComponente(pasta2);
        
        pastaPrincipal.imprimir();
    }
    
}
