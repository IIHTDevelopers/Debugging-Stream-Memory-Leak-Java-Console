
package com.genspark.task2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {

    public long countLines(String path) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(path));
        String line;
        long count = 0;
        while ((line = br.readLine()) != null) {
            count++;
        }
        // BUG: best practice not followed
        
        return count;
    }
}
