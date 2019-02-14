/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bean;

import java.sql.Date;

/**
 *
 * @author Trí Nguyễn
 */
public class SanPhamBean {
    private int ID_SP;
    private String Name_SP;
    private Date Date_NSX;
    private String Status;
    private int ID_NSX;
    private NSXBean nsx;

    public SanPhamBean() {
    }

    public int getID_SP() {
        return ID_SP;
    }

    public void setID_SP(int ID_SP) {
        this.ID_SP = ID_SP;
    }

    public String getName_SP() {
        return Name_SP;
    }

    public void setName_SP(String NameSP) {
        this.Name_SP = NameSP;
    }

    public Date getDate_NSX() {
        return Date_NSX;
    }

    public void setDate_NSX(Date Date_NSX) {
        this.Date_NSX = Date_NSX;
    }

    public String getStatus() {
        return Status;
    }

    public void setStatus(String Status) {
        this.Status = Status;
    }

    public int getID_NSX() {
        return ID_NSX;
    }

    public void setID_NSX(int ID_NSX) {
        this.ID_NSX = ID_NSX;
    }

    public NSXBean getNsx() {
        return nsx;
    }

    public void setNsx(NSXBean nsx) {
        this.nsx = nsx;
    }
    
    
}
