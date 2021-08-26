package generics;

public class MaximumCheck {

    public static Integer maxOfInteger(Integer a1, Integer a2, Integer a3) {
        Integer max = a1;
        if (a2.compareTo(max) > 0)
            max = a2;
        if (a3.compareTo(max) > 0)
            max = a3;
        return max;
    }


    public static Float maxOfFloat(Float f1, Float f2, Float f3) {
        Float max = f1;
        if (f2.compareTo(max) > 0)
            max = f2;
        if (f3.compareTo(max) > 0)
            max = f3;
        return max;
    }


    public static String maxOfString(String s1, String s2, String s3) {
        String max = s1;
        if (s2.compareTo(max) > 0)
            max = s2;
        if (s3.compareTo(max) > 0)
            max = s3;
        return max;
    }

    public static void main(String[] args) {
        System.out.println("Welcome to the program to find maximum value using generics");
        Integer a1 = 20, a2 = 8, a3 = 12;
        System.out.println("The Maximum between three integers is : " + maxOfInteger(a1, a2, a3));
        Float f1 = 1.5f, f2 = 8.2f, f3 = 6.4f;
        System.out.println("The Maximum between three float is : " + maxOfFloat(f1, f2, f3));
        String s1 = "abc", s2 = "pqr", s3 = "xyz";
        System.out.println("The Maximum between three float is : " + maxOfString(s1, s2, s3));
    }
}