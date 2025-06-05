class Conditionals_and_ifStatements {
    public static void main(String[] args) {
        int i = 10;
        if (i < 20) {
            System.out.println("i is less than 20");
        }
        //Exercises
        //Ex 1
        int a = 10; int b = 20; int c = 10; int d = 5;
        if(a+b>c+d) {
            System.out.println("In the given numbers, a+b is greater than c+d!");
        }
        //Ex 2
        int angle1 = 50; int angle2 = 50; int angle3 = 80;

        if(angle1 + angle2 + angle3 == 180) {
            System.out.println("The given figure is a triangle!");
        }
        //Ex 3
        int number = 30;
        if(number%2 == 0) {
            System.out.println("The given integer is Even.");
        }
        //Multiplication table for 5

        for(i = 1; i <= 10; i++) {
            System.out.printf("%d * %d = %d", 5,i, 5*i);
        }
    }
}