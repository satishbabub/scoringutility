package com.occ.score.factory;

import com.occ.util.ScoringKey;

/**
 * Factory class returning instances of @{@link ScoringUtility} based on @scoringKey
 */
public class ScoringFactory {
    /**
     * factory method that returns ScoringUtility instance
     * @param scoringKey
     * @return @{@link ScoringUtility}
     */
    public static ScoringUtility getScoringUtil(ScoringKey scoringKey) {
        ScoringUtility scoringUtility = null;
        switch (scoringKey) {
            case OCC_1:
                scoringUtility = new OCCScoringUtility();
                break;
        }
        return scoringUtility;
    }
}
