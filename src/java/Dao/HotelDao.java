/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import Bean.HotelBean;
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
public class HotelDao {

    Connection conn;
    PreparedStatement ps;
    ResultSet rs;

    public List<HotelBean> GetAllObjectByPlaceID(int ID) throws SQLException {
        List<HotelBean> list = new ArrayList<>();
        conn = ConnectionPool.getConnection();
        ps = conn.prepareCall("CALL Hotel_GetAllObjectByPlaceID(?)");
        rs = ps.executeQuery();
        HotelBean hotel;
        while (rs.next()) {            
            hotel = new HotelBean();
        }
        return null;
    }
}
