import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class coucit extends JFrame implements ItemListener
{
	static JFrame f;
	static JRadioButton r1,r2,r3,r4;
	static JCheckBox c1,c2,c3,c4;
	coucit()
	{
		f=new JFrame("Councit");
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setSize(400,320);
		f.setLayout(null);
		JLabel l1=new JLabel("Countries");
		l1.setBounds(50,25,100,50);
		JLabel l2=new JLabel("Capitals");
		l2.setBounds(150,25,100,50);
		ButtonGroup bg=new ButtonGroup();
		r1=new JRadioButton("India");
		r1.setBounds(50,75,100,25);
		r1.addItemListener(this);
		r2=new JRadioButton("Australia");
		r2.setBounds(50,100,100,25);
		r2.addItemListener(this);
		r3=new JRadioButton("New Zealand");
		r3.setBounds(50,125,100,25);
		r3.addItemListener(this);
		r4=new JRadioButton("USA");
		r4.setBounds(50,150,100,25);
		r4.addItemListener(this);

		ButtonGroup bg1=new ButtonGroup();
		c1=new JCheckBox("Wellington");
		c1.setBounds(150,75,100,25);
		c2=new JCheckBox("Washington DC");
		c2.setBounds(150,100,150,25);
		//c2.addItemListener(this);
		c3=new JCheckBox("Canberra");
		c3.setBounds(150,125,100,25);
		c4=new JCheckBox("New Delhi");
		c4.setBounds(150,150,100,25);
		
		bg.add(r1);
		bg.add(r2);
		bg.add(r3);
		bg.add(r4);
		bg1.add(c1);
		bg1.add(c2);
		bg1.add(c3);
		bg1.add(c4);
		f.add(l1);
		f.add(l2);
		f.add(r1);
		f.add(r2);
		f.add(c1);
		f.add(c2);
		f.add(r3);
		f.add(r4);
		f.add(c3);
		f.add(c4);
		f.setVisible(true);
	}
	public void itemStateChanged(ItemEvent e)
	{
		while(true){
		if(r1.isSelected())
		{
			c4.setSelected(true);
		}
		else if(r2.isSelected())
		{
			c3.setSelected(true);
		}
		else if(r3.isSelected())
		{
			c1.setSelected(true);
		}
		else if(r4.isSelected())
		{
			c2.setSelected(true);
		}
		/*else{
		 if(c2.isSelected())
		{
			r4.setSelected(true);
		}
	}*/}
	}
	public static void main(String[] args) 
	{
			new coucit();
	}
}