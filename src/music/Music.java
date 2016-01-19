package music;

/**
 *
 * @author Maxime
 */
public abstract class Music {

    /**
     * Name of music.
     */
    private String name;

    /**
     * Create a new Music with a specific name.
     *
     * @param aName String
     */
    public Music(String aName) {
        this.name = aName;
    }

    public String getName() {
        return name;
    }

    public abstract double getPrice();

    public abstract double getDuration();

    public abstract String getArtist();
}
