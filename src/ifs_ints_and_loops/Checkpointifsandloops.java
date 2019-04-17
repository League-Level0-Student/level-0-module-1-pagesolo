package ifs_ints_and_loops;

import javax.swing.JOptionPane;

public class Checkpointifsandloops {
public static void main(String[] args) {
  String m = "yes";
  if(m.equals("yes")) {
	  System.out.println("happy");
  }
  else {
	System.out.println("sad");  
	System.out.println("Wednesday");
	  
  }
	int y = 14; 
	if(y<20) {
		JOptionPane.showMessageDialog(null, "It's so great being young!");
	}
	if(y>20) {
		JOptionPane.showMessageDialog(null, "Don't you wish you were young");
		
	}
	
	String answer = JOptionPane.showInputDialog("What is you favorite animal?");
	if(answer.equals("dog")) {
		JOptionPane.showMessageDialog(null, "Dogs go woof");
	}
	if(answer.equals("cat")) {
		JOptionPane.showMessageDialog(null, "Cats go meow");
	}
	if(answer.equals("fish")) {
		JOptionPane.showMessageDialog(null, "Fish goes . . . . .");
	}
	if(answer.equals("cow")) {
		JOptionPane.showMessageDialog(null, "Cows go moo");
		
	}
	else {
		JOptionPane.showMessageDialog(null, "I don't know that one");
	}
	
	
	
}
	
	
	
}
