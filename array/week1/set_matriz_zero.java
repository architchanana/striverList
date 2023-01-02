package com.company.striver_sheet.array.week1;

import java.util.Arrays;

public class set_matriz_zero {
    public static void main(String[] args) {
        int [][]matrix = {{1,1,1},{1,0,1},{1,1,1}};
        setZeroes(matrix);
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void setZeroes(int[][] matrix) {
        int[]row=new int[matrix.length];
        int []col=new int[matrix[0].length];
        Arrays.fill(row,1);
        Arrays.fill(col,1);
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j]==0){
                    row[i]=0;
                    col[j]=0;
                }
            }
        }
        System.out.println(Arrays.toString(row));
        System.out.println(Arrays.toString(col));
        for(int i=0;i<row.length;i++){
            if(row[i]==0){
                for(int j=0;j<matrix[0].length;j++){
                    matrix[i][j]=0;
                }
            }
        }
        for(int i=0;i<col.length;i++){
            if(col[i]==0){
                for(int j=0;j<matrix.length;j++){
                    matrix[j][i]=0;
                }
            }
        }
    }
}
