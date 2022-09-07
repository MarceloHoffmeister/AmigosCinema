package entidade;

public class FilmeProvedoraStreaming extends Filme {    
    public enum ProvedoraStreaming {Netflix, AmanzonPrimeVideo, HBOGo, GooglePlayStore};
    public enum Produção {filme, série};
    
    private ProvedoraStreaming provedora;
    private Produção produção;
    private int totalEpisódios;
    
    public FilmeProvedoraStreaming(int sequencial, String título, Gênero gênero, int ano) {
        super(sequencial, título, gênero, ano);
    }
}
