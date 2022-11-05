package model.services;

import java.util.ArrayList;
import java.util.List;

import model.entities.Department;

public class DepartmentService {

	public List<Department> findAll() {
		List<Department> list = new ArrayList<Department>();
		list.add(new Department(1, "Books"));
		list.add(new Department(2, "Eletronics"));
		list.add(new Department(3, "Toy"));
		list.add(new Department(4, "pots and pans"));
		list.add(new Department(5, "tools"));
		list.add(new Department(6, "Cds"));

		return list;
	}
}
