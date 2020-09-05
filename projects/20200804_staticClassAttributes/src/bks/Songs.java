package bks;

public class Songs {
    private static int songsCount = 0;
    public Songs(){
        songsCount++;
        System.out.println("Songs count: " + songsCount);
    }
    public int getSongsCount(){
        return this.songsCount;
    }
}
