package lambda;

import java.time.LocalDate;
import java.time.Month;

public class Local {
public static void main(String[] args) {
	LocalDate date =LocalDate.of(2018,Month.APRIL,40);
	System.out.println(date.getYear()+""+date.getMonth()+""+date.getDayOfMonth());
	/*int b=4;
	b--;
	System.out.println(--b);
	System.out.println(b);
}*/
}
}
