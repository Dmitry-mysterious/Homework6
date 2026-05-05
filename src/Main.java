void main() {
    // Задача 1
    System.out.println("--|| Задача 1 ||--");

    for (int i = 1; i <= 10; i++) {
        System.out.println(i);
    }

    System.out.println();


    // Задача 2
    System.out.println("--|| Задача 2 ||--");

    for (int i = 10; i >= 1; i--) {
        System.out.println(i);
    }

    System.out.println();


    // Задача 3
    System.out.println("--|| Задача 3 ||--");

    for (int i = 0; i <= 17; i += 2) {
        System.out.println(i);
    }

    System.out.println();


    // Задача 4
    System.out.println("--|| Задача 4 ||--");

    for (int i = 10; i >= -10; i--) {
        System.out.println(i);
    }

    System.out.println();


    // Задача 5
    System.out.println("--|| Задача 5 ||--");

    for (short i = 1904; i <= 2096; i += 4) {
        System.out.println(i + " год является високосным");
    }

    System.out.println();


    // Задача 6
    System.out.println("--|| Задача 6 ||--");

    for (byte i = 7; i <= 98; i += 7) {
        System.out.println(i);
    }

    System.out.println();


    // Задача 7
    System.out.println("--|| Задача 7 ||--");

    for (short i = 1; i <= 512; i *= 2) {
        System.out.println(i);
    }

    System.out.println();


    // Задача 8
    System.out.println("--|| Задача 8 ||--");

    int money = 29000;

    for (byte i = 1; i <= 12; i++) {
        money += 29000;
        System.out.println("Месяц " + i + ", сумма накоплений равна " + money + " рублей");
    }

    System.out.println();


    // Задача 9
    System.out.println("--|| Задача 9 ||--");

    float myMoney = 29000f;
    float percentMonth = 0.01f;

    for (byte i = 1; i <= 12; i++) {
        myMoney += myMoney * percentMonth;
        System.out.println("Месяц " + i + ", сумма накоплений равна " + myMoney + " рублей");
    }

    System.out.println();


    // Задача 10
    System.out.println("--|| Задача 10 ||--");

    for (int i = 1; i <= 10; i++) {
        System.out.println("2 * " + i + " = " + 2 * i);
    }
}
