/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bean;

/**
 *
 * @author Trí Nguyễn
 */
public class NSXBean {
    private int ID_NSX;
    private String Name_NSX;

    public NSXBean() {
    }

    public NSXBean(int ID_NSX, String Name_NSX) {
        this.ID_NSX = ID_NSX;
        this.Name_NSX = Name_NSX;
    }

    public int getID_NSX() {
        return ID_NSX;
    }

    public void setID_NSX(int ID_NSX) {
        this.ID_NSX = ID_NSX;
    }

    public String getName_NSX() {
        return Name_NSX;
    }

    public void setName_NSX(String Name_NSX) {
        this.Name_NSX = Name_NSX;
    }
    
    
}
