/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package interfaces;

import controle.ControladorCadastroAmigos;
import controle.ControladorCadastroFilmes;
import javax.swing.JOptionPane;
import persistência.BD;

/**
 *
 * @author hoffmeister
 */
public class JanelaAmigosCinema extends javax.swing.JFrame {

    /**
     * Creates new form JanelaAmigosCinema
     */
    public JanelaAmigosCinema() {
        BD.criaConexão();
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        amigos_cinemaMenuBar = new javax.swing.JMenuBar();
        amigoMenu = new javax.swing.JMenu();
        cadastrar_amigoItemMenu = new javax.swing.JMenuItem();
        filmeMenu = new javax.swing.JMenu();
        cadastrar_filmeItemMenu = new javax.swing.JMenuItem();
        avaliacaoMenu = new javax.swing.JMenu();
        cadastrar_avaliaçãoItemMenu = new javax.swing.JMenuItem();
        pesquisar_avaliaçãoItemMenu = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Clube de Amigos do Cinema");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                terminarSistema(evt);
            }
        });

        amigoMenu.setLabel("Amigo");
        amigoMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastrarAmigo(evt);
            }
        });

        cadastrar_amigoItemMenu.setText("Cadastrar");
        cadastrar_amigoItemMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastrarAmigo(evt);
            }
        });
        amigoMenu.add(cadastrar_amigoItemMenu);

        amigos_cinemaMenuBar.add(amigoMenu);

        filmeMenu.setLabel("Filme");
        filmeMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastrarFilme(evt);
            }
        });

        cadastrar_filmeItemMenu.setText("Cadastrar");
        cadastrar_filmeItemMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastrarFilme(evt);
            }
        });
        filmeMenu.add(cadastrar_filmeItemMenu);

        amigos_cinemaMenuBar.add(filmeMenu);

        avaliacaoMenu.setLabel("Avaliação");

        cadastrar_avaliaçãoItemMenu.setText("Cadastrar");
        avaliacaoMenu.add(cadastrar_avaliaçãoItemMenu);

        pesquisar_avaliaçãoItemMenu.setText("Pesquisar");
        pesquisar_avaliaçãoItemMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pesquisarAvaliações(evt);
            }
        });
        avaliacaoMenu.add(pesquisar_avaliaçãoItemMenu);

        amigos_cinemaMenuBar.add(avaliacaoMenu);

        setJMenuBar(amigos_cinemaMenuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 277, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cadastrarFilme(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastrarFilme
        new ControladorCadastroFilmes();
    }//GEN-LAST:event_cadastrarFilme

    private void terminarSistema(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_terminarSistema
        BD.fechaConexão();
        initComponents();
    }//GEN-LAST:event_terminarSistema

    private void pesquisarAvaliações(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pesquisarAvaliações
        informarServiçoIndisponível();
    }//GEN-LAST:event_pesquisarAvaliações

    private void cadastrarAmigo(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastrarAmigo
        new ControladorCadastroAmigos();
    }//GEN-LAST:event_cadastrarAmigo

    private void informarServiçoIndisponível() {
        JOptionPane.showMessageDialog(this, "Serviço Indísponível", "Informação", JOptionPane.INFORMATION_MESSAGE);
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
            java.util.logging.Logger.getLogger(JanelaAmigosCinema.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JanelaAmigosCinema.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JanelaAmigosCinema.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JanelaAmigosCinema.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JanelaAmigosCinema().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu amigoMenu;
    private javax.swing.JMenuBar amigos_cinemaMenuBar;
    private javax.swing.JMenu avaliacaoMenu;
    private javax.swing.JMenuItem cadastrar_amigoItemMenu;
    private javax.swing.JMenuItem cadastrar_avaliaçãoItemMenu;
    private javax.swing.JMenuItem cadastrar_filmeItemMenu;
    private javax.swing.JMenu filmeMenu;
    private javax.swing.JMenuItem pesquisar_avaliaçãoItemMenu;
    // End of variables declaration//GEN-END:variables
}