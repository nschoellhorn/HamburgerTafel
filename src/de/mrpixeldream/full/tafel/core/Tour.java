package de.mrpixeldream.full.tafel.core;

import java.io.Serializable;
import java.util.ArrayList;

@SuppressWarnings("serial")
public class Tour implements Serializable
{
	String	name;
	ArrayList<Provider>	providers;
	ArrayList<Customer>	customers;
	ArrayList<Weekday>	days;
}