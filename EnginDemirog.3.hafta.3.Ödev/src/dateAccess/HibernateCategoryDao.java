package dateAccess;

import java.util.List;

import entities.Category;

public class HibernateCategoryDao implements IDao<Category> {

	@Override
	public void add(Category t, List<Category> l) {
			System.out.println("adl� kategory Hibernate ile veritabana�na eklendi");
			l.add(t);
	}

}
