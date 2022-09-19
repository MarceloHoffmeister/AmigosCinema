package entidade;

public class FilmeProvedoraStreaming extends Filme {    
    public enum ProvedoraStreaming {Netflix, AmanzonPrimeVideo, HBOGo, GooglePlayStore};
    public enum Produção {filme, série};
    
    private ProvedoraStreaming provedora;
    private Produção produção;
    private int totalEpisódios;
    
    public FilmeProvedoraStreaming(
            int sequencial,
            String título,
            Gênero gênero,
            int ano,
            ProvedoraStreaming provedora,
            Produção produção,
            int totalEpisódios
    ) {
        super(sequencial, título, gênero, ano);
    }
    
    public ProvedoraStreaming getProvedora() {
        return this.provedora;
    }
    
    public void setProvedora(ProvedoraStreaming provedora) {
        this.provedora = provedora;
    }
    
    public Produção getProdução() {
        return this.produção;
    }
    
    public void setProdução(Produção produção) {
        this.produção = produção;
    }
    
    public int getTotalEpisódios() {
        return this.totalEpisódios;
    }
    
    public void setTotalEpisódios(int totalEpisódios) {
        this.totalEpisódios = totalEpisódios;
    }
}
