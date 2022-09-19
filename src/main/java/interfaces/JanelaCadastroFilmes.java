/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package interfaces;

import controle.ControladorCadastroFilmes;
import entidade.Filme;
import entidade.Filme.Gênero;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

/**
 *
 * @author hoffmeister
 */
public class JanelaCadastroFilmes extends javax.swing.JFrame {

    ControladorCadastroFilmes controlador;
    DefaultListModel modelo_lista_filmes;
    PainelFilmeCompanhiaCinematográfica filme_companhia_cinematográficaPainel;
    PainelFilmeProvedoraStreaming filme_provedora_streamingPainel;
    
    /**
     * Creates new form JanelaCadastroFilmes
     */
    public JanelaCadastroFilmes(ControladorCadastroFilmes controlador) {
        this.controlador = controlador;
        initComponents();
        filme_companhia_cinematográficaPainel = new PainelFilmeCompanhiaCinematográfica();
        filme_provedora_streamingPainel = new PainelFilmeProvedoraStreaming();
        especialização_filmeTabbedPane.addTab("Filme de Companhia Cinematográfica", filme_companhia_cinematográficaPainel);
        especialização_filmeTabbedPane.addTab("Filme de Provedora de Streaming", filme_provedora_streamingPainel);
        inicializarListaFilmes();
        limparCampos();
    }
    
    private void inicializarListaFilmes() {
        modelo_lista_filmes = (DefaultListModel)filmes_cadastradosList.getModel();
        filmes_cadastradosList.setModel(modelo_lista_filmes);
        Filme[] visões = Filme.getVisões();
        for (Filme visão : visões) modelo_lista_filmes.addElement(visão.toString());
    }
    
    private void limparCampos() {
        gêneroComboBox.setSelectedIndex(-1);
        sequencialTextField.setText("");
        títuloTextField.setText("");
        anoTextField.setText("");
    }
    
    private void informarErro(String mensagem){
        JOptionPane.showMessageDialog(this, mensagem, "Erro", JOptionPane.ERROR_MESSAGE);
    }
    
    private Filme obterFilmeInformado(){
        String sequencial_str = sequencialTextField.getText();
        int sequencial = 0;
        if (!sequencial_str.isEmpty()) sequencial = Integer.parseInt(sequencial_str);
        Gênero gênero = null;
        if (gêneroComboBox.getSelectedItem() != null) gênero = (Gênero)gêneroComboBox.getSelectedItem();
        else return null;
        String título = títuloTextField.getText();
        if(título.isEmpty()) título = null;
        String ano = anoTextField.getText();
        if(ano.isEmpty()) ano = null;
        return new Filme(sequencial, título, gênero, Integer.parseInt(ano));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jScrollPane1 = new javax.swing.JScrollPane();
        filmes_cadastradosList = new javax.swing.JList<>();
        gêneroComboBox = new javax.swing.JComboBox<>();
        sequencialTextField = new javax.swing.JTextField();
        títuloTextField = new javax.swing.JTextField();
        anoTextField = new javax.swing.JTextField();
        filmesCadastradosLabel = new javax.swing.JLabel();
        identificadorSequencialLabel = new javax.swing.JLabel();
        tituloLabel = new javax.swing.JLabel();
        generoLabel = new javax.swing.JLabel();
        anoLabel = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        inserirButton = new javax.swing.JButton();
        consultaButton = new javax.swing.JButton();
        alterarButton = new javax.swing.JButton();
        removerButton = new javax.swing.JButton();
        limparButton = new javax.swing.JButton();
        especialização_filmeTabbedPane = new javax.swing.JTabbedPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new java.awt.GridBagLayout());

        filmes_cadastradosList.setModel(new DefaultListModel());
        filmes_cadastradosList.setMaximumSize(new java.awt.Dimension(150, 50));
        filmes_cadastradosList.setMinimumSize(new java.awt.Dimension(150, 50));
        filmes_cadastradosList.setPreferredSize(new java.awt.Dimension(150, 50));
        jScrollPane1.setViewportView(filmes_cadastradosList);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        getContentPane().add(jScrollPane1, gridBagConstraints);

        gêneroComboBox.setModel(new DefaultComboBoxModel(Gênero.values()));
        gêneroComboBox.setPreferredSize(new java.awt.Dimension(150, 25));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        getContentPane().add(gêneroComboBox, gridBagConstraints);

        sequencialTextField.setEditable(false);
        sequencialTextField.setPreferredSize(new java.awt.Dimension(80, 25));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        getContentPane().add(sequencialTextField, gridBagConstraints);

        títuloTextField.setPreferredSize(new java.awt.Dimension(400, 25));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        getContentPane().add(títuloTextField, gridBagConstraints);

        anoTextField.setPreferredSize(new java.awt.Dimension(80, 25));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        getContentPane().add(anoTextField, gridBagConstraints);

        filmesCadastradosLabel.setText("Filmes cadastrados");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_END;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        getContentPane().add(filmesCadastradosLabel, gridBagConstraints);

        identificadorSequencialLabel.setText("Identificador sequencial");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_END;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        getContentPane().add(identificadorSequencialLabel, gridBagConstraints);

        tituloLabel.setText("Título");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_END;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        getContentPane().add(tituloLabel, gridBagConstraints);

