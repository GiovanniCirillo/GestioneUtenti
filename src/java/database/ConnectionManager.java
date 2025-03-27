package database;
import java.sql.*;

public class ConnectionManager {
static Connection con;
static String url;
static String ip;
static String port;
static String dbname;
static String dbUsername;
static String dbPassword;

public ConnectionManager(String ip, String port, String dbname, String dbUsername, String dbPassword){
    ConnectionManager.ip=ip;
    ConnectionManager.port=port;
    ConnectionManager.dbname=dbname;
    ConnectionManager.dbUsername=dbUsername;
    ConnectionManager.dbPassword=dbPassword;
    ConnectionManager.url="jdbc:mysql://"+ip+":"+port+"/"+dbname;
}

    public Connection getConnection() throws SQLException{
        con=null;
        try{
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection(url,dbUsername,dbPassword);
        }
        catch(ClassNotFoundException e){System.out.println(e);}
        return con;
    }
}