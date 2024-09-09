import java.io.File;
import java.util.Scanner;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.*;


public class Main
{
    public static void main(String[] args)
    {
        try
        {
            int counter = 1;
            int numberOfLinesOne = 0;
            int numberOfLinesTwo = 0;
            Scanner input = new Scanner(System.in);
            System.out.println("Enter file name for file1");
            String fileOne = input.next();
            System.out.println("Enter file name for file2");
            String fileTwo = input.next();

            String fileOneLocation = "C:\\Users\\tyler\\IdeaProjects\\Lab 9\\src\\" + fileOne;
            String fileTwoLocation = "C:\\Users\\tyler\\IdeaProjects\\Lab 9\\src\\" + fileTwo;
           /* File myFile = new File("source.csv");
            File myFile = new File("source.csv");*/

            Scanner file1Scan = new Scanner(new File(fileOneLocation));
            Scanner file2Scan = new Scanner(new File(fileTwoLocation));

            BufferedReader file1ScanLines = new BufferedReader(new FileReader(fileOneLocation));
            BufferedReader file2ScanLines = new BufferedReader(new FileReader(fileTwoLocation));

            while (file1ScanLines.readLine() != null)
            {
                numberOfLinesOne++;
            }
            while (file2ScanLines.readLine() != null)
            {
                numberOfLinesTwo++;
            }
            if(numberOfLinesOne != numberOfLinesTwo)
            {
                System.out.println("Files have different number of lines");
                System.exit(0);
            }

            while(file1Scan.hasNextLine())
            {
                String fileOneData = file1Scan.nextLine();
                String fileTwoData = file2Scan.nextLine();


                if(fileOneData.equals(fileTwoData))
                {
                    counter++;

                }
                else
                {
                    System.out.println("Line " + counter);
                    System.out.println("< " + fileOneData);
                    System.out.println("> " + fileTwoData);
                    counter++;
                }
            }
        }
        catch(IOException ioe)
        {
            System.out.println ("Error: " + ioe.getMessage());
        }
    }
}