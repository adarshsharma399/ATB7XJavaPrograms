package ex_13072024;

public class Lab009 {
    public static void main(String[] args) {
        //Operators

        int age = 44;

        // = Assignment Operator - Assign the literal to ref of data type
        int a = 10;  //a is operand, = is operator
        int b = 23;

        //Arithmetic Operator +,-,/,*, %
        System.out.println(a+b);

        //Unary Operator: applies to only one operand
        int age2 = 65; //unary plus
        int lambo = -1;  //unary minus

        System.out.println(age2);
        System.out.println(lambo);
        System.out.println(lambo+2);

        //Binary Operator- two operands are required
        int x = 10;
        int y = 23;

        int sum = x+y;

        System.out.printf("sum2numbers is %d", sum);

        // a,b -> operand

        //Ternary Operator - 3 operands are required




        //Arithmetic Operator +,-,/,*
        //



        //Compound Assignment Operators
        int p = 10;
        //+=, -=, *=, %=
        int s1 = p+=10; //a = a+10

        int p1 = 10;
        int s2 = p1-=10; //a = a-10

        int p2 = 10;
        int s3 = p2/=10; //a = a/10

        int p3 = 10;
        int s4 = p3*=10; //a = a*10

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        System.out.println(s4);


        //Relational Operator > boolean
        // >, <, >=, <=, ==, !=, ( ! = )

        int age_Adarsh = 25;
        int age_Amit = 35;

        boolean result_age = age_Adarsh > age_Amit;
        System.out.println("Result_age:"+result_age);

        System.out.println(10 == 10);  // to compare
        System.out.println(10 >= 10);
        System.out.println(10 <= 10);
        System.out.println(10 > 10);
        System.out.println(10 < 10);

        boolean b1 = true;
        System.out.println(!b1);
        System.out.println(!(10>20)); //lab 46

        //Logical Operators
        // !, ||, &&

        // || - OR

        System.out.println(true || false);


        int e= 12;
        boolean f = !(e>10 || e< 5);
        System.out.println(f);

        //Below operators will be discussed in future class
        // new Operator
        //instanceOf Operator
        //Bitwise - Not imp for automation (~, >>, <<, ^)



    }

}
