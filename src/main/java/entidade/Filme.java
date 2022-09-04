package entidade;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import persistência.BD;

public class Filme {
    public enum Gênero { ação, aventura, comédia, drama, faroeste, ficção, guerra, infantil, musical, romance, suspense, terror }
    
    private int sequencial;
    private String título;
    private Gênero gênero;
    private int ano;
    
    public static Filme[] getVisões() {
        String sql = "SELECT Sequencial, Título FROM Filmes";
        ResultSet lista_resultados = null;
        ArrayList<Filme> visões = new ArrayList();
        try {
            PreparedStatement comando = BD.conexão.prepareStatement(sql);
            lista_resultados = comando.executeQuery();
            while (lista_resultados.next()) {
                int sequencial = lista_resultados.getInt("Sequencial");
                String titulo = lista_resultados.getString("Título");
                visões.add(new Filme(sequencial, titulo));
            }
            lista_resultados.close();
            comando.close();
        } catch (SQLException exceção_sql) { exceção_sql.printStackTrace(); }
        return visões.toArray(new Filme[visões.size()]);
    }
    
    public static int últimoSequencial() {
        String sql = "SELECT MAX(Sequencial) FROM Filmes";
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
    
    public static String inserirFilme(Filme filme){
        String sql="INSERT INTO Filmes(Título,Gênero,Ano)"
            +"VALUES(?,?,?)";
        try {
            PreparedStatement comando = BD.conexão.prepareStatement(sql);
            comando.setString(1, filme.getTitulo());
            comando.setInt(2, filme.getGenero());
            comando.setInt(3, filme.getAno());
            comando.executeUpdate();
            comando.close();
            return null;
        } catch (SQLException exceção_sql){
            exceção_sql.printStackTrace();
            return"Erro na Inserção do Amigo no BD";
        }
    }
    
    public static String alterarFilme(Filme filme){
        String sql = "UPDATE Filme SET Título=?, Gênero=?, Ano=? WHERE Sequencial=?";
        try {
            PreparedStatement comando = BD.conexão.prepareStatement(sql);
            comando.setString(1, filme.getTitulo());
            comando.setInt(2, filme.getGenero());
            comando.setInt(3, filme.getAno());
            comando.setInt(4, filme.getSequencial());
            comando.executeUpdate();
            comando.close();
            return null;
        } catch(SQLException exceção_sql) {
            exceção_sql.printStackTrace();
            return"Erro na Alteração do Amigo no BD";
        }
    }
    
    public static String removerFilme(int sequencial) {
        String sql = "DELETE FROM Filmes WHERE Sequencial = ?";
        try{
            PreparedStatement comando = BD.conexão.prepareStatement(sql);
            comando.setInt(1, sequencial);
            comando.executeUpdate();
            comando.close();
            return null;
        } catch(SQLException exceção_sql) {
            exceção_sql.printStackTrace();
            return"Erro na Remoção do Filme no BD";
        }
    }
    
    public static Filme buscarFilme(int sequencial){
        String sql = "SELECT * FROM Filme WHERE Sequencial=?";
        ResultSet lista_resultados = null;
        Filme filme = null;
        try {
            PreparedStatement comando = BD.conexão.prepareStatement(sql);
            comando.setInt(1,sequencial);
            lista_resultados = comando.executeQuery();
            while(lista_resultados.next()) {
                filme = new Filme(
                        sequencial,
                        lista_resultados.getString("Título"),
                        Gênero.values()[lista_resultados.getInt("Gênero")],
                        lista_resultados.getInt("Ano")
                );
            }
            lista_resultados.close();
            comando.close();
        } catch (SQLException exceção_sql){
            exceção_sql.printStackTrace();
            filme = null;
        }
        return filme;
    }
    
    public static boolean existeFilmeMesmosAtributos(Filme filme) {
        String sql = "SELECT COUNT(Sequencial) FROM Filmes WHERE Título = ? AND Gênero = ? AND Ano = ?";
        ResultSet lista_resultados = null;
        int n_filmes_mesmos_atributos = 0;
        try {
            PreparedStatement comando = BD.conexão.prepareStatement(sql);
            comando.setString(1, filme.getTitulo());
            comando.setInt(2, filme.getGenero());
            comando.setInt(3, filme.getAno());
            lista_resultados = comando.executeQuery();
            while (lista_resultados.next()) {
                n_filmes_mesmos_atributos = lista_resultados.getInt(1);
            }
            lista_resultados.close();
            comando.close();
        } catch (SQLException exceção_sql) { exceção_sql.printStackTrace(); }
        if (n_filmes_mesmos_atributos > 0) return true;
        else return false;
    }
    
    public Filme(int sequencial, String título, Gênero gênero, int ano) {
        this.sequencial = sequencial;
        this.título = título;
        this.gênero = gênero;
        this.ano = ano;
    }
    
    public String toString() {
        return "[" + sequencial + "] " + título;
    }
    
    public Filme(int sequencial, String titulo) {
        this.sequencial = sequencial;
        this.título = titulo;
    }
    
    public String getTitulo() {
        return this.título;
    }
    
    public void setTitulo(String título) {
        this.título = título;
    }
    
    public int getGenero() {
        return this.gênero.ordinal();
    }
    
    public int getAno() {
        return this.ano;
    }
    
    public int getSequencial() {
        return this.sequencial;
    }
    
    public void setSequencial(int sequencial) {
        this.sequencial = sequencial;
    }
    
    public String getVisão() { return new Filme(sequencial, título).toString(); }
}
