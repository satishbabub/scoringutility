package com.occ.util;

import com.occ.exception.ScoringException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Utility class exposing methods to read contents of a file(from absolute path)
 * transform them into array of names
 */
public class FileReader {
    static Logger logger = LoggerFactory.getLogger(FileReader.class);
    /**
     * reads contents of the file line by line and return the names array
     * @param filePath
     * @return String[]
     * @throws @{@link ScoringException}
     */
    public String[] readNames(String filePath) throws ScoringException {
        List<String> list;
        try (Stream<String> stream = Files.lines(Paths.get(filePath))) {
            list = stream.collect(Collectors.toList());
        } catch (NoSuchFileException e) {
            throw new ScoringException("File not found: " + filePath);
        } catch (IOException e) {
            throw new ScoringException("Error reading the file: " + filePath);
        }
        if (list.get(0) == null || list.get(0).trim().length() == 0) {
            throw new ScoringException("No content Error, Uploaded file has no content");
        }
        /*Trimming the leading and trailing quote before splitting using "," as delimiter*/
        logger.info("File contents: "+ list.get(0));
        return list.get(0).substring(1, list.get(0).length() - 1).split("\",\"");
    }
}
