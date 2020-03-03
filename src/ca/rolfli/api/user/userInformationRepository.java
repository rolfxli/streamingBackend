package ca.rolfli.api.user;
import java.sql.*;

public class userInformationRepository {

    String getData(String userID) {
        String queryResult = "";
        String query = "select ROOMS from USERINFO where userID=" + userID;
        Connection conn = DriverManager.getConnection("some conn");


        return queryResult;
    }
}