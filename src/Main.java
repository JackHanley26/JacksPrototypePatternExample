import prototype.FileCache;

public class Main {

    public static void main(String[] args) {

        FileCache.loadCache();

        System.out.println(FileCache.getFile("mp3").getType());

        System.out.println(FileCache.getFile("flac").getType());



    }
}
