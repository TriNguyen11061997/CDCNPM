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
public class SanPhamDao {

    Connection conn;
    PreparedStatement ps;
    ResultSet rs;

    public List<SanPhamBean> GetAllObject() throws SQLException {
        List<SanPhamBean> listSP = new ArrayList<>();
        conn = ConnectionPool.getConnection();
        ps = conn.prepareCall("CALL SanPham_GetAllObject()");
        rs = ps.executeQuery();
        while (rs.next()) {
            SanPhamBean sp = new SanPhamBean();
            sp.setID_SP(rs.getInt("ID_SP"));
            sp.setName_SP(rs.getString("Name_SP"));
            sp.setDate_NSX(rs.getDate("Date_NSX"));
            sp.setStatus(rs.getString("Status"));
            NSXBean nsx = new NSXBean();
            nsx.setName_NSX(rs.getString("Name_NSX"));
            sp.setNsx(nsx);
            listSP.add(sp);
        }
        return listSP;
    }

    public SanPhamBean GetObjectByID(int ID) throws SQLException {
        conn = ConnectionPool.getConnection();
        ps = conn.prepareCall("CALL SanPham_GetObjectByID(?)");
        ps.setInt(1, ID);
        rs = ps.executeQuery();
        while (rs.next()) {
            SanPhamBean sp = new SanPhamBean();
            sp.setID_SP(rs.getInt("ID_SP"));
            sp.setName_SP(rs.getString("Name_SP"));
            sp.setDate_NSX(rs.getDate("Date_NSX"));
            sp.setStatus(rs.getString("Status"));
            sp.setID_NSX(rs.getInt("ID_NSX"));
            return sp;
        }
        return null;
    }

    public boolean Insert(SanPhamBean sp) throws SQLException {
        conn = ConnectionPool.getConnection();
        ps = conn.prepareCall("CALL SanPham_Add(?,?,?,?)");
        ps.setString(1, sp.getName_SP());
        ps.setDate(2, sp.getDate_NSX());
        ps.setString(3, sp.getStatus());
        ps.setInt(4, sp.getID_NSX());
        ps.execute();
        return true;
    }

    public boolean Update(SanPhamBean sp) throws SQLException {
        conn = ConnectionPool.getConnection();
        ps = conn.prepareCall("CALL SanPham_Update(?,?,?,?,?)");
        ps.setString(1, sp.getName_SP());
        ps.setDate(2, sp.getDate_NSX());
        ps.setString(3, sp.getStatus());
        ps.setInt(4, sp.getID_NSX());
        ps.setInt(5, sp.getID_SP());
        ps.execute();
        return true;
    }

    public boolean Delete(int ID) throws SQLException {
        conn = ConnectionPool.getConnection();
        ps = conn.prepareCall("CALL SanPham_Delete(?)");
        ps.setInt(1, ID);
        ps.execute();
        return true;
    }
}
