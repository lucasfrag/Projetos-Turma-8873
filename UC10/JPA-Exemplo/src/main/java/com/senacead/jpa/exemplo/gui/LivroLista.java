/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.senacead.jpa.exemplo.gui;

import com.senacead.jpa.exemplo.model.Livro;
import com.senacead.jpa.exemplo.model.LivroJPA;
import com.senacead.jpa.exemplo.model.Usuario;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.event.TableModelEvent;
import javax.swing.event.TableModelListener;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author tiluc
 */
public class LivroLista extends javax.swing.JFrame {

    /**
     * Creates new form LivroLista
     */
    
    public LivroLista() {
        
    }
    
    public LivroLista(Usuario u) {
        initComponents();
        
        if (u.getNivel().equalsIgnoreCase("Administrador")) {
            AdicionarBotao.setEnabled(true);
            ExcluirBotao.setEnabled(true);
        } else if (u.getNivel().equalsIgnoreCase("Operador")) {
            
            ExcluirBotao.setVisible(false);
        } else {
            //AdicionarBotao.setEnabled(false);
            AdicionarBotao.setVisible(false);
            //ExcluirBotao.setEnabled(false);
            ExcluirBotao.setVisible(false);
        }
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Cabecalho = new javax.swing.JPanel();
        Titulo = new javax.swing.JLabel();
        Descricao = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        TabelaScroll = new javax.swing.JScrollPane();
        TabelaDeLivros = new javax.swing.JTable();
        PesquisarCampo = new javax.swing.JTextField();
        PesquisarBotao = new javax.swing.JButton();
        PesquisarTexto = new javax.swing.JLabel();
        AdicionarBotao = new javax.swing.JButton();
        ExcluirBotao = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                formFocusGained(evt);
            }
        });
        addWindowFocusListener(new java.awt.event.WindowFocusListener() {
            public void windowGainedFocus(java.awt.event.WindowEvent evt) {
                formWindowGainedFocus(evt);
            }
            public void windowLostFocus(java.awt.event.WindowEvent evt) {
            }
        });

        Titulo.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Titulo.setText("Lista de livros");

        Descricao.setText("Abaixo está a lista completa de todos os livros cadastrados:");

        javax.swing.GroupLayout CabecalhoLayout = new javax.swing.GroupLayout(Cabecalho);
        Cabecalho.setLayout(CabecalhoLayout);
        CabecalhoLayout.setHorizontalGroup(
            CabecalhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CabecalhoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(CabecalhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Titulo, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Descricao))
                .addContainerGap(129, Short.MAX_VALUE))
        );
        CabecalhoLayout.setVerticalGroup(
            CabecalhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CabecalhoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Titulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Descricao)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        DefaultTableModel tabela = montarTabela(LivroJPA.listar());
        TabelaDeLivros.setModel(tabela);
        TabelaDeLivros.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                TabelaDeLivrosPropertyChange(evt);
            }
        });
        TabelaScroll.setViewportView(TabelaDeLivros);

        PesquisarBotao.setForeground(new java.awt.Color(0, 153, 102));
        PesquisarBotao.setText("Buscar");
        PesquisarBotao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PesquisarBotaoActionPerformed(evt);
            }
        });

        PesquisarTexto.setText("Pesquisar:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(TabelaScroll)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(PesquisarTexto)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PesquisarCampo, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PesquisarBotao)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PesquisarCampo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PesquisarBotao)
                    .addComponent(PesquisarTexto))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                .addComponent(TabelaScroll, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        AdicionarBotao.setForeground(new java.awt.Color(0, 153, 255));
        AdicionarBotao.setText("Adicionar novo livro");
        AdicionarBotao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AdicionarBotaoActionPerformed(evt);
            }
        });

        ExcluirBotao.setForeground(new java.awt.Color(255, 0, 51));
        ExcluirBotao.setText("Excluir");
        ExcluirBotao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExcluirBotaoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Cabecalho, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(129, 129, 129))
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(AdicionarBotao)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ExcluirBotao)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Cabecalho, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AdicionarBotao)
                    .addComponent(ExcluirBotao))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void PesquisarBotaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PesquisarBotaoActionPerformed
        // TODO add your handling code here:
        List<Livro> lista = LivroJPA.buscar(PesquisarCampo.getText());
        DefaultTableModel tabela = montarTabela(lista);
        TabelaDeLivros.setModel(tabela);
        TabelaScroll.setViewportView(TabelaDeLivros);
    }//GEN-LAST:event_PesquisarBotaoActionPerformed

    private void AdicionarBotaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AdicionarBotaoActionPerformed
        // TODO add your handling code here:
        LivroCadastro tela = new LivroCadastro();
        tela.setVisible(true);
    }//GEN-LAST:event_AdicionarBotaoActionPerformed

    private void formFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_formFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_formFocusGained

    private void formWindowGainedFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowGainedFocus
        // TODO add your handling code here:
        DefaultTableModel tabela = montarTabela(LivroJPA.listar());
        TabelaDeLivros.setModel(tabela);
        TabelaScroll.setViewportView(TabelaDeLivros);
    }//GEN-LAST:event_formWindowGainedFocus

    private void ExcluirBotaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExcluirBotaoActionPerformed
        // TODO add your handling code here:
        LivroJPA.excluir(Integer.parseInt(getId()));

        JOptionPane.showMessageDialog(null, "Registro excluido com sucesso!");

        DefaultTableModel tabela = montarTabela(LivroJPA.listar());
        TabelaDeLivros.setModel(tabela);
        TabelaScroll.setViewportView(TabelaDeLivros);
    }//GEN-LAST:event_ExcluirBotaoActionPerformed

    private void TabelaDeLivrosPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_TabelaDeLivrosPropertyChange
        // TODO add your handling code here:
        TabelaDeLivros.getModel().addTableModelListener(new TableModelListener() {
            @Override
            public void tableChanged(TableModelEvent e) {
                if (e.getType() == TableModelEvent.UPDATE) {
                    int row = e.getFirstRow();
                    int column = e.getColumn();
                    EditavelTableModel model = (EditavelTableModel) e.getSource();

                    //System.out.println(model.getValueAt(row, 0));
                    String idString = (String) model.getValueAt(row, 0);
                    int id = Integer.parseInt(idString); 
                    String titulo = (String) model.getValueAt(row, 1);
                    String autor = (String) model.getValueAt(row, 2);
                    String editora = (String) model.getValueAt(row, 3);
                    String dataPublicacao = (String) model.getValueAt(row, 4);                     
                    boolean lido = false;
                    
                    // Verifica se o campo está como "sim" e "não" e muda para true e false
                    if("Sim".equalsIgnoreCase((String) model.getValueAt(row, 5))) {
                        lido = true; 
                    } else if ("Não".equalsIgnoreCase((String) model.getValueAt(row, 5))) {
                        lido = false;
                    }

                    // Objeto livro completo
                    Livro l = new Livro(id, titulo, autor, editora, lido, Livro.converterParaFormatoBanco(dataPublicacao));
                    
                    // Você pode usá-lo para chamar o método atualizarBanco() ou realizar outras ações.
                    //LivroBD.atualizar(l);
                    
                }
            }
        });
    }//GEN-LAST:event_TabelaDeLivrosPropertyChange

    private String getId() {
        int posicao = TabelaDeLivros.getSelectedRow();
        if (posicao == -1) {
            JOptionPane.showMessageDialog(null, "Selecione um item da tabela.");
        }

        return (String) TabelaDeLivros.getValueAt(posicao, 0);
    }

    // Método para "construir" a tabela
    private EditavelTableModel montarTabela(List<Livro> lista) {
        String[] colunas = {"ID", "Titulo", "Autor", "Editora", "Data de Publicação", "Lido"};

        EditavelTableModel tabela = new EditavelTableModel();
        tabela.setColumnIdentifiers(colunas);

        for (int i = 0; i < lista.size(); i++) {
            Livro l = lista.get(i);
            String lido = "";

            if (l.isLido()) {
                lido = "Sim";
            } else {
                lido = "Não";
            }

            String[] linha = {
                Integer.toString(l.getId()),
                l.getTitulo(),
                l.getAutor(),
                l.getEditora(),
                Livro.converterParaFormatoJava(l.getDataPublicacao()),
                lido,};
            tabela.addRow(linha);
        }
        
        return tabela;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(LivroLista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LivroLista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LivroLista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LivroLista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LivroLista().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AdicionarBotao;
    private javax.swing.JPanel Cabecalho;
    private javax.swing.JLabel Descricao;
    private javax.swing.JButton ExcluirBotao;
    private javax.swing.JButton PesquisarBotao;
    private javax.swing.JTextField PesquisarCampo;
    private javax.swing.JLabel PesquisarTexto;
    private javax.swing.JTable TabelaDeLivros;
    private javax.swing.JScrollPane TabelaScroll;
    private javax.swing.JLabel Titulo;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}