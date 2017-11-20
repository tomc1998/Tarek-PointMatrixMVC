package com.tarek.mvc;

public class PointMatrixView {
  public void drawMatrix(int[][] data) {
    for(int ii = 0; ii < data.length; ++ii) {
      for(int jj = 0; jj < data[ii].length; ++jj) {
        System.out.print(data[ii][jj]);
      }
      System.out.println("");
    }
  }
}

