package entidade;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import persistência.BD;

public class Amigo {
    private String nome, apelido, cidade, email, whatsapp, instagram;

    public static Amigo buscarAmigo(String nome){
        String sql = "SELECT * FROM Amigos WHERE Nome=?";
        ResultSet lista_resultados = null;
        Amigo amigo = null;
        try {
            PreparedStatement comando = BD.conexão.prepareStatement(sql);
            comando.setString(1,nome);
            lista_resultados = comando.executeQuery();
            while(lista_resultados.next()) {
                amigo = new Amigo(
                        nome,
                        lista_resultados.getString("Apelido"),
                        lista_resultados.getString("Cidade"),
                        lista_resultados.getString("Email"),
                        lista_resultados.getString("Whatsapp"),
                        lista_resultados.getString("Instagram")
                );
            }
            lista_resultados.close();
            comando.close();
        } catch (SQLException exceção_sql){
            exceção_sql.printStackTrace();
            amigo = null;
        }
        return amigo;
    }
    
    public static String inserirAmigo(Amigo amigo){
        String sql="INSERT INTO Amigos(Nome,Apelido,Cidade,Email,Whatsapp,Instagram)"
            +"VALUES(?,?,?,?,?,?)";
        try {
            PreparedStatement comando = BD.conexão.prepareStatement(sql);
            comando.setString(1, amigo.getNome());
            comando.setString(2, amigo.getApelido());
            comando.setString(3, amigo.getCidade());
            comando.setString(4, amigo.getEmail());
            comando.setString(5, amigo.getWhatsapp());
            comando.setString(6, amigo.getInstagram());
            comando.executeUpdate();
            comando.close();
            return null;
        } catch (SQLException exceção_sql){
            exceção_sql.printStackTrace();
            return"Erro na Inserção do Amigo no BD";
        }
    }
    
    public static String alterarAmigo(Amigo amigo){
        String sql = "UPDATE Amigos SET Apelido=?, Cidade=?, Email=?, Whatsapp=?, Instagram=?"
            +"WHERE Nome?";
        try {
            PreparedStatement comando = BD.conexão.prepareStatement(sql);
            comando.setString(1, amigo.getApelido());
            comando.setString(2, amigo.getCidade());
            comando.setString(3, amigo.getEmail());
            comando.setString(4, amigo.getWhatsapp());
            comando.setString(5, amigo.getInstagram());
            comando.setString(6, amigo.getNome());
            comando.executeUpdate();
            comando.close();
            return null;
        } catch(SQLException exceção_sql) {
            exceção_sql.printStackTrace();
            return"Erro na Alteração do Amigo no BD";
        }
    }
    
    public static String removerAmigo(String nome) {
        String sql = "DELETE FROM Amigos WHERE Nome = ?";
        try{
            PreparedStatement comando = BD.conexão.prepareStatement(sql);
            comando.setString(1, nome);
            comando.executeUpdate();
            comando.close();
            return null;
        } catch(SQLException exceção_sql) {
            exceção_sql.printStackTrace();
            return"Erro na Remoção do Amigo no BD";
        }
    }
    
    public static Amigo[] getVisões() {
        String sql = "SELECT Nome, Apelido FROM Amigos";
        ResultSet lista_resultados = null;
        ArrayList<Amigo> visões = new ArrayList();
        try {
            PreparedStatement comando = BD.conexão.prepareStatement(sql);
            lista_resultados = comando.executeQuery();
            while (lista_resultados.next()) {
                String nome = lista_resultados.getString("Nome");
                String apelido = lista_resultados.getString("Apelido");
                visões.add(new Amigo(nome, apelido));
            }
            lista_resultados.close();
            comando.close();
        } catch (SQLException exceção_sql) { exceção_sql.printStackTrace(); }
        return visões.toArray(new Amigo[visões.size()]);
    }
    
    public Amigo(String nome, String apelido, String cidade, String email, String whatsapp, String instagram) {
        this.nome = nome;
        this.apelido = apelido;
        this.cidade = cidade;
        this.email = email;
        this.whatsapp = whatsapp;
        this.instagram = instagram;
    }
    
    public String getApelido() {
        return this.apelido;
    }
    
    public void setApelido(String apelido) {
        this.apelido = apelido;
    }
    
    public String getCidade() {
        return this.cidade;
    }
    
    public String getEmail() {
        return this.email;
    }
    
    public String getWhatsapp() {
        return this.whatsapp;
    }
    
    public String getInstagram() {
        return this.instagram;
    }
    
    public String getNome() {
        return this.nome;
    }
    
    public String toString() {
        if (apelido != null) return nome + " [" + apelido + "]";
        else return nome;
    }
    
    public Amigo(String nome, String apelido) {
        this.nome = nome;
        this.apelido = apelido;
    }
    
    public String getVisão() { return new Amigo(nome, apelido).toString(); }
}
