package model.classes;

public class Stage {
    private String stageName;
    private int capacity;
    private String stageLocation;

    public Stage(String stageName, int capacity, String stageLocation) {
        this.stageName = stageName;
        this.capacity = capacity;
        this.stageLocation = stageLocation;
    }

    public String getStageDetails() {
        return "Stage name\t: " + stageName + "\nCapacity\t: " + capacity + "\nStage location\t: " + stageLocation;
    }
}
