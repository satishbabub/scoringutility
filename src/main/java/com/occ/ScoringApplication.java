package com.occ;

import com.occ.exception.ScoringException;
import com.occ.score.factory.ScoringFactory;
import com.occ.score.factory.ScoringUtility;
import com.occ.util.FileReader;
import com.occ.util.ScoringKey;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * main class that triggers the scoring
 */

public class ScoringApplication {
    static Logger logger = LoggerFactory.getLogger(ScoringApplication.class);

    public static void main(String[] args) throws Exception {
        if (args.length < 2) {
            throw new ScoringException("missing arguments, input file(absolute path) and scoring KEY are required");
        }
        logger.info("filePath: " + args[0]);
        logger.info("Scoring Key: " + args[1]);
        ScoringUtility scoringUtility = ScoringFactory.getScoringUtil(ScoringKey.fromValue(args[1]));
        FileReader fileReader = new FileReader();
        scoringUtility.calculateScore(fileReader.readNames(args[0]));
    }
}
