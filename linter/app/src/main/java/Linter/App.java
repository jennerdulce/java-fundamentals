package Linter;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.io.IOException;
import java.util.*;

public class App {
    public static void main(String[] args) {
        // Linter
        String filePath = "/Users/jenner/codefellows/Java-401/java-fundamentals/linter/app/src/main/resources/gates.js";
        System.out.println(linter(filePath));
    }

    public static String linter(String filePath) {
        int lineCounter = 0;
        String errorMessage = "";
        try {
            Path newPath = Paths.get(filePath);
            Scanner scanner = new Scanner(newPath);
            while(scanner.hasNextLine()){
                lineCounter++;
                String currentString = scanner.nextLine();
                if(currentString.isEmpty() || currentString.endsWith(";") || currentString.endsWith("{") || currentString.endsWith("}") || currentString.contains("if") || currentString.contains("else")){
                    continue;
                } else {
                    errorMessage += "Line " + lineCounter + ": Missing semicolon.\n";
                }
            }
        } catch (Exception e){
            System.out.println(e + " Line: " + lineCounter);
        }
        return errorMessage;
    }
}