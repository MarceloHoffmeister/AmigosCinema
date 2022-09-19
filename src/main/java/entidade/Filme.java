package entidade;

import entidade.FilmeProvedoraStreaming.Produção;
import entidade.FilmeProvedoraStreaming.ProvedoraStreaming;
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
        } catch (SQLException exceção_sql){
            exceção_sql.printStackTrace();
            return"Erro na Inserção do Filme no BD";
        }
        int sequencial = últimoSequencial();
        if(filme instanceof FilmeCompanhiaCinematográfica) {
            FilmeCompanhiaCinematográfica filme_companhia_cinematográfica = (FilmeCompanhiaCinematográfica) filme;
            sql = "INSERT INTO FilmesCompanhiasCinematográficas (OscarMelhorFilme, OscarMelhorDiretor, OscarMelhorAtor, OscarMelhorAtriz, FilmeId)"
                    + " VALUES (?, ?, ?, ?, ?)";
            try {
                PreparedStatement comando = BD.conexão.prepareStatement(sql);
                comando.setBoolean(1, filme_companhia_cinematográfica.isOscarMelhorFilme());
                comando.setString(2, filme_companhia_cinematográfica.getOscarMelhorDiretor());
                comando.setString(3, filme_companhia_cinematográfica.getOscarMelhorAtor());
                comando.setString(4, filme_companhia_cinematográfica.getOscarMelhorAtriz());
                comando.setInt(5, sequencial);
                comando.executeUpdate();
                comando.close();
            } catch (SQLException exceção_sql) {
                exceção_sql.printStackTrace();
                return "Erro na Inserção do FilmeCompanhiaCinematográfica no BD";
            }
        } else if (filme instanceof FilmeProvedoraStreaming) {
            FilmeProvedoraStreaming filme_provedora_streaming = (FilmeProvedoraStreaming) filme;
            sql = "INSERT INTO FilmesProvedorasStreaming (ProvedoraStreaming, Produção, TotalEpisódios, FilmId)"
                    + " VALUES (?, ?, ?, ?)";
            try {
                PreparedStatement comando = BD.conexão.prepareStatement(sql);
                comando.setInt(1, filme_provedora_streaming.getProvedora().ordinal());
                comando.setInt(2, filme_provedora_streaming.getProdução().ordinal());
                comando.setInt(3, filme_provedora_streaming.getTotalEpisódios());
                comando.setInt(4, sequencial);
                comando.executeUpdate();
                comando.close();
            } catch (SQLException exceção_sql) {
                exceção_sql.printStackTrace();
                return "Erro na Inserção do FilmeProvedoraStreaming no BD";
            }
        }
        return null;
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
        } catch(SQLException exceção_sql) {
            exceção_sql.printStackTrace();
            return"Erro na Alteração do Amigo no BD";
        }
        if(filme instanceof FilmeCompanhiaCinematográfica) {
            FilmeCompanhiaCinematográfica filme_companhia_cinematográfica = (FilmeCompanhiaCinematográfica) filme;
            sql = "UPDATE FilmesCompanhiasCinematográficas SET OscarMelhorFilme=?, OscarMelhorDiretor=?, OscarMelhorAtor=?, OscarMelhorAtriz=?"
                    + " WHERE FilmeId=?";
            try {
                PreparedStatement comando = BD.conexão.prepareStatement(sql);
                comando.setBoolean(1, filme_companhia_cinematográfica.isOscarMelhorFilme());
                comando.setString(2, filme_companhia_cinematográfica.getOscarMelhorDiretor());
                comando.setString(3, filme_companhia_cinematográfica.getOscarMelhorAtor());
                comando.setString(4, filme_companhia_cinematográfica.getOscarMelhorAtriz());
                comando.setInt(5, filme_companhia_cinematográfica.getSequencial());
                comando.executeUpdate();
                comando.close();
            } catch (SQLException exceção_sql) {
                exceção_sql.printStackTrace();
                return "Erro na alteração do filme no BD";
            }
        } else if (filme instanceof FilmeProvedoraStreaming) {
            FilmeProvedoraStreaming filme_provedora_streaming = (FilmeProvedoraStreaming) filme;
            sql = "UPDATE FilmesProvedorasStreaming SET ProvedoraStreaming=?, Produção=?, TotalEpisódios=?"
                    + " WHERE FilmeId=?";
            try {
                PreparedStatement comando = BD.conexão.prepareStatement(sql);
                comando.setInt(1, filme_provedora_streaming.getProvedora().ordinal());
                comando.setInt(2, filme_provedora_streaming.getProdução().ordinal());
                comando.setInt(3, filme_provedora_streaming.getTotalEpisódios());
                comando.setInt(4, filme_provedora_streaming.getSequencial());
                comando.executeUpdate();
                comando.close();
            } catch (SQLException exceção_sql) {
                exceção_sql.printStackTrace();
                return "Erro na alteração do filme no BD";
            }
        }
        return null;
    }
    
    public static String removerFilme(Filme filme) {
        int sequencial = filme.getSequencial();
        if (filme instanceof FilmeCompanhiaCinematográfica) {
            String sql = "DELETE FROM FilmesCompanhiasCinematográficas WHERE FilmeId=?";
            try {
                PreparedStatement comando = BD.conexão.prepareStatement(sql);
                comando.setInt(1, sequencial);
                comando.executeUpdate();
                comando.close();
            } catch (SQLException exceção_sql) {
                exceção_sql.printStackTrace();
                return "Erro na remoção do FilmeOriginal do BD";
            }
        } else if (filme instanceof FilmeProvedoraStreaming) {
            String sql = "DELETE FROM FilmesProvedorasStreaming WHERE FilmeId=?";
            try {
                PreparedStatement comando = BD.conexão.prepareStatement(sql);
                comando.setInt(1, sequencial);
                comando.executeUpdate();
                comando.close();
            } catch (SQLException exceção_sql) {
                exceção_sql.printStackTrace();
                return "Erro na remoção do FilmeOriginal do BD";
            }
        }
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
        String sql = null;
        ResultSet lista_resultados = null;
        sql = "SELECT Título, Gênero, Ano, FROM Filme WHERE Sequencial=?";
        String título = null;
        Gênero gênero = null;
        int ano = 0;
        try {
            PreparedStatement comando = BD.conexão.prepareStatement(sql);
            comando.setInt(1,sequencial);
            lista_resultados = comando.executeQuery();
            while(lista_resultados.next()) {
                título = lista_resultados.getString("Título");
                gênero = Gênero.values()[lista_resultados.getInt("Gênero")];
                ano = lista_resultados.getInt("Ano");
            }
            lista_resultados.close();
            comando.close();
        } catch (SQLException exceção_sql){exceção_sql.printStackTrace();}
        if (título == null) return null;
        sql = "SELECT OscarMelhorFilme, OscarMelhorDiretor, OscarMelhorAtor, OscarMelhorAtriz"
                + " FROM FilmesCompanhiasCinematrográficas WHERE FilmeId = ?";
        lista_resultados = null;
        try {
            PreparedStatement comando = BD.conexão.prepareStatement(sql);
            comando.setInt(1, sequencial);
            lista_resultados = comando.executeQuery();
            while (lista_resultados.next()) {
                return new FilmeCompanhiaCinematográfica (sequencial, título, gênero, ano,
                        lista_resultados.getBoolean("OscarMelhorFilme"),
                        lista_resultados.getString("OscarMelhorDiretor"),
                        lista_resultados.getString("OscarMelhorAtor"),
                        lista_resultados.getString("OscarMelhorAtriz")                        
                );
            }
            lista_resultados.close();
            comando.close();
        } catch (SQLException exceção_sql){exceção_sql.printStackTrace();}
        sql = "SELECT ProvedoraStreaming, Produção, TotalEpisódios"
                + " FROM FilmesProvedorasStreaming WHERE FilmeId = ?";
        lista_resultados = null;
        try {
            PreparedStatement comando = BD.conexão.prepareStatement(sql);
            comando.setInt(1, sequencial);
            lista_resultados = comando.executeQuery();
            while (lista_resultados.next()) {
                return (new FilmeProvedoraStreaming (sequencial, título, gênero, ano,
                        ProvedoraStreaming.values()[lista_resultados.getInt("ProvedoraStreaming")],
                        Produção.values()[lista_resultados.getInt("Produção")],
                        lista_resultados.getInt("TotalEpisódios")
                ));
            }
            lista_resultados.close();
            comando.close();
        } catch (SQLException exceção_sql){exceção_sql.printStackTrace();}
        return null;
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
