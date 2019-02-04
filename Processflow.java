package Diploma;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.PrintWriter;
import java.awt.*;
import java.util.Scanner;

import jxl.Workbook;
import jxl.write.DateTime;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Processflow
{
    public static void main( String[] args ) throws Exception
    {
//Read the electrical values from the Mltimeter file.

        FileReader fileReader = new FileReader("D:\\Programare\\Programe\\IntelliJ\\Proiect de Diploma\\src\\main\\Log\\Valori electrice.txt");
            BufferedReader reader = new BufferedReader(fileReader);

            String text = "";
            String line = reader.readLine();

            while (line != null) {
                text = text + " " + line;
                line = reader.readLine();
            }
// Write the data stored in the Procesflow.txt.
            PrintWriter output = new PrintWriter("D:\\Programare\\Programe\\IntelliJ\\Proiect de Diploma\\src\\main\\Log\\ProcesFlow.txt");
            output.print(text);
        System.out.println("1. Valorice electrice au fost actualizate");
        TimeUnit.SECONDS.sleep(1);

// Initiate the request of the values from the barcode.
            String barcodescanner;
            Scanner barcode = new Scanner(System.in);
            System.out.println("2. Scanati va rog codul de bare ... ");
            barcodescanner = barcode.next();
            output.print(" " + barcodescanner);

            TimeUnit.SECONDS.sleep(1);
            output.close();
        System.out.println("3. Fisierul a fost actualizat ...");

// Create a excel file.

        File f = new File("D:\\Programare\\Programe\\IntelliJ\\Proiect de Diploma\\RezultatValori.xls");

            WritableWorkbook myexcel = Workbook.createWorkbook(f);
            WritableSheet mysheet = myexcel.createSheet("mysheet",0);
        Label l = new Label(0,0,"data 1");

        mysheet.addCell(new Label(0, 0, "Numar intern"));
        mysheet.addCell(new Label(0, 1, barcodescanner));

        mysheet.addCell(new Label(1, 0, "Rezistenta masurata"));
        mysheet.addCell(new Label(1, 1, "Rezistenta"));
        mysheet.addCell(new Label(2, 0, "Data masuratorii"));


        myexcel.write();
        myexcel.close();
        TimeUnit.SECONDS.sleep(1);
        System.out.println("A fost creat fisierul excel cu datele masuratorilor.");
    }
}
