package test1;
import java.util.Scanner;
public class Student {
    int id;
    int rollnum;
    int res;
    Scanner scn=new Scanner(System.in);
    public Student(int id, int rollnum,int res) {
        this.id = id;
        this.rollnum = rollnum;
        this.res=res;
    }
    public int getId() {
        return id;
    }
    public int getRollnum() {
        return rollnum;
    }
    
    int qnum=5;
    int correct=0;
    int incorrect=0;
    
    public int Questions() {
        int res=0;
        System.out.println("who was the first prime misnister of india");
        System.out.println("1_ Narendra Modi   2_Manmohan sing \n 3_Rajendra Prshad   4_Jawaharlal Nehru");
        int q1ans=scn.nextInt();
        //
        if (q1ans==4){
            
            res=res+4;
            correct++;
        }
        else{
            q1ans=0;
            incorrect++;
        }
        System.out.println("Color of Sky?");
        System.out.println("1_ Blue   2_Black \n 3_White  4_Sky Blue");
        int q2ans=scn.nextInt();
        //
        if (q2ans==4){
            res=res+4;
            correct++;
        }
        else{
            q2ans=0;
            incorrect++;
        }
        System.out.println("Number of Oceans in world ?");
        System.out.println("(1) 7  (2) 8 \n (3) 4   (4) 9");
        int q3ans=scn.nextInt();
        //
        if (q3ans==1){
            res=res+4;
            correct++;
        }
        else{
            q3ans=0;
            incorrect++;
        }
        System.out.println("Planets in solar system");
        System.out.println("(1)  7   (2)  8 \n (3)  9   (4)  10");
        int q4ans=scn.nextInt();
        //
        if (q4ans==2){
            res=res+4;
            correct++;
        }
        else{
            q4ans=0;
            incorrect++;
        }
        System.out.println("Who is the current PM of india");
        System.out.println("1_ Narendra Modi   2_Manmohan sing \n 3_Rajendra Prshad   4_Jawaharlal Nehru");
        int q5ans=scn.nextInt();
        //
        if (q5ans==1){
            res=res+4;
            correct++;
        }
        else{
            q5ans=0;
            incorrect++;
        }

   // System.out.println("You reecived "+res+" marks"); 
    //System.out.println("Correct answers is = "+correct);  
    //System.out.println("incorrect answers is = "+incorrect);
    return res;
    }
}
