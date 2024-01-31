package main.clients;
@FunctionalInterface
public interface Goable {
    void go();
    default double getRunSpeed() {
        return 10;
    }
}
