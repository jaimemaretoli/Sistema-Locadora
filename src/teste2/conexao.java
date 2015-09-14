package teste2;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class conexao {
                               // biblioteca importada, direito bibliotecas...
    private static String servidor = "com.mysql.jdbc.Driver";
    private static String usuario = "root";
    private static String senha = "";
    private static String banco = "locadora";
    private static String server = "localhost";
    private static String url = "jdbc:mysql://" + conexao.server + "/"
            + conexao.banco;

    public Connection conectar() {
        try{
            Class.forName(conexao.servidor);
            Connection con = (Connection) DriverManager.getConnection(conexao.url, 
                    conexao.usuario, conexao.senha);
            System.out.println("CONEXÃO OK!");
            return con;
        }catch(ClassNotFoundException c){
            System.out.println("Classe " + servidor + "não encontrada \n "
            + "ERRO: " + c.getMessage());
        }catch(SQLException sqlE){
            System.out.println("ERRO DE SQL: " + sqlE.getMessage());
        }
        return null;
    }
}