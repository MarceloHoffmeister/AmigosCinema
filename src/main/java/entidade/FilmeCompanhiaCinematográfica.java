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
            String oscarMelhorDiretor,
            String oscarMelhorAtor,
            String oscarMelhorAtriz
    ) {
        super(sequencial, título, gênero, ano);
    }
    
    public boolean isOscarMelhorFilme() {
        return this.oscarMelhorFilme;
    }
    
    public void setOscarMelhorFilme(boolean oscarMelhorFilme) {
        this.oscarMelhorFilme = oscarMelhorFilme;
    }
    
    public String getOscarMelhorDiretor() {
        return this.oscarMelhorDiretor;
    }
    
    public void setOscarMelhorDiretor(String oscarMelhorDiretor) {
        this.oscarMelhorDiretor = oscarMelhorDiretor;
    }
    
    public String getOscarMelhorAtor() {
        return this.oscarMelhorAtor;
    }
    
    public void setOscarMelhorAtor(String oscarMelhorAtor) {
        this.oscarMelhorAtor = oscarMelhorAtor;
    }
    
    public String getOscarMelhorAtriz() {
        return this.oscarMelhorAtriz;
    }
    
    public void setOscarMelhorAtriz(String oscarMelhorAtriz) {
        this.oscarMelhorAtriz = oscarMelhorAtriz;
    }
    
}
