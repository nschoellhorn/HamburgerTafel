package de.mrpixeldream.full.tafel.frames;

import java.awt.EventQueue;
import java.awt.FlowLayout;

import javax.swing.JFrame;

public class ErrorFrame extends JFrame
{
	private static final long	serialVersionUID	= 8554026471075498797L;

	/**
	 * Launch the application.
	 */
	public static void main(final String message)
	{
		EventQueue.invokeLater(new Runnable()
		{
			@Override
			public void run()
			{
				try
				{
					final ErrorFrame frame = new ErrorFrame(message);
					frame.setVisible(true);
				}
				catch (final Exception e)
				{
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public ErrorFrame(String message)
	{
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 485, 379);
		getContentPane().setLayout(null);
		getContentPane().setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
	}

}
