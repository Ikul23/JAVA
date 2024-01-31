package main.staff;

import java.sql.Timestamp;

public class Nurse extends Staff implements Duty, Position {
    private final ShiftSchedule shiftSchedule;

    public Nurse(String fullname, Position treat, ShiftSchedule shiftSchedule) {
        super(fullname, treat, null);
        this.shiftSchedule = shiftSchedule;
    }

    @Override
    public void support() {

        System.out.println("Медсестра помагает доктору");
    }

    @Override
    public Timestamp getStartTime() {
        return shiftSchedule.getStartTime();
    }

    @Override
    public Timestamp getEndTime() {
        return shiftSchedule.getEndTime();
    }

}