package com.techelevator.view;

import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Auditor {

    public static void writeToLog(String message) {
        //path
        Path path = Paths.get("log.txt");

        ///File object
        File fileToWrite = new File(path.toAbsolutePath().toString());

        //try catch
        try (PrintWriter pw = new PrintWriter(new FileWriter(fileToWrite, true))) {
            //Print the Date/Time
            DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("MM/dd/yyyy hh:mm a");  //formatting on docs.oracle
            LocalDateTime currentDateTime = LocalDateTime.now();
            String dateTimeFormatted = currentDateTime.format(dateFormat);
            pw.println(dateTimeFormatted + " " + message);

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
