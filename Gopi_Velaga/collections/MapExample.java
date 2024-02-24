package collections;

import java.util.Arrays;
import java.util.Calendar;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapExample {

	public static void main(String[] args) {

		StudentData stu1 = new StudentData("Gopi Chand", 25, 1234, 9288639761L);
		StudentData stu2 = new StudentData("Gnaneshwar", 23, 1239, 9288639828L);
		StudentData stu3 = new StudentData("Lakshmi Reddy", 22, 1236, 9288639861L);
		StudentData stu4 = new StudentData("Varun Teja", 24, 1237, 9642985343L);
		StudentData stu5 = new StudentData("Tejaswini", 24, 1238, 9288639781L);
		StudentData stu6 = new StudentData("Priyanka", 24, 1235, 9288697894L);
		StudentData stu7 = new StudentData("Tejaswini", 25, 1240, 9288639762L);
		StudentData stu8 = new StudentData("Gopi Chand", 25, 1234, 9288639761L);
		StudentData stu9 = stu2;

		Map<Integer, String> m = new HashMap<Integer, String>();

		m.put(stu1.getId(), stu1.getName());
		m.put(stu2.getId(), stu2.getName());
		m.put(stu3.getId(), stu3.getName());
		m.put(stu4.getId(), stu4.getName());
		m.put(stu5.getId(), stu5.getName());
		m.put(stu6.getId(), stu6.getName());
		m.put(stu7.getId(), stu7.getName());
		m.put(stu8.getId(), stu8.getName());
		m.put(stu9.getId(), stu9.getName());

		System.out.println("Hash Map");
		System.out.println(m);
		System.out.println(m.keySet());
		System.out.println(m.values());
		System.out.println(m.get(stu9));

		System.out.println("Key Value pairs");
		Set<Entry<Integer, String>> entrySet = m.entrySet();
		for (Entry<Integer, String> i : entrySet) {
			System.out.println(i.getKey() + " : " + i.getValue());
		}

		/*
		 * Hash Map {StudentData [name=Tejaswini, age=24, id=1238,
		 * phnNumber=9288639781]=Tejaswini, StudentData [name=Varun Teja, age=24,
		 * id=1237, phnNumber=9642985343]=Varun Teja, StudentData [name=Priyanka,
		 * age=24, id=1235, phnNumber=9288697894]=Priyanka, StudentData [name=Tejaswini,
		 * age=25, id=1240, phnNumber=9288639762]=Tejaswini, StudentData [name=Lakshmi
		 * Reddy, age=22, id=1236, phnNumber=9288639861]=Lakshmi Reddy, StudentData
		 * [name=Gnaneshwar, age=23, id=1239, phnNumber=9288639828]=Gnaneshwar,
		 * StudentData [name=Gopi Chand, age=25, id=1234, phnNumber=9288639761]=Gopi
		 * Chand}
		 * 
		 * [StudentData [name=Tejaswini, age=24, id=1238, phnNumber=9288639781],
		 * StudentData [name=Varun Teja, age=24, id=1237, phnNumber=9642985343],
		 * StudentData [name=Priyanka, age=24, id=1235, phnNumber=9288697894],
		 * StudentData [name=Tejaswini, age=25, id=1240, phnNumber=9288639762],
		 * StudentData [name=Lakshmi Reddy, age=22, id=1236, phnNumber=9288639861],
		 * StudentData [name=Gnaneshwar, age=23, id=1239, phnNumber=9288639828],
		 * StudentData [name=Gopi Chand, age=25, id=1234, phnNumber=9288639761]]
		 * 
		 * [Tejaswini, Varun Teja, Priyanka, Tejaswini, Lakshmi Reddy, Gnaneshwar, Gopi
		 * Chand]
		 * 
		 * Gnaneshwar
		 * 
		 * Key Value pairs StudentData [name=Tejaswini, age=24, id=1238,
		 * phnNumber=9288639781] : Tejaswini StudentData [name=Varun Teja, age=24,
		 * id=1237, phnNumber=9642985343] : Varun Teja StudentData [name=Priyanka,
		 * age=24, id=1235, phnNumber=9288697894] : Priyanka StudentData
		 * [name=Tejaswini, age=25, id=1240, phnNumber=9288639762] : Tejaswini
		 * StudentData [name=Lakshmi Reddy, age=22, id=1236, phnNumber=9288639861] :
		 * Lakshmi Reddy StudentData [name=Gnaneshwar, age=23, id=1239,
		 * phnNumber=9288639828] : Gnaneshwar StudentData [name=Gopi Chand, age=25,
		 * id=1234, phnNumber=9288639761] : Gopi Chand
		 */

		Date d = new Date();

		System.out.println(d.getDate());
		System.out.println(d.getDay());

		Calendar c = Calendar.getInstance();
		System.out.println(c);

		
		//Arrays is a class, we can use and create the list
		//With the help of the List.of() method we will create the unique list..
		List<Integer> list = Arrays.asList(1, 2, 6, 3, 5, 7, 4, 6, 9);

		Collections.sort(list);

	}

}
