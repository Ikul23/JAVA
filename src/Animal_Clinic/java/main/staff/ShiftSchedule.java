package main.staff;

import java.sql.Timestamp;

public class ShiftSchedule {
    private Timestamp startTime;
    private Timestamp endTime;

    public ShiftSchedule(Timestamp startTime, Timestamp endTime) {
        this.startTime = startTime;
        this.endTime = endTime;
    }

    public Timestamp getStartTime() {
        return startTime;
    }

    public Timestamp getEndTime() {
        return endTime;
    }
}