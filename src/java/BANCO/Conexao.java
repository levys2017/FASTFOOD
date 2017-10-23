package BANCO;

import java.sql.*;

public class Conexao {

    private static Connection con;
    
    public static Connection getConnection(){
        try{
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver").newInstance();
            String url = "jdbc:sqlserver:localhost:1433/DB_FASTFOOD";
            con = DriverManager.getConnection(url,"levy","123456");        
        }catch(Exception e){
            con= null;
        }
        return con;
    }
    
    public static void main(String[] args) {
        Connection c = Conexao.getConnection();
        if(c != null){
            System.out.println("Conectado");
            System.out.println(""+c);
        }else{
            System.out.println("Desconectado");
        }
    }
}

/*
public class Conexao {
    private Connection conexao;
   public Conexao getConnection() throws Exception{
       Class.forName("net.sourceforge.jtds.jdbc.Driver");
       String url = "jdbc:jtds:sqlserver://DAVID-PC:1433/teste";
       conexao = DriverManager.getConnection(url,"david","dba");
   }
   public Connection getConexao(){
       return conexao;
   }
   
   public static void main(String[] args) {
        Connection conexao = Conexao.getConnection();
        if(c != null){
            System.out.println("Conectado");
            System.out.println(""+c);
        }else{
            System.out.println("Desconectado");
        }
    }
}*/