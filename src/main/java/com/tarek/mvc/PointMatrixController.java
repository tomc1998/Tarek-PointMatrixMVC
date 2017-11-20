package com.tarek.mvc;

public class PointMatrixController {
  private PointMatrixView view;
  private PointMatrixModel model;

  public PointMatrixController(
      PointMatrixView view, 
      PointMatrixModel model) {
    this.view = view;
    this.model = model;
  }

  public void updateView() {
    view.drawMatrix(model.data);
  }

  public void initialiseMatrix() {
    for(int ii = 0; ii < model.data.length; ++ii) {
      for(int jj = 0; jj < model.data[ii].length; ++jj) {
        model.data[ii][jj] = 
          (int)Math.floor(Math.random() * 4 + 1);
      }
    }
  }
}
