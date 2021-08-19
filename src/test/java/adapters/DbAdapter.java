package adapters;

import models.Playlist;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.PrimitiveIterator;

public class DbAdapter {
    private static final String USER = "dbuser01";
    private static final String PASSWORD = "pa$$01";
    private static final String DB_URL = "jdbc:mariadb://104.237.13.60/dbkoel";
    private static final String JDBC_DRIVER = "org.mariadb.jdbc.Driver";

    private static Connection connection;
    private static Statement statement;

    public static List<Playlist> getUserPlaylists(int userId) {
        String query = "SELECT * from playlists p where user_id = " + userId;
        List<Playlist> playlists = new ArrayList<>();
        try {
            connection = DriverManager.getConnection(DB_URL, USER, PASSWORD);
            statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(query);
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                Playlist pl = new Playlist(id, name);
                playlists.add(pl);
            }
        } catch (SQLException err) {
            System.out.println(err.getMessage());
        }
        return playlists;
    }

    public static String getPlaylistName(int playlistId) {
        String query = "SELECT * from playlists p where id = " + playlistId;
        String name = null;
        try {
            Class.forName(JDBC_DRIVER);
            connection = DriverManager.getConnection(DB_URL, USER, PASSWORD);
            statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(query);
            while (resultSet.next()) {
                name = resultSet.getString("name");
            }
        } catch (SQLException | ClassNotFoundException err) {}
        finally {
            if (connection!=null) {
                try{
                    connection.close();
                } catch (SQLException err) {}
            }
        }
        return name;
    }
}
