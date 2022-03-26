package Diziler;

import java.util.Arrays;

public class Transpoz {
    public static void main(String[] args) {
        int[][] uzaklik = {
                {1, 2, 3},
                {4, 5, 6}
        };
        System.out.println("Matris:");
        for (int i = 0; i < uzaklik.length; i++) {
            for (int j = 0; j < uzaklik[i].length; j++) {
                System.out.print(uzaklik[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Transpozu: ");
        int[][] duplicate = new int[3][2];
        for (int i = 0; i < duplicate.length; i++) {
            for (int j = 0; j < duplicate[i].length; j++) {
                duplicate[i][j] = 0;
                duplicate[i][j] = uzaklik[j][i];
                System.out.print(duplicate[i][j] + " ");
            }
            System.out.println();
        }


    }
}
