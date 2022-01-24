package com.company.matrix;

public class RectangularMatrix extends Matrix{

    protected RectangularMatrix(int sizeX, int sizeY, MatrixParams matrixParams) {
        super(sizeX, sizeY, matrixParams);
    }

    protected RectangularMatrix(int[][] matrix) {
        super(matrix);
    }
}
