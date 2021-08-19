package dbTests;

import adapters.DbAdapter;
import models.Playlist;
import org.testng.annotations.Test;

import java.util.List;

public class DbTests {
    @Test
    public void printPlaylists(){
        List<Playlist> playlists = DbAdapter.getUserPlaylists(1081);
        for (Playlist pl: playlists){
            System.out.println(pl.getId()+" "+pl.getName());
        }
    }
    @Test
    public void printPlaylistName() {
        System.out.println(DbAdapter.getPlaylistName(2042));
    }
}
