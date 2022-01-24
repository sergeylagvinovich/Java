package com.company.matrix;

public enum MatrixParams {
    FILL_WITH_ZEROS("Заполнить матрицу нулями"),
    FILL_RANDOMLY("Заполнить матрицу случайными значениями"),
    FILL_IN_MANUALLY("Заполнить матрицу вручную");

    private String title;

    MatrixParams(String title) {
        this.title = title;
    }

    public String getTitle(){
        return this.title;
    }
}
