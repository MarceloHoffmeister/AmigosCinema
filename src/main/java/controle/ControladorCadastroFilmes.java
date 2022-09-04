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
    
    public String alterarFilme(Filme Filme) {
        Filme filmel = Filme.buscarFilme(Filme.getSequencial());
        if(filmel != null) return Filme.alterarFilme(Filme);
        else return "Nome de filme não cadastrado";
    }
    
    public String removerFilme(int sequencial){
        Filme filmel=Filme.buscarFilme(sequencial);
        if(filmel!=null) return Filme.removerFilme(sequencial);
        else return"Nome de filme não cadastrado";
    }
}
