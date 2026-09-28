/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.testquestion2;
import java.util.Scanner;
/**
 *
 * @author Student
 */
public class TestQuestion2 {

     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Select the electronic type");
        System.out.println("1. PS5");
        System.out.println("2. XBOX");
        System.out.println("3. SWITCH");
        System.out.print("Choice: ");
        int choice = scanner.nextInt();
        scanner.nextLine(); 

        String consoleType = "";
        switch (choice) {
            case 1:
                consoleType = "PS5";
                break;
            case 2:
                consoleType = "XBOX";
                break;
            case 3:
                consoleType = "SWITCH";
                break;
            default:
                consoleType = "Unknown";
                break;
        }

        System.out.print("Enter The Store: ");
        String storeName = scanner.nextLine();

        System.out.print("ENTER THE TOTAL SALES OF THE " + consoleType + " CONSOLES FOR " + storeName + ": ");
        int totalSales = scanner.nextInt();

        System.out.println();
        
        ConsoleSales salesReport = new ConsoleSales(consoleType, storeName, totalSales);
        salesReport.printReport();
        
        scanner.close();
    }
}
