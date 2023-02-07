import java.awt.*;
import java.awt.event.*;
import java.applet.*;

/*
      <applet code="MouseEvents.class" width="500" height="500">
      </applet>
*/

public class MouseEvents extends Applet implements MouseListener, MouseMotionListener
 {
  	 String msg = "MOUSE EVENTS BY ADITYA";
   	int mouseX = 0, mouseY = 0; 
   	public void init() 
    	{
		addMouseListener(this);
		addMouseMotionListener(this);
  	  }
 	 public void paint(Graphics g) 
   	{
      		g.drawString("APPLET RUNNING",0,10);
      		g.drawString(msg, mouseX, mouseY);
 	  }
 	 public void mouseClicked(MouseEvent me)
  	 {
   		 mouseX = 0;
    		mouseY = 40;
    		msg = "STATUS : CLICKED";
    		repaint();
    	}
  	public void mouseEntered(MouseEvent me)
  	 {
    		mouseX = 0;
    		mouseY = 40;
		setBackground(Color.GREEN);
    		msg = "STATUS : ENTERED" ;
    		
    	}
  	public void mouseExited(MouseEvent me) 
  	{
  		mouseX = 0;
  		mouseY = 40;
		setBackground(Color.RED);
  		msg = "STATUS : EXITED";
  		repaint();
  	}
  	public void mousePressed(MouseEvent me) 
  	{
 		 mouseX = me.getX();
 		 mouseY = me.getY();
  		msg = "STATUS : CLICKED";
  		repaint();
  	}
  	public void mouseReleased(MouseEvent me) 
  	{
  		mouseX = 0;
  		mouseY = 40;
  		msg = "STATUS:RELEASED";
 		setBackground(Color.GREEN);
  		repaint();
	  }
	public void mouseDragged(MouseEvent me) 
 	 {
  		 mouseX = 0;
  		 mouseY = 40;
		 setBackground(Color.YELLOW);
  		 repaint();
   	}
   	public void mouseMoved(MouseEvent me) 
   	{
   		showStatus("Coordinates: " + me.getX() + ", " + me.getY());
  	 }

 }


/*
COMPILE:
Z:\LA22CS001\javaprogs>appletviewer mouse.html
Z:\LA22CS001\javaprogs>appletviewer MouseEvents.java
*/