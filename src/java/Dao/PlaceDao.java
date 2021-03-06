/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import Bean.PlaceBean;
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
public class PlaceDao {

    Connection conn;
    PreparedStatement ps;
    ResultSet rs;

    public List<PlaceBean> GetListObjectByCityID(int ID) throws SQLException {
        List<PlaceBean> list = new ArrayList<>();
        conn = ConnectionPool.getConnection();
        ps = conn.prepareCall("CALL Place_GetAllObjectByCityID(?)");
        ps.setInt(1, ID);
        rs = ps.executeQuery();
        PlaceBean place;
        while (rs.next()) {            
            place = new PlaceBean();
            place.setPlaceID(rs.getInt("PlaceID"));
            place.setPlaceName(rs.getString("PlaceName"));
            place.setPlaceDesc(rs.getString("PlaceDesc"));
            list.add(place);
        }
        return list;
    }
}
