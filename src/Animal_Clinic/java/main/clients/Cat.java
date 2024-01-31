package main.clients;

import java.time.LocalDate;

public class Cat extends Animal implements Goable, Huntable {

        Double discount;

    public Cat(String nickName, Owner owner, LocalDate birthDate, Illness illness, Double discount) {
        super(nickName, owner, birthDate, illness);
        this.discount = discount;
    }

    public Cat() {
        super();
        this.discount = 10D;
    }

    public Double getDiscount() {
        return discount;
    }

    public void setDiscount(Double discount) {
        this.discount = discount;
    }

    //Todo статикой пользоваться аккуратно ( пароли там не хранить :-) )
    public static void meow(){
        System.out.println("Мяяяу!");
    }

    @Override
    public String toString() {
        return super.toString()+"Discount("+discount+")";
    }

    @Override
    public void eat() {
        System.out.println("Кошка поймала мышь и ест");
    }

    @Override
    public void go() {

    }

    @Override
    public double getRunSpeed() {
        return Goable.super.getRunSpeed();
    }


}
