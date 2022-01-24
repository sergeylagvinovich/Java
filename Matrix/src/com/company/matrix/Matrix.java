package com.company.matrix;

public abstract class Matrix {

    private int sizeX;
    private int sizeY;
    private int matrix[][];

    protected Matrix(int sizeX, int sizeY, MatrixParams matrixParams) {
        this.sizeX = sizeX;
        this.sizeY = sizeY;
        fillMatrix(matrixParams);
    }

    protected Matrix(int[][] matrix) {
        this.matrix = matrix;
        this.sizeX = matrix[matrix.length - 1].length;
        this.sizeY = matrix.length;
    }

    private void fillMatrix(MatrixParams matrixParams){
        switch (matrixParams){
            case FILL_RANDOMLY:{
                fillRandom();
                break;
            }
            case FILL_IN_MANUALLY:{
                fillInManually();
                break;
            }
            case FILL_WITH_ZEROS:{
                fillWithValue(0);
                break;
            }
        }
    }

    private void fillRandom(){

    }

    private void fillWithValue(int value){

    }

    private void fillInManually(){

    }

    @Override
    public String toString() {
        return "Matrix{" +
                "sizeX=" + sizeX +
                ", sizeY=" + sizeY +
                '}';
    }
}
