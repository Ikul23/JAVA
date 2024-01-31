package main.staff;

import java.sql.Timestamp;

public interface Duty {
    void Doctor();
    void Nurse();
    void support();
    void treat();

    Timestamp getStartTime();

    Timestamp getEndTime();
}

