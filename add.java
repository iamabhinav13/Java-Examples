import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;
public class add extends JFrame implements ActionListener//, KeyListener
{
		static JFrame f;static JLabel l;static JTextField t1;static JTextField t2;
		static JButton b;
	add()
	{
		f=new JFrame("Addition");
		b=new JButton("ADD");
		b.setBounds(100,40,100,50);
		t1=new JTextField();
		t1.setBounds(100,100,100,50);
		t2=new JTextField();
		t2.setBounds(100,200,100,50);
		l=new JLabel("");
		l.setBounds(100,300,100,50);
		b.addActionListener(this);
		//b.addKeyListener(this);
		t2.addActionListener(this);
		f.setSize(500,500);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.add(t1);
		f.add(t2);
		f.add(l);
		f.add(b);
		f.setLayout(null);
		f.setVisible(true);
	} 
	public void actionPerformed(ActionEvent e)
	{
		int a=Integer.parseInt(t1.getText());
		int b=Integer.parseInt(t2.getText());
		int c=a+b;
		l.setText(Integer.toString(c));
	}
	/*
	public void keyPressed(KeyEvent e)
	{
		if(e.getKeyCode()==KeyEvent.VK_ENTER)
		{
			int a=Integer.parseInt(t1.getText());
		int b=Integer.parseInt(t2.getText());
		int c=a+b;
		l.setText(Integer.toString(c));		
		}
	}
	public void keyReleased(KeyEvent e)
	{
	}
    public void keyTyped(KeyEvent e){}*/
	public static void main(String args[])
	{
		new add();
	}
}