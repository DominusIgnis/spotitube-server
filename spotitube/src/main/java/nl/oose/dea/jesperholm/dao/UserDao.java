package nl.oose.dea.jesperholm.dao;

import nl.oose.dea.jesperholm.connection.ConnectionFactory;
import nl.oose.dea.jesperholm.connection.IConnection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UserDao implements IUserDao {

    @Override
    public String login(String user, String password) {
        // Select * from user where user = .........
        IConnection conn = ConnectionFactory.getConnection();
        try {
            PreparedStatement ps = conn.prepareStatement("SELECT * FROM user WHERE user=? AND pass=?");
            ps.setString(1, user);
            ps.setString(2, password);
            ResultSet rs = ps.executeQuery();
            if(rs.next())
            {
                return "1234-1234-1234";
                //extractUserFromResultSet(rs);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return null;









//        return "1234-1234-1234";
    }
}
