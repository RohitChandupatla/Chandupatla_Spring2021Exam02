/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question02;
import java.util.Scanner;

/**
 *
 * @author Rohit Reddy Chandupatla
 */
public class Array2D {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter list1: ");
        int[][] firstArray = new int[3][3];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                firstArray[i][j] = scanner.nextInt();
            }
        }

        System.out.println("Enter list2: ");
        int[][] secondArray = new int[3][3];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                secondArray[i][j] = scanner.nextInt();
            }
        }

        scanner.close();

        if (equals(firstArray, secondArray)) {
            System.out.println("The two arrays are strictly identical");
        }
        else {
            System.out.println("The two arrays are not strictly identical");
        }
    }

    public static boolean equals(int[][] m1, int[][] m2) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (m1[i][j] != m2[i][j]) {
                    return false;
                }
            }
        }
        return true;
    }
}

