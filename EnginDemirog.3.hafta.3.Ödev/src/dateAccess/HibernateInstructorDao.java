package dateAccess;

import java.util.List;

import entities.Instructor;

public class HibernateInstructorDao implements IDao<Instructor>{

	@Override
	public void add(Instructor t, List<Instructor> list) {
				System.out.println("Hibernate ile veritaban�na eklendi.");
				list.add(t);
		
	}

}
