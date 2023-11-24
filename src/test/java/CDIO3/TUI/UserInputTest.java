package CDIO3.TUI;

import static org.junit.jupiter.api.Assertions.assertEquals;


import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;

import CDIO3.InReplace;

/**
 * UserInputTest
 */
@TestMethodOrder(OrderAnnotation.class)
public class UserInputTest {
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
  @AfterAll
  public static void recoverStream(){
    System.setOut(orgOut);
    System.setErr(orgErr);
    System.setIn(orgIn);
  }
  @Order(1)
  @Test
  public void testOutPrintStream(){
    newOut.reset();
    System.out.print("output");
    assertEquals(new String("output".getBytes()),new String(newOut.toByteArray()));
  }
  @Order(2)
  @Test
  public void testErrPrintStream(){
    newErr.reset();
    System.err.print("output");
    assertEquals(new String("output".getBytes()),new String(newErr.toByteArray()));
  }
  @Order(3)
  @Test
  public void testUserInputInt(){
    Input("20");
    int number = UserInput.getInt("number: ");
    assertEquals(number, 20);
  }
  @Order(4)
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