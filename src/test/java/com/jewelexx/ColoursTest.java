package com.jewelexx;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.jewelexx.craftcolours.CraftColours;

public class ColoursTest {

    @Test
    public void redShouldBeRed() {
        assertEquals(CraftColours.RED, "§c");
    }
}
