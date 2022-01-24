package com.company.matrix;

public class SquareMatrix extends Matrix implements AdditionMatrix, MultiplicationMatrix{

    protected SquareMatrix(int sizeX, int sizeY, MatrixParams matrixParams) {
        super(sizeX, sizeY, matrixParams);
    }

    protected SquareMatrix(int[][] matrix) {
        super(matrix);
    }

    @Override
    public Matrix fold(Matrix otherMatrix) {
        return null;
    }

    @Override
    public Matrix multiply(Matrix otherMatrix) {
        return null;
    }
}
