package de.mrpixeldream.full.tafel.core;

@SuppressWarnings("serial")
public class CoDriver extends Driver
{
	Driver	driver;

	public CoDriver(Driver driver, String name, String prename, int age, String phone)
	{
		super(name, prename, age, phone);
		this.driver = driver;
	}

	public CoDriver(String name, String prename)
	{
		super(name, prename);
	}

	public CoDriver(String name, String prename, int age)
	{
		super(name, prename, age);
	}

	public CoDriver(String name, String prename, int age, String phone)
	{
		super(name, prename, age, phone);
	}

	public Driver getDriver()
	{
		return driver;
	}

	public void setDriver(Driver driver)
	{
		this.driver = driver;
	}
}
