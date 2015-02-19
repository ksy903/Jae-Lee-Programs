import javax.sound.sampled.*;
import java.util.*;
import java.io.*;

public class Musicbox {
  static Scanner scan = new Scanner(System.in);
  public static float SAMPLE_RATE = 8000f;
  static HashMap<String, Integer> notes = new HashMap<String, Integer>();
  public static void tone(int hz, int msecs)
     throws LineUnavailableException
  {ception
  {
    byte[] buf = new byte[1];
    AudioFormat af =
        new AudioFormat(
            SAMPLE_RATE, // sampleRate
            8,           // sampleSizeInBits
            1,           // channels
            true,        // signed
            false);      // bigEndian
    SourceDataLine sdl = AudioSystem.getSourceDataLine(af);
     tone(hz, msecs, 1.0);
  }

  public static void tone(int hz, int msecs, double vol)
      throws LineUnavailableEx
    sdl.open(af);
    sdl.start();
    for (int i=0; i < msecs*8; i++) {
      double angle = i / (SAMPLE_RATE / hz) * 2.0 * Math.PI;
      buf[0] = (byte)(Math.sin(angle) * 127.0 * vol);
      sdl.write(buf,0,1);
    }
    sdl.drain();
    sdl.stop();
    sdl.close();
  }

  public static void main(String[] args) throws Exception {
	notes.put("c3", 131);
	notes.put("c#3", 139);
	notes.put("d3", 147);
	notes.put("d#3", 156);
	notes.put("e3", 165);
	notes.put("f3", 175);
	notes.put("f#3", 185);
	notes.put("g3", 196);
	notes.put("g#3", 208);
	notes.put("a3", 220);
	notes.put("a#3", 233);
	notes.put("b3", 247);
	notes.put("c4", 262);
	notes.put("c#4", 277);
	notes.put("d4", 294);
	notes.put("d#4", 311);
	notes.put("e4", 330);
	notes.put("f4", 349);
	notes.put("f#4", 370);
	notes.put("g4", 392);
	notes.put("g#4", 415);
	notes.put("a4", 440);
	notes.put("a#4", 466);
	notes.put("b4", 494);
	notes.put("c5", 523);
	notes.put("c#5", 554);
	notes.put("d5", 587);
	notes.put("d#5", 622);
	notes.put("e5", 659);
	notes.put("f5", 698);
	notes.put("f#5", 740);
	notes.put("g5", 784);
	notes.put("g#5", 830);
	notes.put("a5", 880);
	notes.put("a#5", 932);
	notes.put("b5", 988);
	notes.put("s", 0);
	String take = "";
	while(!take.equals("stop")){
		take = scan.next();
		if(notes.containsKey(take))
			tone(notes.get(take), 1000);
		else
			System.out.println("Error! NoSuchNoteException");
  	}
  }
  public static void record() throws Exception{
  }
}