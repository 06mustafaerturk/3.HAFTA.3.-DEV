package logging;

import entities.Category;
import entities.Course;
import entities.Instructor;

public class EmailLogger implements Logger<Object> {

	@Override
	public void log(Object data) {
		
			if(data instanceof Category) {
				System.out.println(((Category) data).getCategoryName()+"  adl� category Emaile logland�");
			}else if(data instanceof Course) {
				System.out.println(((Course) data).getCourseName()+"  adl� kurs Emaile logland�");
			}else if(data instanceof Instructor) {
				System.out.println(((Instructor) data).getInstructorName()+"  adl� e�itmen Emaile logland�");
			}
		
	
	}
}
