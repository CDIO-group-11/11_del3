package CDIO3.TUI;

import java.io.InputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.ByteArrayOutputStream;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import CDIO3.InReplace;
import CDIO3.Player.Player;
import CDIO3.Tiles.Board;

/**
 * TUI_ManagerTest
 */
public class TUI_ManagerTest {
  TUI_Manager tui = new TUI_Manager(new Board());
  static PrintStream 
    orgOut = System.out,
    orgErr = System.err;
  static InputStream orgIn  = System.in;
  static  ByteArrayOutputStream
    newOut = new ByteArrayOutputStream(), 
    newErr = new ByteArrayOutputStream();
  static InReplace newIn = new InReplace();
  @BeforeAll
  public static void setStream(){
    System.setOut(new PrintStream(newOut));
    System.setErr(new PrintStream(newErr));
    System.setIn(newIn);
  }
  @AfterAll
  public static void recoverStream(){
    System.setOut(orgOut);
    System.setErr(orgErr);
    System.setIn(orgIn);
  }
  @Test
  @Disabled
  public void detailPrintTest(){
    tui.detailPrint(5, 2, 1, new Player[3], new Board());
    assertEquals(
      "Player 1 owns 0\n        and has 20 M\n\nPlayer 2 owns 0\n        and has 20 M\n\nPlayer 3 owns 0\n        and has 20 M\n\n\nPlayer: 2Has just rolled a: 5\nand is now on tile 1\ncalled: Go\n\nCurrent player: 2\nYou are on tile 1\ncalled: Go\n\n┌──────┐┌──────┐┌──────┐┌──────┐┌──────┐┌──────┐┌──────┐\n│██████││██████││██████││██████││██████││██████││██████│\n├──┬───┤├──┬───┤├──┬───┤├──┬───┤├──┬───┤├──┬───┤├──┬───┤\n│  │#1 ││  │#2 ││  │#3 ││  │#4 ││  │#5 ││  │#6 ││  │#7 │\n┌──────┐                                        ┌──────┐\n│██████│                                        │██████│\n├──┬───┤                                        ├──┬───┤\n│  │#24│                                        │  │#8 │\n┌──────┐                                        ┌──────┐\n│██████│                                        │██████│\n├──┬───┤                                        ├──┬───┤\n│  │#23│                                        │  │#9 │\n┌──────┐                                        ┌──────┐\n│██████│                                        │██████│\n├──┬───┤                                        ├──┬───┤\n│  │#22│                                        │  │#10│\n┌──────┐                                        ┌──────┐\n│██████│                                        │██████│\n├──┬───┤                                        ├──┬───┤\n│  │#21│                                        │  │#11│\n┌──────┐                                        ┌──────┐\n│██████│                                        │██████│\n├──┬───┤                                        ├──┬───┤\n│  │#20│                                        │  │#12│\n┌──────┐┌──────┐┌──────┐┌──────┐┌──────┐┌──────┐┌──────┐\n│██████││██████││██████││██████││██████││██████││██████│\n├──┬───┤├──┬───┤├──┬───┤├──┬───┤├──┬───┤├──┬───┤├──┬───┤\n│  │#19││  │#18││  │#17││  │#16││  │#15││  │#14││  │#13│\n",
      new String(newOut.toByteArray())
    ); 
  }
}