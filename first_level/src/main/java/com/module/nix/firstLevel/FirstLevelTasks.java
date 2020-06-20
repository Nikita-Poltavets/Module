package com.module.nix.firstLevel;

public class FirstLevelTasks {

    public static double triangleArea(double a, double b, double c){
       double s, p;

       p = 0.5 * (a + b + c);
       s = Math.sqrt(p * (p - a) * (p - b) * (p - c));

       return s;
    }

    public static boolean isPossibleToMoveHorse(int x1, int y1, int x2, int y2){
        if((Math.abs(x1 - x2) == 1 && Math.abs(y1 - y2) == 2) || (Math.abs(x1 - x2) == 2 && Math.abs(y1 - y2) == 1)){
            return true;
        } else {
            return false;
        }
    }

    public static int returnAmountOfUniqueSymbol(int[] array){
        int countUnique = 0;
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            countUnique++;
            for (int j = i+1; j < array.length; j++)
            {
                if (array[j] == array[i])
                {
                    count++;
                    break;
                }
            }
        }
        return countUnique - count;
    }
}
