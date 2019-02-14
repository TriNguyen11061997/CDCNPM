/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import Bean.NSXBean;
import Bean.SanPhamBean;
import Util.ConnectionPool;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Trí Nguyễn
 */
public class NSXDao {

    Connection conn;
    PreparedStatement ps;
    ResultSet rs;

    public List<NSXBean> GetAllObject() throws SQLException {
        List<NSXBean> listNSX = new ArrayList<>();
        conn = ConnectionPool.getConnection();
        ps = conn.prepareCall("CALL NSX_GetAllObject()");
        rs = ps.executeQuery();
        while (rs.next()) {
            NSXBean nsx = new NSXBean();
            nsx.setID_NSX(rs.getInt("ID_NSX"));
            nsx.setName_NSX(rs.getString("Name_NSX"));
            listNSX.add(nsx);
        }
        return listNSX;
    }

}
