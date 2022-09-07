package entidade;

public class FilmeCompanhiaCinematográfica extends Filme {
    private boolean oscarMelhorFilme;
    private String oscarMelhorDiretor;
    private String oscarMelhorAtor;
    private String oscarMelhorAtriz;

    public FilmeCompanhiaCinematográfica(int sequencial, String título, Gênero gênero, int ano) {
        super(sequencial, título, gênero, ano);
    }
    
}
