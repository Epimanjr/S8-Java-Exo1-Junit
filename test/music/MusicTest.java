/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package music;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Maxime
 */
public class MusicTest {
    
    public Album album;
    
    public MusicTest() {
        this.album = new Album("MaxAlbum");
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }
    
    @Test
    public void albumTest() {
        // Create 3 tracks
        Track t1 = new Track("Track1", "MaximeB", 10, 3);
        Track t2 = new Track("Track2", "MaximeB", 5, 4);
        Track t3 = new Track("Track3", "MaximeB", 15, 10);
        // Add these tracks to album
        album.getListTracks().add(t1);
        album.getListTracks().add(t2);
        album.getListTracks().add(t3);
        // Test
        assertTrue(album.getDuration() == 17);
        assertTrue(album.getPrice() == 30);
        assertTrue(album.getArtist().equals("MaximeB"));
        // Add new Track with other Artist
        album.getListTracks().add(new Track("Track4", "GuillaumeD", 10, 10));
        assertTrue(album.getArtist().equals("various artists"));
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
