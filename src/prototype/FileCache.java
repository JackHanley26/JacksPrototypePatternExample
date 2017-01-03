package prototype;

import java.util.Hashtable;

public class FileCache {

    private static Hashtable<String, AudioFile> fileMap = new Hashtable<String, AudioFile>();

    public static AudioFile getFile(String fileId){
        AudioFile cachedFile = fileMap.get(fileId);
        return (AudioFile) cachedFile.clone();
    }
    public static void loadCache(){
        fileMap.put("mp3", new MP3());
        fileMap.put("flac", new FLAC());
    }

}
