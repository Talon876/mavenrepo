#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package};

import javax.swing.*;

public class Launcher extends JFrame
{
	//Using the package variable now.
	//groupId: ${groupId}
	//artifactId: ${artifactId}
	//version: ${version}
	//package: ${package}
	public Launcher()
	{
		initialize();
	}
	
	private void initialize()
	{
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("${artifactId} - (v${version})");
		this.setSize(800,600);
		this.setLocationRelativeTo(null);
		this.setVisible(true);
	}
}