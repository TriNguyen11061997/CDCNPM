/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import Bean.CityBean;
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
public class CityDao {

    Connection conn;
    PreparedStatement ps;
    ResultSet rs;

    public List<CityBean> GetAllObject() throws SQLException {
        conn = ConnectionPool.getConnection();
        ps = conn.prepareCall("Call City_GetAllObject()");
        rs = ps.executeQuery();
        List<CityBean> list = new ArrayList<>();
        CityBean city;
        while (rs.next()) {
            city = new CityBean();
            city.setCityID(rs.getInt("CityID"));
            city.setCityName(rs.getString("CityName"));
            city.setCityImage(rs.getString("CityImage"));
            city.setCityDesc(rs.getString("CityDesc"));
            list.add(city);
        }
        return list;
    }
}
