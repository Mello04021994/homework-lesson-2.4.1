package org.example;
class Plate {
    private int food;

    public Plate(int food) {
        if (food < 0) {
            this.food = 0;
        } else {
            this.food = food;
        }
    }

    public boolean decreaseFood(int amount) { // Метод на уменьшение еды при этом что бы она не была отрицательной
        if (amount <= food) {
            food -= amount;
            return true;
        }
        return false; // Если еды не хватило, количество не меняем, что бы досыпать корм
    }

    public void addFood(int amount) {
        if (amount > 0) {
            food += amount;
            System.out.println("В миску насыпано " + amount + " подушек корма. Всего в миске корма: " + food);
        }
    }

    public void info() {
        System.out.println("В миске осталось корма: " + food);
    }
}