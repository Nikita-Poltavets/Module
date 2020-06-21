package com.module.nix.thirdLevel;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ThirdLevelTasksTest {

    @Test
    void gameOfLife() {
        int[][] board = {
                {0,  0,  0,  0,  0,  0,  0,  0,  0},
                {0,  0,  0,  0,  0,  0,  0,  0,  0},
                {0,  1,  0,  1,  0,  0,  0,  0,  0},
                {0,  0,  1,  0,  0,  0,  1,  1,  0},
                {0,  0,  0,  0,  0,  1,  1,  1,  1},
                {0,  0,  0,  0,  0,  0,  0,  0,  0},
                {0,  0,  1,  0,  0,  0,  0,  0,  0},
                {0,  0,  0,  1,  0,  0,  0,  0,  0},
                {0,  0,  0,  1,  0,  0,  0,  0,  0}
        };

        int[][] nextGenerationBoard = {
                {0,	0,	0,	0,	0,	0,	0,	0,	0},
                {0,	0,	0,	0,	0,	0,	0,	0,	0},
                {0,	0,	1,	0,	0,	0,	0,	0,	0},
                {0,	0,	1,	0,	0,	1,	0,	0,	1},
                {0,	0,	0,	0,	0,	1,	0,	0,	1},
                {0,	0,	0,	0,	0,	0,	1,	1,	0},
                {0,	0,	0,	0,	0,	0,	0,	0,	0},
                {0,	0,	1,	1,	0,	0,	0,	0,	0},
                {0,	0,	0,	0,	0,	0,	0,	0,	0},
        };

        assertArrayEquals(ThirdLevelTasks.gameOfLife(board), nextGenerationBoard);
    }
}