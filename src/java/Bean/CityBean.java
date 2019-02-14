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
public class CityBean {
    private int CityID;
    private String CityName;
    private String CityImage;
    private String CityDesc;

    public CityBean() {
    }

    public int getCityID() {
        return CityID;
    }

    public void setCityID(int CityID) {
        this.CityID = CityID;
    }

    public String getCityName() {
        return CityName;
    }

    public void setCityName(String CityName) {
        this.CityName = CityName;
    }

    public String getCityImage() {
        return CityImage;
    }

    public void setCityImage(String CityImage) {
        this.CityImage = CityImage;
    }

    public String getCityDesc() {
        return CityDesc;
    }

    public void setCityDesc(String CityDesc) {
        this.CityDesc = CityDesc;
    }
    
    
}
