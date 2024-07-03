package application;

import java.util.Date;
import java.util.List;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {

		SellerDao sellerDao = DaoFactory.createSellerDao();
		
		Seller seller = sellerDao.findById(8);
		
		
		Department dep = new Department(2, null);
		List<Seller> list = sellerDao.findByDepartment(dep);

		list.forEach(System.out::println);
		System.out.println();
		

		System.out.println("============ UPDATE ============");
		
		seller.setName("Joao");
		seller.setEmail("joao@gmail.com");
		sellerDao.update(seller);
	}

}
