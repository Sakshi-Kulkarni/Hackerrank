

class Student extends Person{
	private int[] testScores;

    /*	
    *   Class Constructor
    *   
    *   @param firstName - A string denoting the Person's first name.
    *   @param lastName - A string denoting the Person's last name.
    *   @param id - An integer denoting the Person's ID number.
    *   @param scores - An array of integers denoting the Person's test scores.
    */
    // Write your constructor here

    //   Method Name: calculate
     Student(String firstName, String lastName, int id,int[]testScores){
         super(firstName,lastName,id);
         this.testScores=testScores;
    }
    char calculate(){
        int sum=0;
        char grade;
        for (int i = 0; i < testScores.length; i++) {
            sum+=testScores[i];
         }
         int avg=sum/testScores.length;
         if(avg<=100 && avg>=90){
              grade='O';
            }
          else if( avg<=90 && avg>=80){
                grade='E'; 
            }
           else if( avg<=80 && avg>=70){ 
               grade='A';
             }
           else if( avg<=70 && avg>=55){
                grade='P';
            }
            else if( avg<=55 && avg>=40) {
                grade='D';
            } 
            else{ 
                grade='T';
        }
          return grade;
        }

//  @return A character denoting the grade.
    //
    // Write your method here
}

