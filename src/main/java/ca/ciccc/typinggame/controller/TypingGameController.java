package ca.ciccc.typinggame.controller;

import ca.ciccc.typinggame.model.Word;
import java.util.Deque;
import javafx.scene.Scene;

public class TypingGameController {
  //  private Player player;
  //  private Player[] players;
  private int timeRemains;
  //  private Score score;
  private Deque<Word> targetWords;
  private String currentInput;
  private boolean isFinished;

  public void initialize() {
    this.isFinished = false;
    this.timeRemains = 60;
  }

  public void pressNewGame() {
    // TODO: initialize the game and call setGameScene()
  }

  public void pressMainMenu() {
    // TODO: initialize the game and call setStartScene()
  }

  public Scene getScene() {
    // TODO: get the Scene
    return null;
  }

  public void updateTimeRemains() {
    // TODO: update the time every second
  }

  public void hitKey() {
    // TODO: check the input value
  }

  public void setResult() {
    // TODO: set the result page
  }
}
