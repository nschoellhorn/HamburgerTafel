package de.mrpixeldream.full.tafel;

import java.io.File;

import de.mrpixeldream.full.tafel.frames.MainFrame;
import de.mrpixeldream.full.tafel.io.Data;
import de.mrpixeldream.full.tafel.io.SavesReader;
import de.mrpixeldream.full.tafel.io.SavesWriter;

public class HamburgerTafel
{
	static final String	CODRIVER	= getSettingsPath()
											+ "/.tafel/codriver.bin";
	static final String	CUSTOMER	= getSettingsPath()
											+ "/.tafel/customer.bin";
	static final String	DRIVER		= getSettingsPath() + "/.tafel/driver.bin";
	static final String	ITEM		= getSettingsPath() + "/.tafel/item.bin";
	static final String	PROVIDER	= getSettingsPath()
											+ "/.tafel/provider.bin";
	static final String	TOUR		= getSettingsPath() + "/.tafel/tour.bin";

	static File			baseDir		= new File(getSettingsPath() + "/.tafel");

	public static void main(String[] args)
	{
		createSaves();

		try
		{
			SavesReader reader = new SavesReader();

			Data.setCodriver(reader.readCoDriver(CODRIVER));
			Data.setCustomer(reader.readCustomer(CUSTOMER));
			Data.setDriver(reader.readDriver(DRIVER));
			Data.setItem(reader.readItem(ITEM));
			Data.setProvider(reader.readProvider(PROVIDER));
			Data.setTour(reader.readTour(TOUR));

			reader = null;
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}

		MainFrame.main();
	}

	public static void endProgram()
	{
		try
		{
			SavesWriter writer = new SavesWriter();

			writer.writeCoDriver(Data.getCodriver(), CODRIVER);
			writer.writeCustomer(Data.getCustomer(), CUSTOMER);
			writer.writeDriver(Data.getDriver(), DRIVER);
			writer.writeItem(Data.getItem(), ITEM);
			writer.writeProvider(Data.getProvider(), PROVIDER);
			writer.writeTour(Data.getTour(), TOUR);

			writer = null;
		}
		catch (Exception e)
		{
			e.printStackTrace();
			System.exit(0);
		}

		System.exit(0);
	}

	public static void createSaves()
	{
		try
		{
			if (!baseDir.exists())
			{
				baseDir.mkdir();
				File tmp;

				tmp = new File(CODRIVER);
				tmp.createNewFile();

				tmp = new File(CUSTOMER);
				tmp.createNewFile();

				tmp = new File(DRIVER);
				tmp.createNewFile();

				tmp = new File(ITEM);
				tmp.createNewFile();

				tmp = new File(PROVIDER);
				tmp.createNewFile();

				tmp = new File(TOUR);
				tmp.createNewFile();

				tmp = null;
			}
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}

	public static String getSettingsPath()
	{
		String settingsPath;

		// Windows
		settingsPath = System.getenv("APPDATA");

		// Unix
		if (settingsPath == null)
		{
			settingsPath = System.getProperty("user.home");
		}

		return settingsPath;
	}
}