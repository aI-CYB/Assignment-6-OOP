package singleton;

import java.sql.*;

public class Database {
    private static Database instance;
    private Connection connection;

    private Database() throws SQLException { //Thread safe private constructor
        connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/database", "postgres", "sd58b12a");
    }

    public static Database getInstance(){
        if (instance == null){
            try{
                instance = new Database();
            } catch (Exception e){
                e.printStackTrace();
            }
        }
        return instance;
    }

    public void query(String sql){
        try{
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.executeQuery();
        } catch (Exception e){
            e.printStackTrace();
        }
    }
}