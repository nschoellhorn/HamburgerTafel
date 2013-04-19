package de.mrpixeldream.full.tafel.core;

import java.io.Serializable;
import java.util.ArrayList;

@SuppressWarnings("serial")
public class Customer implements Serializable
{
	String name;
	ArrayList<Weekday> deliveryDay;
	ArrayList<Item> items;
	Tour tour;
	
	public boolean containsDeliveryDay(Weekday o)
	{
		return deliveryDay.contains(o);
	}
	
	public boolean addDeliveryDay(Weekday e)
	{
		return deliveryDay.add(e);
	}
	
	public Weekday removeDeliveryDay(int index)
	{
		return deliveryDay.remove(index);
	}
	
	public boolean removeDeliveryDay(Weekday o)
	{
		return deliveryDay.remove(o);
	}
	
	public boolean addItem(Item e)
	{
		return items.add(e);
	}
	
	public String getName()
	{
		return name;
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
	
	public ArrayList<Item> getItems()
	{
		return items;
	}
	
	public void setItems(ArrayList<Item> items)
	{
		this.items = items;
	}
	
	public Tour getTour()
	{
		return tour;
	}
	
	public void setTour(Tour tour)
	{
		this.tour = tour;
	}
}