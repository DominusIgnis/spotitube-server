package nl.oose.dea.jesperholm.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class MYSQLConnection implements IConnection {

    @Override
    public Connection getConnection() {
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
        }
        catch (ClassNotFoundException e)
        {
            System.out.println("Error loading JDBC driver: " + e);
        }
        Connection conn = null;
        try {
            Class.forName("comom.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/Spotitube?user=root&password=&serverTimezone=UTC");
        }
        catch(
                SQLException e) {
            System.out.println("Error connecting to a database: " + e);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return conn;
    }

}
