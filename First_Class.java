class Main {
    public static void main(String[] args) {
        System.out.print("I am a programmer!");
        System.out.println("Hello World!");
        System.out.println("I love Java!");
        System.out.println(args[0]);
        System.out.println("Hello City!");
        System.out.println("Hello City!!!");
        System.out.println("Hello City!!!!!");
    }
}

//Data types
//Primitive data types
class data_types {
    public static void main(String[] args) {
        //Non-Numeric
        char c = '=';
        System.out.println(c);

        boolean bool = true;
        System.out.println(bool);

        //Numeric
        byte b = 2; //(range = -228 : 227  /8bits)
        System.out.println(b);

        short s = 5; //(range = -32768 : 32767  /16bits)
        System.out.println(s);

        int i = 10; //(range = -2,147,483,648 : 2,147,483,647  /32bits)
        System.out.println(i);

        long l = 20; //(range = -9,223,372,036,854,775,808 : 9,223,372,036,854,775,807  /64bits)
        System.out.println(l);

        long g = 3_000_000_000L;
        System.out.println(g);

        float f = 3.8F;  //(range = 1.40239846 x 10^-45 : 3.40239846 x 10^38  /32bits)
        System.out.println(f);

        double d = 2.7; //(range = 4.94065............ x 10^-324 : 1.79769............. x 10^308  /64bits)
        System.out.println(d);
    }
}

//Non-Primitive data types
class string {
    public static void main(String[] args) {
        String s = "I love java!";
        System.out.println(s);

        System.out.println(s.charAt(7));
        System.out.println(s.charAt(2));

        String s2 = """
                Harry potter and the philosopher's Stone
                Harry potter and the Chambers of secrets
                Harry potter and the prisoner of Azkaban
                Harry potter and the Goblet of fire
                Harry potter and the Order of phoenix
                Harry potter and the half Blood prince
                Harry potter and the Deathly hallows Part 1
                Harry potter and the Deathly hallows Part 2
                """;

        System.out.println(s2);
        /*
        This is a multiline comment example!
         */
    }
}

class First_Class {
    public static void main(String[] args) {
        //Simply Printing out strings and expressions.
        System.out.println("Hello World!");   //println to simply print the console in a new line(Use print to avoid the new line!)
        System.out.println("5 * 6 * 7");
        //Printing outputs to console
        System.out.println(5*6);
        //Printing outputs to console with formatting
        System.out.printf("%d + %d + %d = %d", 2,3,4,2+3+4).println(); //Formatting integer
        System.out.printf("Print %s", "Testing").println(); //Formatting String
        System.out.printf("%f, %f, %f", 3.5,4.5,5.6).println(); //Floating Point formatting
        System.out.printf("%f * %f = %f", 3.5,4.5, 3.5 * 4.5).println();
        //Random
        String a = "Testing";
        System.out.printf("Print %s", a).println();
        //Variable Declaration and Assignment
        int b = 20; int c = 80;
        System.out.println(Math.max(b,c));
        //If variable declared but not assigned, it will give out an error in a running program but in jshell
        // it will assign the declared variable a value of 0 as the current value!
        int declaredVariable; //(Example)
        //Rules to follow strictly during naming a variable
        //1. Can only consist of combination of letters, numbers, $ and Underscore(_)
        int naming_variable$ = 80;
        //2.Cannot start with a number, will give out an error!
        int 3test = 110;
        //3.Cannot be a keyword!
        int int = 424;
        //4. No limit on length of identifiers!(Rules 1-4 to be followed strictly!)
        int dihgirrgirgnkhirngoeirngoiergneirgei = 698;
        //5. CamelCase
        int noOfGoals = 30;//(Every first letter is lowercase and then every start's with an uppercase!)
        short no_Of_Goals;
        no_Of_Goals++;//Will increase the counter with +1
        long populationOfTheWorld;
        populationOfTheWorld++;
        double average = 0.0;//double is more accurate than float
        char gradesOfTheStudents = 'A';//char type to store single characters.
        gradesOfTheStudents = 'B';

        boolean isEven = false;
        isEven = true;
    }
}
