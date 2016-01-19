package music;

import java.util.ArrayList;

/**
 *
 * @author Maxime
 */
public class Album extends Music {

    /**
     * List of tracks.
     */
    private final ArrayList<Track> listTracks = new ArrayList<>();

    /**
     * Create an album with a specific name.
     *
     * @param aName .
     */
    public Album(String aName) {
        super(aName);
    }

    /**
     * Add a track to Album.
     *
     * @param aTrack .
     */
    public void addTrack(Track aTrack) {
        this.listTracks.add(aTrack);
    }

    @Override
    public double getPrice() {
        // Init price 0
        double price = 0;
        if(!this.listTracks.isEmpty()) {
            // Loop for calculation (sum of prices)
            for(Track t : this.listTracks) {
                price += t.getPrice();
            }
        }
        return price;
    }

    @Override
    public double getDuration() {
        // Init duration 0
        double duration = 0;
        if(!this.listTracks.isEmpty()) {
            // Loop for calculation (sum of prices)
            for(Track t : this.listTracks) {
                duration += t.getDuration();
            }
        }
        return duration;
    }

    @Override
    public String getArtist() {
        String artist = "";
        int nombreArtistesDifferents = 0;
        if(!this.listTracks.isEmpty()) {
            for(Track t : this.listTracks) {
                if(!t.getArtist().equals(artist)) {
                    artist = t.getArtist();
                    nombreArtistesDifferents++;
                }
                if(nombreArtistesDifferents > 1) {
                    return "various artists";
                }
            }
            return artist;
        }
        // Aucune piste
        return "unknown artist";
    }

    public ArrayList<Track> getListTracks() {
        return listTracks;
    }

}
