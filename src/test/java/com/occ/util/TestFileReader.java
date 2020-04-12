package com.occ.util;

import com.occ.exception.ScoringException;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.File;

import static org.junit.jupiter.api.Assertions.*;

public class TestFileReader {
    FileReader fileReader;

    @BeforeEach
    public void setUp(){
        fileReader = new FileReader();
    }

    @Test
    public void testReadNames_FileNotFound() {
        Exception exception = assertThrows(ScoringException.class, () -> {
            fileReader.readNames("C:\\someInvalidPath\\NoFile.txt");
        });
        assertTrue(exception.getMessage().contains("File not found"));
    }

    @Test
    public void testReadNames_success() throws Exception{
        String path = "src/main/resources/config/names.txt";
        File file = new File(path);
        String absolutePath = file.getAbsolutePath();
        String[] names= fileReader.readNames(absolutePath);
        assertNotNull(names);
        assertEquals(3, names.length);
        assertEquals("MARY",names[0]);
        assertEquals("PATRICIA",names[1]);
        assertEquals("LINDA",names[2]);
    }
}
