package practice;

import java.awt.*;
import java.awt.event.*;
import java.util.Enumeration;
//import COM.ociweb.awt.ColorMap;
public class FontTest extends java.applet.Applet
implements ActionListener, AdjustmentListener, ItemListener, MouseListener {
 static final String DEFAULT_FONT = "Helvetica";
 static final String DEFAULT_TEXT = "FontTest";
 static final int DEFAULT_SIZE = 24;
 private static final int BOX_SIZE = 3;
 private static final int MIN_SIZE = 6;
 private static final int MAX_SIZE = 250;
 private CheckboxGroup styleGroup = new CheckboxGroup();
 private Checkbox boldRadio = new Checkbox("Bold", false, styleGroup);
 private Checkbox bothRadio = new Checkbox("Both", false, styleGroup);
 private Checkbox italicRadio =
 new Checkbox("Italic", false, styleGroup);
 private Checkbox plainRadio = new Checkbox("Plain", true, styleGroup);
 private Choice fontChoice = new Choice();
 private List colorList = new List(4, false);
 private MyCanvas myCanvas = new MyCanvas();
 private PopupMenu popup = new PopupMenu("Font");
 private Scrollbar scrollbar =
 new Scrollbar(Scrollbar.HORIZONTAL, DEFAULT_SIZE, BOX_SIZE,
 MIN_SIZE, MAX_SIZE + BOX_SIZE);
 private TextField sizeField =
 new TextField(String.valueOf(DEFAULT_SIZE), 3);
 private TextField textField = new TextField(DEFAULT_TEXT, 40);
 public void init() {
	 fontChoice.addItem("TimesRoman");
	 fontChoice.addItem("Helvetica");
	 fontChoice.addItem("Courier");
	 fontChoice.select(DEFAULT_FONT);
	 Panel fontPanel = new Panel();
	 fontPanel.add(new Label("Font:"));
	 fontPanel.add(fontChoice);
	 Panel stylePanel = new Panel();
	 stylePanel.add(plainRadio);
	 stylePanel.add(boldRadio);
	 stylePanel.add(italicRadio);
	 stylePanel.add(bothRadio);
	 Enumeration e = ColorMap.getColorNames();
	 while (e.hasMoreElements()) {
	 colorList.addItem((String) e.nextElement());
	 }
	 colorList.select(0);
	 Panel sizePanel = new Panel();
	 sizePanel.add
	 (new Label("Size (" + MIN_SIZE + "-" + MAX_SIZE + ")"));
	 sizePanel.add(sizeField);
	 Panel westPanel = new Panel(new GridLayout(0, 1));
	 westPanel.add(fontPanel);
	 westPanel.add(stylePanel);
	 westPanel.add(colorList);
	 westPanel.add(sizePanel);
	 setLayout(new BorderLayout());
	 add(myCanvas, "Center");
	 add(westPanel, "West");
	 add(textField, "North");
	 add(scrollbar, "South");
	 fontChoice.addItemListener(this);
	 plainRadio.addItemListener(this);
	 boldRadio.addItemListener(this);
	 italicRadio.addItemListener(this);
	 bothRadio.addItemListener(this);
	 colorList.addItemListener(this);
	 sizeField.addActionListener(this);
	 textField.addActionListener(this);
	 scrollbar.addAdjustmentListener(this);
	 fontPanel.addMouseListener(this);
	 stylePanel.addMouseListener(this);
	 sizePanel.addMouseListener(this);
	 myCanvas.addMouseListener(this);
	 MenuItem timesRomanItem = new MenuItem("TimesRoman");
	 MenuItem helveticaItem = new MenuItem("Helvetica");
	 MenuItem courierItem = new MenuItem("Courier");
	 timesRomanItem.addActionListener(this);
	 helveticaItem.addActionListener(this);
	 courierItem.addActionListener(this);
	 popup.add(timesRomanItem);
	 popup.add(helveticaItem);
	 popup.add(courierItem);
	 add(popup);
	 }
 public void actionPerformed(ActionEvent e) {
	 Object source = e.getSource();
	 if (source == textField) {
	 myCanvas.setText(textField.getText());
	 } else if (source == sizeField) {
	 int size = Integer.parseInt(sizeField.getText());
	 scrollbar.setValue(size);
	 setFont();
	 } else if (source instanceof MenuItem) {
	 MenuItem menuItem = (MenuItem) source;
	 if (menuItem.getParent() == popup) {
	 fontChoice.select(e.getActionCommand());
	 setFont();
	 }
	 }
	 }
	 public void adjustmentValueChanged(AdjustmentEvent e) {
	 if (e.getSource() == scrollbar) {
	 sizeField.setText(String.valueOf(scrollbar.getValue()));
	 setFont();
	 }
	 }
	 public void itemStateChanged(ItemEvent e) {
	 Object source = e.getSource();
	 if (source == fontChoice) {
	 setFont();
	 } else if (source instanceof Checkbox) {
	 Checkbox checkbox = (Checkbox) source;
	 if (checkbox.getCheckboxGroup() == styleGroup) {
	 setFont();
	 }
	 } else if (source == colorList) {
	 Color color = ColorMap.getColor(colorList.getSelectedItem());
	 myCanvas.setColor(color);
	 }
	 }
	// MouseListener methods that need no action.
	 public void mouseEntered(MouseEvent e) {}
	 public void mouseExited(MouseEvent e) {}
	 public void mouseClicked(MouseEvent e) {}
	 public void mouseReleased(MouseEvent e) {}
	 public void mousePressed(MouseEvent e) {
	 popup.show((Component) e.getSource(), e.getX(), e.getY());
	 }
	 private void setFont() {
	 int style = Font.PLAIN;
	 Checkbox styleRadio = styleGroup.getSelectedCheckbox();
	 if (styleRadio == plainRadio) {
	 style = Font.PLAIN;
	 } else if (styleRadio == boldRadio) {
	 style = Font.BOLD;
	 } else if (styleRadio == italicRadio) {
	 style = Font.ITALIC;
	 } else if (styleRadio == bothRadio) {
	 style = Font.BOLD + Font.ITALIC;
	 }
	 Font font =
	 new Font(fontChoice.getSelectedItem(),
	 style,
	 Integer.parseInt(sizeField.getText()));
	 myCanvas.setFont(font);
	 }
	}
class MyCanvas extends Canvas {
	 private Color color = Color.black;
	 private Font font =
	 new Font(FontTest.DEFAULT_FONT,
	 Font.PLAIN,
	 FontTest.DEFAULT_SIZE);
	 private String text = FontTest.DEFAULT_TEXT;
	 public void setColor(Color color) {
	 this.color = color;
	 repaint();
	 }
	 public void setFont(Font font) {
	 this.font = font;
	 repaint();
	 }
	 public void setText(String text) {
	 this.text = text;
	 repaint();
	 }
	 public void paint(Graphics g) {
	 g.setColor(color);
	 g.setFont(font);
	 g.drawString(text, 10, 200);
	 }
	}