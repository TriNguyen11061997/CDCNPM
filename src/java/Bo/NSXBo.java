/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bo;

import Bean.NSXBean;
import Dao.NSXDao;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Trí Nguyễn
 */
public class NSXBo {

    public List<NSXBean> GetAllObject() {
        try {
            NSXDao nSXDao = new NSXDao();
            List<NSXBean> listNSX = nSXDao.GetAllObject();
            return listNSX;
        } catch (SQLException ex) {
            return null;
        }
    }
}
