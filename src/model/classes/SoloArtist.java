package model.classes;

public class SoloArtist extends Artist {
    private String assistantName;

    public SoloArtist(String name, Genre genre, double performanceFee, String assistantName) {
        super(name, genre, performanceFee);
        this.assistantName = assistantName;
    }
}
