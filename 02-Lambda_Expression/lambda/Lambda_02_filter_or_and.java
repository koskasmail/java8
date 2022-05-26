
import java.util.ArrayList;
import java.util.List;

import utility.java8.lambda.lambdaAllInOne.ProductsInventory;

public class Lambda_02_filter_or_and {

	public Lambda_02_filter_or_and() {
		
		List<Product> productList = new ArrayList();

		// cooking
		productList.add(new Product("id-1001", "microwave", "hemilton", 1122, "white", "xl", "b", 100, 500));
		productList.add(new Product("id-1002", "toaster-oven", "hemilton", 1500, "black", "l", "c", 150, 350));

		// baking a cake
		productList.add(new Product("id-2001", "phone", "nokia", 5577, "black", "xs", "a", 200, 450));

		ProductsInventory p2 = new ProductsInventory();

		System.out.println("Or Condition");
		p2.getStatMainList().stream()
				.filter(p -> p.getId().equalsIgnoreCase("id-1001") || p.getId().equalsIgnoreCase("id-1002"))
				.forEach(p -> {
					System.out.println(p.toString());
				});
		System.out.println("======================");

		System.out.println("And Condition");
		p2.getStatMainList().stream().filter(p -> p.getPrice() > 100 && p.getPrice() < 460).forEach(p -> {
			System.out.println(p.toString());
		});

	}
}
