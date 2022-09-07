/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package interfaces;

import controle.ControladorCadastroAmigos;
import entidade.Amigo;
import entidade.Amigo.EstadoCivil;
import javax.swing.JOptionPane;
import javax.swing.DefaultComboBoxModel;

/**
 *
 * @author hoffmeister
 */
public class JanelaCadastroAmigos extends javax.swing.JFrame {

    ControladorCadastroAmigos controlador;
    Amigo[] amigos_cadastrados;
    
    /**
     * Creates new form JanelaCadastroAmigos
     */
    public JanelaCadastroAmigos(ControladorCadastroAmigos controlador) {
        this.controlador = controlador;
        amigos_cadastrados = Amigo.getVisões();
        initComponents();
        limparCampos();
    }
    
    private void limparCampos() {
        nomeTextField.setText("");
        apelidoTextField.setText("");
        cidadeTextField.setText("");
        emailTextField.setText("");
        whatsappTextField.setText("");
        instagramTextField.setText("");
        sexoButtonGroup.clearSelection();
        estado_civilButtonGroup.clearSelection();
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

        sexoButtonGroup = new javax.swing.ButtonGroup();
        estado_civilButtonGroup = new javax.swing.ButtonGroup();
        nomeLabel = new javax.swing.JLabel();
        nomeTextField = new javax.swing.JTextField();
        apelidoLabel = new javax.swing.JLabel();
        apelidoTextField = new javax.swing.JTextField();
        cidadeLabel = new javax.swing.JLabel();
        cidadeTextField = new javax.swing.JTextField();
        emailLabel = new javax.swing.JLabel();
        emailTextField = new javax.swing.JTextField();
        whatsappLabel = new javax.swing.JLabel();
        instagramLabel = new javax.swing.JLabel();
        instagramTextField = new javax.swing.JTextField();
        whatsappTextField = new javax.swing.JTextField();
        comandosPanel = new javax.swing.JPanel();
        inserirButton = new javax.swing.JButton();
        consultarButton = new javax.swing.JButton();
        alterarButton = new javax.swing.JButton();
        removerButton = new javax.swing.JButton();
        LimparButton = new javax.swing.JButton();
        amigos_cadastradosComboBox = new javax.swing.JComboBox<>();
        amigosCadastradosTextField = new javax.swing.JLabel();
        sexoPanel = new javax.swing.JPanel();
        femininoRadioButton = new javax.swing.JRadioButton();
        masculinoRadioButton = new javax.swing.JRadioButton();
        estado_civilPanel = new javax.swing.JPanel();
        solteiroRadioButton = new javax.swing.JRadioButton();
        casadoRadioButton = new javax.swing.JRadioButton();
        divorciadoRadioButton = new javax.swing.JRadioButton();
        viuvoRadioButton = new javax.swing.JRadioButton();
        sexoTextLabel = new javax.swing.JLabel();
        estado_civilTextLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastrar Amigos");
        getContentPane().setLayout(new java.awt.GridBagLayout());

        nomeLabel.setText("Nome");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_END;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        getContentPane().add(nomeLabel, gridBagConstraints);

        nomeTextField.setColumns(20);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        getContentPane().add(nomeTextField, gridBagConstraints);

        apelidoLabel.setText("Apelido");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_END;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        getContentPane().add(apelidoLabel, gridBagConstraints);

        apelidoTextField.setColumns(20);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        getContentPane().add(apelidoTextField, gridBagConstraints);

        cidadeLabel.setText("Cidade");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_END;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        getContentPane().add(cidadeLabel, gridBagConstraints);

        cidadeTextField.setColumns(20);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        getContentPane().add(cidadeTextField, gridBagConstraints);

        emailLabel.setText("Email");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_END;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        getContentPane().add(emailLabel, gridBagConstraints);

        emailTextField.setColumns(20);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        getContentPane().add(emailTextField, gridBagConstraints);

        whatsappLabel.setText("Whatsapp");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_END;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        getContentPane().add(whatsappLabel, gridBagConstraints);

        instagramLabel.setText("Instagram");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_END;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        getContentPane().add(instagramLabel, gridBagConstraints);

        instagramTextField.setColumns(20);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        getContentPane().add(instagramTextField, gridBagConstraints);

        whatsappTextField.setColumns(20);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        getContentPane().add(whatsappTextField, gridBagConstraints);

        inserirButton.setText("Inserir");
        inserirButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inserirAmigo(evt);
            }
        });
        comandosPanel.add(inserirButton);

        consultarButton.setText("Consultar");
        consultarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consultarAmigo(evt);
            }
        });
        comandosPanel.add(consultarButton);

        alterarButton.setText("Alterar");
        alterarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alterarAmigo(evt);
            }
        });
        comandosPanel.add(alterarButton);

        removerButton.setText("Remover");
        removerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removerAmigo(evt);
            }
        });
        comandosPanel.add(removerButton);

        LimparButton.setText("Limpar");
        LimparButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limparCampos(evt);
            }
        });
        comandosPanel.add(LimparButton);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 9;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        getContentPane().add(comandosPanel, gridBagConstraints);

        amigos_cadastradosComboBox.setModel(new DefaultComboBoxModel(amigos_cadastrados));
        amigos_cadastradosComboBox.setPreferredSize(new java.awt.Dimension(200, 25));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        getContentPane().add(amigos_cadastradosComboBox, gridBagConstraints);

        amigosCadastradosTextField.setText("Amigos cadastrados");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_END;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        getContentPane().add(amigosCadastradosTextField, gridBagConstraints);

        sexoPanel.setPreferredSize(new java.awt.Dimension(200, 33));

        sexoButtonGroup.add(femininoRadioButton);
        femininoRadioButton.setMnemonic('F');
        femininoRadioButton.setText("Feminino");

        sexoButtonGroup.add(masculinoRadioButton);
        masculinoRadioButton.setMnemonic('M');
        masculinoRadioButton.setText("Masculino");

        javax.swing.GroupLayout sexoPanelLayout = new javax.swing.GroupLayout(sexoPanel);
        sexoPanel.setLayout(sexoPanelLayout);
        sexoPanelLayout.setHorizontalGroup(
            sexoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sexoPanelLayout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(femininoRadioButton)
                .addGap(26, 26, 26)
                .addComponent(masculinoRadioButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        sexoPanelLayout.setVerticalGroup(
            sexoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sexoPanelLayout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(sexoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(femininoRadioButton)
                    .addComponent(masculinoRadioButton))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        getContentPane().add(sexoPanel, gridBagConstraints);

        estado_civilButtonGroup.add(solteiroRadioButton);
        solteiroRadioButton.setMnemonic(0);
        solteiroRadioButton.setText("Solteiro");
        estado_civilPanel.add(solteiroRadioButton);

        estado_civilButtonGroup.add(casadoRadioButton);
        casadoRadioButton.setMnemonic(1);
        casadoRadioButton.setText("Casado");
        estado_civilPanel.add(casadoRadioButton);

        estado_civilButtonGroup.add(divorciadoRadioButton);
        divorciadoRadioButton.setMnemonic(2);
        divorciadoRadioButton.setText("Divorciado");
        estado_civilPanel.add(divorciadoRadioButton);

        estado_civilButtonGroup.add(viuvoRadioButton);
        viuvoRadioButton.setMnemonic(3);
        viuvoRadioButton.setText("Viúvo");
        estado_civilPanel.add(viuvoRadioButton);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        getContentPane().add(estado_civilPanel, gridBagConstraints);

        sexoTextLabel.setText("Sexo");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_END;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        getContentPane().add(sexoTextLabel, gridBagConstraints);

        estado_civilTextLabel.setText("Estado civil");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_END;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        getContentPane().add(estado_civilTextLabel, gridBagConstraints);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void limparCampos(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limparCampos
        limparCampos();
    }//GEN-LAST:event_limparCampos

    private void inserirAmigo(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inserirAmigo
        Amigo amigo = obterAmigoInformado();
        String mensagem_erro = null;
        if(amigo!=null) mensagem_erro = controlador.inserirAmigo(amigo);
        else mensagem_erro = "Algum atributo do amigo não foi informado";
        if(mensagem_erro == null) {
            String visão = amigo.getVisão();
            amigos_cadastradosComboBox.addItem(visão);
            amigos_cadastradosComboBox.setSelectedItem(visão);
        } else informarErro(mensagem_erro);
    }//GEN-LAST:event_inserirAmigo

    private void consultarAmigo(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consultarAmigo
        Amigo visão = (Amigo) amigos_cadastradosComboBox.getSelectedItem();
        String mensagem_erro = null;
        Amigo amigo = null;
        if(visão != null) {
            amigo = Amigo.buscarAmigo(visão.getNome());
            if(amigo == null) mensagem_erro = "Amigo não cadastrado";
        } else mensagem_erro = "Nenhum amigo selecionado";
        if(mensagem_erro == null) {
            nomeTextField.setText(amigo.getNome());
            String apelido = amigo.getApelido();
            if(apelido == null) apelido = "";
            apelidoTextField.setText(apelido);
            cidadeTextField.setText(amigo.getCidade());
            emailTextField.setText(amigo.getEmail());
            String whatsapp = amigo.getWhatsapp();
            if(whatsapp == null) whatsapp = "";
            whatsappTextField.setText(whatsapp);
            String instagram = amigo.getInstagram();
            if(instagram == null) instagram = "";
            instagramTextField.setText(instagram);
            selecionaSexoRadioButton(amigo.getSexo());
            selecioneEstadoCivilRadioButton(amigo.getEstadoCivil().ordinal());
        } else informarErro(mensagem_erro);
    }//GEN-LAST:event_consultarAmigo

    private void selecionaSexoRadioButton(char sexo) {
        switch(sexo) {
            case 'F': femininoRadioButton.setSelected(true); break;
            case 'M': masculinoRadioButton.setSelected(true);
        }
    }
    
    private void selecioneEstadoCivilRadioButton(int indice_estado_civil) {
        switch(indice_estado_civil) {
            case 0: solteiroRadioButton.setSelected(true); break;
            case 1: casadoRadioButton.setSelected(true); break;
            case 2: divorciadoRadioButton.setSelected(true); break;
            case 3: viuvoRadioButton.setSelected(true);
        }
    }
    
    private void alterarAmigo(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alterarAmigo
        Amigo amigo = obterAmigoInformado();
        String mensagem_erro = null;
        if(amigo != null) mensagem_erro = controlador.alterarAmigo(amigo);
        else mensagem_erro = "Algum atributo do amigo não foi informado";
        if(mensagem_erro == null) {
            Amigo visão = getVisãoAlterada(amigo.getNome());
            if (visão != null) {
                visão.setApelido(amigo.getApelido());
                amigos_cadastradosComboBox.updateUI();
                amigos_cadastradosComboBox.setSelectedItem(visão);
            }
        }
        else informarErro(mensagem_erro);
    }//GEN-LAST:event_alterarAmigo

    private Amigo getVisãoAlterada(String nome) {
        for (Amigo visão : amigos_cadastrados) {
            if (visão.getNome().equals(nome)) return visão;
        }
        return null;
    }
    
    private void removerAmigo(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removerAmigo
        Amigo visão = (Amigo) amigos_cadastradosComboBox.getSelectedItem();
        String mensagem_erro = null;
        if(visão != null) mensagem_erro = controlador.removerAmigo(visão.getNome());
        else mensagem_erro="Nenhum amigo selecionado";
        if(mensagem_erro == null) {
            amigos_cadastradosComboBox.removeItem(visão);
            if (amigos_cadastrados.length >= 1) amigos_cadastradosComboBox.setSelectedIndex(0);
            else amigos_cadastradosComboBox.setSelectedIndex(-1);
        }
        else informarErro(mensagem_erro);
    }//GEN-LAST:event_removerAmigo
     
    private Amigo obterAmigoInformado(){        
        String nome = nomeTextField.getText();
        if(nome.isEmpty()) return null;
        String apelido = apelidoTextField.getText();
        if(apelido.isEmpty()) apelido = null;
        String cidade = cidadeTextField.getText();
        if(cidade.isEmpty()) return null;
        String email = emailTextField.getText();
        if(email.isEmpty()) return null;
        String whatsapp = whatsappTextField.getText();
        if(whatsapp.isEmpty())whatsapp=null;
        String instagram = instagramTextField.getText();
        if(instagram.isEmpty()) instagram = null;
        char sexo = 'X';
        if(sexoButtonGroup.getSelection() != null)
            sexo = (char) sexoButtonGroup.getSelection().getMnemonic();
        else return null;
        EstadoCivil estado_civil = null;
        if(estado_civilButtonGroup.getSelection() != null)
            estado_civil = EstadoCivil.values()[estado_civilButtonGroup.getSelection().getMnemonic()];
        else return null;
        return new Amigo(nome, apelido, cidade, email, whatsapp, instagram, sexo, estado_civil);
    }
    
    private void informarSucesso(String mensagem){
        JOptionPane.showMessageDialog(this, mensagem, "Informação", JOptionPane.INFORMATION_MESSAGE);
    }
                                  
    private void informarErro(String mensagem){
        JOptionPane.showMessageDialog(this, mensagem, "Erro", JOptionPane.ERROR_MESSAGE);
    }
    
    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(JanelaCadastroAmigos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(JanelaCadastroAmigos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(JanelaCadastroAmigos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(JanelaCadastroAmigos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new JanelaCadastroAmigos(this).setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton LimparButton;
    private javax.swing.JButton alterarButton;
    private javax.swing.JLabel amigosCadastradosTextField;
    private javax.swing.JComboBox<String> amigos_cadastradosComboBox;
    private javax.swing.JLabel apelidoLabel;
    private javax.swing.JTextField apelidoTextField;
    private javax.swing.JRadioButton casadoRadioButton;
    private javax.swing.JLabel cidadeLabel;
    private javax.swing.JTextField cidadeTextField;
    private javax.swing.JPanel comandosPanel;
    private javax.swing.JButton consultarButton;
    private javax.swing.JRadioButton divorciadoRadioButton;
    private javax.swing.JLabel emailLabel;
    private javax.swing.JTextField emailTextField;
    private javax.swing.ButtonGroup estado_civilButtonGroup;
    private javax.swing.JPanel estado_civilPanel;
    private javax.swing.JLabel estado_civilTextLabel;
    private javax.swing.JRadioButton femininoRadioButton;
    private javax.swing.JButton inserirButton;
    private javax.swing.JLabel instagramLabel;
    private javax.swing.JTextField instagramTextField;
    private javax.swing.JRadioButton masculinoRadioButton;
    private javax.swing.JLabel nomeLabel;
    private javax.swing.JTextField nomeTextField;
    private javax.swing.JButton removerButton;
    private javax.swing.ButtonGroup sexoButtonGroup;
    private javax.swing.JPanel sexoPanel;
    private javax.swing.JLabel sexoTextLabel;
    private javax.swing.JRadioButton solteiroRadioButton;
    private javax.swing.JRadioButton viuvoRadioButton;
    private javax.swing.JLabel whatsappLabel;
    private javax.swing.JTextField whatsappTextField;
    // End of variables declaration//GEN-END:variables
}
