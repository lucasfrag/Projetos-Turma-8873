package lean;

public class Lean {

    /* Remover código morto ou comentado */
    // Método não utilizado
    private void metodoNaoUtilizado() {
        // ...
        
        
        /* Simplificar condicionais desnecessárias */
        boolean condicao = true;

        // Jeito ineficiente: if (condicao == true) {
        if (condicao) {
            System.out.println("Condição verdadeira!");
        } else {
            System.out.println("Condição falsa!");
        }
    }

    public static void main(String[] args) {
        // Código comentado
        // System.out.println("Olá, mundo!");
        System.out.println("Lorem Ipsum is simply dummy text of the printing and typesetting industry. "
                + "Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an "
                + "unknown printer took a galley of type and scrambled it to make a type specimen book. "
                + "It has survived not only five centuries, but also the leap into electronic typesetting, "
                + "remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset "
                + "sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like"
                + " Aldus PageMaker including versions of Lorem Ipsum.");
        
        int resultado = soma(2,3);
        System.out.println(resultado);
        
        System.out.println("Ola, João!");
        System.out.println("Ola, João!");
        System.out.println("Ola, João!");
        System.out.println("Ola, João!");
        System.out.println("Ola, João!");
        System.out.println("Ola, João!");
        
        saudacao("João");
        saudacao("Maria");
        saudacao("Pedro");
        
    }
    
    private static int soma(int valor1, int valor2) {
        // Calcula a soma do valor1 e valor2
        int resultado = valor1 + valor2;
        return  resultado;
    }
    
    private static void saudacao(String nome) {
        System.out.println("Olá, " + nome + "!");
    }

    public static void verificar(int valor) {
        try {
            if (valor > 10) {

            } else if(valor > 5) {

            }else if(valor > 3) {

            } else {

            }
        } catch (Exception e) {
            System.out.println("Por favor, informe um valor válido!");
        }
    }
   
    
    // Código sem refatoração
    public void calcularTotal(double preco, int quantidade) {
        // lógica
        double desconto = 0.5;
        double total = preco * quantidade;
        total -= total * desconto;
        System.out.println("Total: " + total);
    }
    
    // Código com refatoração:
    public void exibirTotal(double preco, int quantidade) {
        double total = calcularPrecoTotalComDesconto(preco, quantidade);
        System.out.println("Total: " + total);
    }
    
    public double calcularPrecoTotalComDesconto(double preco, int quantidade) {
        double desconto = 0.1;
        double total = preco * quantidade;
        total -= total * desconto;
        return total;
    }
    
}
