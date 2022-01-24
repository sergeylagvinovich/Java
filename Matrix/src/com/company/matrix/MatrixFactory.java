package com.company.matrix;

public class MatrixFactory {

    public static SquareMatrix createSquareMatrix(){
       return createSquareMatrix(10,10);
    }

    public static SquareMatrix createSquareMatrix(int sizeX, int sizeY){
        return createSquareMatrix(sizeX,sizeY,MatrixParams.FILL_RANDOMLY);
    }

    public static SquareMatrix createSquareMatrix(int sizeX,int sizeY,MatrixParams matrixParams){
        return new SquareMatrix(sizeX,sizeY,matrixParams);
    }

    public static SquareMatrix createSquareMatrix(int[][] matrix){
        if(!checkMatrix(matrix)){
            System.out.println("Не корректная матрица");
            return null;
        }else
            return new SquareMatrix(matrix);
    }

    private static boolean checkMatrix(int[][] matrix){
        return false;
    }
}
