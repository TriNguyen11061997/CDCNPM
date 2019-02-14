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
public class HotelBean {

    private int HotelID;
    private String HotelName;
    private int FK_PlaceID;
    private String HotelDesc;

    public HotelBean() {
    }

    public int getHotelID() {
        return HotelID;
    }

    public void setHotelID(int HotelID) {
        this.HotelID = HotelID;
    }

    public String getHotelName() {
        return HotelName;
    }

    public void setHotelName(String HotelName) {
        this.HotelName = HotelName;
    }

    public int getFK_PlaceID() {
        return FK_PlaceID;
    }

    public void setFK_PlaceID(int FK_PlaceID) {
        this.FK_PlaceID = FK_PlaceID;
    }

    public String getHotelDesc() {
        return HotelDesc;
    }

    public void setHotelDesc(String HotelDesc) {
        this.HotelDesc = HotelDesc;
    }

}
