package Diploma;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.PrintWriter;
import java.awt.*;
import java.util.Scanner;

public class Processflow
{
    public static void main( String[] args ) throws Exception
    {
        FileReader fileReader = new FileReader("D:\\Programare\\Programe\\IntelliJ\\Proiect de Diploma\\src\\main\\Log\\Valori electrice.txt");
        BufferedReader reader = new BufferedReader(fileReader);

        String text = "";                              // objekt that retains the electrical values fromthe specified file.
        String line = reader.readLine();               // read the file from begining to end.

        while (line != null){
            text = text + line;
            line = reader.readLine();
        }

// Write the data stored in the buffer.
        PrintWriter output = new PrintWriter("D:\\Programare\\Programe\\IntelliJ\\Proiect de Diploma\\src\\main\\Log\\ProcesFlow.txt");
        output.println(text);


// Initiate the request of the values from the barcode.
        String barcodescanner;

        Scanner barcode = new Scanner(System.in);
        System.out.println("Please scan the bar code ... ");
        barcodescanner = barcode.next();
        output.print(barcodescanner);

        output.close();



    }
}
