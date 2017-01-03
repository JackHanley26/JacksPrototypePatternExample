package prototype;

public class FLAC extends AudioFile{

    public String getType(){
        return "Flac";
    }

    @Override
    void play() {
        System.out.println("PLaying FLAC Audio File");
    }
}
