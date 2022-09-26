public class Solution {
	
    public static void main(String[] args) {
        int i = 4;
        double d = 4.0;
        String s = "HackerRank ";
		
        Scanner scan = new Scanner(System.in);

        /* Declare second integer, double, and String variables. */
        int num;
        double frac;
        String str;
      
        /* Read and save an integer, double, and String to your variables.*/
        num = scan.nextInt();
        frac = scan.nextDouble();
        str= scan.next() + scan.nextLine();
      
        /* Print the sum of both integer variables on a new line. */
        System.out.println(i+num);
      /* Print the sum of the double variables on a new line. */
        System.out.println(d+frac);
       /* Concatenate and print the String variables on a new line; 
       the 's' variable above should be printed first. */
        System.out.println(s+str);
        scan.close();
    }
}
