package model.classes;

public abstract class Artist {
    private String name;
    private Genre genre;
    private double performanceFee;

    public Artist(String name, Genre genre, double performanceFee) {
        this.name = name;
        this.genre = genre;
        this.performanceFee = performanceFee;
    }

    public String getDetails() {
        return "Nama\t\t: " + name + "\nGenre\t\t: " + genre + "\nPerformance Fee\t: " + performanceFee;
    }
}
