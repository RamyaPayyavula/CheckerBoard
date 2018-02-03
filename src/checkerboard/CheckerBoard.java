/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package checkerboard;

import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

/**
 *
 * @author ramya
 */
public class CheckerBoard {
    
    private int numRows;
    private int numCols;
    private double boardWidth;
    private double boardHeight;
    private double rectangleWidth;
    private double rectangleHeight;
    private Color lightColor = Color.RED;
    private Color darkColor = Color.BLACK;
    private AnchorPane anchorPane;
    
    public CheckerBoard(int numRows, int numCols, double boardWidth, double boardHeight) {
       this.numRows = numRows;
       this.numCols = numCols;
       this.boardWidth = boardWidth;
       this.boardHeight = boardHeight;
       rectangleWidth = boardWidth / numCols;
       rectangleHeight = boardHeight / numRows;
    }
    
    public CheckerBoard(int numRows, int numCols, double boardWidth, double boardHeight, Color lightColor, Color darkColor) {
       this(numRows, numCols, boardWidth, boardHeight);
       this.lightColor = lightColor;
       this.darkColor = darkColor;
    }
    
    
    public AnchorPane build() {
        anchorPane = new AnchorPane();
        anchorPane.setPrefSize(boardWidth, boardHeight);
        
        for (int row = 0; row < numRows; row++) {
            for (int col = 0; col < numCols; col++) {
                Rectangle rectangle = new Rectangle(col * rectangleWidth, row * rectangleHeight, rectangleWidth, rectangleHeight);
                Color color = darkColor;
                if ((col %2) == (row % 2)) {
                    color = lightColor;
                }
                rectangle.setFill(color);
                anchorPane.getChildren().add(rectangle);
            }
        }
        
        return anchorPane;
    }
    
    public AnchorPane getBoard() {
        return anchorPane;
    }
    public Color getDarkColor() {
        return darkColor;
    }
    public int getNumCols() {
        return numCols;
    }
    public int getNumRows() {
        return numRows;
    }
    public double getRectangleWidth() {
        return rectangleWidth;
    }
    
    public double getRectangleHeight() {
        return rectangleHeight;
    }
    public double getWidth() {
        return boardWidth;
    }
    
    public double getHeight() {
        return boardHeight;
    }
     
    public Color getLightColor() {
        return lightColor;
    } 
}
