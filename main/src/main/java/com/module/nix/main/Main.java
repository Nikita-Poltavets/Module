package com.module.nix.main;

import com.module.nix.firstLevel.FirstLevelTasks;
import com.module.nix.secondLevel.SecondLevelTasks;
import com.module.nix.secondLevel.TreeNode;

public class Main {

    public static void main(String[] args) {
        int[] array = {1, 4, 5, 1, 1, 1, 3};

        SecondLevelTasks tree = new SecondLevelTasks();
        tree.root = new TreeNode(33);
        tree.root.left = new TreeNode(24);
        tree.root.right = new TreeNode(13);
        tree.root.right.left = new TreeNode(13);
        tree.root.right.left = new TreeNode(67);
        tree.root.left.right = new TreeNode(41);
        tree.root.left.right = new TreeNode(4);


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

        System.out.println();

        System.out.println("|||||||||2 LEVEL, 1 TASK|||||||||");
        System.out.println("Учитывая строку, содержащую символы '(', ')', '{', '}', '[' и ']', определите, является ли входная строка допустимой.\n" +
                "Входная строка действительна, если:\n" +
                "Открытые скобки должны быть закрыты скобками того же типа.\n" +
                "Открытые скобки должны быть закрыты в правильном порядке.\n" +
                "Обратите внимание, что пустая строка также считается допустимой.");
        System.out.println("Ответ - " + SecondLevelTasks.isBracketsClose("{}[]()"));

        System.out.println();

        System.out.println("|||||||||2 LEVEL, 2 TASK|||||||||");
        System.out.println("По заданному бинарному дереву найдите его максимальную глубину. Максимальная глубина - это количество узлов вдоль самого длинного пути от корневого узла до самого дальнего конечного узла.\n" +
                "/**\n" +
                " * Definition for a binary tree node.\n" +
                " * public class TreeNode {\n" +
                " *     int val;\n" +
                " *     TreeNode left;\n" +
                " *     TreeNode right;\n" +
                " *     TreeNode(int x) { val = x; }\n" +
                " * }");
        System.out.println("Ответ - " + SecondLevelTasks.maxDepthOfBinaryTree(tree.root));

        System.out.println();


    }



}
