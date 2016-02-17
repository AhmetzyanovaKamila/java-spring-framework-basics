package foo.bar.etc;

import foo.bar.etc.Song;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * Created by aur on 17.02.2016.
 */
public class SongSelector {

    List<Song> songs;

    public SongSelector() {
    }

    public void setSongs(List<Song> songs) {
        this.songs = songs;
    }

    public Song selectSong(int songIndex){
        return songs.get(songIndex);
    }

}
