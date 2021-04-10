package ru.geekbrains.lesson_5;

public class Main {
    public static void main(String[] args) {
        Collaborator[] collabArray = new Collaborator[5]; // Вначале объявляем массив объектов
        collabArray[0] = new Collaborator("Ivanov Ivan",
                "Engineer",
                "ivivan@mailbox.com",
                "892312312",
                130000, 30); // потом для каждой ячейки массива задаем объект

        collabArray[1] = new Collaborator("Pavel Gon",
                "Developer",
                "pavel@mailbox.com",
                "892312123",
                177000, 31);

        collabArray[2] = new Collaborator("Alex Pavlov",
                "Boss",
                "alex@mailbox.com",
                "892312124",
                190000, 45);

        collabArray[3] = new Collaborator("Bogdan Karanchuk",
                "Engineer",
                "bogdan@mailbox.com",
                "892312125",
                180000, 41);

        collabArray[4] = new Collaborator("Sergey Loev",
                "Engineer",
                "sergey@mailbox.com",
                "892312127",
                160000, 27);

        for (int i = 0; i < collabArray.length; i++) {
            if (collabArray[i].getAge() > 40) {
                collabArray[i].getInfo();
                System.out.println("");
            }
        }
    }
}
