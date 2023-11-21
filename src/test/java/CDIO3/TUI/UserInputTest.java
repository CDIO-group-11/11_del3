package CDIO3.TUI;

import static org.junit.jupiter.api.Assertions.assertEquals;


import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import CDIO3.InReplace;

/**
 * UserInputTest
 */
public class UserInputTest {
  PrintStream 
    orgOut = System.out,
    orgErr = System.err;
  InputStream orgIn  = System.in;
  ByteArrayOutputStream 
    newOut = new ByteArrayOutputStream(), 
    newErr = new ByteArrayOutputStream();
    InReplace newIn = new InReplace();
  @BeforeAll
  public void setStream(){
    System.setOut(new PrintStream(newOut));
    System.setErr(new PrintStream(newErr));
    System.setIn(newIn);
  }
  @AfterAll
  public void recoverStream(){
    System.setOut(orgOut);
    System.setErr(orgErr);
    System.setIn(orgIn);
  }

  @Test
  public void testOutPrintStream(){
    System.out.print("output");
    assertEquals(new String("output".getBytes()),new String(newOut.toByteArray()));
  }
  @Test
  public void testErrPrintStream(){
    System.err.print("output");
    assertEquals(new String("output".getBytes()),new String(newErr.toByteArray()));
  }
  @Test
  public void testUserInputInt(){
    Input("20");
    int number = UserInput.getInt("number: ");
    assertEquals(number, 20);
  }
  @Test
  public void testUserInputCommand(){
    int rand = (int) (Math.random() * Commands.values().length);
    Input(Commands.values()[rand].name());
    Commands command = UserInput.getCommand(new String[0], "commands");
    assertEquals(Commands.values()[rand].name(), command.name());
  }

  public void Input(String str){
    newIn.write((str+ "\n").getBytes());
  }
}