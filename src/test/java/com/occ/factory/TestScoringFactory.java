package com.occ.factory;

import com.occ.score.factory.OCCScoringUtility;
import com.occ.score.factory.ScoringFactory;
import com.occ.score.factory.ScoringUtility;
import com.occ.util.ScoringKey;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class TestScoringFactory {
    ScoringFactory scoringFactory;

    @BeforeEach
    public void setUp(){
        scoringFactory = new ScoringFactory();
    }

    @Test
    public void testGetScoringUtility_OCC() {
        ScoringUtility scoringUtility = scoringFactory.getScoringUtil(ScoringKey.OCC_1);
        assertTrue(scoringUtility instanceof OCCScoringUtility);
    }

}
