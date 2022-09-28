/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controle;

import entidade.Avaliação;

/**
 *
 * @author hoffmeister
 */
public class ControladorCadastroAvaliações {
    public String inserirAvaliação(Avaliação avaliação) {
        if (!Avaliação.existeAvaliação(avaliação.getAmigo().getNome(), avaliação.getFilmes().getSequencial())) {
            return Avaliação.inserirAvaliação(avaliação);
        } else return "Avaliação já cadastrada";
    }
}
