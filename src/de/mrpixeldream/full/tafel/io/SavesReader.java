package de.mrpixeldream.full.tafel.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;

import de.mrpixeldream.full.tafel.core.CoDriver;
import de.mrpixeldream.full.tafel.core.Customer;
import de.mrpixeldream.full.tafel.core.Driver;
import de.mrpixeldream.full.tafel.core.Item;
import de.mrpixeldream.full.tafel.core.Provider;
import de.mrpixeldream.full.tafel.core.Tour;

public class SavesReader
{
	File				saves;
	InputStream			in;
	ObjectInputStream	reader;

	@SuppressWarnings("unchecked")
	public ArrayList<CoDriver> readCoDriver(String f)
	{
		try
		{
			this.saves = new File(f);
			this.in = new FileInputStream(saves);
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}

		try
		{
			this.reader = new ObjectInputStream(in);
			ArrayList<CoDriver> a = new ArrayList<CoDriver>();
			a = (ArrayList<CoDriver>) reader.readObject();
			this.reader.close();
			this.in.close();
			return a;
		}
		catch (IOException e)
		{
			e.printStackTrace();
			return null;
		}
		catch (ClassNotFoundException e)
		{
			e.printStackTrace();
			return null;
		}
	}

	@SuppressWarnings("unchecked")
	public ArrayList<Customer> readCustomer(String f)
	{
		try
		{
			this.saves = new File(f);
			this.in = new FileInputStream(saves);
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}

		try
		{
			this.reader = new ObjectInputStream(in);
			ArrayList<Customer> a = new ArrayList<Customer>();
			a = (ArrayList<Customer>) reader.readObject();
			this.reader.close();
			this.in.close();
			return a;
		}
		catch (IOException e)
		{
			e.printStackTrace();
			return null;
		}
		catch (ClassNotFoundException e)
		{
			e.printStackTrace();
			return null;
		}
	}

	@SuppressWarnings("unchecked")
	public ArrayList<Driver> readDriver(String f)
	{
		try
		{
			this.saves = new File(f);
			this.in = new FileInputStream(saves);
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}

		try
		{
			this.reader = new ObjectInputStream(in);
			ArrayList<Driver> a = new ArrayList<Driver>();
			a = (ArrayList<Driver>) reader.readObject();
			this.reader.close();
			this.in.close();
			return a;
		}
		catch (IOException e)
		{
			e.printStackTrace();
			return null;
		}
		catch (ClassNotFoundException e)
		{
			e.printStackTrace();
			return null;
		}
	}

	@SuppressWarnings("unchecked")
	public ArrayList<Item> readItem(String f)
	{
		try
		{
			this.saves = new File(f);
			this.in = new FileInputStream(saves);
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}

		try
		{
			this.reader = new ObjectInputStream(in);
			ArrayList<Item> a = new ArrayList<Item>();
			a = (ArrayList<Item>) reader.readObject();
			this.reader.close();
			this.in.close();
			return a;
		}
		catch (IOException e)
		{
			e.printStackTrace();
			return null;
		}
		catch (ClassNotFoundException e)
		{
			e.printStackTrace();
			return null;
		}
	}

	@SuppressWarnings("unchecked")
	public ArrayList<Provider> readProvider(String f)
	{
		try
		{
			this.saves = new File(f);
			this.in = new FileInputStream(saves);
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}

		try
		{
			this.reader = new ObjectInputStream(in);
			ArrayList<Provider> a = new ArrayList<Provider>();
			a = (ArrayList<Provider>) reader.readObject();
			this.reader.close();
			this.in.close();
			return a;
		}
		catch (IOException e)
		{
			e.printStackTrace();
			return null;
		}
		catch (ClassNotFoundException e)
		{
			e.printStackTrace();
			return null;
		}
	}

	@SuppressWarnings("unchecked")
	public ArrayList<Tour> readTour(String f)
	{
		try
		{
			this.saves = new File(f);
			this.in = new FileInputStream(saves);
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}

		try
		{
			this.reader = new ObjectInputStream(in);
			ArrayList<Tour> a = new ArrayList<Tour>();
			a = (ArrayList<Tour>) reader.readObject();
			this.reader.close();
			this.in.close();
			return a;
		}
		catch (IOException e)
		{
			e.printStackTrace();
			return null;
		}
		catch (ClassNotFoundException e)
		{
			e.printStackTrace();
			return null;
		}
	}
}