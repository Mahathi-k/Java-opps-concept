package com.test;

public class InvoiceItem 
{
   private String Id;
   private String Desc;
   private int Quntity;
   private double unitPrice;
   
   InvoiceItem(String Id,String Desc, int Quantity, Double unitPrice)
   {
	   this.Id=Id;
	   this.Desc=Desc;
	   this.Quntity=Quantity;
	   this.unitPrice=unitPrice;
	   
   }
	
	public String getId() {
	return Id;
}

public void setId(String id) {
	Id = id;
}

public String getDesc() {
	return Desc;
}

public void setDesc(String desc) {
	Desc = desc;
}

public int getQuntity() {
	return Quntity;
}
public void setQuntity(int quntity) {
	Quntity = quntity;
}
public double getUnitPrice() {
	return unitPrice;
}

public void setUnitPrice(double unitPrice) {
	this.unitPrice = unitPrice;
}
public double getTotal() {
	return unitPrice *Quntity;
}

	@Override
public String toString() {
	return "InvoiceItem [Id=" + Id + ", Desc=" + Desc + ", Quntity=" + Quntity + ", unitPrice=" + unitPrice + "]";
}

	public static void main(String[] args) 
	{
		InvoiceItem obj=new InvoiceItem("Ma1234","voice of india",20,50.87);
				System.out.println(obj.getId());
				System.out.println(obj.getDesc());
				System.out.println(obj.getQuntity());
				System.out.println(obj.getUnitPrice());
				System.out.println(obj.getTotal());

	}

}
