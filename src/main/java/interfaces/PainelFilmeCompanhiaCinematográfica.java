/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package interfaces;

/**
 *
 * @author hoffmeister
 */
public class PainelFilmeCompanhiaCinematográfica extends javax.swing.JPanel {

    /**
     * Creates new form PainelFilmeCompanhiaCinematográfica
     */
    public PainelFilmeCompanhiaCinematográfica() {
        initComponents();
    }
    
    public boolean isOscarMelhorFilme() {
        return oscar_filmeCheckBox.isSelected();
    }
    
    public void setOscarMelhorFilme(boolean oscar_melhor_filme) {
        oscar_filmeCheckBox.setSelected(oscar_melhor_filme);
    }
    
    public String getOscarMelhorDiretor() {
        String diretor = oscar_diretorTextField.getText();
        if (diretor.isEmpty()) return null;
        else return diretor;
    }
    
    public void setOscarMelhorDiretor(String diretor) {
        oscar_diretorTextField.setText(diretor);
    }
    
    public String getOscarMelhorAtor() {
        String ator = oscar_atorTextField.getText();
        if (ator.isEmpty()) return null;
        else return ator;
    }
    
    public void setOscarMelhorAtor(String ator) {
        oscar_atorTextField.setText(ator);
    }
    
    public String getOscarMelhorAtriz() {
        String atriz = oscar_atrizTextField.getText();
        if (atriz.isEmpty()) return null;
        else return atriz;
    }
    
    public void setOscarMelhorAtriz(String atriz) {
        oscar_atrizTextField.setText(atriz);
    }
    
    public void limparCampos() {
        oscar_filmeCheckBox.setSelected(false);
        oscar_diretorTextField.setText("");
        oscar_atorTextField.setText("");
        oscar_atrizTextField.setText("");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        oscar_filmeCheckBox = new javax.swing.JCheckBox();
        oscarDeMelhorDiretorTextLabel = new javax.swing.JLabel();
        oscarDeMelhorAtorTextLabel = new javax.swing.JLabel();
        oscarDeMelhorAtrizTextLabel = new javax.swing.JLabel();
        oscar_diretorTextField = new javax.swing.JTextField();
        oscar_atorTextField = new javax.swing.JTextField();
        oscar_atrizTextField = new javax.swing.JTextField();

        oscar_filmeCheckBox.setText("Oscar de Melhor Filme");

        oscarDeMelhorDiretorTextLabel.setText("Oscar de Melhor Diretor");

        oscarDeMelhorAtorTextLabel.setText("Oscar de Melhor Ator");

        oscarDeMelhorAtrizTextLabel.setText("Oscar de Melhor Atriz");

        oscar_diretorTextField.setPreferredSize(new java.awt.Dimension(246, 25));

        oscar_atorTextField.setPreferredSize(new java.awt.Dimension(246, 25));

        oscar_atrizTextField.setPreferredSize(new java.awt.Dimension(246, 25));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(134, 134, 134)
                        .addComponent(oscar_filmeCheckBox))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(oscarDeMelhorDiretorTextLabel)
                            .addComponent(oscarDeMelhorAtorTextLabel)
                            .addComponent(oscarDeMelhorAtrizTextLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(oscar_diretorTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 294, Short.MAX_VALUE)
                            .addComponent(oscar_atorTextField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(oscar_atrizTextField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(oscar_filmeCheckBox)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(oscarDeMelhorDiretorTextLabel)
                    .addComponent(oscar_diretorTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(oscarDeMelhorAtorTextLabel)
                    .addComponent(oscar_atorTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(oscarDeMelhorAtrizTextLabel)
                    .addComponent(oscar_atrizTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel oscarDeMelhorAtorTextLabel;
    private javax.swing.JLabel oscarDeMelhorAtrizTextLabel;
    private javax.swing.JLabel oscarDeMelhorDiretorTextLabel;
    private javax.swing.JTextField oscar_atorTextField;
    private javax.swing.JTextField oscar_atrizTextField;
    private javax.swing.JTextField oscar_diretorTextField;
    private javax.swing.JCheckBox oscar_filmeCheckBox;
    // End of variables declaration//GEN-END:variables
}
