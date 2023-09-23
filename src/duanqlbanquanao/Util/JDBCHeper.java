/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package duanqlbanquanao.Util;

import duanqlbanquanao.repository.DBContext;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Admin
 */
public class JDBCHeper {
     private Connection _connection;
    private PreparedStatement _preparedStatement;
    private ResultSet _resultSet;

    public ResultSet executeQuery(String sql, Object... args) {
        try {
            _connection = DBContext.getConnection();
            _preparedStatement = _connection.prepareStatement(sql);
            for (int i = 0; i < args.length; i++) {
                _preparedStatement.setObject(i + 1, args[i]);
            }
            _resultSet = _preparedStatement.executeQuery();
        } catch (Exception e) {
            System.out.println("Lỗi truy vấn câu lệnh: " + sql);
            release(_resultSet, _preparedStatement, _connection);
        }
        return _resultSet;
    }

    public static Integer executeUpdate(String sql, Object... args) {
        Connection connection = null;
        PreparedStatement preparedstatement = null;
        Integer affectedRows = null;
        try {
            connection = DBContext.getConnection();
            preparedstatement = connection.prepareStatement(sql);
            for (int i = 0; i < args.length; i++) {
                preparedstatement.setObject(i + 1, args[i]);
            }
            affectedRows = preparedstatement.executeUpdate();
        } catch (Exception e) {
            System.out.println("Lỗi thực thi câu lệnh: " + sql);
        } finally {
            release(preparedstatement, connection);
        }
        return affectedRows;
    }

    public static void release(PreparedStatement preparedStatement, Connection connection) {
        if (preparedStatement != null) {
            try {
                preparedStatement.close();

            } catch (SQLException e) {
                System.out.println("Không đóng được Statement");
            }
        }
        if (connection != null) {
            try {
                connection.close();
            } catch (SQLException e) {
                System.out.println("Không đóng được Connection");
            }
        }
    }

    public void close() throws Exception {
    }

    private void release(ResultSet _resultSet,
            PreparedStatement _preparedStatement, Connection _connection) {
        if (_resultSet != null) {
            try {
                _resultSet.close();
            } catch (SQLException e) {
                System.out.println("Không đóng được ResultSet");
            }
        }
        release(_preparedStatement, _connection);
    }
}
