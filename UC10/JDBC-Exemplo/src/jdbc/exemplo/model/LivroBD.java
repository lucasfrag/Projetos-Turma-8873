package jdbc.exemplo.model;

import java.sql.SQLException;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.util.ArrayList;


public class LivroBD {
    // CRUD
    // ✅ Create - ✅ Read - ✅ Update - ✅ Delete

    // Cadastro no banco de dados
    public static void cadastrar(Livro livro) {
        try {
            // Conexão com o banco
            BancoDados bd = new BancoDados();
            bd.conectar();

            String sql = "INSERT INTO livro (titulo, autor, editora, lido, dataPublicacao, ativo) VALUES (?, ?, ?, ?, ?, ?)";
            PreparedStatement consulta = bd.getConexao().prepareStatement(sql);
            consulta.setString(1, livro.getTitulo());
            consulta.setString(2, livro.getAutor());
            consulta.setString(3, livro.getEditora());
            consulta.setBoolean(4, livro.isLido());
            consulta.setString(5, livro.getDataPublicacao());
            consulta.setBoolean(6, true);

            consulta.execute();
            bd.desconectar();
        } catch (SQLException e) {
            System.out.println("Erro ao inserir registro no banco de dados.");
        }
    }
    
    //Listagem
    public static ArrayList<Livro> listarTodos() {
        ArrayList<Livro> livros = new ArrayList<Livro>();
        
        try {
            // Conectamos com o banco de dados MySQL
            BancoDados bd = new BancoDados();
            bd.conectar();
            
            // Construir a query e executar lá no MySQL
            String sql = "SELECT * FROM livro WHERE ativo = 1";
            PreparedStatement consulta = bd.getConexao().prepareStatement(sql);
            ResultSet resposta = consulta.executeQuery();
            
            // Criar uma lista de livros baseado no ResultSet que tivemos do banco de dados
            while(resposta.next()) {
                // Declaro um objeto livro vazio
                Livro l = new Livro();
                
                // Vou populando esse objeto livro com as informações do banco
                l.setId(resposta.getInt("id"));
                l.setTitulo(resposta.getString("titulo"));
                l.setAutor(resposta.getString("autor"));
                l.setEditora(resposta.getString("editora"));
                l.setLido(resposta.getBoolean("lido"));
                l.setDataPublicacao(resposta.getString("dataPublicacao"));
                //l.setAtivo(resposta.getBoolean("ativo"));
                
                // Adiciono a lista de livros
                livros.add(l);
            }
            
            bd.desconectar();
            
        } catch (SQLException e) {
            System.out.println("Erro ao cadastrar o registro no banco de dados.");
        }
        return livros;
    }
    
    // Edição
    public static void atualizar(Livro l) {
        try {
                // Conectamos com o banco de dados MySQL
                BancoDados bd = new BancoDados();
                bd.conectar();

                // Construir a query 
                String sql = "UPDATE livro SET titulo=?, autor=?, editora=?, lido=?, dataPublicacao=? WHERE id=?";
                PreparedStatement consulta = bd.getConexao().prepareStatement(sql);
                
                // Passar informações do objeto l para a consulta do PreparedStatement
                consulta.setString(1, l.getTitulo());
                consulta.setString(2, l.getAutor());
                consulta.setString(3, l.getEditora());
                consulta.setBoolean(4, l.isLido());
                consulta.setString(5, l.getDataPublicacao());
                consulta.setInt(6, l.getId());
                
                // Executa a query no banco de dados
                consulta.executeUpdate();
                bd.desconectar();
                
            } catch (SQLException e) {
            System.out.println("Erro ao atualizar o registro no banco de dados.");
        }
    }    
    
