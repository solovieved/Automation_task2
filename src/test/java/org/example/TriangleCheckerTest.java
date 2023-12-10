package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TriangleCheckerTest {

    @Test
    public void testIsTriangle() {
        assertTrue(TriangleChecker.isTriangle(3, 4, 5));
        assertTrue(TriangleChecker.isTriangle(2, 2, 2));
        assertTrue(TriangleChecker.isTriangle(2, 3, 4));
        assertFalse(TriangleChecker.isTriangle(0, 0, 0));
    }

    @Test
    public void testDetermineTriangleType() {
        assertEquals("equilateral", TriangleChecker.determineTriangleType(2, 2, 2));
        assertEquals("isosceles", TriangleChecker.determineTriangleType(2, 3, 3));
        assertEquals("scalene", TriangleChecker.determineTriangleType(3, 4, 5));
        assertEquals("scalene", TriangleChecker.determineTriangleType(2, 3, 4));
        assertNotEquals("isosceles", TriangleChecker.determineTriangleType(3, 4, 5));
        assertNotEquals("equilateral", TriangleChecker.determineTriangleType(3, 4, 5));
    }

}
