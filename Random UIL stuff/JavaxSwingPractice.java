import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingUtilities;

public class JavaxSwingPractice implements Runnable
{
	@Override
	public void run()
	{
		JFrame f = new JFrame("Hello World");
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setLayout(new FlowLayout());
		f.add(new JLabel("Hello, world!"));
		f.add(new JButton("Press me!"));
		f.pack();
		f.setVisible(true);


	}

	public static void main (String[] args)
	{
		JavaxSwingPractice jw = new JavaxSwingPractice();
		SwingUtilities.invokeLater(jw);
	}
}