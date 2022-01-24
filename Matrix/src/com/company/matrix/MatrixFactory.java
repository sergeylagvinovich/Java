package com.company.matrix;

public class MatrixFactory {


    public static RectangularMatrix createRectangularMatrix(){
        return createRectangularMatrix(10,10);
    }
    public static RectangularMatrix createRectangularMatrix(int sizeX, int sizeY){
        return createRectangularMatrix(sizeX,sizeY,MatrixParams.FILL_RANDOMLY);
    }
    public static RectangularMatrix createRectangularMatrix(int sizeX, int sizeY, MatrixParams matrixParams){
        if(checkSizesByNull(sizeX,sizeY))
            return new RectangularMatrix(sizeX,sizeY, matrixParams);
        else{
            return null;
        }

    }
    public static RectangularMatrix createRectangularMatrix(int[][] matrix){
        return new RectangularMatrix(matrix);
    }

    //Создание квадратной матрицы
    public static SquareMatrix createSquareMatrix(){
       return createSquareMatrix(10,10);
    }

    public static SquareMatrix createSquareMatrix(int sizeX, int sizeY){
        return createSquareMatrix(sizeX,sizeY,MatrixParams.FILL_RANDOMLY);
    }

    public static SquareMatrix createSquareMatrix(int sizeX,int sizeY,MatrixParams matrixParams){
        if(sizeX == sizeY)
            return new SquareMatrix(sizeX,sizeY,matrixParams);
        else {
            System.out.println("Переданная размерность матрицы не подходит для квадратной матрицы");
            return null;
        }
    }

    public static SquareMatrix createSquareMatrix(int[][] matrix){
        if(!checkMatrix(matrix)){
            System.out.println("Не корректная матрица");
            return null;
        }else
            return new SquareMatrix(matrix);
    }


    private static boolean checkSizesByNull(int sizeX, int sizeY){
        if(sizeX <= 0 || sizeY<=0) {
            System.out.println("Размерность матрицы должна быть больше 0");
            return false;
        }
        return true;
    }

    private static boolean checkMatrix(int[][] matrix){
        return false;
    }
}
