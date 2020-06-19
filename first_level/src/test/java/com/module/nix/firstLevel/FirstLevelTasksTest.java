package com.module.nix.firstLevel;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class FirstLevelTasksTest {

    @Test
    void returnAmountOfUniqueSymbol() {
        int[] array = {1, 4, 5, 1, 1, 1, 3};
        assertEquals(FirstLevelTasks.returnAmountOfUniqueSymbol(array), 4);
    }

    @Test
    void isPossibleToMoveHorse() {
        assertTrue(FirstLevelTasks.isPossibleToMoveHorse(2, 1, 3, 3));
    }
}