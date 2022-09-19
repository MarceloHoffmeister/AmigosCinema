package entidade;

public class FilmeCompanhiaCinematográfica extends Filme {
    private boolean oscarMelhorFilme;
    private String oscarMelhorDiretor;
    private String oscarMelhorAtor;
    private String oscarMelhorAtriz;

    public FilmeCompanhiaCinematográfica(
            int sequencial,
            String título,
            Gênero gênero,
            int ano,
            boolean oscarMelhorFilme,
            boolean oscarMelhorDiretor,
            boolean oscarMelhorAtor,
            boolean oscarMelhorAtriz
    ) {
        super(sequencial, título, gênero, ano);
    }
    
    public boolean isOscarMelhorFilme() {
        return this.oscarMelhorFilme;
    }
    
    public String getOscarMelhorDiretor() {
        return this.oscarMelhorDiretor;
    }
    
    public String getOscarMelhorAtor() {
        return this.oscarMelhorAtor;
    }
    
    public String getOscarMelhorAtriz() {
        return this.oscarMelhorAtriz;
    }
    
}
