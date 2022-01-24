package com.company;

import com.company.matrix.Matrix;
import com.company.matrix.MatrixFactory;
import com.company.matrix.SquareMatrix;

public class Main {

    public static void main(String[] args) throws Exception {
        SquareMatrix matrix = MatrixFactory.createSquareMatrix(1,1);
        System.out.println(matrix.toString());
    }
}
