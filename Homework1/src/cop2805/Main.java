package cop2805;

import java.util.Scanner;

public class Main {

static void computeIncome( double salesAmount) {

int bonus = 1000;

double bonus1 = 0, bonus2 = 0;

while (bonus <= salesAmount) {

if (bonus <= 5000) {

System. out .println("$" + bonus + ":" + (bonus * .08 + 5000));

bonus1 = (bonus * .08);

} else if (bonus > 5000 && bonus <= 10000) {

System. out .println("$" + bonus + ":" + (bonus1 + (bonus - 5000) * .10 + 5000));

bonus2 = (bonus - 5000) * .10;

} else if (bonus > 10000) {

System. out .println("$" + bonus + ":" + (bonus1 + bonus2 + (bonus - 10000) * .12 + 5000));

}

bonus += 1000;

}

}

public static void main(String args[]) {

Scanner in = new Scanner(System. in );

System. out .println("Enter Sale Amount");

double salesAmount = Double. parseDouble (in.nextLine());

computeIncome (salesAmount);

}

}