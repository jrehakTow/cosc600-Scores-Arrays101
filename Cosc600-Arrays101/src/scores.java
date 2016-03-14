/*COSC 600              Project 1
 * James Rehak          9-7-14
 * PROGRAM-NAME: Scores
 * Read in scores to an array, calculate average,
 * 
 * 
 * */

public class scores{
  
  public static void main(String[] args){
    //the variables
    int sum = 0;//for the sum
    int average =0; //for the average
    
    int[] the_scores = new int[10]; //create an array of 10 scores
    char[] the_OSUs = new char[10]; //array of O's, S's, and U's 
    
    //test scores
    the_scores[0] = 55;
    the_scores[1] = 98;
    the_scores[2] = 89;
    the_scores[3] = 62;
    the_scores[4] = 78;
    the_scores[5] = 69;
    the_scores[6] = 91;
    the_scores[7] = 83;
    the_scores[8] = 99;
    the_scores[9] = 52;
    
    //the meat
    for(int i=0; i<10; i++){ //sums and averages the score array
      
      sum = sum + the_scores[i];
      average = sum/(i+1);//finds the average, put in the loop for dif amounts of scores
    }
    
    //the grader
    for(int i=0; i<10; i++){
      if(the_scores[i] <= (average * 0.1 + average) && the_scores[i] >= (average - average * 0.1)){
        the_OSUs[i] = 'S';
      }
      else if(the_scores[i] > (average * 0.1 + average)){
        the_OSUs[i] = 'O';
      }
      else the_OSUs[i] = 'U';                 
    }//asigns grades to the_OSUs array
    
    
    //testing
    System.out.println("Average: " + average);
    for(int i=0; i<10; i++){
      System.out.println(the_scores[i] + " " + the_OSUs[i]);
    }
  }
}//end program