    // Exclusão direta do banco de dados 
    public static void excluir(int id) {
        try {
                // Conectamos com o banco de dados MySQL
                BancoDados bd = new BancoDados();
                bd.conectar();

                // NÃO RECOMENDADO 
                //String sql = "DELETE FROM livro WHERE id=?";
                
                // RECOMENDADO
                String sql = "UPDATE livro SET ativo = ? WHERE id=?";
                PreparedStatement consulta = bd.getConexao().prepareStatement(sql);
                
                // Passar o id para a consulta do PreparedStatement
                consulta.setBoolean(1, false);
                consulta.setInt(2, id);
                
                // Executa a query no banco de dados
                consulta.executeUpdate();
                bd.desconectar();
                
            } catch (SQLException e) {
            System.out.println("Erro ao excluir o registro no banco de dados.");
        }
    }      
    
    // "Recuperar um registro excluido"
    public static void recuperar(int id) {
        try {
                // Conectamos com o banco de dados MySQL
                BancoDados bd = new BancoDados();
                bd.conectar();

                // RECOMENDADO
                String sql = "UPDATE livro SET ativo = ? WHERE id=?";
                PreparedStatement consulta = bd.getConexao().prepareStatement(sql);
                
                // Passar o id para a consulta do PreparedStatement
                consulta.setBoolean(1, true);
                consulta.setInt(2, id);
                
                // Executa a query no banco de dados
                consulta.executeUpdate();
                bd.desconectar();
                
            } catch (SQLException e) {
            System.out.println("Erro ao excluir o registro no banco de dados.");
        }
    }      
    
    public static ArrayList<Livro> filtrarPorTitulo(String textoPesquisa) {
        ArrayList<Livro> livros = new ArrayList<Livro>();
        
        try {
            // Conectamos com o banco de dados MySQL
            BancoDados bd = new BancoDados();
            bd.conectar();
            
            // Construir a query e executar lá no MySQL
            String sql = "SELECT * FROM livro WHERE ativo = 1 AND titulo LIKE ?";
            PreparedStatement consulta = bd.getConexao().prepareStatement(sql);
            consulta.setString(1, "%" + textoPesquisa + "%");
            
            ResultSet resposta = consulta.executeQuery();
            
            // Criar uma lista de livros baseado no ResultSet que tivemos do banco de dados
            while(resposta.next()) {
                // Declaro um objeto livro vazio
                Livro l = new Livro();
                
                // Vou populando esse objeto livro com as informações do banco
                l.setId(resposta.getInt("id"));
                l.setTitulo(resposta.getString("titulo"));
                l.setAutor(resposta.getString("autor"));
                l.setEditora(resposta.getString("editora"));
                l.setLido(resposta.getBoolean("lido"));
                l.setDataPublicacao(resposta.getString("dataPublicacao"));
                
                // Adiciono a lista de livros
                livros.add(l);
            }
            
            bd.desconectar();
            
        } catch (SQLException e) {
            System.out.println("Erro ao cadastrar o registro no banco de dados.");
        }
        return livros;
    }
    
    public static Livro buscarPorId(int id) {
        Livro l = new Livro();
        
        try {
            // Conectamos com o banco de dados MySQL
            BancoDados bd = new BancoDados();
            bd.conectar();
            
            // Construir a query e executar lá no MySQL
            String sql = "SELECT * FROM livro WHERE ativo = 1 AND id=?";
            PreparedStatement consulta = bd.getConexao().prepareStatement(sql);
            consulta.setInt(1, id);
            
            ResultSet resposta = consulta.executeQuery();
            
            // Criar uma lista de livros baseado no ResultSet que tivemos do banco de dados
            if(resposta.next()) {                
                // Vou populando esse objeto livro com as informações do banco
                l.setId(resposta.getInt("id"));
                l.setTitulo(resposta.getString("titulo"));
                l.setAutor(resposta.getString("autor"));
                l.setEditora(resposta.getString("editora"));
                l.setLido(resposta.getBoolean("lido"));
                l.setDataPublicacao(resposta.getString("dataPublicacao"));
            }
            
            bd.desconectar();
            
        } catch (SQLException e) {
            System.out.println("Erro ao cadastrar o registro no banco de dados.");
        }
        return l;
    }
}
