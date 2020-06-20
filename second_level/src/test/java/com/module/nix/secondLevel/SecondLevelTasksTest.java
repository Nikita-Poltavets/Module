package com.module.nix.secondLevel;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class SecondLevelTasksTest {

    @Test
    void isBracketsClose() {
        assertTrue(SecondLevelTasks.isBracketsClose("{}[]()"));
    }
}