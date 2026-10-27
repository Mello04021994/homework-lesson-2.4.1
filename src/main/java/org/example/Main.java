package org.example;
public class Main {
    public static void main(String[] args) {
        Cat catShtrih = new Cat("Штрих");
        Cat catTybik = new Cat("Тюбик");
        Cat catPashtet = new Cat("Паштет");
        Cat catPorshen = new Cat("Поршень");
        Cat catChizburger = new Cat("Чизбургер");
        Dog dogShnekers = new Dog("Шнэкерс");
        Dog dogPespatron = new Dog("Пэспатрон");
        Dog dogDublon = new Dog("Дублон");
        Dog dogMaoir = new Dog("Майор");
        Dog dogNikitka = new Dog("Никитка");

        catShtrih.run(50);
        catShtrih.swim(50);
        catTybik.run(100);
        catTybik.swim(100);
        catPashtet.run(150);
        catPashtet.swim(150);
        catPorshen.run(200);
        catPorshen.swim(200);
        catChizburger.run(250);
        catChizburger.swim(250);

        dogShnekers.run(250);
        dogShnekers.swim(5);
        dogPespatron.run(300);
        dogPespatron.swim(7);
        dogDublon.run(350);
        dogDublon.swim(9);
        dogMaoir.run(500);
        dogMaoir.swim(11);
        dogNikitka.run(1000);
        dogNikitka.swim(15);

        System.out.println("-СТАТИСТИКА ВСЕХ СОЗДАННЫХ ЖИТОНЫХ-");
        System.out.println("Всего животных: " + Animal.getAnimalCount());
        System.out.println("Всего котов: " + Cat.getCatCount());
        System.out.println("Всего собак: " + Dog.getDogCount());

        System.out.println("-КТО ИЗ КОТОВ ПОКУШАЛ ИЗ МИСКИ А КТО ОСТАЛСЯ ГОЛОДНЫЙ-");

        Cat[] cats = {
                new Cat("Штрих"),
                new Cat("Тюбик"),
                new Cat("Паштет"),
                new Cat("Поршень"),
                new Cat("Чизбургер"),
        };

        Plate plate = new Plate(200); // Засыпаем в пустую миску корм, что бы начать кормить котов
        plate.info();

        for (Cat cat : cats) {
            cat.eat(plate, 50); // Кот сыт когда съест 50
        }

        System.out.println("-КТО ИЗ КОТОВ НАСЫТИЛСЯ-");
        for (Cat cat : cats) {
            System.out.println(cat.name + " покушал? " + (cat.isFull() ? "Да" : "Нет"));
        }

        plate.info();

        System.out.println("-ДОБАВЛЯЕМ ЕДУИ ПРОБУЕМ НАКОРМИТЬ ОСТАВШИХСЯ-");
        plate.addFood(200);

        for (Cat cat : cats) {
            if (!cat.isFull()) {
                cat.eat(plate, 50);
            }
        }
    }
}