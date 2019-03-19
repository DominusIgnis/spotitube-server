package nl.oose.dea.jesperholm.dao;

public class UserDao implements IUserDao {

    @Override
    public String login(String userName, String password) {
        // Select * from user where user = .........
        return "dit token komt uit de database";
    }
}
