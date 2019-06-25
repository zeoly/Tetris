package com.yahacode.tetris;

import com.yahacode.tetris.common.TetrisConsts;
import com.yahacode.tetris.view.TetrisPane;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class TetrisApplication extends Application {

    public void start(Stage primaryStage) throws Exception {
        TetrisPane tetrisPane = new TetrisPane(TetrisConsts.WIDTH, TetrisConsts.HEIGHT);
        Scene scene = new Scene(tetrisPane, TetrisConsts.WIDTH, TetrisConsts.HEIGHT);

        primaryStage.setScene(scene);
        primaryStage.setTitle("tetris");
        primaryStage.show();
    }
}
