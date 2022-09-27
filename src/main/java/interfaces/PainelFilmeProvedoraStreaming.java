package interfaces;

import entidade.FilmeProvedoraStreaming.Produção;
import entidade.FilmeProvedoraStreaming.ProvedoraStreaming;
import javax.swing.DefaultComboBoxModel;

public class PainelFilmeProvedoraStreaming extends javax.swing.JPanel {
    public PainelFilmeProvedoraStreaming() {
        initComponents();
    }
    
    public ProvedoraStreaming getSelectedProvedoraStreaming() {
        Object provedora_streaming = provedoraComboBox.getSelectedItem();
        if (provedora_streaming != null) return (ProvedoraStreaming) provedora_streaming;
        else return null;
    }
    
    public void setSelectedProvedoraStreaming(ProvedoraStreaming provedora_streaming) {
        provedoraComboBox.setSelectedItem(provedora_streaming);
    }
    
    public Produção getSelectedProdução() {
        Produção produção = null;
        if (produçãoButtonGroup.getSelection() != null)
            produção = Produção.values()[produçãoButtonGroup.getSelection().getMnemonic()];
        return produção;
    }
    
    public void setSelectedProdução(int índice_produção) {
        switch(índice_produção) {
            case 0: filmeRadioButton.setSelected(true); break;
            case 1: sérieRadioButton.setSelected(true);
        }
    }
    
    public int getTotalEpisódios() {
        String total_episódios_str = total_episódiosTextField.getText();
        if (!total_episódios_str.isEmpty()) return Integer.parseInt(total_episódios_str);
        else return -1;
    }
    
    public void setTotalEpisódios(int total_episódios) {
        total_episódiosTextField.setText(total_episódios+"");
    }
    
    public void limparCampos() {
        provedoraComboBox.setSelectedIndex(-1);
        produçãoButtonGroup.clearSelection();
        total_episódiosTextField.setText("");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        produçãoButtonGroup = new javax.swing.ButtonGroup();
        provedoraLabel = new javax.swing.JLabel();
        produçãoLabel = new javax.swing.JLabel();
        total_episódiosLabel = new javax.swing.JLabel();
        provedoraComboBox = new javax.swing.JComboBox<>();
        produçãoPanel = new javax.swing.JPanel();
        filmeRadioButton = new javax.swing.JRadioButton();
        sérieRadioButton = new javax.swing.JRadioButton();
        total_episódiosTextField = new javax.swing.JTextField();

        provedoraLabel.setText("Provedora de Streaming");

        produçãoLabel.setText("Produção");

        total_episódiosLabel.setText("Total de Episódios");

        provedoraComboBox.setModel(new DefaultComboBoxModel(ProvedoraStreaming.values()));
        provedoraComboBox.setPreferredSize(new java.awt.Dimension(100, 25));

        produçãoPanel.setPreferredSize(new java.awt.Dimension(200, 33));

        produçãoButtonGroup.add(filmeRadioButton);
        filmeRadioButton.setMnemonic(0);
        filmeRadioButton.setText("Filme");

        produçãoButtonGroup.add(sérieRadioButton);
        sérieRadioButton.setMnemonic(1);
        sérieRadioButton.setText("Série");

        javax.swing.GroupLayout produçãoPanelLayout = new javax.swing.GroupLayout(produçãoPanel);
        produçãoPanel.setLayout(produçãoPanelLayout);
        produçãoPanelLayout.setHorizontalGroup(
            produçãoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(produçãoPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(filmeRadioButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sérieRadioButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        produçãoPanelLayout.setVerticalGroup(
            produçãoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, produçãoPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(produçãoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(filmeRadioButton)
                    .addComponent(sérieRadioButton))
                .addContainerGap())
        );

        total_episódiosTextField.setPreferredSize(new java.awt.Dimension(246, 25));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(provedoraLabel)
                    .addComponent(total_episódiosLabel)
                    .addComponent(produçãoLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(provedoraComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(produçãoPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(total_episódiosTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(provedoraLabel)
                    .addComponent(provedoraComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(produçãoLabel)
                    .addComponent(produçãoPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(total_episódiosLabel)
                    .addComponent(total_episódiosTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton filmeRadioButton;
    private javax.swing.ButtonGroup produçãoButtonGroup;
    private javax.swing.JLabel produçãoLabel;
    private javax.swing.JPanel produçãoPanel;
    private javax.swing.JComboBox<String> provedoraComboBox;
    private javax.swing.JLabel provedoraLabel;
    private javax.swing.JRadioButton sérieRadioButton;
    private javax.swing.JLabel total_episódiosLabel;
    private javax.swing.JTextField total_episódiosTextField;
    // End of variables declaration//GEN-END:variables
}
