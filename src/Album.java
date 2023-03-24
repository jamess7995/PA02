import java.util.ArrayList;

public class Album implements Comparable<Album> {
    int numID;
    ArrayList<String> artistNames;
    String albumTitle;
    Integer numSongs;



    public Album(int numID, ArrayList<String> artistNames, String albumTitle, Integer numSongs) {
        this.numID = numID;
        this.artistNames = artistNames;
        this.albumTitle = albumTitle;
        this.numSongs = numSongs;
    }

    @Override
    public int compareTo(Album album) {
        return this.numSongs.compareTo(album.numSongs);
    }
    @Override
    public String toString() {
        return numID +  ": " + numSongs +  " -- " + artistNames;
    }

}
