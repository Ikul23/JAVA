package main.clients;

import java.time.LocalDate;

public class Goldfish extends Animal implements Swimable{

    public Goldfish(String nickName, Owner owner, LocalDate birthDate, Illness illness) {
        super(nickName, owner, birthDate, illness);
    }

    public Goldfish() {
        super();
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
    public void swim() {

    }


    @Override
    public double getSwimSpeed() {
        return Swimable.super.getSwimSpeed();
    }
}
