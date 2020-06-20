package com.module.nix.secondLevel;

public class SecondLevelTasks {

    public static boolean isBracketsClose(String line){
        int countBrackets = 0;
        char[] arrayLine = line.toCharArray();

        if(line.isEmpty()){ return true; }

        for (int i = 0; i < arrayLine.length; i++) {
            if(arrayLine[i] == '{' || arrayLine[i] == '(' || arrayLine[i] == '[')
                countBrackets++;
            else if(arrayLine[i] == '}' || arrayLine[i] == ')' || arrayLine[i] == ']')
                countBrackets--;
        }

        if(countBrackets == 0) { return true; }

        return false;
    }
}
