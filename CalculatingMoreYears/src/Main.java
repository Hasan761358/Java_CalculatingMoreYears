import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int year;

        System.out.print("Enter Year : ");
        year=sc.nextInt();
        if(year%100==0){
            if(year%400==0){
                System.out.println(year+ " is a more year.");

            }else{
                System.out.println(year+" is not a more year.");
            }
        }else if (year%4==0){
            System.out.println(year+ " is a more year.");
        }else {
            System.out.println(year +"is a more year.");
        }
    }
}