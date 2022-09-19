package controle;

import entidade.Filme;
import interfaces.JanelaCadastroFilmes;

public class ControladorCadastroFilmes {
    public ControladorCadastroFilmes() {
        new JanelaCadastroFilmes(this).setVisible(true);
    }
    
    public String inserirFilme(Filme filme){
        if (!Filme.existeFilmeMesmosAtributos(filme)) return Filme.inserirFilme(filme);
        else return "Já existe um filme com os mesmo atributos";
    }
    
    public String alterarFilme(Filme filme) {
        Filme filmel = Filme.buscarFilme(filme.getSequencial());
        if(filmel != null) return Filme.alterarFilme(filme);
        else return "Nome de filme não cadastrado";
    }
    
    public String removerFilme(Filme filme){
        Filme filmel=Filme.buscarFilme(filme.getSequencial());
        if(filmel!=null) return Filme.removerFilme(filme);
        else return"Nome de filme não cadastrado";
    }
}
