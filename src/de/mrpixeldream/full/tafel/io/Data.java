package de.mrpixeldream.full.tafel.io;

import java.util.ArrayList;

import de.mrpixeldream.full.tafel.core.CoDriver;
import de.mrpixeldream.full.tafel.core.Customer;
import de.mrpixeldream.full.tafel.core.Driver;
import de.mrpixeldream.full.tafel.core.Item;
import de.mrpixeldream.full.tafel.core.Provider;
import de.mrpixeldream.full.tafel.core.Tour;

public class Data
{
	static ArrayList<CoDriver>	codriver	= new ArrayList<CoDriver>(1);
	static ArrayList<Customer>	customer	= new ArrayList<Customer>(1);
	static ArrayList<Driver>	driver		= new ArrayList<Driver>(1);
	static ArrayList<Item>		item		= new ArrayList<Item>(1);
	static ArrayList<Provider>	provider	= new ArrayList<Provider>(1);
	static ArrayList<Tour>		tour		= new ArrayList<Tour>(1);

	public static ArrayList<CoDriver> getCodriver()
	{
		return codriver;
	}

	public static void setCodriver(ArrayList<CoDriver> codriver)
	{
		Data.codriver = codriver;
	}

	public static ArrayList<Customer> getCustomer()
	{
		return customer;
	}

	public static void setCustomer(ArrayList<Customer> customer)
	{
		Data.customer = customer;
	}

	public static ArrayList<Driver> getDriver()
	{
		return driver;
	}

	public static void setDriver(ArrayList<Driver> driver)
	{
		Data.driver = driver;
	}

	public static ArrayList<Item> getItem()
	{
		return item;
	}

	public static void setItem(ArrayList<Item> item)
	{
		Data.item = item;
	}

	public static ArrayList<Provider> getProvider()
	{
		return provider;
	}

	public static void setProvider(ArrayList<Provider> provider)
	{
		Data.provider = provider;
	}

	public static ArrayList<Tour> getTour()
	{
		return tour;
	}

	public static void setTour(ArrayList<Tour> tour)
	{
		Data.tour = tour;
	}
}