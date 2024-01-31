import main.clients.*;

import java.time.LocalDate;
import java.util.HashMap;
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
}


