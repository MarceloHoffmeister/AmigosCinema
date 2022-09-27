package entidade;

import java.sql.Timestamp;

public class Avaliação {
    public enum Classificação {péssima, fraca, regular, boa, excelente};
    public enum Preferência {entre_dez_mais, entre_dez_anos};
    
    private int sequencial;
    private Amigo amigo;
    private Filme filme;
    private Classificação classificaçãoTrama, classificaçãoDireção, classificaçãoAtuação;
    private Preferência preferência;
    private Timestamp dataHora;
}
