package org.example;
class Cat extends Animal {
    private static int catCount = 0;
    private boolean isFull;

    public Cat(String name) {
        super(name);
        this.isFull = false;
        catCount++;
    }

    public static int getCatCount() { // Метод, который закидывает нового кота в счетчик
        return catCount;
    }

    public boolean isFull() { // Метод, который покажет сыт ли кот
        return isFull;
    }

    @Override
    public void run(int distance) { // Переопределенный метод бега специально для кота
        if (distance <= 200) { // Если дистанция меньше или равна 200, выводим что пробежал
            System.out.println(" Кот " + name + " пробежал " + distance + " м.");
        } else { // Иначе, выводим что не может пробежать больше 200
            System.out.println(" Для кота " + name + " дистанция в размере " + distance + " м. слишком большая, он не пробежит столько");
        }
    } // Тут мы выполнили условие задачи, что кот бегает не больше 200 м.

    @Override
    public void swim(int distance) { // Переопределенный метод для кота на плавание
        System.out.println(name + " не умеет плавать!");
    } // Прописываем, что по условию коты не плавают

    public void eat(Plate plate, int amount) { // Метод для еды, который примет наш объект миски и количество подушечек корма
        if (!isFull && plate.decreaseFood(amount)) { // Тут если кот не сыт + он съедает корм
            isFull = true; // тогда меняем его сытость на тру
            System.out.println(name + " покушал " + amount + " подушек корма и теперь сыт.");
        } else if (isFull) { // иначе если он сытый
            System.out.println(name + " уже сыт и не хочет кушать.");
        } else { // в остальном если условия не отработали
            System.out.println(name + " остался голодным (ничего удивительного), в миске не хватает корма (как обычно), нужно досыпать (" + amount + " подушечек).");
        }
    }
}
