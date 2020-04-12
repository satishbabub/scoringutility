package com.occ.util;

import com.occ.exception.ScoringException;

import java.util.HashMap;
import java.util.Map;

/**
 * Enum class representing different scoring implementations
 */
public enum ScoringKey {
    OCC_1("OCC_1");
    private String key;
    private static Map<String, ScoringKey> scoringKeyMap = new HashMap<>();

    ScoringKey(String key) {
        this.key = key;
    }

    static {
        for (ScoringKey scoringKey : ScoringKey.values()) {
            scoringKeyMap.put(scoringKey.key, scoringKey);
        }
    }

    /**
     *
     * @param key String
     * @return ScoringKey which is used in ScoringFactory to get ScoringUtility instance
     * @throws ScoringException
     */
    public static ScoringKey fromValue(String key) throws ScoringException{
        if(!scoringKeyMap.containsKey(key)){
            throw new ScoringException("Invalid scoring Key. Scoring algorithm not defined for key: "+key);
        }
        return scoringKeyMap.get(key);
    }
}
