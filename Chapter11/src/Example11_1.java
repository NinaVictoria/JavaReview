import java.sql.*;

/**
 * @author : Nina
 * @time : 2020/7/6 20:23
 * @description : JDBC and MySQL database
 */
public class Example11_1 {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");  //新版JDBC使用com.mysql.cj.jdbc.Driver
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        String uri = "jdbc:mysql://47.112.230.94:3306/test_database?serverTimezone=UTC&user=user001&password=user001&useSSL=true";    //添加参数serverTimezone=UTC 时区
        Connection connection;
        try {
            connection = DriverManager.getConnection(uri);
            Statement sql = connection.createStatement();
            ResultSet resultSet = sql.executeQuery("SELECT * FROM USERS");
            while (resultSet.next()) {
                System.out.println(resultSet.getString(1) + "   " + resultSet.getString(2));
            }
            System.out.println("");

            //预处理语句
            String str = "SELECT * FROM USERS";
            PreparedStatement preSql = connection.prepareStatement(str);
            resultSet = preSql.executeQuery();
            while (resultSet.next()) {
                System.out.println(resultSet.getString(1) + "   " + resultSet.getString(2));
            }

            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }


    }
}
