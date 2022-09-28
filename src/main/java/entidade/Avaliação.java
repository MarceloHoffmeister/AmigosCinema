package entidade;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.ArrayList;
import persistência.BD;

public class Avaliação {
    public enum Classificação {péssima, fraca, regular, boa, excelente};
    public enum Preferência {entre_dez_mais, entre_dez_anos};
    
    private int sequencial;
    private Amigo amigo;
    private Filme filme;
    private Classificação classificaçãoTrama, classificaçãoDireção, classificaçãoAtuação;
    private Preferência preferência;
    private Timestamp dataHora;
    
    public static Avaliação[] getVisões() {
        String sql = "SELECT Sequencial, AmigoId, FilmeId FROM Avaliações";
        ResultSet lista_resultados = null;
        ArrayList<Avaliação> visões = new ArrayList();
        try {
            PreparedStatement comando = BD.conexão.prepareStatement(sql);
            lista_resultados = comando.executeQuery();
            while (lista_resultados.next()) {
                visões.add(new Avaliação(lista_resultados.getInt("Sequencial")),
                        Amigo.buscarAmigo(lista_resultados.getString("AmigoId")).getVisão(),
                        Filme.buscarFilme(lista_resultados.getInt("FilmeId")).getVisão());
            }
            lista_resultados.close();
            comando.close();
        } catch (SQLException exceção_sql) {exceção_sql.printStackTrace();}
        return visões.toArray(new Avaliação[visões.size()]);
    }
    
    
}
