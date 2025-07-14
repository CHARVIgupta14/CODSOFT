import java.util.Scanner;
public class Task2_student_grade_calculator {
    public static void main(String[] args) {
        float a=0;
        System.out.println("enter the total number of subjects");
        Scanner S= new Scanner(System.in);
        int sub=S.nextInt();
        float marks[]=new float[sub];
        for(int i=0;i<sub;i++){
            System.out.println("enter marks for subject "+(i+1)+" \n");
          marks[i]=S.nextFloat(); 
          a+=marks[i]; 
        }
        float avg_percentage= a/sub ;
            System.out.println(" Average percentage is " +avg_percentage+"%");
        if (100>=avg_percentage && avg_percentage>=90) {
            System.out.println("you got Grade A!");
        }  else if (90>avg_percentage && avg_percentage>=80){
            System.out.println("you got Grade B!");
        }else if (80>avg_percentage && avg_percentage>=70){
            System.out.println("you got Grade C!");
        }else if (70>avg_percentage && avg_percentage>=60){
            System.out.println("you got Grade D!");
        }else if (60>avg_percentage && avg_percentage>=50){
            System.out.println("you got Grade E!");
        }else{
            System.out.println("Fail!");
        }

    }
}
