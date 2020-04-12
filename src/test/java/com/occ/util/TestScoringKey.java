package com.occ.util;

import com.occ.exception.ScoringException;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TestScoringKey {

    @Test
    public void test_OCC_1Key() throws Exception{
        assertEquals(ScoringKey.OCC_1, ScoringKey.fromValue("OCC_1"));
    }

    @Test
    public void test_InvalidKey() {
        Exception exception = assertThrows(ScoringException.class, () -> {
            assertEquals(ScoringKey.OCC_1, ScoringKey.fromValue("RandomKey"));
        });
        assertTrue(exception.getMessage().contains("Invalid scoring Key. Scoring algorithm not defined for key: RandomKey"));
    }
}
