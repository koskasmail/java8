

public class Lambda_06_find_first_element_in_stream 
{
	public Lambda_06_find_first_element_in_stream() 
	{
		ProductsInventory p6 = new ProductsInventory();

		System.out.println("Product info with id is p2");

//		output to String
		String out = p6.getStatMainList()
				.stream()
				.filter(p -> p.getId().equalsIgnoreCase("id-1001"))
				.findFirst()
				.toString();

//		output to object "Product"
		Product intOut = p6.getStatMainList()
				.stream()
				.filter(p -> p.getId().equalsIgnoreCase("id-1001"))
				.findFirst()
				.get();

// output
		System.out.println(out);
		System.out.println("-----------------------------------------------");
		System.out.println(intOut);
	}
}
	
