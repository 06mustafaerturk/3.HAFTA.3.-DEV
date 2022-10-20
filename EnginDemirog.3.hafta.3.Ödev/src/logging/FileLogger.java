package logging;

import entities.Category;
import entities.Course;
import entities.Instructor;

public class FileLogger implements Logger<Object> {

	@Override
	public void log(Object data) {
		
		if (data instanceof Course) {
		System.out.println(((Course) data).getCourseName()+" adl� kurs Dosyaya logland�");
		}
		else if(data instanceof Instructor) {
		System.out.println(((Instructor) data).getInstructorName() +"adl� egitmen Dosyaya Logland�");	
		}else if(data instanceof Category) {
		System.out.println(((Category) data).getCategoryName()+"adl� kategoriy Dosyaya logland�");
		}
		
	}

	
	

}
