/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controle;

import entidade.Avaliação;
import interfaces.JanelaCadastroAvaliações;

/**
 *
 * @author hoffmeister
 */
public class ControladorCadastroAvaliações {
    public ControladorCadastroAvaliações() {
        new JanelaCadastroAvaliações(this).setVisible(true);
    }
    
    public String inserirAvaliação(Avaliação avaliação) {
        if (!Avaliação.existeAvaliação(avaliação.getAmigo().getNome(), avaliação.getFilme().getSequencial())) {
            return Avaliação.inserirAvaliação(avaliação);
        } else return "Avaliação já cadastrada";
    }
    
    public String alterarAvaliação(Avaliação avaliação_informada) {
        Avaliação avaliação_cadastradas = Avaliação.buscarAvaliação(avaliação_informada.getSequencial());
        if ((avaliação_informada.getAmigo().getNome().equals(avaliação_cadastradas.getAmigo().getNome()))
                && (avaliação_informada.getFilme().getSequencial() == avaliação_cadastradas.getFilme().getSequencial())) {
            return Avaliação.alterarAvaliação (avaliação_informada);
        } else return "Avaliação não permitida: chave do amigo e/ou do filme foram alteradas";
    }
    
    public String removerAvaliação(int sequencial) {
        if (Avaliação.existeAvaliação(sequencial)) return Avaliação.removerAvaliação(sequencial);
        else return "Sequencial não corresponde a nenhuma reserva cadastrada";
    }
}
