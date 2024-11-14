import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
public class GUICalc implements ActionListener{

	JTextField t1 = new JTextField();
	JFrame f= new JFrame("Calculator");
	JPanel p= new JPanel();
	JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14,b15,b16;
	int i=0,n=0;
	
	
	public GUICalc() {
		t1.setBounds(100, 100, 200, 30);
		b1= new JButton("1");
		b2= new JButton("2");
		b3= new JButton("3");
		b4= new JButton("+");
		b5= new JButton("4");
		b6= new JButton("5");
		b7= new JButton("6");
		b8= new JButton("-");
		b9= new JButton("7");
		b10= new JButton("8");
		b11= new JButton("9");
		b12= new JButton("*");
		b13= new JButton("/");
		b14= new JButton("0");
		b15= new JButton("=");
		b16= new JButton("c");
		
		b1.setBounds(100,140,50,30);
		b2.setBounds(150,140,50,30);
		b3.setBounds(200,140,50,30);
		b4.setBounds(250,140,50,30);
		b5.setBounds(100,170,50,30);
		b6.setBounds(150,170,50,30);
		b7.setBounds(200,170,50,30);
		b8.setBounds(250,170,50,30);
		b9.setBounds(100,200,50,30);
		b10.setBounds(150,200,50,30);
		b11.setBounds(200,200,50,30);
		b12.setBounds(250,200,50,30);
		b13.setBounds(100,230,50,30);
		b14.setBounds(150,230,50,30);
		b15.setBounds(200,230,50,30);
		b16.setBounds(250,230,50,30);
		
		p.add(t1);
		p.add(b1);
		p.add(b2);
		p.add(b3);
		p.add(b4);
		p.add(b5);
		p.add(b6);
		p.add(b7);
		p.add(b8);
		p.add(b9);
		p.add(b10);
		p.add(b11);
		p.add(b12);
		p.add(b13);
		p.add(b14);
		p.add(b15);
		p.add(b16);

		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		b5.addActionListener(this);
		b6.addActionListener(this);
		b7.addActionListener(this);
		b8.addActionListener(this);
		b9.addActionListener(this);
		b10.addActionListener(this);
		b11.addActionListener(this);
		b12.addActionListener(this);
		b13.addActionListener(this);
		b14.addActionListener(this);
		b15.addActionListener(this);
		b16.addActionListener(this);
		
		f.setContentPane(p);
		f.setLayout(null);
		f.setSize(500,500);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);
	}
	
	
	public static void main(String[] args) {
		new GUICalc();

	}
	public void actionPerformed(ActionEvent e) {
		if (e.getSource()==b1) {
			t1.setText(t1.getText()+"1");
		}
		if (e.getSource()==b2) {
			t1.setText(t1.getText()+"2");
		}
		if (e.getSource()==b3) {
			t1.setText(t1.getText()+"3");
		}
		if (e.getSource()==b5) {
			t1.setText(t1.getText()+"4");
		}
		if (e.getSource()==b6) {
			t1.setText(t1.getText()+"5");
		}
		if (e.getSource()==b7) {
			t1.setText(t1.getText()+"6");
		}
		if (e.getSource()==b9) {
			t1.setText(t1.getText()+"7");
		}
		if (e.getSource()==b10) {
			t1.setText(t1.getText()+"8");
		}
		if (e.getSource()==b11) {
			t1.setText(t1.getText()+"9");
		}
		if (e.getSource()==b14) {
			t1.setText(t1.getText()+"0");
		}
		if (e.getSource()==b15) {
			calc();
		}
		if (e.getSource()==b16) {
			t1.setText("");
			i=0;
			n=0;
		}
		if (e.getSource()==b4) {
			n=Integer.parseInt(t1.getText());
			t1.setText("");
			i=1;
			
		}
		if (e.getSource()==b8) {
			n=Integer.parseInt(t1.getText());
			t1.setText("");
			i=2;
			
		}
		if (e.getSource()==b12) {
			n=Integer.parseInt(t1.getText());
			t1.setText("");
			i=3;
			
		}
		if (e.getSource()==b13) {
			n=Integer.parseInt(t1.getText());
			t1.setText("");
			i=4;
			
		}	
	}
	
	public void calc() {
		int m=Integer.parseInt(t1.getText());
		int result=0;
		switch (i) {
		case 1: result= n+m;
				break;
		case 2: result= n-m;
				break;
		case 3: result=n*m;
				break;
		case 4: if (m!=0) {
				result=n/m;
		}	else t1.setText("ERROR");
				break;
		}
		t1.setText(Integer.toString(result));
	}
}
