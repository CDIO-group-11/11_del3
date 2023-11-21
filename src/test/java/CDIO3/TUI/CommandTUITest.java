package CDIO3.TUI;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import CDIO3.InReplace;

public class CommandTUITest {
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
  }
  @Test
  public void upTest(){
    CommandTUI.up(0);
    assertEquals("\r\033[0A",new String (newOut.toByteArray()));
    newOut.reset();
    
    CommandTUI.up(1);
    assertEquals("\r\033[1A",new String (newOut.toByteArray()));
    newOut.reset();
    
    CommandTUI.up(2);
    assertEquals("\r\033[2A",new String (newOut.toByteArray()));
    newOut.reset();
    
    CommandTUI.up(3);
    assertEquals("\r\033[3A",new String (newOut.toByteArray()));
    newOut.reset();
  }
  @Test
  public void skipTest(){
    CommandTUI.skip(0);
    assertEquals("\033[0C",new String (newOut.toByteArray()));
    newOut.reset();
    
    CommandTUI.skip(1);
    assertEquals("\033[1C",new String (newOut.toByteArray()));
    newOut.reset();
    
    CommandTUI.skip(2);
    assertEquals("\033[2C",new String (newOut.toByteArray()));
    newOut.reset();
    
    CommandTUI.skip(3);
    assertEquals("\033[3C",new String (newOut.toByteArray()));
    newOut.reset();
  }
  @Test
  public void setPointTest(){
    CommandTUI.setPoint(0,0);
    assertEquals("\033[1;1H",new String (newOut.toByteArray()));
    newOut.reset();
    
    CommandTUI.setPoint(1,0);
    assertEquals("\033[1;1H",new String (newOut.toByteArray()));
    newOut.reset();
    
    CommandTUI.setPoint(0,1);
    assertEquals("\033[1;1H",new String (newOut.toByteArray()));
    newOut.reset();
    
    CommandTUI.setPoint(1,1);
    assertEquals("\033[1;1H",new String (newOut.toByteArray()));
    newOut.reset();
  }
  @Test
  public void clearTest(){
    CommandTUI.clearAll();
    assertEquals("\033[2J",new String (newOut.toByteArray()));
    newOut.reset();
    CommandTUI.clearLine();
    assertEquals("\r\033[1J",new String (newOut.toByteArray()));
    newOut.reset();
  }
}
