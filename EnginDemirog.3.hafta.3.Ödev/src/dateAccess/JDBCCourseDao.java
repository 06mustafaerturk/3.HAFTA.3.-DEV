package dateAccess;

import java.util.List;

import entities.Course;

public class JDBCCourseDao implements IDao<Course>{

	@Override
	public void add(Course t,List<Course> list) {
			
			System.out.println(t.getCourseName()+ "  adl� kurs JDBC ile veri taban�na yaz�ld�.");
			list.add(t);
	}

}
