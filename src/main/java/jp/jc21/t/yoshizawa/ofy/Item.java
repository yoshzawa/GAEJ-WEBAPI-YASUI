package jp.jc21.t.yoshizawa.ofy;
import java.util.Date;
import java.util.List;

import com.google.appengine.api.datastore.Key;
import com.google.appengine.api.datastore.KeyFactory;
import com.googlecode.objectify.*;
import com.googlecode.objectify.annotation.*;

@Entity
public final class Item {
	  @Id @Index public String janCode;

	  public String itemName;
	  public String itemUrl;
	  public int price;
	  @Index 
	  public String shopName;
	  public Date created;
	  
	  public static void register() {
			ObjectifyService.register(Item.class);
	  }
	  
	  public String getJanCode() {
		return janCode;
	}


	public void setJanCode(String janCode) {
		this.janCode = janCode;
	}


	public String getItemName() {
		return itemName;
	}


	public void setItemName(String itemName) {
		this.itemName = itemName;
	}


	public String getItemUrl() {
		return itemUrl;
	}


	public void setItemUrl(String itemUrl) {
		this.itemUrl = itemUrl;
	}


	public int getPrice() {
		return price;
	}


	public void setPrice(int price) {
		this.price = price;
	}


	public Date getCreated() {
		return created;
	}


	public void setCreated(Date created) {
		this.created = created;
	}


	public String getShopName() {
		return shopName;
	}

	public void setShopName(String shopName) {
		this.shopName = shopName;
	}

	public Item(String janCode,String itemName,String itemUrl,int price,String shopName,Date created) {
		setJanCode(janCode);
		setItemName(itemName);
		setItemUrl(itemUrl);
		setPrice(price);
		setShopName(shopName);
		setCreated(created);
	}
	public Item(String janCode,String itemName,String itemUrl,String shopName,int price) {
		this(janCode,itemName,itemUrl,price,shopName,new Date());
	}
	public Item() {	}


	
	
	
	public void save() {
		ObjectifyService.ofy().save().entity(this).now();		
	}


	public static List<Item> getlist() {
		return ObjectifyService.ofy().load().type(Item.class).list();
	}


	public static List<Item> getListById(String id) {
		Key itemKey = KeyFactory.createKey("Item", id);
		List<Item> items = ObjectifyService.ofy().load().type(Item.class).
				filterKey(itemKey).list();
		return items;
	}


	public static List<Item> getlistByShopName(String shopName) {
		List<Item> items = ObjectifyService.ofy().load().type(Item.class).
				filter("shopName",shopName).list();
		return items;
	}
	
	public static Item getObjectById(String janCode) {
		List<Item> list = getListById(janCode);
		if(list.size()!=1) {
			return null;
		} else {
			return list.get(0);
		}
	}
	
	
	
	

}
