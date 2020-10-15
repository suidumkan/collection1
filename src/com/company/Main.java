package com.company;


import java.util.*;

public class Main {


    public static void main(String[] args) {
        ArrayList<String> studentsName = new ArrayList();
        Scanner input = new Scanner(System.in);
        System.out.println("Введите 5 имен мальчика: ");
        studentsName.add(input.nextLine());
        studentsName.add(input.nextLine());
        studentsName.add(input.nextLine());
        studentsName.add(input.nextLine());
        studentsName.add(input.nextLine());
        studentsName.add(input.nextLine());



        Iterator<String> iteratorA = studentsName.iterator();
        while (iteratorA.hasNext()) {
            String a = iteratorA.next();
            System.out.println(a);

        }
        System.out.println("______________________________");

        ArrayList<String> girlsName = new ArrayList();
        System.out.println("Введите 5 имен девочки: ");
        girlsName.add(input.nextLine());
        girlsName.add(input.nextLine());
        girlsName.add(input.nextLine());
        girlsName.add(input.nextLine());
        girlsName.add(input.nextLine());
        girlsName.add(input.nextLine());



        Iterator<String> iteratorB = girlsName.iterator();
        while (iteratorB.hasNext()) {
            String b = iteratorB.next();
            System.out.println(b);

        }
        System.out.println(" Результат ___________________________________");

        Collections.reverse(girlsName);
        ArrayList<String> C = new ArrayList<>();
        for (int i = 0; i < girlsName.size(); i++) {
            C.add(studentsName.get(i));
            C.add(girlsName.get(i));

        }

        Collections.sort(C, new Comparator<String>() {
            @Override
            public int compare(String studentsName, String girlsName) {
                if (studentsName.length() > girlsName.length()) {
                    return 1;
                } else if (studentsName.length() < girlsName.length()) {
                    return -1;
                } else {
                    return 0;
                }
            }

        });
        for (String print : C) {
            System.out.println(print);
        }
    }
}



/*
a)  В задании нельзя использовать циклы for и for each. Только while и Iterator
        b)  Написать приложение которое бы считывало сначала 5 строк которые вводит юзер и сохраняла бы их в Список А.
        c)  Затем программа должна отобразить этот список
        d)  Потом программа считывает еще 5 строк, которые вводит юзер и помещает их в Список Б. После также отображает его в консоли
        e)  Объединить Список А со Списком Б в новый список С следующим образом {A1,B5,А2,Б4,А3,Б3,А4,Б2,А5,Б1}
        f)  После объединения отобразить в консоли список С
        g)   В конце отсортировать элементы списка С по длине слова, сначала идут String-и с наименьшим количеством символов, и распечатать отсортированный список С.*/