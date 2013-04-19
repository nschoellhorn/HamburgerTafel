package de.mrpixeldream.full.tafel.io;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.util.ArrayList;

import de.mrpixeldream.full.tafel.core.CoDriver;
import de.mrpixeldream.full.tafel.core.Customer;
import de.mrpixeldream.full.tafel.core.Driver;
import de.mrpixeldream.full.tafel.core.Item;
import de.mrpixeldream.full.tafel.core.Provider;
import de.mrpixeldream.full.tafel.core.Tour;

public class SavesWriter
{
	File saves;
	OutputStream		out;
	ObjectOutputStream writer;
	
	public void writeCoDriver(ArrayList<CoDriver> items, String f)
	{
		try
		{
			this.saves = new File(f);
			this.out = new FileOutputStream(this.saves);
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}

		try
		{
			this.writer = new ObjectOutputStream(out);
			this.writer.writeObject(items);
			this.writer.close();
			this.out.close();
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
	}

	public void writeCustomer(ArrayList<Customer> items, String f)
	{
		try
		{
			this.saves = new File(f);
			this.out = new FileOutputStream(this.saves);
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}

		try
		{
			this.writer = new ObjectOutputStream(out);
			this.writer.writeObject(items);
			this.writer.close();
			this.out.close();
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
	}

	public void writeDriver(ArrayList<Driver> items, String f)
	{
		try
		{
			this.saves = new File(f);
			this.out = new FileOutputStream(this.saves);
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}

		try
		{
			this.writer = new ObjectOutputStream(out);
			this.writer.writeObject(items);
			this.writer.close();
			this.out.close();
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
	}

	public void writeItem(ArrayList<Item> items, String f)
	{
		try
		{
			this.saves = new File(f);
			this.out = new FileOutputStream(this.saves);
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}

		try
		{
			this.writer = new ObjectOutputStream(out);
			this.writer.writeObject(items);
			this.writer.close();
			this.out.close();
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
	}

	public void writeProvider(ArrayList<Provider> items, String f)
	{
		try
		{
			this.saves = new File(f);
			this.out = new FileOutputStream(this.saves);
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}

		try
		{
			this.writer = new ObjectOutputStream(out);
			this.writer.writeObject(items);
			this.writer.close();
			this.out.close();
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
	}

	public void writeTour(ArrayList<Tour> items, String f)
	{
		try
		{
			this.saves = new File(f);
			this.out = new FileOutputStream(this.saves);
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}

		try
		{
			this.writer = new ObjectOutputStream(out);
			this.writer.writeObject(items);
			this.writer.close();
			this.out.close();
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
	}
}