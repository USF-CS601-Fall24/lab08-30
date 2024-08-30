package exceptions;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

// Consider the following code and answer the questions:
/*
 1. Will the code crush? Why?
 2. What will happen if we remove "throws IOException" from the signature of readFromFile?
 3. What will happen if main does not have a try / catch block?
 4. What will happen if instead of having try/catch in main we add "throws IOException" to the signature of the main method?
 5. Can you catch ArithmeticException instead of IOException in catch?
 6. Can you catch Exception instead of IOException in catch? Why is it a bad practice?
 7. What we use two catch blocks, one for IOException, one for Exception. Which one should come first?
 */
public class TryCatchDemo {

    public static void main(String[] args) {
        try {
            readFromFile(Paths.get("fileThatDoesNotExist.txt"));
        }
        catch (IOException e) {
            System.out.println(e);
        }
    }

    public static void readFromFile(Path path) throws IOException
    {
        BufferedReader reader = Files.newBufferedReader(path, Charset.forName("UTF-8"));
        String line;
        while ((line = reader.readLine()) != null) {
            System.out.println(line);
        }

        System.out.println("Last statement");
    }
}

