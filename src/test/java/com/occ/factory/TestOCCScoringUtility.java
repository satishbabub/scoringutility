package com.occ.factory;

import com.occ.score.factory.OCCScoringUtility;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestOCCScoringUtility {
    OCCScoringUtility occScoringUtility;

    @BeforeEach
    public void setUp(){
       occScoringUtility = new OCCScoringUtility();
    }

    @Test
    public void testCalculateScore(){
        String[] namesUpper = new String[]{"MARY","PATRICIA","LINDA","BARBARA","VINCENZO","SHON","LYNWOOD","JERE","HAI"};
        String[] namesLower = new String[]{"mary","patricia","linda","barbara","vincenzo","shon","lynwood","jere","hai"};
        assertEquals(occScoringUtility.calculateScore(namesUpper), occScoringUtility.calculateScore(namesLower));
        assertEquals(3194, occScoringUtility.calculateScore(namesLower));
    }
}
