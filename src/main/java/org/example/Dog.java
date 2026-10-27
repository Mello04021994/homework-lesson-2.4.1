package org.example;
class Dog extends Animal {
    private static int dogCount = 0;

    public Dog(String name) {
        super(name);
        dogCount++;
    }

    public static int getDogCount() {
        return dogCount;
    }

    @Override
    public void run(int distance) { // Переопределенный метод для собак, по условию бегут до 500 м
        if (distance <= 500) {
            System.out.println("Собака " + name + " пробежал " + distance + " м.");
        } else {
            System.out.println("Собака " + name + " не может пробежать " + distance + " м. он выдохся");
        }
    }

    @Override
    public void swim(int distance) { // Переопределенный метод на плавание
        if (distance <= 10) {
            System.out.println(name + " проплыл " + distance + " м.");
        } else {
            System.out.println(name + " не может проплыть " + distance + " м. т.к. не проплывет это расстояние до конца");
        }
    }
}