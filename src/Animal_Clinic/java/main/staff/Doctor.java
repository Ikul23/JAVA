package main.staff;

import java.sql.Timestamp;

public class Doctor extends Staff implements Duty, Position {
    private final ShiftSchedule shiftSchedule;

    public Doctor(String fullname, Position treat, ShiftSchedule shiftSchedule) {
        super(fullname, treat, null);
        this.shiftSchedule = shiftSchedule;
    }

    @Override
    public void treat() {

        System.out.println("Доктор лечит");
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



