
package university;

 import java.util.Scanner;
public class Student {
    String  Name;
    int id;
    int Semester;
    double CGPA;
    int FeesPaid;
    int InitialFeesTotal;
    int Fees;
    int PayedFees;
    int Due;
    public Student(String N,int m,int v,double o,int p,int q,int r){
    Name=N;
    id=m;
    Semester=v;
    CGPA=o;
    FeesPaid=p;
    InitialFeesTotal=q;
    Fees=r;
     }
    void input(){
        System.out.println("<>Include.. <>");
        Scanner s=new Scanner(System.in);
        System.out.println("Enter Student Name :");
        Name=s.nextLine();
        System.out.println("Enter Student ID :");
        id=s.nextInt();
        System.out.println("Enter Student Semester No :");
        Semester=s.nextInt();
        System.out.println("Enter Student CGPA :");
        CGPA=s.nextDouble();
        System.out.println("Enter Student InitialFeesPaid $:");
        FeesPaid=s.nextInt();
        System.out.println("Enter  FeesTotal $:");
        InitialFeesTotal=s.nextInt();
        System.out.println("Enter Fees $:");
        Fees=s.nextInt();
    }
    void show(){
        System.out.println("  <>Result Show..<>  :");
        
        
        System.out.println("Name :"+Name+"\n ID :"+id+"\n CGPA :"+CGPA); //+"\n InitialFeesPaid :"+FeesPaid+"\n FeesTotal $:"+InitialFeesTotal
        System.out.println("Fees $:"+Fees);
        System.out.println("Total Credit  :157");
        System.out.println("Total Course Year :4 Year");
    }
    public void setsemester(){
        if(Semester==0){
            System.out.println("Error or No credit Completed");
        }
        else if(Semester==1){
            System.out.println("Credit Completed : 13");
        }
        else if(Semester==2){
             System.out.println("Credit Completed : 26");
        }
        else if(Semester==3){
             System.out.println("Credit Completed : 39");
        }
        else if(Semester==4){
             System.out.println("Credit Completed : 52");
        }
        else if(Semester==5){
             System.out.println("Credit Completed : 65");
        }
        else if(Semester==6){
             System.out.println("Credit Completed : 78");
        }
        else if(Semester==7){
             System.out.println("Credit Completed : 91");
        }
        else if(Semester==8){
             System.out.println("Credit Completed : 104");
        }
        else if(Semester==9){
             System.out.println("Credit Completed : 117");
        }
        else if(Semester==10){
             System.out.println("Credit Completed : 130");
        }
        else if(Semester==11){
             System.out.println("Credit Completed : 143");
        }
        else if(Semester==12){
             System.out.println("Total Credit Completed");
        }
        else{
            System.out.println("Error");
        }
        
    }
    public void setgrade(){
       if(CGPA<=2.22){
            System.out.println("Student must be Dropped");
        }
       else if(CGPA<=3.59){
           System.out.println("No Waiver");
       }
      
        else if(CGPA<=3.99){
            System.out.println("40% Waiver");
        }
        else if(CGPA>=4.00){
            System.out.println("60% Waiver");
        }
        
    }
    public void graderesult(){
      if(CGPA<=1.00){
            System.out.println("GetMarks :10-20");
        }
         else if(CGPA<=1.50){
            System.out.println("GetMarks :21-33");
        }
         else if(CGPA<=2.00){
             System.out.println("GetMarks :33-40");
         }
         else if(CGPA<=2.50){
             System.out.println("GetMarks :40-45");
         }
         else if(CGPA<=3.00){
             System.out.println("GetMarks :46-60");
         }
         else if(CGPA<=3.50){
             System.out.println("GetMarks :60-69");
         }
         else if(CGPA<3.99){
             System.out.println("GetMarks :69-85");
         }
         else if(CGPA>=4.00){
             System.out.println("GetMarks :86-93");
         }
         
    }
   public void updateFeesTotal(){
       PayedFees=FeesPaid+Fees;
       Due=InitialFeesTotal-PayedFees;
       System.out.println("FeesTotal :"+PayedFees);
       System.out.println("University Money Take From the Student :"+PayedFees);
       System.out.println("Due Money :"+Due);
       
       
                                                           //Money Earned by The University.
   }
  
}

class test1{
      String Name;
    String NAME;
    String name;
    int ID;
    int iD;
    int Id;
    public test1(String x,String y,String z, int id,int j,int k){
        Name=x;
        NAME=y;
        name=z;
        ID=id;
        iD=j;
        Id=k;
    }  
}
