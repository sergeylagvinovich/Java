package com.company;

import com.company.matrix.Matrix;
import com.company.matrix.MatrixFactory;
import com.company.matrix.SquareMatrix;

public class Main {

    public static void main(String[] args) {
        int i = 1;
        SquareMatrix matrix = MatrixFactory.createSquareMatrix(i,i);
        System.out.println(matrix.toString());
    }
}
