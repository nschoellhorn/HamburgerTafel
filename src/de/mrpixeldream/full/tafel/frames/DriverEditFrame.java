package de.mrpixeldream.full.tafel.frames;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

import de.mrpixeldream.full.tafel.core.CoDriver;
import de.mrpixeldream.full.tafel.core.Driver;
import de.mrpixeldream.full.tafel.io.Data;

@SuppressWarnings("serial")
public class DriverEditFrame extends JFrame
{
	private JPanel	contentPane;
	private JTabbedPane	tabbedPane;
	private JTable		driver;
	private JTable		codriver;
	private JScrollPane	scrollPane1;
	private JScrollPane	scrollPane2;
	private JMenuBar	menuBar;
	private JMenu		mnFahrerbeifahrer;
	private JMenuItem	mntmNeuerFahrer;
	private JMenuItem	mntmNeuerBeifahrer;

	static ArrayList<Driver>	d	= new ArrayList<Driver>();
	static ArrayList<CoDriver>	c	= new ArrayList<CoDriver>();

	/**
	 * Launch the application.
	 */
	public static void main()
	{
		EventQueue.invokeLater(new Runnable()
		{
			public void run()
			{
				try
				{
					DriverEditFrame frame = new DriverEditFrame();
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
	public DriverEditFrame()
	{
		String[] cols1 = null;
		String[][] rows1 = null;

		try
		{
			rows1 = new String[Data.getDriver().size()][2];
			cols1 = new String[] { "Vorname", "Nachname" };
			for (int i = 0; i < Data.getDriver().size(); i++)
			{
				rows1[i][0] = Data.getDriver().get(i).getPrename();
				rows1[i][1] = Data.getDriver().get(i).getName();
			}
		}
		catch (NullPointerException e)
		{
			rows1 = new String[1][2];
			rows1[0][0] = "";
			rows1[0][1] = "";
			cols1 = new String[] { "Vorname", "Nachname" };
		}

		String[] cols2 = null;
		String[][] rows2 = null;

		try
		{
			rows2 = new String[Data.getCodriver().size()][2];
			cols2 = new String[] { "Vorname", "Nachname" };
			for (int i = 0; i < Data.getCodriver().size(); i++)
			{
				rows2[i][0] = Data.getCodriver().get(i).getPrename();
				rows2[i][1] = Data.getCodriver().get(i).getName();
			}
		}
		catch (NullPointerException e)
		{
			rows2 = new String[1][2];
			rows2[0][0] = "";
			rows2[0][1] = "";
			cols2 = new String[] { "Vorname", "Nachname" };
		}

		try
		{
			setTitle("Hamburger Tafel - Fahrer bearbeiten");
			setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
			setBounds(100, 100, 450, 317);
			this.contentPane = new JPanel();
			this.contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
			setContentPane(this.contentPane);
			this.contentPane.setLayout(null);

			this.tabbedPane = new JTabbedPane(JTabbedPane.TOP);
			this.tabbedPane.setBounds(0, 22, 434, 262);
			this.contentPane.add(this.tabbedPane);

			this.driver = new JTable(new DefaultTableModel(rows1, cols1));
			this.driver.addMouseListener(new MouseAdapter()
			{
				@Override
				public void mouseClicked(MouseEvent e)
				{
					if (e.getClickCount() == 2)
					{

					}
				}
			});
			this.driver.setCellSelectionEnabled(true);
			this.driver.setColumnSelectionAllowed(true);
			this.driver.addKeyListener(new KeyAdapter()
			{
				@Override
				public void keyPressed(KeyEvent e)
				{
					if (e.getKeyCode() == KeyEvent.VK_DELETE)
					{
						int row = driver.getSelectedRow();
						DefaultTableModel def = (DefaultTableModel) driver
								.getModel();
						def.removeRow(row);
					}
				}
			});

			this.scrollPane1 = new JScrollPane(driver);
			this.tabbedPane.addTab("Fahrer", this.scrollPane1);

			this.codriver = new JTable(new DefaultTableModel(rows2, cols2));
			this.codriver.addKeyListener(new KeyAdapter()
			{
				@Override
				public void keyPressed(KeyEvent e)
				{
					if (e.getKeyCode() == KeyEvent.VK_DELETE)
					{
						int row = codriver.getSelectedRow();
						DefaultTableModel def = (DefaultTableModel) codriver
								.getModel();
						def.removeRow(row);
					}
				}
			});

			this.scrollPane2 = new JScrollPane(codriver);
			this.tabbedPane.addTab("Beifahrer", this.scrollPane2);

			this.menuBar = new JMenuBar();
			this.menuBar.setBounds(0, 0, 434, 21);
			this.contentPane.add(this.menuBar);

			this.mnFahrerbeifahrer = new JMenu("Fahrer/Beifahrer");
			this.menuBar.add(this.mnFahrerbeifahrer);

			this.mntmNeuerFahrer = new JMenuItem("Neuer Fahrer...");
			this.mntmNeuerFahrer.addActionListener(new ActionListener()
			{
				public void actionPerformed(ActionEvent e)
				{
					TableModel model = driver.getModel();
					DefaultTableModel def = (DefaultTableModel) model;
					def.addRow(new String[] { "Neuer", "Fahrer" });
					tabbedPane.setSelectedComponent(scrollPane1);
				}
			});
			this.mnFahrerbeifahrer.add(this.mntmNeuerFahrer);

			this.mntmNeuerBeifahrer = new JMenuItem("Neuer Beifahrer...");
			this.mntmNeuerBeifahrer.addActionListener(new ActionListener()
			{
				public void actionPerformed(ActionEvent e)
				{
					TableModel model = codriver.getModel();
					DefaultTableModel def = (DefaultTableModel) model;
					def.addRow(new String[] { "Neuer", "Beifahrer" });
					tabbedPane.setSelectedComponent(scrollPane2);
				}
			});
			this.mnFahrerbeifahrer.add(this.mntmNeuerBeifahrer);
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}

	@Override
	public void dispose()
	{
		super.dispose();

		TableModel content = this.driver.getModel();
		for (int i = 0; i < content.getRowCount(); i++)
		{
			String prename = (String) content.getValueAt(i, 0);
			String name = (String) content.getValueAt(i, 1);
			if (!prename.equals("") && !name.equals(""))
			{
				d.add(new Driver(name, prename));
			}
			else
			{
				continue;
			}
		}
		Data.setDriver(d);

		TableModel content2 = this.codriver.getModel();
		for (int i = 0; i < content.getRowCount(); i++)
		{
			String prename = (String) content2.getValueAt(i, 0);
			String name = (String) content2.getValueAt(i, 1);
			if (!prename.equals("") && !name.equals(""))
			{
				c.add(new CoDriver(name, prename));
			}
			else
			{
				continue;
			}
		}
		Data.setCodriver(c);
	}
}
