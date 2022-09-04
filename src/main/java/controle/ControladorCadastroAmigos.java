package controle;

import entidade.Amigo;
import interfaces.JanelaCadastroAmigos;

public class ControladorCadastroAmigos {
    public ControladorCadastroAmigos() {
        new JanelaCadastroAmigos(this).setVisible(true);
    }
    
    public String inserirAmigo(Amigo amigo){
        Amigo amigo1 = Amigo.buscarAmigo(amigo.getNome());
        if(amigo1 == null) return Amigo.inserirAmigo(amigo);
        else return "Nome de amigo já cadastrado";
    }
    
    public String alterarAmigo(Amigo amigo) {
        Amigo amigo1 = Amigo.buscarAmigo(amigo.getNome());
        if(amigo1 != null) return Amigo.alterarAmigo(amigo);
        else return "Nome de amigo não cadastrado";
    }
    
    public String removerAmigo(String nome){
        Amigo amigol=Amigo.buscarAmigo(nome);
        if(amigol!=null) return Amigo.removerAmigo(nome);
        else return"Nome de amigo não cadastrado";
    }
}
