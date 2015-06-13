package practice;


//package COM.ociweb.awt;
import java.awt.Color;
import java.util.Enumeration;
import java.util.Hashtable;
public class ColorMap {
 private static Hashtable hashtable = new Hashtable();
 static {
 hashtable.put("White", Color.white);
 hashtable.put("Gray", Color.gray);
 hashtable.put("DarkGray", Color.darkGray);
 hashtable.put("Black", Color.black);
 hashtable.put("Red", Color.red);
 hashtable.put("Pink", Color.pink);
 hashtable.put("Orange", Color.orange);
 hashtable.put("Yellow", Color.yellow);
 hashtable.put("Green", Color.green);
 hashtable.put("Magenta", Color.magenta);
 hashtable.put("Cyan", Color.cyan);
 hashtable.put("Blue", Color.blue);
 }
 public static Color getColor(String name) {
 return (Color) hashtable.get(name);
 }
 public static Enumeration getColorNames() {
 return hashtable.keys();
 }
}


