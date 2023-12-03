/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package connection;

import com.mysql.cj.jdbc.MysqlConnectionPoolDataSource;
import com.mysql.cj.jdbc.MysqlDataSource;
//import com.mysql.cj.jdbc.Driver;
import java.sql.Connection;
import java.sql.SQLException;

/**
 *
 * @author Tamcin
 */
public class Conn {
    static Connection c;
    
    public static Connection connection(){
        if(c == null) {
            MysqlDataSource data = new MysqlConnectionPoolDataSource();
            data.setDatabaseName("ujian_rpl");
            data.setUser("root");
            data.setPassword("");
            try {
                c = (Connection) data.getConnection();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return c;
    }
}
