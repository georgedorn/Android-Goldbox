package com.goldbox.data;

import java.io.Serializable;
import java.util.HashMap;
import java.util.List;

public class Character implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4804567889712637509L;
	public String name;
	public HashMap<String, Integer> attributes;
	public transient HashMap<String, Integer> attributes_calculated;
	private EnumMap<Enum, Integer>; //@todo: figure out enums
	
	public Item headItem;
	public Item leftHandItem;
	public Item rightHandItem;
	public Item bootsItem;
	public Item armorItem;
	public List<Item> inventory;
	
	
	
}
