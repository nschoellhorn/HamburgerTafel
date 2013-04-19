package de.mrpixeldream.full.tafel.frames;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.WindowConstants;
import javax.swing.border.EmptyBorder;

public class MainFrame extends JFrame
{
	private static final long	serialVersionUID	= -8729528661298957359L;

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
					UIManager.setLookAndFeel(UIManager
							.getSystemLookAndFeelClassName());
					final MainFrame frame = new MainFrame();
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
	private JButton			btnTestframe;

	/**
	 * Create the frame.
	 */
	public MainFrame()
	{
		setResizable(false);
		setTitle("Hamburger Tafel");
		setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 354, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		final JLabel lblHamburgerTafel = new JLabel("Hamburger Tafel");
		lblHamburgerTafel.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblHamburgerTafel.setHorizontalAlignment(SwingConstants.CENTER);
		lblHamburgerTafel.setBounds(10, 11, 321, 23);
		contentPane.add(lblHamburgerTafel);

		final JButton btnBeenden = new JButton("Beenden...");
		btnBeenden.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent e)
			{
				QuitConfirmFrame.main();
			}
		});
		btnBeenden.setBounds(242, 231, 89, 23);
		contentPane.add(btnBeenden);

		final JButton btnOptionen = new JButton("Optionen");
		btnOptionen.setBounds(10, 231, 89, 23);
		contentPane.add(btnOptionen);

		final JLabel lblNewLabel = new JLabel(
				"-----------------------------------------------------");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(10, 45, 321, 14);
		contentPane.add(lblNewLabel);

		final JButton btnFahrerBearbeiten = new JButton("Fahrer bearbeiten");
		btnFahrerBearbeiten.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				DriverEditFrame.main();
			}
		});
		btnFahrerBearbeiten.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btnFahrerBearbeiten.setBounds(10, 70, 143, 23);
		contentPane.add(btnFahrerBearbeiten);

		final JLabel label = new JLabel(
				"-----------------------------------------------------");
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setFont(new Font("Tahoma", Font.BOLD, 14));
		label.setBounds(10, 206, 321, 14);
		contentPane.add(label);

		final JButton btnWagenBearbeiten = new JButton("Wagen bearbeiten");
		btnWagenBearbeiten.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btnWagenBearbeiten.setBounds(10, 104, 143, 23);
		contentPane.add(btnWagenBearbeiten);

		final JButton btnLieferantenBearbeiten = new JButton(
				"Lieferanten bearbeiten");
		btnLieferantenBearbeiten.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btnLieferantenBearbeiten.setBounds(10, 138, 143, 23);
		contentPane.add(btnLieferantenBearbeiten);

		final JButton btnAbnehmerBearbeiten = new JButton("Abnehmer bearbeiten");
		btnAbnehmerBearbeiten.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btnAbnehmerBearbeiten.setBounds(10, 172, 143, 23);
		contentPane.add(btnAbnehmerBearbeiten);

		this.btnTestframe = new JButton("Testframe");
		this.btnTestframe.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				TestFrame.main(null);
			}
		});
		this.btnTestframe.setBounds(210, 118, 89, 23);
		this.contentPane.add(this.btnTestframe);
	}

	@Override
	public void dispose()
	{
		QuitConfirmFrame.main();
	}
}
