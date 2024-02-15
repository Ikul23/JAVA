package main;

import main.clients.*;
import main.drugstore.Component;
import main.drugstore.Pharmacy;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        Animal cat = new Animal("Солнышко", new Owner("Сергей Валерьевич"),
                LocalDate.of(2021, 10, 5), new Illness("Лишай")) {
            @Override
            public void eat() {

            }
        }; //Создаём экземпляр класса

        System.out.println(cat.getOwner());
        System.out.println(cat.getNickName());
        System.out.println("Болезнь:" + cat.getIllness());

        System.out.println(cat.getNickName());

        cat.setIllness(new Illness(null));

        System.out.println("Болезнь:" + cat.getIllness());

        Map<String, Animal> animalsMap = new HashMap<>();

        Cat catty = new Cat();
        Goldfish goldfish = new Goldfish();

        animalsMap.put("Cat", catty);
        animalsMap.put("Fish", goldfish);

        for (Map.Entry<String, Animal> entry : animalsMap.entrySet()) {
            String type = entry.getKey();
            Animal animal = entry.getValue();

            System.out.println(type + ": " + animal.getType());

            if (animal instanceof Flyable) {
                ((Flyable) animal).fly(); // Выведет "Кошки не летают"
            }

            if (animal instanceof Swimable) {
                ((Swimable) animal).swim(); // Выведет "Рыбы плавают"
            }
        }
    }
    // Создаем список рецептов лекарств
    List<Pharmacy> prescriptions = new ArrayList<>();

    // Создаем рецепт лекарства "Азитронит"
    Pharmacy azitronitPrescription = new Pharmacy();
        azitronitPrescription.addComponents(new Azitronite("Азитронит", 100.0, 50), new Water("Вода", 50.0, 25));

    // Добавляем рецепт в список
        prescriptions.add(azitronitPrescription);

    // Создаем рецепт лекарства "Пенициллин"
    Pharmacy penicillinePrescription = new Pharmacy();
        penicillinePrescription.addComponents(new Penicilline("Пенициллин", 120.0, 70), new Water("Вода", 50.0, 25));

    // Добавляем рецепт в список
        prescriptions.add(penicillinePrescription);

    // Выводим информацию о рецептах
        for (
    Pharmacy prescription : prescriptions) {
        System.out.println("Рецепт:");
        for (Component component : prescription.getComponents()) {
            System.out.println("Компонент: " + component.getTitle() + ", Вес: " + component.getWeight() + ", Сила: " + component.getPower());
        }
    }
}



