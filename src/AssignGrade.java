import java.util.Arrays;
import java.util.Scanner;

public class AssignGrade {
	public static void main(String[] args)
	{
		//create a program the get a students score and
		// base on the students score 
		//choose the best of the 4 score 
		//from the best score i assign the grade
		
		Scanner input = new Scanner(System.in);
		//makes an array of scores
		int[] score;
		//variable declare
		int sizeScores = input.nextInt();
		int i = 0;
		score = new int[sizeScores];
		
		
		
		//wanna keep asking for the scores
		
		while(i <= sizeScores)
		{
			//
			System.out.print("Give me a score: ");
			int enter = input.nextInt();
			score[i] = enter;
			i++;
		}
		input.close();
		
		System.out.print(Arrays.toString(score));
		
	}
}
