package org.xcelevate;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class FetchingIT {

    @Test
    void integrationTest_fetchingObject() {
        Fetching fetching = new Fetching();

        assertEquals("Keerthika Mathiyazhagan", fetching.getName());
        assertEquals(23, fetching.getAge());
        assertFalse(fetching.isEmployed());
        assertEquals('F', fetching.getGender());
        assertEquals(49.8, fetching.getWeight(), 0.01);
    }
}
