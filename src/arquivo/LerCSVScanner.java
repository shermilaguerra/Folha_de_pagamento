/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arquivo;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class LerCSVScanner {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(new File("/home/usuario/Documentos/a/Dados.csv"));
            scanner.useDelimiter(",|\n");
            
            while (scanner.hasNext()) {
                System.out.print(scanner.next() + " | ");
            }
            
            scanner.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
