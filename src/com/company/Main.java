package com.company;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Main {


    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //circle(br);
        //personalInf(br);
        //conversation(br);
        //brick(br);
        number(br);
    }

    public static void circle (BufferedReader br) throws IOException {
        System.out.println("1");
        System.out.println("Enter radius, please: ");
        double radius = Double.parseDouble(br.readLine());
        double area = Math.PI * radius * radius;
        System.out.println("Area: " + area);
        double circumference = Math.PI * 2 * radius;
        System.out.println("Circumference: " + circumference);
    }

    public static void personalInf(BufferedReader br) throws IOException {
        System.out.println("2");
        System.out.println("Enter your name, please: ");
        String  name = br.readLine();
        System.out.println( name + ", what is your address? ");
        String  address = br.readLine();
        System.out.println( "You are " + name + " and your address is " + address );
    }

    public static void conversation(BufferedReader br) throws IOException {
        System.out.println("3");
        ArrayList<Double> c = new ArrayList<Double>();
        ArrayList<Double> t = new ArrayList<Double>();
        ArrayList<Double> res = new ArrayList<Double>();
        for (int i = 0; i < 3; i++) {
            System.out.println("enter c" + i);
            double  cc = Double.parseDouble(br.readLine());
            c.add(cc);
            System.out.println("enter t" + i);
            double  tt = Double.parseDouble(br.readLine());
            t.add(tt);
            //System.out.println(c);
        }

        double sum = 0;
        for (int i = 0; i < 3; i++) {
            double temp = c.get(i) * t.get(i);
            res.add(temp);
            sum += res.get(i);
        }

        System.out.println(res);
        System.out.println(sum);
    }


    public static void brick(BufferedReader br) throws IOException {
        System.out.println("4");
        System.out.println("Enter a, please: ");
        double a = Double.parseDouble(br.readLine());
        System.out.println("Enter b, please: ");
        double b = Double.parseDouble(br.readLine());
        System.out.println("Enter c, please: ");
        double c = Double.parseDouble(br.readLine());
        System.out.println("Enter x, please: ");
        double x = Double.parseDouble(br.readLine());
        System.out.println("Enter y, please: ");
        double y = Double.parseDouble(br.readLine());
        ArrayList<Double> brick = new ArrayList<Double>();
        brick.add(a);
        brick.add(b);
        brick.add(c);
        Collections.sort(brick);
        int i = 0;
        if ((brick.get(i) < x && brick.get(i+1) < y ) ||(brick.get(i) < y && brick.get(i+1) < x ) ){
            System.out.println("The brick is good for it");
        }
        else {
            System.out.println("The brick is bad for it");
        }
    }


    public static void number(BufferedReader br) throws IOException {
        System.out.println("5");
        System.out.println("Enter n, please: ");
        int n = Integer.parseInt(br.readLine());
        System.out.println("Enter what do you want to do, please: ");
        System.out.println(" 1. check the availability of '3' ");
        System.out.println(" 2. add '1' on the beginning and the end of the number");
        System.out.println(" 3. reverse number");
        int choice = Integer.parseInt(br.readLine());

        ArrayList<Integer> nums = new ArrayList<>();
        ArrayList<Integer> nums_revers = new ArrayList<>();



        switch(choice) {
            case 1:
                n = n * n;
                System.out.println("n = " + n);
                while (n != 0) {
                    nums.add(n % 10);
                    n /= 10;
                }
                boolean consistsThree = false;
                for ( Integer num : nums) {
                    if (num == 3){
                        System.out.println("1. consists 3");
                        consistsThree = true;
                    }
                }
                if (consistsThree == false){
                    System.out.println("1. does not consist 3");
                }
                break;
            case 2:
                int n1 = n ;
                while (n != 0) {
                    nums.add(n % 10);
                    n /= 10;
                }
                int amountOfZeros= nums.size();
                int newN = (int) (Math.pow(10, (amountOfZeros + 1 )) + n1*10 +1);
                System.out.println("2. " + newN );
                break;
            case 3:
                int reversed = 0;
                while(n != 0) {
                    int digit = n % 10;
                    reversed = reversed * 10 + digit;
                    n /= 10;
                }

                System.out.println("3. reversed number: " + reversed);
                break;
            default:
                System.out.println("you entered the wrong value ");
        }

    }
}



