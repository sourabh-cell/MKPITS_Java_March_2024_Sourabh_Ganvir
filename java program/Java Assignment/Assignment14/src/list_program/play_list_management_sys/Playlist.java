//Create a music playlist manager where users can add, remove, and search
// for songs. Each song should have properties such as `songId`, `title`,
// `artist`, `album`, and `duration`. Implement functionality to display all songs,
// search for a song by `title`, and display songs sorted by their duration.

package list_program.play_list_management_sys;

public class Playlist implements Comparable<Playlist> {
    private int song_id;
    private String title;
    private String artist;
    private int duration;
    private String album;

    public Playlist(int song_id, String title, String artist, int duration, String album) {
        this.song_id = song_id;
        this.title = title;
        this.artist = artist;
        this.duration = duration;
        this.album = album;
    }

    public int getSong_id() {
        return song_id;
    }

    public String getTitle() {
        return title;
    }

    public String getArtist() {
        return artist;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public int getDuration() {
        return duration;
    }

    public String getAlbum() {
        return album;
    }

    //implement Comparable interface and override method for sorting
    @Override
    public int compareTo(Playlist o)
    {
        if (this.duration==o.getDuration())
            return 0;
        else if (this.duration>o.getDuration())
               return 1;
        else
            return -1;
    }

    //Override toString Method for printing object

    @Override
    public String toString() {
        return "CustomerOrder{" +
                "song_id=" + song_id +
                ", title='" + title + '\'' +
                ", artist='" + artist + '\'' +
                ", duration=" + duration+" minute" +
                ", album='" + album + '\'' +
                '}';
    }
}
