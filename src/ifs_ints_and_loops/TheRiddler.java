package ifs_ints_and_loops;

import javax.swing.JOptionPane;

//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0



public class TheRiddler {

	public static void main(String[] args) {

		// 1. Make a variable to hold the score
int score = 0;
		// 3. Ask the user a riddle. Here are some ideas: bit.ly/some-riddles
JOptionPane.showMessageDialog(null, "Come! Answer my riddles! / (P.S. Answer in lower case)");
String a= JOptionPane.showInputDialog("What can travel around the world while staying in a corner?");
		
if (a.equals("a stamp")) {
	score++;
	System.out.println(score);
	JOptionPane.showMessageDialog(null, "Correct");
}
else {
	score--;
	System.out.println(score);
	JOptionPane.showMessageDialog(null, "Worong, the answer is 'a stamp'");
	
}
	JOptionPane.showMessageDialog(null, score, "Your Score", 1);	
	
	String b = JOptionPane.showInputDialog("Feed me and I live, yet give me a drink and I die.");


	
	if (b.equals("fire")) {
		score++;
		System.out.println(score);
		JOptionPane.showMessageDialog(null, "Correct");
	}
	else {
		score--;
		System.out.println(score);
		JOptionPane.showMessageDialog(null, "Worong, the answer is 'fire'");
		
	}
		JOptionPane.showMessageDialog(null, score, "Your Score", 1);
		
		String c = JOptionPane.showInputDialog("Imagine you are in a dark room. How do you get out?");


		
		if (c.equals("stop imagining")) {
			score++;
			System.out.println(score);
			JOptionPane.showMessageDialog(null, "Correct");
		}
		else {
			score--;
			System.out.println(score);
			JOptionPane.showMessageDialog(null, "Worong, the answer is 'stop imagining'");
			
		}
			JOptionPane.showMessageDialog(null, score, "Your Score", 1);
		
	}
}

