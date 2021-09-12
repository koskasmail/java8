

public class Lambda_06_find_first_element_in_stream 
{
	public Lambda_06_find_first_element_in_stream() 
	{	
		ProductsInventory p6 = new ProductsInventory();
		System.out.println("Product info with id is p2");
		p6.getStatMainList().stream()
				.filter(p -> p.getId().equalsIgnoreCase("id-1001"))
				.findFirst()
				.get();
		System.out.println(p6.getStatMainList());
	}
}
