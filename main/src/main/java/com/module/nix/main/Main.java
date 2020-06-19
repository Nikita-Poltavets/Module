package com.module.nix.main;

import com.module.nix.firstLevel.FirstLevelTasks;

public class Main {

    public static void main(String[] args) {
        int[] array = {1, 4, 5, 1, 1, 1, 3};
        System.out.println("|||||||||1 level, 1 task|||||||||");
        System.out.println("Дан массив чисел. Вернуть число уникальных символов\n" +
                "Пример: для 1 4 5 1 1 3 ответ 4.");
        System.out.println("Ответ - " + FirstLevelTasks.returnAmountOfUniqueSymbol(array));

        System.out.println("|||||||||1 level, 2 task|||||||||");
        System.out.println("Ход коня по бесконечной шахматной доске. Вводится текущее положение коня и клетка в которую пробуют его передвинуть за 1 ход.\n" +
                "Программа должна проверить, возможно ли это сделать.");
        System.out.println("Ответ - " + FirstLevelTasks.isPossibleToMoveHorse(2, 1, 3, 3));
    }



}
