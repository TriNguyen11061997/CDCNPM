/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Util;

import java.sql.Connection;
import java.sql.SQLException;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

/**
 *
 * @author Trí Nguyễn
 */
public class ConnectionPool {

    public static Connection getConnection() {
        try {
            InitialContext ctx = new InitialContext();
            DataSource ds
                    = (DataSource) ctx.lookup("java:comp/env/jdbc/ck_ltm");
            return ds.getConnection();
        } catch (NamingException ex) {
            return null;
        } catch (SQLException ex) {
            return null;
        }
    }
}
