package org.example;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the first list
        System.out.print("Enter list1: ");
        int size1 = scanner.nextInt();
        int[] list1 = new int[size1];
        for (int i = 0; i < size1; i++) {
            list1[i] = scanner.nextInt();
        }

        // Read the second list
        System.out.print("Enter list2: ");
        int size2 = scanner.nextInt();
        int[] list2 = new int[size2];
        for (int i = 0; i < size2; i++) {
            list2[i] = scanner.nextInt();
        }

        // Check if the lists are identical
        if (equals(list1, list2)) {
            System.out.println("Two lists are identical");
        } else {
            System.out.println("Two lists are not identical");
        }

        scanner.close();
    }

    public static boolean equals(int[] list1, int[] list2) {
        if (list1.length != list2.length) {
            return false;
        }

        for (int i = 0; i < list1.length; i++) {
            if (list1[i] != list2[i]) {
                return false;
            }
        }

        return true;
    }
}