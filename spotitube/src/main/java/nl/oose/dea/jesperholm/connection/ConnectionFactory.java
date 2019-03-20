package nl.oose.dea.jesperholm.connection;


public class ConnectionFactory {

    public static IConnection getConnection() {
        return new MYSQLConnection();
    }

}
