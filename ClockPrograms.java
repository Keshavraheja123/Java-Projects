import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import java.util.Calendar;
import java.text.SimpleDateFormat;
import java.awt.FlowLayout;
class ClockProjects extends JFrame
{
JFrame f;
Calendar calendar;
SimpleDateFormat timeFormat;
SimpleDateFormat dayFormat;
SimpleDateFormat dateFormat;
//SimpleDateFormat dateFormat;
JLabel timeLabel1;
JLabel dayLabel2;
JLabel dateLabel3;
//JLabel info;
//JLabel dateLabel3;
String time;
String day;
String date;
//String date;
ClockProjects()
{
	//info =new JLabel("This Project is made by Keshav Kumar Under the Guidence of Mr.Manish Sir");
	//info.setFont(new Font("Vardana",Font.bold,30));
	//f.add(info);
	//info.setBounds(250,150,2000,150);
f=new JFrame("Clock Programs");
//FlowLayout fl=new FlowLayout();
//f.setLayout(fl);
f.setLayout(null);
f.setVisible(true);
f.setResizable(true);
//calendar=new Calendar(
f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

timeFormat=new SimpleDateFormat("hh:mm:ss a");
dateFormat=new SimpleDateFormat("dd MM,yyyy");
timeLabel1=new JLabel();
timeLabel1.setBounds(500,200,5000,150);
timeLabel1.setFont(new Font("Vardana",Font.PLAIN,50));
//timeLabel1.setForeground(new Color(Color.Red));
timeLabel1.setBackground(Color.RED);
dateLabel3=new JLabel();
dateLabel3.setBounds(700,400,500,150);
dateLabel3.setFont(new Font("Vardana",Font.PLAIN,40));
f.add(dateLabel3);
//timeLabel.setOpaque(true);
time=timeFormat.format(Calendar.getInstance().getTime());
//timeLabel1.setText(text);
date=dateFormat.format(Calendar.getInstance().getTime());

dayLabel2=new JLabel();
dayLabel2.setBounds(500,400,500,150);
dayLabel2.setFont(new Font("Vardana",Font.PLAIN,40));
//daylabel2.setBackground(Color.Green);

dayFormat=new SimpleDateFormat("EEEE");
//dayFormat= new SimpleDateFormat();

f.add(timeLabel1);
f.add(dayLabel2);
//f.add(timeLabel);
//f.add(calendar);
//f.add(timeFormat);
//f.add()

setTime();
}
public void setTime()
{
	while(true)
	{
	time=timeFormat.format(Calendar.getInstance().getTime());
	timeLabel1.setText(time);
	
	day=dayFormat.format(Calendar.getInstance().getTime());
	dayLabel2.setText(day);
	
	date=dateFormat.format(Calendar.getInstance().getTime());
	dateLabel3.setText(date);
	try
	{
	Thread.sleep(100);
	}
	catch(InterruptedException e)
	{
	
	}
	
}}
public static void main(String[] args) 
{
	ClockProjects t1=new ClockProjects();
}

}