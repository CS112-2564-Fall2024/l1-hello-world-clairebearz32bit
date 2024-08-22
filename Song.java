
public class Song {
    private String name;
    private String albumName;
    private String artist;
    private double songLength;


    public Song() {
        setName("Blank");
        setArtist("Unknown");
        setSongLength(0.0);
    }


    public Song(String name, String artist, double songLength) {
        setName(name);
        setArtist(artist);
        setSongLength(songLength);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setArtist(String artist) {
        this.artist = artist;

    }


    public void setSongLength(double songLength) {
        this.songLength = songLength;
    }

    public String getName() {
        return this.name;
    }

    public String getArtist() {
        return this.artist;
    }

    public double getSongLength() {
        return this.songLength;
    }


}
