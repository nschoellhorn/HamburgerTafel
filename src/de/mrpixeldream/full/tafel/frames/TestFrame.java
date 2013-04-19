package de.mrpixeldream.full.tafel.frames;

import java.awt.EventQueue;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import de.mrpixeldream.full.tafel.HamburgerTafel;
import de.mrpixeldream.full.tafel.core.Driver;

@SuppressWarnings("serial")
public class TestFrame extends JFrame
{

	private JPanel	contentPane;
	private JLabel	lblTestlabel;

	static ArrayList<Driver>	a;

	/**
	 * Launch the application.
	 */
	public static void main(ArrayList<Driver> a)
	{
		TestFrame.a = a;
		EventQueue.invokeLater(new Runnable()
		{
			public void run()
			{
				try
				{
					TestFrame frame = new TestFrame();
					frame.setVisible(true);
				}
				catch (Exception e)
				{
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public TestFrame()
	{
		setTitle("Testfenster");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 280);
		this.contentPane = new JPanel();
		this.contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(this.contentPane);
		this.contentPane.setLayout(null);

		this.lblTestlabel = new JLabel("Testlabel");
		this.lblTestlabel.setVerticalAlignment(SwingConstants.TOP);
		this.lblTestlabel.setBounds(10, 11, 414, 220);
		this.contentPane.add(this.lblTestlabel);

		this.lblTestlabel.setText(HamburgerTafel.getSettingsPath());
	}
}
