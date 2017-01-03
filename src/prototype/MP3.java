package prototype;

public class MP3 extends AudioFile {

    public String getType() {
        return "Mp3";
    }

    @Override
    void play() {
        System.out.println("Playing MP3 Audio File");
    }
}
