package com.goldbox.data;

import java.io.Serializable;
import java.util.List;

public class Item implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -4731314845399582197L;
	public String name;
	public String description;
	public List<Effect> effects;

}
