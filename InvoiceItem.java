public class InvoiceItem 
{

	private int id;
	private String desc; 
	private int qty; 
	private double unitPrice; 
		
		
		public InvoiceItem( int item_id,String d, int q, double u)
		{
			id = item_id;
			desc  = d; 
			qty = q; 
			unitPrice = u; 
		} 
		
		
		public int getId() {
			return id;
		}


		public void setId(int id) {
			this.id = id;
		}


		public void setDesc (String d)
		{
			desc = d;	
		}
		
		public String getDesc()
		{
			return desc;
		} 
		
		public void setQty(int q)
		{
			qty = q;	
		}
		
		public int getQty()
		{
			return qty;
		}
		
		public void setUnitPrice (double u)
		{
			unitPrice = u;	
		}
		
		
		public double getUnitPrice ()
		{
			return unitPrice;
		} 
		
		public double getTotal()
		{
			return unitPrice * qty;
		} 
		public String toString() {
			String str= "Id: " +getId()+" "+ "\nDescription:  "+getDesc()+ " " + "\nQuantity:  "+getQty()+ " " + "\nUnit price: "+ " "+getUnitPrice();
			return str;
			
		}
		
		
	} 
