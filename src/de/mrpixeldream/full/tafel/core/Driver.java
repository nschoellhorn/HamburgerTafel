package de.mrpixeldream.full.tafel.core;

import java.io.Serializable;

@SuppressWarnings("serial")
public class Driver implements Serializable
{
	private String	name;
	private String	prename;

	private int		age;

	private String	phone;

	public Driver(String name, String prename)
	{
		this.name = name;
		this.prename = prename;
	}

	public Driver(String name, String prename, int age)
	{
		this.name = name;
		this.prename = prename;
		this.age = age;

		if (age > 99)
		{
			this.age = 80;
		}
		if (age < 10)
		{
			this.age = 14;
		}
	}

	public Driver(String name, String prename, int age, String phone)
	{
		this.name = name;
		this.prename = prename;
		this.age = age;

		if (age > 99)
		{
			this.age = 80;
		}
		if (age < 10)
		{
			this.age = 14;
		}

		if (!phone.contains("/"))
		{
			this.phone = "040/" + phone;
		}
		else
		{
			this.phone = phone;
		}
	}

	public int getAge()
	{
		return age;
	}

	public String getName()
	{
		return name;
	}

	public String getPhone()
	{
		return phone;
	}

	public String getPrename()
	{
		return prename;
	}

	public void setAge(int age)
	{
		this.age = age;
	}

	public void setName(String name, String prename)
	{
		this.name = name;
		this.prename = prename;
	}

	public void setPhone(String phone)
	{
		this.phone = phone;
	}
}