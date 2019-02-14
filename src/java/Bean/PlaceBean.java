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
public class PlaceBean {
    private int PlaceID;
    private String PlaceName;
    private String PlaceDesc;
    private int FK_CityID;

    public PlaceBean() {
    }

    public int getPlaceID() {
        return PlaceID;
    }

    public void setPlaceID(int PlaceID) {
        this.PlaceID = PlaceID;
    }

    public String getPlaceName() {
        return PlaceName;
    }

    public void setPlaceName(String PlaceName) {
        this.PlaceName = PlaceName;
    }

    public String getPlaceDesc() {
        return PlaceDesc;
    }

    public void setPlaceDesc(String PlaceDesc) {
        this.PlaceDesc = PlaceDesc;
    }

    public int getFK_CityID() {
        return FK_CityID;
    }

    public void setFK_CityID(int FK_CityID) {
        this.FK_CityID = FK_CityID;
    }
    
    
}
