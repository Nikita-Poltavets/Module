package com.module.nix.secondLevel;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class SecondLevelTasksTest {

    @Test
    void isBracketsClose() {
        assertTrue(SecondLevelTasks.isBracketsClose("{}[]()"));
    }

    @Test
    void maxDepthOfBinaryTree() {
        SecondLevelTasks tree = new SecondLevelTasks();
        tree.root = new TreeNode(33);
        tree.root.left = new TreeNode(24);
        tree.root.right = new TreeNode(13);
        tree.root.right.left = new TreeNode(13);
        tree.root.right.left = new TreeNode(67);
        tree.root.left.right = new TreeNode(41);
        tree.root.left.right = new TreeNode(4);

        assertEquals(SecondLevelTasks.maxDepthOfBinaryTree(tree.root), 3);
    }
}