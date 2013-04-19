package de.mrpixeldream.full.tafel.frames;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.WindowConstants;
import javax.swing.border.EmptyBorder;

import de.mrpixeldream.full.tafel.HamburgerTafel;

public class QuitConfirmFrame extends JFrame
{
	private static final long	serialVersionUID	= -1173561102002114044L;

	/**
	 * Launch the application.
	 */
	public static void main()
	{
		EventQueue.invokeLater(new Runnable()
		{
			@Override
			public void run()
			{
				try
				{
					final QuitConfirmFrame frame = new QuitConfirmFrame();
					frame.setVisible(true);
				}
				catch (final Exception e)
				{
					e.printStackTrace();
				}
			}
		});
	}

	private final JPanel	contentPane;

	/**
	 * Create the frame.
	 */
	public QuitConfirmFrame()
	{
		setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 359, 172);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		final JLabel label = new JLabel("Hamburger Tafel");
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setFont(new Font("Tahoma", Font.PLAIN, 18));
		label.setBounds(10, 11, 321, 23);
		contentPane.add(label);

		final JLabel label_1 = new JLabel(
				"-----------------------------------------------------");
		label_1.setHorizontalAlignment(SwingConstants.CENTER);
		label_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		label_1.setBounds(10, 45, 321, 14);
		contentPane.add(label_1);

		final JLabel lblWirklichBeenden = new JLabel("Wirklich beenden?");
		lblWirklichBeenden.setForeground(Color.RED);
		lblWirklichBeenden.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblWirklichBeenden.setHorizontalAlignment(SwingConstants.CENTER);
		lblWirklichBeenden.setBounds(85, 70, 171, 23);
		contentPane.add(lblWirklichBeenden);

		final JButton btnJa = new JButton("Ja!");
		btnJa.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent e)
			{

				HamburgerTafel.endProgram();
			}
		});
		btnJa.setBounds(10, 104, 80, 23);
		contentPane.add(btnJa);

		final JButton btnNein = new JButton("Nein!");
		btnNein.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent e)
			{

				dispose();
			}
		});
		btnNein.setBounds(251, 104, 80, 23);
		contentPane.add(btnNein);
	}

}
