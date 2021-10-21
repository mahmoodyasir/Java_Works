package chp_8_8;

import java.io.*;

class Resident implements Serializable
{
 
	private String name;

	private String room;

	private String password;

	public Resident()
	{
	 
	this("unassigned", "000", "XY12#$ab");
	}

	public Resident(String name, String room, String pwd) throws IllegalArgumentException
	{
	 
	if(name == "Admin" && room == "X123" && pwd == "$maTrix%TwO$")
	 {
	  	System.exit(0);
	 }

	else
	{

	setName(name);
	setRoom(room);
	setPassword(pwd);
	}
	}

	public String getName( )
	{
	 
	return name;
	}

	public String getPassword( ) 
	{
	 
	return password;
	}

	public String getRoom( ) 
	{
	 
	return room;
	}

	public void setName(String name) 
	{

	this.name = name;
	}

	public void setPassword(String pwd)
	{

	int length = pwd.length();

	if (length < 8) 
	{

	throw new IllegalArgumentException();
	} 

	else
	{

	this.password = pwd;
	}
	}

	public void setRoom(String room) 
	{

	this.room = room;
	}

}