        generoLabel.setText("Gênero");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_END;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        getContentPane().add(generoLabel, gridBagConstraints);

        anoLabel.setText("Ano");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_END;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        getContentPane().add(anoLabel, gridBagConstraints);

        inserirButton.setText("Inserir");
        inserirButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inserirFilme(evt);
            }
        });

        consultaButton.setText("Consultar");
        consultaButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consultarFilme(evt);
            }
        });

        alterarButton.setText("Alterar");
        alterarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alterarFilme(evt);
            }
        });

        removerButton.setText("Remover");
        removerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removerFilme(evt);
            }
        });

        limparButton.setText("Limpar");
        limparButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limparCampos(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(inserirButton)
                .addGap(18, 18, 18)
                .addComponent(consultaButton)
                .addGap(18, 18, 18)
                .addComponent(alterarButton)
                .addGap(18, 18, 18)
                .addComponent(removerButton)
                .addGap(18, 18, 18)
                .addComponent(limparButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(inserirButton)
                    .addComponent(consultaButton)
                    .addComponent(alterarButton)
                    .addComponent(removerButton)
                    .addComponent(limparButton))
                .addGap(21, 21, 21))
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        getContentPane().add(jPanel1, gridBagConstraints);
        getContentPane().add(especialização_filmeTabbedPane, new java.awt.GridBagConstraints());

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void inserirFilme(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inserirFilme
        Filme filme = obterFilmeInformado();
        String mensagem_erro = null;
        if(filme!=null) mensagem_erro = controlador.inserirFilme(filme);
        else mensagem_erro = "Algum atributo do filme não foi informado";
        if(mensagem_erro == null) {
            int sequencial = Filme.últimoSequencial();
            filme.setSequencial(sequencial);
            modelo_lista_filmes.addElement(filme.getVisão());
            filmes_cadastradosList.setSelectedIndex(modelo_lista_filmes.size() - 1);
            sequencialTextField.setText(""+sequencial);
        } else informarErro(mensagem_erro);
    }//GEN-LAST:event_inserirFilme

    private void consultarFilme(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consultarFilme
        Filme visão = (Filme) filmes_cadastradosList.getSelectedValue();
        String mensagem_erro = null;
        Filme filme = null;
        if(visão != null) {
            filme = Filme.buscarFilme(visão.getSequencial());
            if(filme == null) mensagem_erro = "Filme não cadastrado";
        } else mensagem_erro = "Nenhum filme selecionado";
        if(mensagem_erro == null) {
            sequencialTextField.setText(Integer.toString(filme.getSequencial()));
            String título = filme.getTitulo();
            if(título == null) título = "";
            títuloTextField.setText(título);
            gêneroComboBox.setSelectedItem(filme.getGenero());
            anoTextField.setText(Integer.toString(filme.getAno()));
        } else informarErro(mensagem_erro);
    }//GEN-LAST:event_consultarFilme

    private void alterarFilme(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alterarFilme
        Filme filme = obterFilmeInformado();
        String mensagem_erro = null;
        if(filme!=null) mensagem_erro = controlador.inserirFilme(filme);
        else mensagem_erro = "Algum atributo do filme não foi informado";
        if(mensagem_erro == null) {
            Filme visão = (Filme) filmes_cadastradosList.getModel();
            if (visão != null) {
                visão.setTitulo(filme.getTitulo());
                filmes_cadastradosList.updateUI();
            }
        }
        else informarErro(mensagem_erro);
    }//GEN-LAST:event_alterarFilme

    private void removerFilme(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removerFilme
        Filme visão = (Filme) filmes_cadastradosList.getSelectedValue();
        String mensagem_erro = null;
        Filme filme = null;
        if(visão != null) mensagem_erro = controlador.removerFilme(visão.getSequencial());
        else mensagem_erro="Nenhum filme selecionado";
        if(mensagem_erro == null) modelo_lista_filmes.removeElement(visão);
        else informarErro(mensagem_erro);
    }//GEN-LAST:event_removerFilme

    private void limparCampos(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limparCampos
        limparCampos();
    }//GEN-LAST:event_limparCampos

    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(JanelaCadastroFilmes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(JanelaCadastroFilmes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(JanelaCadastroFilmes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(JanelaCadastroFilmes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
        //</editor-fold>

        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new JanelaCadastroFilmes().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton alterarButton;
    private javax.swing.JLabel anoLabel;
    private javax.swing.JTextField anoTextField;
    private javax.swing.JButton consultaButton;
    private javax.swing.JTabbedPane especialização_filmeTabbedPane;
    private javax.swing.JLabel filmesCadastradosLabel;
    private javax.swing.JList<String> filmes_cadastradosList;
    private javax.swing.JLabel generoLabel;
    private javax.swing.JComboBox<String> gêneroComboBox;
    private javax.swing.JLabel identificadorSequencialLabel;
    private javax.swing.JButton inserirButton;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton limparButton;
    private javax.swing.JButton removerButton;
    private javax.swing.JTextField sequencialTextField;
    private javax.swing.JLabel tituloLabel;
    private javax.swing.JTextField títuloTextField;
    // End of variables declaration//GEN-END:variables
}
