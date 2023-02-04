package com.jewelexx;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.jewelexx.mccolours.MCColours;

public class ColoursTest {

    @Test
    public void redShouldBeRed() {
        assertEquals(MCColours.RED, "§c");
    }
}
