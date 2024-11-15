package model.classes;

public class Band extends Artist {
    private int numberOfMember;

    public Band(String name, Genre genre, double performanceFee, int numberOfMember) {
        super(name, genre, performanceFee);
        this.numberOfMember = numberOfMember;
    }
}
