package dateAccess;

import java.util.List;

import entities.Instructor;

public class JDBCInstructorDao implements IDao<Instructor>{

	@Override
	public void add(Instructor t, List<Instructor> l) {
			System.out.println(t.getInstructorName()+ "  adl� e�itmen JDBC ile veri taban�na eklendi");
			l.add(t);
	}

}
