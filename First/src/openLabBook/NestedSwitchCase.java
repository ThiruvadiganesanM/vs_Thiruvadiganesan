package openLabBook;

public class NestedSwitchCase {
public static void main(String[] args) {
	int index=2;
	int course=3;
	switch(index) {
	case 1:
		System.out.println("Software Testing package");
		break;
	case 2:
		switch(course) {
		case 1:
			System.out.println("Core Java");
			break;
		case 2:
			System.out.println("SQL");
			break;
		case 3:
			System.out.println("J2EE");
			break;
		}
	}

}
}
