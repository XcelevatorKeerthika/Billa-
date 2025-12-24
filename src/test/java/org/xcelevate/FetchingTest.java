package org.xcelevate;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class FetchingTest {

    @Test
    void testGetName() {
        Fetching fetching = new Fetching();
        assertEquals("Keerthika Mathiyazhagan", fetching.getName());
    }

    @Test
    void testGetAge() {
        Fetching fetching = new Fetching();
        assertEquals(23, fetching.getAge());
    }

    @Test
    void testIsEmployed() {
        Fetching fetching = new Fetching();
        assertFalse(fetching.isEmployed());
    }

    @Test
    void testGetGender() {
        Fetching fetching = new Fetching();
        assertEquals('F', fetching.getGender());
    }
}
