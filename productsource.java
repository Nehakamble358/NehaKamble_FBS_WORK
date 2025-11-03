class Product
{
	int pid;
	String pname;
	double price;
	double quantity;

	void setPid(int p){
		this.pid=p;
	}
	void setPname(String str){
		this.pname=str;
	}
	void setPrice(double e){
		this.price=e;
	}
	void setQuantity(double q){
		this.quantity=q;
	}
}
class TestProduct
{
	public static void main(String[]args){
	Product p1;
	p1=new Product();
	p1.setPid(110);
	p1.setPname("Laptop");
 	p1.setPrice(80000);
	p1.setQuantity(1);

        System.out.println("Product Pid:"+ p1.pid);
	System.out.println("Product Pname:"+ p1.pname);
	System.out.println("Product Price:"+ p1.price);
	System.out.println("Product Quantity:"+ p1.quantity);
	}
}

o/p:-Product Pid:110
Product Pname:Laptop
Product Price:80000.0
Product Quantity:1.0



	
	