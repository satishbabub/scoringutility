package com.occ.score.factory;

import com.occ.exception.ScoringException;

/**
 * ScoringUtility interface, All Scoring algorithm will implement this interface
 * and provide definition for calculateScore method
 */
public interface ScoringUtility {
    public long calculateScore(String[] names) throws ScoringException;
}
