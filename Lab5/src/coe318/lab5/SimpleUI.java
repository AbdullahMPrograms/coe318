//package coe318.lab5;

import java.util.List;
import java.util.Scanner;

public class SimpleUI implements UserInterface {
  private BlackjackGame game;
  private Scanner user = new Scanner(System.in);

  @Override
  public void setGame(BlackjackGame game) {
    this.game = game;
  }

  @Override
  public void display() {
    // Display the cards held by the House and you
    System.out.println("House holds:");
    displayCards(game.getHouseCards().getCards());
    System.out.println("You hold:");
    displayCards(game.getYourCards().getCards());
  }

  private void displayCards(List<Card> cards) {
    for (Card card : cards) {
      System.out.println(" " + card.toString());
    }
  }

  @Override
  public boolean hitMe() {
    System.out.print("Do you want another card? (yes/no): ");
    String input = user.next();
    return input.equalsIgnoreCase("yes");
  }

  @Override
  public void gameOver() {
    System.out.println("House Cards: " + game.getHouseCards());
    System.out.println("Your Cards: " + game.getYourCards());
    int houseScore = game.score(game.getHouseCards());
    int yourScore = game.score(game.getYourCards());

    System.out.println("House Score: " + houseScore);
    System.out.println("Your Score: " + yourScore);

    if (yourScore > 21 || (houseScore == yourScore)) {
      System.out.println("House wins!");
    } else if (houseScore > 21 || yourScore > houseScore) {
      System.out.println("You win!");
    }
  }
}