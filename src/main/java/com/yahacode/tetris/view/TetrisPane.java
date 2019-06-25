package com.yahacode.tetris.view;

import com.yahacode.tetris.common.TetrisConsts;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;

public class TetrisPane extends Pane {

    private int width;

    private int height;

    private Canvas canvas;

    private GraphicsContext graphicsContext;

    public TetrisPane(int width, int height) {
        this.width = width;
        this.height = height;
        canvas = new Canvas(width, height);
        drawBoard();
        getChildren().add(canvas);
    }

    public void drawBoard() {
        graphicsContext = canvas.getGraphicsContext2D();
        graphicsContext.clearRect(0, 0, canvas.getWidth(), canvas.getHeight());

        graphicsContext.setFill(Color.rgb(213, 176, 146));
        graphicsContext.fillRect(TetrisConsts.PADDING,
                TetrisConsts.PADDING, TetrisConsts.GRID_WIDTH * TetrisConsts.GRID_WIDTH_NUM,
                TetrisConsts.GRID_WIDTH * TetrisConsts.GRID_HEIGHT_NUM);

        graphicsContext.setStroke(Color.BLACK);
        for (int i = 0; i < TetrisConsts.GRID_WIDTH_NUM; i++) {
            for (int j = 0; j < TetrisConsts.GRID_HEIGHT_NUM; j++) {
                graphicsContext.strokeRect(TetrisConsts.PADDING + i * TetrisConsts.GRID_WIDTH,
                        TetrisConsts.PADDING + j * TetrisConsts.GRID_WIDTH,
                        TetrisConsts.GRID_WIDTH, TetrisConsts.GRID_WIDTH);
            }
        }
    }
}
