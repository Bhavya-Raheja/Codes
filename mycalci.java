import java.awt.*;
import java.applet.*;
import java.awt.event.*;

/*<applet code=mycalci.class height=300 width=600></applet>*/

public class mycalci extends Applet implements ActionListener
{
double n1=0,n2=0;
String op="";
TextField t1;
Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b10;
public void init()
{
t1=new TextField(50);
b1=new Button("1");
b2=new Button("2");
b3=new Button("3");
b4=new Button("4");
b5=new Button("+");
b6=new Button("-");
b7=new Button("0");
b8=new Button(".");
b9=new Button("<----");
b10=new Button("=");
t1.setEditable(false);
add(t1);
add(b1);
add(b2);
add(b3);
add(b4);
add(b5);
add(b6);
add(b7);
add(b8);
add(b9);
add(b10);
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
}
public void actionPerformed(ActionEvent e)
{
String msg=e.getActionCommand();
if(msg.equals("1"))
{
if(t1.getText().equals("0"))
{
t1.setText("");
}
t1.setText(t1.getText()+"1");
}

if(msg.equals("2"))
{
if(t1.getText().equals("0"))
{
t1.setText("");
}
t1.setText(t1.getText()+"2");
}

if(msg.equals("3"))
{
if(t1.getText().equals("0"))
{
t1.setText("");
}
t1.setText(t1.getText()+"3");
}

if(msg.equals("4"))
{
if(t1.getText().equals("0"))
{
t1.setText("");
}
t1.setText(t1.getText()+"4");
}

if(msg.equals("0"))
{
if(t1.getText().equals("0"))
{
t1.setText("");
}
t1.setText(t1.getText()+"0");
}

if(msg.equals("."))
{
if(t1.getText().indexOf(".")==-1)
{
	if(t1.getText().length()==0)
	{
	t1.setText("0");
	}
t1.setText(t1.getText()+".");
}
}

if(msg.equals("<----"))
{
if(t1.getText().length()!=0)
{
t1.setText(t1.getText().substring(0,t1.getText().length()-1));
}
}

if(msg.equals("+"))
{
op="+";
n1=Double.valueOf(t1.getText());
t1.setText("");
}

if(msg.equals("-"))
{
op="-";
n1=Double.valueOf(t1.getText());
t1.setText("");
}

if(msg.equals("="))
{
n2=Double.valueOf(t1.getText());
if(op.equals("+"))
{
t1.setText((n1+n2)+"");
}
if(op.equals("-"))
{
t1.setText((n1-n2)+"");
}
}

}
}