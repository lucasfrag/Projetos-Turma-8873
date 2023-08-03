package gui.exemplo;

import javax.swing.JOptionPane;

public class JOptionPaneExemplo {

    public static void main(String[] args) {
        // 0 = SIM
        // 1 = NÃO
        int resposta = 0;
        do {
            String nome = JOptionPane.showInputDialog("Digite seu nome:");

            if (nome.equalsIgnoreCase("Lucas")) {
                JOptionPane.showMessageDialog(null, "Olá, tutor " + nome + "!", "Boas-vindas!", 1);
            } else if (nome.isBlank() || nome.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Nome inválido!", "Erro!", 0);
            } else {
                JOptionPane.showMessageDialog(null, "Olá, " + nome + "!", "Boas-vindas!", 1);
            }
            resposta = JOptionPane.showConfirmDialog(null, "Deseja continuar?");
        } while (resposta == 0);
    }

}
