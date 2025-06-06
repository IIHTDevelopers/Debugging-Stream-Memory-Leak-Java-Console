package com.genspark.task2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

import static com.genspark.task2.utils.TestUtils.businessTestFile;
import static com.genspark.task2.utils.TestUtils.currentTest;
import static com.genspark.task2.utils.TestUtils.testReport;
import static com.genspark.task2.utils.TestUtils.yakshaAssert;

class CSVTest {

	@Test
    public void testCountLinesWithResourceClosure() throws IOException {
        // Create temporary file with known number of lines
        Path tempFile = Files.createTempFile("testfile", ".txt");
        try (FileWriter writer = new FileWriter(tempFile.toFile())) {
            writer.write("Line 1\nLine 2\nLine 3\n");
        }

        // Call the method and check line count
        Main main = new Main();
        long lineCount = main.countLines(tempFile.toString());
        
        yakshaAssert(currentTest(), (lineCount==3 && tempFile.toFile().delete()), businessTestFile);

        //assertEquals(3, lineCount);

        // Try deleting the file to confirm it’s not locked (implies stream was closed)
        //assertTrue(tempFile.toFile().delete(), "File deletion failed - possible stream not closed");
    }

}
