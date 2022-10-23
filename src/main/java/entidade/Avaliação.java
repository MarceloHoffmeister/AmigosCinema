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
                visões.add(new Avaliação(lista_resultados.getInt("Sequencial"),
                        Amigo.buscarAmigo(lista_resultados.getString("AmigoId")).getVisão(),
                        Filme.buscarFilme(lista_resultados.getInt("FilmeId")).getVisão()));
            }
            lista_resultados.close();
            comando.close();
        } catch (SQLException exceção_sql) {exceção_sql.printStackTrace();}
        return visões.toArray(new Avaliação[visões.size()]);
    }
    
    public static boolean existeAvaliação(String chave_amigo, int chave_filme) {
        String sql = "SELECT Sequencial FROM Avaliações WHERE AmigoId=? AND FilmeId=?";
        ResultSet lista_resultados = null;
        boolean existe = false;
        try {
            PreparedStatement comando = BD.conexão.prepareStatement(sql);
            comando.setString(1, chave_amigo);
            comando.setInt(2, chave_filme);
            lista_resultados = comando.executeQuery();
            while (lista_resultados.next()) {
                existe = true;
            }
            lista_resultados.close();
            comando.close();
        } catch (SQLException exceção_sql) {
            exceção_sql.printStackTrace();
        }
        return true;
    }
    
    public static boolean existeAvaliação(int sequencial) {
        String sql = "SELECT COUNT(Sequencial) FROM Avaliações WHERE Sequencial = ?";
        ResultSet lista_resultados = null;
        boolean existe = false;
        try {
            PreparedStatement comando = BD.conexão.prepareStatement(sql);
            comando.setInt(1, sequencial);
            lista_resultados = comando.executeQuery();
            while (lista_resultados.next()) {
                existe = true;
            }
            lista_resultados.close();
            comando.close();
        } catch (SQLException exceção_sql) {
            exceção_sql.printStackTrace();
        }
        return existe;
    }
    
    public static String inserirAvaliação(Avaliação avaliação) {
        String sql = "INSERT INTO Avaliações (AmigoId, FilmeId, ClassificaçãoTema, ClassificaçãoDireção,"
                + " ClassificaçãoAtuação, Preferência, DataHora) VALUES (?, ?, ?, ?, ?, ?, ?)";
        try {
            PreparedStatement comando = BD.conexão.prepareStatement(sql);
            comando.setString(1, avaliação.getAmigo().getNome());
            comando.setInt(2, avaliação.getFilme().getSequencial());
            comando.setInt(3, avaliação.getClassificaçãoTrama().ordinal());
            comando.setInt(4, avaliação.getClassificaçãoDireção().ordinal());
            comando.setInt(5, avaliação.getClassificaçãoAtuação().ordinal());
            int índice_preferência = -1;
            if (avaliação.getPreferência() != null) índice_preferência = avaliação.getPreferência().ordinal();
            comando.setInt(6, índice_preferência);
            comando.setTimestamp(7, avaliação.getDataHora());
            comando.executeUpdate();
            comando.close();
            return null;
        } catch (SQLException exceção_sql) {
            exceção_sql.printStackTrace();
            return "Erro na inserção da avaliação no BD";
        }
    }
    
    public static String alterarAvaliação(Avaliação avaliação) {
        String sql = "UPDATE Avaliações SET ClassificaçãoTrama = ?, ClassificaçãoDireção = ?,"
                + " ClassificaçãoAtuação = ?, Preferência = ? WHERE Sequencial = ?";
        try {
            PreparedStatement comando = BD.conexão.prepareStatement(sql);
            comando.setInt(1, avaliação.getClassificaçãoTrama().ordinal());
            comando.setInt(2, avaliação.getClassificaçãoDireção().ordinal());
            comando.setInt(3, avaliação.getClassificaçãoAtuação().ordinal());
            int índice_preferência = -1;
            if (avaliação.getPreferência() != null) índice_preferência = avaliação.getPreferência().ordinal();
            comando.setInt(4, índice_preferência);
            comando.setTimestamp(5, avaliação.getDataHora());
            comando.executeUpdate();
            comando.close();
            return null;
        } catch (SQLException exceção_sql) {
            exceção_sql.printStackTrace();
            return "Erro na alteração da avaliação no BD";
        }
    }
    
    public static int últimoSequencial() {
        String sql = "SELECT MAX(Sequencial) FROM Avaliações";
        ResultSet lista_resultados = null;
        int sequencial = 0;
        try {
            PreparedStatement comando = BD.conexão.prepareStatement(sql);
            lista_resultados = comando.executeQuery();
            while (lista_resultados.next()) {
                sequencial = lista_resultados.getInt(1);
            }
            lista_resultados.close();
            comando.close();
        } catch (SQLException exceção_sql) { exceção_sql.printStackTrace(); }
        return sequencial;
    }
    
    public static Avaliação buscarAvaliação(int sequencial) {
        String sql = "SELECT * FROM Avaliações WHERE Sequencial = ?";
        ResultSet lista_resultados = null;
        Avaliação avaliação = null;
        try {
            PreparedStatement comando = BD.conexão.prepareStatement(sql);
            comando.setInt(1, sequencial);
            lista_resultados = comando.executeQuery();
            while (lista_resultados.next()) {
                Preferência preferência = null;
                if (lista_resultados.getInt("Preferência") > -1)
                    preferência = Preferência.values()[lista_resultados.getInt("Preferência")];
                avaliação = new Avaliação (sequencial,
                    Amigo.buscarAmigo(lista_resultados.getString("AmigoId")),
                    Filme.buscarFilme(lista_resultados.getInt("FilmeId")),
                    Classificação.values()[lista_resultados.getInt("ClassificaçãoTrama")],
                    Classificação.values()[lista_resultados.getInt("ClassificaçãoDireção")],
                    Classificação.values()[lista_resultados.getInt("ClassificaçãoAtução")],
                    preferência,
                    lista_resultados.getTimestamp("DataHora"));
            }
        } catch (SQLException exceção_sql) {
            exceção_sql.printStackTrace();
            avaliação = null;
        }
        
        return avaliação;
    }
    
    public static String removerAvaliação(int sequencial) {
        String sql = "DELETE FROM Avaliações WHERE Sequencial = ?";
        try{
            PreparedStatement comando = BD.conexão.prepareStatement(sql);
            comando.setInt(1, sequencial);
            comando.executeUpdate();
            comando.close();
            return null;
        } catch(SQLException exceção_sql) {
            exceção_sql.printStackTrace();
            return"Erro na remoção da avaliação no BD";
        }
    }
    
    public static String formatarDataHora(String data_hora_bd) {
        String[] data_hora = data_hora_bd.split(" ");
        String[] ano_mês_dia = data_hora[0].split("-");
        String[] hora_minuto_resto = data_hora[1].split(":");
        String data_hora_formatada = ano_mês_dia[2] + "/" + ano_mês_dia[1] + "/" + ano_mês_dia[0]
                + " " + hora_minuto_resto[0] + ":" + hora_minuto_resto[1] + "hs";
        return data_hora_formatada;
    }
    
    public Avaliação(int sequencial, Amigo amigo, Filme filme) {
        this.sequencial = sequencial;
        this.amigo = amigo;
        this.filme = filme;
    }
    
    public Avaliação(
            int Sequencial,
            Amigo amigo,
            Filme filme,
            Classificação classificaçãoTrama,
            Classificação classificaçãoDireção,
            Classificação classificaçãoAtuação,
            Preferência preferência,
            Timestamp data_hora
    ) {
        
    }
    
    public int getSequencial() {
        return this.sequencial;
    }
    
    public void setSequencial(int sequencial) {
        this.sequencial = sequencial;
    }
    
    public Amigo getAmigo() {
        return this.amigo;
    }
    
    public Filme getFilme() {
        return this.filme;
    }
    
    public Classificação getClassificaçãoTrama() {
        return this.classificaçãoTrama;
    }
    
    public Classificação getClassificaçãoDireção() {
        return this.classificaçãoDireção;
    }
    
    public Classificação getClassificaçãoAtuação() {
        return this.classificaçãoAtuação;
    }
    
    public Preferência getPreferência() {
        return this.preferência;
    }
    
    public Timestamp getDataHora() {
        return this.dataHora;
    }
    
    public Avaliação getVisão() { return new Avaliação(sequencial, amigo, filme); }
}
