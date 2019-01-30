package Diploma;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.PrintWriter;

public class Processflow
{
    public static void main( String[] args ) throws Exception
    {
        FileReader fileReader = new FileReader("D:\\Programare\\Programe\\IntelliJ\\Proiect de Diploma\\Log\\Valori electrice.txt");
        BufferedReader reader = new BufferedReader(fileReader);

        String text = "";                                         // objekt that retains the text from the file readed.
        String line = reader.readLine();                          // read the file from begining to end.

        while (line != null){
            text = text + line;
            line = reader.readLine();
        }

// Write the data stored in the buffer.
        PrintWriter output = new PrintWriter("D:\\Programare\\Programe\\IntelliJ\\Proiect de Diploma\\Log\\ProcesFlow.txt");
        output.println(text);
        output.close();


    }
}
