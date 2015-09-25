 package com.praktikum.project;

import javax.swing.*;
import java.awt.GridLayout;

public class DemoGridLayout{
	public static void main(String[]xx){
	//beberapa button untuk demo
	JButton btn1 = new JButton("Button 1");
	JButton btn2 = new JButton("#2");
	JButton btn3 = new JButton("Tombol 3");
	JButton btn4 = new JButton("Tombol 4 : Panjang");
	JButton btn5 = new JButton("Btn 5");
	JButton btn6 = new JButton("No.6");
	
	JPanel panel = new JPanel();
	panel.setLayout(new GridLayout(6,1));
	panel.add(btn1);
	panel.add(btn2);
	panel.add(btn3);
	panel.add(btn4);
	panel.add(btn5);
	panel.add(btn6);
	
	//menginstankan frame
	JFrame fr = new JFrame("Belajar Layout");
	
	fr.getContentPane().add(panel);
	
	//ukuran Frame
	fr.setSize(800,400);
	
	//posisi ditengah
	fr.setLocationRelativeTo(null);
	
	//Tampilkan
	fr.setVisible(true);
	}
}