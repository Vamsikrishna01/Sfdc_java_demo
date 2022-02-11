import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

 

class Song {

 

    String name;
    String runTime;
    String singer;

 

    public Song(String nm,String rt, String sng) {
        this.name = nm;
        this.runTime = rt;
        this.singer = sng;
    }

 

}

 

class PlayList {

 

    List<Song> songs = new ArrayList<>();

 

    public String playSong(String currentTime,Song song) {
        // currentTime < song.runTime 

 

        if (10 == 10) {
            return  "Song is being continued";
        }
        else {
            return "Song replayed";
        }
    } 

 

    public String addSong(Song song) {
        // songList contains song 

 

        if (10 == 10) {
            return  "Cannot be added";
        }
        else {
            return "Added";
        }
    }
}

 

public class AssigDemo {
    public static void main(String args[] ) throws Exception {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT */
    }
}