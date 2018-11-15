package jp.jc21.t.yoshizawa.ofy;
import java.util.Date;
import java.util.List;

import com.google.appengine.api.datastore.Key;
import com.google.appengine.api.datastore.KeyFactory;
import com.googlecode.objectify.*;
import com.googlecode.objectify.annotation.*;

@Entity
public final class WebItem {
	  @Id public String itemUrl ;

	  public String itemName;
	  public String janCode;
	  public int price;
	  public Date created;
	  
	  public static void register() {
			ObjectifyService.register(WebItem.class);
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


	public WebItem(String janCode,String itemName,String itemUrl,int price,Date created) {
		setJanCode(janCode);
		setItemName(itemName);
		setItemUrl(itemUrl);
		setPrice(price);
		setCreated(created);
	}
	public WebItem(String janCode,String itemName,String itemUrl,int price) {
		this(janCode,itemName,itemUrl,price,new Date());
	}
	public WebItem() {	}


	
	
	
	public void save() {
		ObjectifyService.ofy().save().entity(this).now();		
	}


	public static List<WebItem> getlist() {
		return ObjectifyService.ofy().load().type(WebItem.class).list();
	}


	public static List<WebItem> getListById(String id) {
		Key itemKey = KeyFactory.createKey("Item", id);
		List<WebItem> items = ObjectifyService.ofy().load().type(WebItem.class).
				filterKey(itemKey).list();
		return items;
	}


	public static WebItem getObjectById(String janCode) {
		List<WebItem> list = getListById(janCode);
		if(list.size()!=1) {
			return null;
		} else {
			return list.get(0);
		}
	}
	

}
