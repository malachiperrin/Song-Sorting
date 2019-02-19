// Filename: Recording.java
// Author: Malachi
// Date: 2/13/19
// Class that defines a single Recording and contains getter and setter methods for each field of data

public class Recording {
    // Private data fields
    private String songTitle;
    private String artist;
    private int playTime; // playing time in seconds

    // Mutatator methods (setters) for the fields in this class

    public void setSongTitle(String song) {
        songTitle = song;
    }

    public void setArtist(String a) {
        artist = a;
    }
    public void setPlayingTime(int time) {
        playTime = time;
    }

    // Accessor methods (getters) for each field individually
    public String getSongTitle() {
        return songTitle; // RETURN STATEMENT SO METHOD ISNT VOID
    }

    public String getArtist() {
        return artist;
    }

    public int getPlayTime() {
        return playTime;
    }
}
