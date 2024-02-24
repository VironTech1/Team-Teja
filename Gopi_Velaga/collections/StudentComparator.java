package collections;

import java.util.Comparator;

public class StudentComparator implements Comparator<StudentData> {

	@Override
	public int compare(StudentData o1, StudentData o2) {
		if(o1.getId() >= o2.getId())
			return 1;
		else
			return -1;
	}

}
