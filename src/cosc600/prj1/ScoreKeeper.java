/*COSC 600              Project 1
 * James Rehak          9-7-14
 * PROGRAM-NAME: Scores
 * Read in scores to an array, calculate average,
 * 
 * 
 * */

package cosc600.prj1;

public class ScoreKeeper{
	int sum = 0;
    int average = 0; 
    
    int[] scores = new int[10]; 
    char[] gradeAssignments = new char[10]; 

    public void averageScores(){
    	for(int i=0; i<scores.length; i++){ 
    		sum = sum + scores[i];
    		average = sum/(i+1);
    	}
    }

    public void assignGrade(){
    	for(int i=0; i<scores.length; i++){
    		if(scores[i] <= (average * 0.1 + average) && scores[i] >= (average - average * 0.1)){
    			gradeAssignments[i] = 'S';
    		}
    		else if(scores[i] > (average * 0.1 + average)){
    			gradeAssignments[i] = 'O';
    		}
    		else gradeAssignments[i] = 'U';                 
    	}
    }
    
    public void printAllScores(){
    	System.out.println("Average: " + average);
    	for(int i=0; i<scores.length; i++){
    		System.out.println(scores[i] + " " + gradeAssignments[i]);
    	}
    }
  
  public static void main(String[] args){
	  ScoreKeeper fallScores = new ScoreKeeper();
	  
	  fallScores.scores[0] = 55;
	  fallScores.scores[1] = 98;
	  fallScores.scores[2] = 89;
	  fallScores.scores[3] = 62;
	  fallScores.scores[4] = 78;
	  fallScores.scores[5] = 69;
	  fallScores.scores[6] = 91;
	  fallScores.scores[7] = 83;
	  fallScores.scores[8] = 99;
	  fallScores.scores[9] = 52;
	    
	  fallScores.averageScores();
	    
	  fallScores.assignGrade();
	    
	  fallScores.printAllScores();
    
  }
}
