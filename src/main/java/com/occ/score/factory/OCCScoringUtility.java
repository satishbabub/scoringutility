package com.occ.score.factory;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Arrays;

/**
 * Class to calculates the score for OCC
 */
public class OCCScoringUtility implements ScoringUtility {
    static Logger logger = LoggerFactory.getLogger(OCCScoringUtility.class);

    /**
     * calculates the score of the file
     * @param names
     * @return long total score of the file
     */
    public long calculateScore(String[] names) {
        long score = 0;
        Arrays.sort(names);
        int index = 1;
        for (String name : names) {
            score += getNameScore(name.toUpperCase()) * index++;
        }
        logger.info("File score: "+score);
        return score;
    }

    /**
     * calculate the score of individual names
     * @param name
     * @return int score of the name
     */
    private int getNameScore(String name) {
        int score = 0;
        for (char c : name.toCharArray()) {
            if(Character.isLetter(c)) {
                if (Character.isUpperCase(c)) {
                    score += c - 'A' + 1;
                } else if (Character.isLowerCase(c)) {
                    score += c - 'a' + 1;
                }
            }
        }
        return score;
    }
}
