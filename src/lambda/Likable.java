package lambda;

import java.util.List;

public interface Likable {
	
	
	List<Student> getAllStudents();
	
	default void update()
	{
		System.out.println("Method update");
	}

}
