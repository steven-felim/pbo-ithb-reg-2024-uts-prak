package model.classes;

import java.util.Date;

public class PerformanceSchedule {
    private Date startTime;
    private Date endTime;

    public PerformanceSchedule(Date startTime, Date endTime) {
        this.startTime = startTime;
        this.endTime = endTime;
    }

    public String getSchedule() {
        return startTime + " - " + endTime;
    }
}
