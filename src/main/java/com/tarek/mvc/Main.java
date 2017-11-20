package com.tarek.mvc;

public class Main {
  public static void main(String[] args) {
    // Create the model and view
    PointMatrixModel model = new PointMatrixModel(6, 6);
    PointMatrixView view = new PointMatrixView();

    // Create the controller
    PointMatrixController controller 
      = new PointMatrixController(view, model);

    controller.initialiseMatrix();
    controller.updateView();

    controller.initialiseMatrix();
    controller.updateView();
  }
}

/*
 *
 * - PointMatrixController
 *   - IntialiseMatrix()
 * - PointMatrixModel
 *   - A big 2D array of integers
 *   - Each number in the array will be a number of dots
 * - PointMatrixView
 *   - DrawMatrix(PointMatrixModel model)
 *
 */
