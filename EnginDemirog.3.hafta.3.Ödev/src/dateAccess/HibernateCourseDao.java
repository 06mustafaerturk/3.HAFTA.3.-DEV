package dateAccess;

import java.util.List;

import entities.Course;

public class HibernateCourseDao implements IDao<Course>{

	@Override
	public void add(Course t,List<Course> list) {
		
		System.out.println(t.getCourseName()+ "  adl� kurs  HiberNate ile veri taban�na eklendi");
		list.add(t);
	}
	

}
