package test1;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        
        int res1=0;
        int res2=0;
        Student std1 =new Student(1, 1001,res1);
        Student std2 =new Student(2, 1002,res2);
        res1=std1.Questions();
        res2=std2.Questions();

        int wstd=0;
        System.out.println("Which students result you wanted to see");
        wstd=scn.nextInt();
        if (wstd==1){
            System.out.println(res1);
        }
        else{
            System.out.println(res2);
        }
        


    }
    
}
