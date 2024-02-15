package main.drugstore;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Pharmacy implements Comparable<Pharmacy> {
    private List<Component> components = new ArrayList<>();

    public void addComponents(Component... components) {
        Collections.addAll(this.components, components);
    }

    public List<Component> getComponents() {
        return components;
    }

    @Override
    public int compareTo(Pharmacy other) {
        // Сравниваем рецепты по количеству компонентов
        return Integer.compare(this.components.size(), other.components.size());
    }

    public static void main(String[] args) {
        // Создаем несколько экземпляров Pharmacy
        Pharmacy pharmacy1 = new Pharmacy();
        pharmacy1.addComponents(new Azitronite("Азитронит", 100.0, 50), new Water("Вода", 50.0, 25));

        Pharmacy pharmacy2 = new Pharmacy();
        pharmacy2.addComponents(new Penicilline("Пенициллин", 120.0, 70), new Water("Вода", 50.0, 25));

        // Добавляем их в ArrayList
        List<Pharmacy> pharmacies = new ArrayList<>();
        pharmacies.add(pharmacy1);
        pharmacies.add(pharmacy2);

        // Выводим компоненты в неотсортированном виде
        System.out.println("Компоненты до сортировки:");
        for (Pharmacy pharmacy : pharmacies) {
            System.out.println("Компоненты в рецепте: " + pharmacy.getComponents());
        }

        // Сортируем ArrayList
        Collections.sort(pharmacies);

        // Выводим компоненты в отсортированном виде
        System.out.println("\nКомпоненты после сортировки:");
        for (Pharmacy pharmacy : pharmacies) {
            System.out.println("Компоненты в рецепте: " + pharmacy.getComponents());
        }
    }
}
