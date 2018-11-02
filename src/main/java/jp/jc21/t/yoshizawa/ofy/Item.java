package jp.jc21.t.yoshizawa.ofy;
import java.util.Date;

import com.googlecode.objectify.*;
import com.googlecode.objectify.annotation.*;

@Entity
public class Item {
	  @Id @Index public String janCode;

	  public String itemName;
	  public String itemUrl;
	  public int price;
	  public Date created;
	  
	  
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


	public Item(String janCode,String itemName,String itemUrl,int price,Date created) {
		setJanCode(janCode);
		setItemName(itemName);
		setItemUrl(itemUrl);
		setPrice(price);
		setCreated(created);
	}
	public Item(String janCode,String itemName,String itemUrl,int price) {
		this(janCode,itemName,itemUrl,price,new Date());
	}
	public Item() {	}
	

}
