/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bo;

import Bean.SanPhamBean;
import Dao.SanPhamDao;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Trí Nguyễn
 */
public class SanPhamBo {

    public List<SanPhamBean> GetAllObject() {
        try {
            SanPhamDao sp = new SanPhamDao();
            List<SanPhamBean> listSP = sp.GetAllObject();
            return listSP;
        } catch (SQLException ex) {
            return null;
        }
    }

    public SanPhamBean GetObjectByID(int ID) {
        try {
            SanPhamDao sp = new SanPhamDao();
            return sp.GetObjectByID(ID);
        } catch (SQLException ex) {
            return null;
        }
    }

    public boolean Insert(SanPhamBean sp) {
        try {
            SanPhamDao spDao = new SanPhamDao();
            spDao.Insert(sp);
            return true;
        } catch (SQLException ex) {
            return false;
        }
    }

    public boolean Delete(int ID) {
        try {
            SanPhamDao spDao = new SanPhamDao();
            spDao.Delete(ID);
            return true;
        } catch (SQLException ex) {
            return false;
        }
    }

    public boolean Update(SanPhamBean sp) {
        try {
            SanPhamDao spDao = new SanPhamDao();
            spDao.Update(sp);
            return true;
        } catch (SQLException ex) {
            return false;
        }
    }
}
