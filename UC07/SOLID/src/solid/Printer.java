package solid;
// Interface Segregation Principle		=	Princípio da Segregação de Interfaces
public interface Printer {
    void print(Document document)
}

public interface Scanner {
    void scan(Document document);
}

public class AllInOnePrinter implements Printer, Scanner {
    public void print(Document document) {
        // Lógica para imprimir um documento
    }
    
    public void scan(Document document) {
        // Lógica para digitalizar um documento
    }
}