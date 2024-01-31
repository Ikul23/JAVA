package main.clients;

@FunctionalInterface
public interface Flyable {
    void fly();
    default double getFlightCeiling() {  return 5;    }
}

