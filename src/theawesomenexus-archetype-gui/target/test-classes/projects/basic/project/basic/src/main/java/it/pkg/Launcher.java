package it.pkg;

import javax.swing.*;

public class Launcher extends JFrame
{
	//Using the package variable now.
	//groupId: archetype.it
	//artifactId: basic
	//version: 0.1-SNAPSHOT
	//package: it.pkg
	public Launcher()
	{
		initialize();
	}
	
	private void initialize()
	{
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("basic - (v0.1-SNAPSHOT)");
		this.setSize(800,600);
		this.setLocationRelativeTo(null);
		this.setVisible(true);
	}
}