package CDIO3;

import java.io.IOException;
import java.io.InputStream;

public class InReplace extends InputStream {
  byte[] buf;
  int point = -1;
  public void write(byte[] buf){
    this.buf = buf;
    point = -1;
  }

  @Override
  public int read() throws IOException {
    point++;
    if(buf.length <= point) throw new IOException();
    return buf[point];
  }
}
