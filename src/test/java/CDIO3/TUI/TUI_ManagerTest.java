package CDIO3.TUI;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import CDIO3.InReplace;
import CDIO3.Player.Player;
import CDIO3.Tiles.Board;

public class TUI_ManagerTest {
  static TUI_Manager manager;
  static Player[] p;
  
  static PrintStream 
    orgOut = System.out,
    orgErr = System.err;
  static InputStream orgIn  = System.in;
  static ByteArrayOutputStream 
    newOut = new ByteArrayOutputStream(), 
    newErr = new ByteArrayOutputStream();
  static InReplace 
    newIn = new InReplace();
  
  @BeforeAll
  public static void generate(){
    manager = new TUI_Manager(new Board());
    Player.Pamount = 3;
    p = new Player[]{new Player(), new Player(), new Player()};

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
  public void detail(){
    newOut.reset();
    Input("detail");
    manager.readTurn(2, 3, 0, p);
    assertEquals("detail\n".getBytes(),newOut.toByteArray());
  }
  @Test
  public void roll(){
    newOut.reset();
    Input("detail");
    manager.readTurn(2, 3, 0, p);
    assertEquals("".getBytes(),newOut.toByteArray());
  }

  public void Input(String str){
    newIn.write((str+ "\n").getBytes());
  }
}
