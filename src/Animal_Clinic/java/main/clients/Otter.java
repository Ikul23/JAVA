package main.clients;

import java.time.LocalDate;

public class Otter extends Animal implements Goable,Swimable,Huntable{

    public Otter(String nickName, Owner owner, LocalDate birthDate, Illness illness) {
        super(nickName, owner, birthDate, illness);
    }

    @Override
    public String getNickName() {
        return super.getNickName();
    }

    @Override
    public Owner getOwner() {
        return super.getOwner();
    }

    @Override
    public LocalDate getBirthDate() {
        return super.getBirthDate();
    }

    @Override
    public Illness getIllness() {
        return super.getIllness();
    }

    @Override
    public void setIllness(Illness illness) {
        super.setIllness(illness);
    }

    @Override
    public String getType() {
        return super.getType();
    }

    @Override
    public void eat() {

    }

    @Override
    public void go() {

    }

    @Override
    public double getRunSpeed() {
        return Goable.super.getRunSpeed();
    }

    @Override
    public void swim() {

    }

    @Override
    public double getSwimSpeed() {
        return Swimable.super.getSwimSpeed();
    }
}
