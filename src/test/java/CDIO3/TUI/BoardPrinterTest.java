package CDIO3.TUI;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import CDIO3.InReplace;
import CDIO3.Tiles.Board;

/**
 * BoardPrinterTest
 */
public class BoardPrinterTest {
  static BoardPrinter print;
  static PrintStream 
    orgOut = System.out,
    orgErr = System.err;
  static InputStream orgIn  = System.in;
  static ByteArrayOutputStream 
    newOut = new ByteArrayOutputStream(), 
    newErr = new ByteArrayOutputStream();
  static InReplace newIn = new InReplace();
  @BeforeAll
  public static void setStream(){
    System.setOut(new PrintStream(newOut));
    System.setErr(new PrintStream(newErr));
    System.setIn(newIn);
    
    print = new BoardPrinter(new Board());
  }
  @AfterAll
  public static void recoverStream(){
    System.setOut(orgOut);
    System.setErr(orgErr);
    System.setIn(orgIn);
  }
  @Test
  public void guide(){
    BoardPrinter.guide();
    byte[] out = newOut.toByteArray();
    byte[] real = ("┌──────────────┐\n│████color█████│\n├─────┬────────┤\n│owner│#tile nr│\n").getBytes();
    assertArrayEquals(out, real);
    newOut.reset();
  }
  @Test
  public void tilePositionTest(){
    int[] correct = new int[]{0,1,2,3,4,5,6,23,7,22,8,21,9,20,10,19,11,18,17,16,15,14,13,12};
    int[] actual = print.getOrder();
    assertArrayEquals(actual, correct);
  }
}