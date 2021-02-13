package dbTest;

import helpers.DbAdapter;
import org.testng.annotations.Test;

public class GetPlaylists {
    @Test
    public void getPlaylistsForUser(){
        var list = DbAdapter.getPlaylistByUserId(801);
        for (var pl : list){
            System.out.println("name = " +pl.getName()+" id= "+pl.getId());
        }
    }
}
