/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.testquestion1;

/**
 *
 * @author Student
 */
public class TestQuestion1 {

     public static void main(String[] args) {

        // Two-dimensional arrays
        int[][] sales = {
            {1000, 2000,3000},
            {2000, 3000, 4000},
            {1500, 1100, 1200}
        };

        String[] consoles = {
            "PS5",
            "XBOX",
            "SWITCH"
        };

        String[] cities = {
            "Cape Town",
            "Port Elizabeth",
            "Pretoria"
        };

        // Console Sales Totals For Each City
        int CapeTownTotal = 0;
        int PortElizabethTotal = 0;
        int PretoriaTotal = 0;

        System.out.println("==============================================");
        System.out.println("       GAMING Console REPORT               ");
        System.out.println("==============================================");

        System.out.printf("%-15s %-8s %-8s %-8s %-8s%n",
                "CONSOLE", "PS5", "XBOX", "SWITCH", "TOTAL");

        // Print rows and calculate totals
        for (int row = 0; row < sales.length; row++) {

            int consoleTotal = 0;

            for (int column = 0; column < sales[row].length; column++) {

                consoleTotal = consoleTotal + sales[row][column];

                if (column == 0) {
                    CapeTownTotal = CapeTownTotal + sales[row][column];
                } else if (column == 1) {
                    PortElizabethTotal = PortElizabethTotal + sales[row][column];
                } else if (column == 2) {
                    PretoriaTotal = PretoriaTotal + sales[row][column];
                }
            }

            System.out.printf("%-15s %-8d %-8d %-8d %-8d%n",
                    cities[row],
                    sales[row][0],
                    sales[row][1],
                    sales[row][2],
                    consoleTotal);
        }

        System.out.println("----------------------------------------------");

        System.out.printf("%-15s %-8d %-8d %-8d%n",
                "Cities TOTAL",
                CapeTownTotal,
                PortElizabethTotal,
                PretoriaTotal);

        System.out.println("==============================================");
    }
}
