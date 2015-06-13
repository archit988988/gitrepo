
  // reversi.java - jpq - 18/12/04
    
    import java.awt.event.* ;
    import java.awt.* ;
    import java.applet.* ;
    import java.util.Random ;
    
    public class reversi extends Applet
   	  { controles C ;
    dessin D ;
  
    public void init ()
  	    { setLayout (new BorderLayout ()) ;
      setFont (new Font ("Arial", Font.PLAIN, 10)) ;
      int n = 9;
      String s = getParameter ("n") ;
      if (s != null)
      { try { n = Integer.parseInt (s) ; }
        catch (NumberFormatException nfe) { }
        if (n < 9) n = 9 ;
      }
      D = new dessin (n) ;
      C = new controles () ;
      add (C, BorderLayout.NORTH) ;
      add (D, BorderLayout.CENTER) ;
    }
  
    public void destroy ()
    { remove (D) ; remove (C) ; }
  
    public String getAppletInfo ()
    { return "reversi par j.-p. Quelen" ; }
  
  ////////////////////////////////////////////////////////////////////////////////
  protected class dessin extends Canvas implements MouseListener
  
  	  { Image img ;
    Graphics g ;
    int n, w, h, N, p, pn ;
    Random r ;
  //  boolean [] [] grille ;
    boolean unpion ;
  
    public dessin (int n)
  	    { addMouseListener (this) ;
      setCursor (new Cursor (Cursor.HAND_CURSOR)) ;
      r = new Random () ;
      init1 (n) ;
    }
  
    private void init1 (int n)
  	    { this.n = n ;
      reversitab.grille = new boolean [n] [n] ;
      for (int i = 0 ; i < n ; i ++)
        for (int j = 0 ; j < n ; j ++)
  //        grille [i] [j] = r.nextBoolean () ; la machine Java de IE n'aime pas
          reversitab.grille [i] [j] = (r.nextDouble () > 0.5) ;
    }
  
    public void update (Graphics g)
    { paint (g) ; }
  
    public void paint (Graphics g1)
  	    { if (img == null)
  	      { w = getSize().width ;
        h = getSize().height ;
        N = Math.min (w, h) ;
        img = createImage (w, h) ;
        g = img.getGraphics () ;
      }
      p = N / n ;
      pn = p * n ;
      g.setColor (Color.white) ;
      g.fillRect (0, 0, w, h) ;
      if (p < 5) g.drawString ("n trop grand", 10, 10) ;
      else
  	      { int njn = 0 ;
        g.setColor (Color.yellow) ;
        int pi, pj ;
        for (int i = pi = 0 ; i <= n ; i ++, pi += p)
          g.drawLine (0, pi, pn, pi) ;
        for (int i = pi = 0 ; i <= n ; i ++, pi += p)
          g.drawLine (pi, 0, pi, pn) ;
        g.setColor (Color.black) ;
        for (int i = pi = 0 ; i < n ; i ++, pi += p)
          for (int j = pj = 0 ; j < n ; j ++, pj += p)
            if (reversitab.grille [i] [j])
              g.drawOval (pi + 1, pj + 1 , p - 2 , p - 2) ;
            else
  	            { g.fillOval (pi + 1, pj + 1 , p - 2 , p - 2) ;
              njn ++ ;
            }
        String s = Integer.toString (njn) + " jeton" ;
        if (njn >= 2) s += "s" ;
        s += " noir" ;
        if (njn >= 2) s += "s" ;
        C.lnjb.setText (s) ;
      }
      g1.drawImage (img, 0, 0, this) ;
   }
 
   public void mouseClicked (MouseEvent e)
 	    { e.consume () ;
     int i = e.getX () ;
     int j = e.getY () ;
    if ((i < pn) && (j < pn))
 	      { i = i / p ;
       j = j / p ;
       reversitab.grille [i] [j] = ! reversitab.grille [i] [j] ;
       if (! unpion)
 	        { if (i > 0) reversitab.grille [i - 1] [j] = ! reversitab.grille [i - 1] [j] ;
         if (j > 0) reversitab.grille [i] [j - 1] = ! reversitab.grille [i] [j - 1] ;
         if (i < n - 1) reversitab.grille [i + 1] [j] = ! reversitab.grille [i + 1] [j] ;
         if (j < n - 1) reversitab.grille [i] [j + 1] = ! reversitab.grille [i] [j + 1] ;
       }
     }
   D.repaint () ;
   }
 
   public void mousePressed (MouseEvent e) { }
   public void mouseReleased (MouseEvent e) { }
   public void mouseEntered (MouseEvent e) { }
   public void mouseExited (MouseEvent e) { }
 
 }
 ////////////////////////////////////////////////////////////////////////////////
 protected class controles extends Panel implements ActionListener, ItemListener
 	  { TextField tn ;
   Button ok, ng ;
   Label lnjb ;
   Checkbox cbunpion ;
 
   public controles ()
 	    { setBackground (Color.lightGray) ;
     add (tn = new TextField (Integer.toString(D.n), 4)) ;
     add (ng = new Button ("Nouvelle partie")) ;
     ng.addActionListener (this) ;
     add (lnjb = new Label ("    jetons noirs")) ;
     add (cbunpion = new Checkbox ("retourne 1 seul pion", false)) ;
 //    D.cbunpion = false ;
     cbunpion.addItemListener (this) ;
   }
 
   public void itemStateChanged (ItemEvent e)
 	    { if (e.getSource () == cbunpion) D.unpion = cbunpion.getState () ;
   }
 
   public void actionPerformed (ActionEvent e)
 	    { if (e.getSource () == ng)
 	      { int n = D.n;
       try { n = Integer.parseInt (tn.getText ()) ; }
       catch (NumberFormatException nfe) { }
       if (n < 9) n = 9 ;
       tn.setText (Integer.toString (n)) ;
       D.init1 (n) ;
     }
     D.repaint () ;
   }
 }
 
 }
 
 class reversitab
 	  { static boolean [] [] grille ;
 }

