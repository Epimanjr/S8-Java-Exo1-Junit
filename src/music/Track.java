/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package music;

/**
 *
 * @author Maxime
 */
public class Track extends Music {

    private double Price;
    private double Duration;
    private String Artist;
    
    public Track(String aName, String anArtist, double aPrice, double aDuration) {
        super(aName);
        this.Artist = anArtist;
        this.Duration = aDuration;
        this.Price = aPrice;
    }

    @Override
    public double getPrice() {
        return this.Price;
    }

    @Override
    public double getDuration() {
        return this.Duration;
    }

    @Override
    public String getArtist() {
        return this.Artist;
    }
    
    
}
