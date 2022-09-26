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
    String firstName, lastName;
     int idNumber;
     ArrayList<Integer> testScore = new ArrayList<Integer>();
    // Write your constructor here
    Student(String firstName, String lastName, int idNumber,int testScores[]){
        super(firstName, lastName, idNumber);
        this.firstName = firstName;
        this.lastName = lastName;
        this. idNumber = idNumber;
        this.testScores = testScores;
    }

    /*	
    *   Method Name: calculate
    *   @return A character denoting the grade.
    */
    // Write your method here
    char calculate(){
        char c;
        int sum=0;
        for(int i=0;i<testScores.length;i++){
            sum+=testScores[i];
        }
        float avg = sum/testScores.length;
        if(avg>=90 && avg<=100) c='O';
        else if(avg>=80 && avg<90) c='E';
        else if(avg>=70 && avg<80) c='A';
        else if(avg>=55 && avg<70) c='P';
        else if(avg>=40 && avg<55) c='D';
        else c='T';
        return c;
    }
}
