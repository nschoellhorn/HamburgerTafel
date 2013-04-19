package de.mrpixeldream.full.tafel.core;

import java.io.Serializable;

@SuppressWarnings("serial")
public class Item implements Serializable
{
	ItemType type;
	String name;
	
	public Item(String name, ItemType category)
	{
		this.type = category;
		this.name = name;
	}

	public ItemType getType()
	{
		return type;
	}

	public void setType(ItemType type)
	{
		this.type = type;
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}
}