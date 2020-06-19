package com.module.nix.firstLevel;

public class FirstLevelTasks {


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
