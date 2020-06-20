package com.module.nix.secondLevel;

public class SecondLevelTasks {

    public TreeNode root;

    public static int maxDepthOfBinaryTree(TreeNode root){
        if (root == null){ return 0; }

        int leftDepth = maxDepthOfBinaryTree(root.left);
        int rightDepth = maxDepthOfBinaryTree(root.right);

        if (leftDepth > rightDepth)
            return (leftDepth + 1);
        else
            return (rightDepth + 1);
    }

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
