import java.sql.*;

public class AppModel {
    public static int userId = 0;

    public void login(String userName, String password){
        String query = "SELECT user_name," +
                               "password " +
                        "FROM login_info " +
                        "WHERE user_name = " + "'" + userName + "'";
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
        }catch (Exception exception){
            exception.printStackTrace();
        }
        try{
            Connection connection = DriverManager.getConnection(DatabaseInfo.url,DatabaseInfo.userNameDB,DatabaseInfo.passwordDB);
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(query);

            while (resultSet.next()){
                if (userName.equals(resultSet.getString(1)) && password.equals(resultSet.getString(2))){
                    System.out.println("login success");
                } else {
                    System.out.println("login fail");
                }
            }
            System.out.println("end");
            statement.close();
        }catch (SQLException sqlException){
            sqlException.printStackTrace();
        }
    }



    public void register(String userName, String password, String firstName, String lastName, String gender, String email, int phoneNumber, String address){
        String addLoginInfoQuery = "INSERT INTO login_info (user_id, user_name, password) " +
                                    "VALUES(" + "'" + userId + "'" +
                                                "'" + userName + "'" + ","+
                                                "'" + password + "'" +
                                            ")";
        System.out.println(addLoginInfoQuery);
        String addUserQuery = "INSERT INTO user_info (user_id, first_name, last_name, gender, email, phone, address) " +
                              "VALUES(" +   "'" + userId + "'" +
                                            "'" + firstName + "'" +","+
                                            "'" + lastName+ "'" + ","+
                                            "'" + gender + "'" + ","+
                                            "'" + email + "'" + ","+
                                            "'" + phoneNumber + "'" + ","+
                                            "'" + address + "'" +
                                      ")";
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        }catch (Exception ex){
            ex.printStackTrace();
        }
        try {
            Connection connection = DriverManager.getConnection(DatabaseInfo.url,DatabaseInfo.userNameDB,DatabaseInfo.passwordDB);
            Statement statement = connection.createStatement();
            statement.execute(addLoginInfoQuery);
            statement.execute(addUserQuery);
            statement.close();
        }catch (SQLException ex){
            ex.printStackTrace();
        }
    }
}
