package dbTestHW;

import helpersHW.DbAdapterHW;
import org.testng.annotations.Test;

import java.sql.SQLException;

public class GetPlaylistsHW {
    @Test
    public void getPlaylistForUser() throws SQLException {
        var list = DbAdapterHW.getPlaylistByUserId(801);
        for(var pl: list){
            System.out.println("name = "+pl.getName()+"id="+pl.getId());
        }
    }
}

