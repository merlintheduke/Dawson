package application.controller;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;

public class MainController {
  
  @FXML Label timeRemainingLabel;
  @FXML Label scoreLabel;

  @FXML ImageView imageView0;
  @FXML ImageView imageView1;
  @FXML ImageView imageView2;
  @FXML ImageView imageView3;
  @FXML ImageView imageView4;

  @FXML Pane pane0;
  @FXML Pane pane1;
  @FXML Pane pane2;
  @FXML Pane pane3;
  @FXML Pane pane4;

  private WhackAMole game;

  public void initialize() {
    Pane[] panes = { pane0, pane1, pane2, pane3, pane4}
      for ( Pane p : panes ){
      p.setStyle("-fx-border-color: black; -fx-border-width: 2;");
      }
    game = new WhackAMole();
   

      ImageView[] imgs = { 
            img0, img1, img2, img3, img4}
        };

        for (int i = 0; i < imgs.length; i++) {
            imgs[i].setUserData(i);   // Store the index so you know which mole was clicked
        }
    MainView view = new MainView(panes, imgs)
  }
  
  @FXML
  public void imageViewAction() {
    throw new RuntimeException("Not Implemented");
  }
  
  @FXML
  public void startButtonAction() {
    throw new RuntimeException("Not Implemented");
  }
  
}
