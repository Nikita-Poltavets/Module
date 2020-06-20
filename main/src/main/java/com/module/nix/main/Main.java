package com.module.nix.main;

import com.module.nix.firstLevel.FirstLevelTasks;
import com.module.nix.secondLevel.SecondLevelTasks;

public class Main {

    public static void main(String[] args) {
        int[] array = {1, 4, 5, 1, 1, 1, 3};
        System.out.println("|||||||||1 LEVEL, 1 TASK||||||||");
        System.out.println("Дан массив чисел. Вернуть число уникальных символов\n" +
                "Пример: для 1 4 5 1 1 3 ответ 4.");
        System.out.println("Ответ - " + FirstLevelTasks.returnAmountOfUniqueSymbol(array));

        System.out.println();

        System.out.println("|||||||||1 LEVEL, 2 TASK|||||||||");
        System.out.println("Ход коня по бесконечной шахматной доске. Вводится текущее положение коня и клетка в которую пробуют его передвинуть за 1 ход.\n" +
                "Программа должна проверить, возможно ли это сделать.");
        System.out.println("Ответ - " + FirstLevelTasks.isPossibleToMoveHorse(2, 1, 3, 3));

        System.out.println();

        System.out.println("|||||||||1 LEVEL, 3 TASK|||||||||");
        System.out.println("Даны точки A,B,C  на плоскости.  Вычислить площадь  треугольника ABC.");
        System.out.println("Ответ - " + FirstLevelTasks.triangleArea(4, 4, 4));

    }



}
