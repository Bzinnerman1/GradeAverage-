import java.util.Scanner;
/**
*class to calculate grade average and letter grade
*@author
*@version
*
*/

public class GradeAverage {
   public static void main(String[] args){
  
  //weight age
  final double Test_weight=.4;
  final double mid_weight=.25;
  final double final_weight=.35;
  // scanner tool
   Scanner sc=new Scanner(System.in);
   
  
  //input test scores
  System.out.print("Enter Test score #1:");
  double test1=sc.nextDouble();
  System.out.print("Enter Test score #2:");
  double test2=sc.nextDouble();
  System.out.print("Enter Test score #3:");
  double test3=sc.nextDouble();
  
  //Test average 
  double testavg=(test1+test2+test3)/3;
  
  //Mid score 
  System.out.print("Enter Mid score:");
  double mid=sc.nextDouble();
  
  //final score
  System.out.print("Enter Final score:");
  double finalE=sc.nextDouble();
  
  //Grade average
  double 
  gradeAvg=testAvg*TEST_WEIGHT+*MID_WEIGHT+*FINAL_WEIGHT;
  
  // Letter Grade
  char letterGrade=' ';
  if(gradeAvg>=90){
    letterGrade='A';
   }
   else if(gradeAvg>=80){
    letterGrade='B';
   }
   else if(gradeAvg>=70){
    letterGrade='C';
   }
   else if(gradeAvg>=60){
    letterGrade='D';
   }
   else{
    letterGrade='F';
   }
   //Results Calculated
   System.out.printf("\nGrade Average:%.2f\n",gradeAvg);
   System.out.printf("Letter Grade:%c\n",letterGrade);
   //Pass/Fail details
   if(letterGrade>'A'&& letterGrade<='C'){
    System.out.printf("Great job.You met the prerequisite for the next course.\n");
    }
    else {
      System.out.printf("I'm sorry. You will have to repeat the course before advancing.\n");
      }
   }
  }

  

  
    
  