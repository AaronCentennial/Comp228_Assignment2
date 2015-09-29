/**
 * Created by Aaron Fernandes
 */

import java.util.ArrayList;
import java.security.SecureRandom;

/*
	Question Class
		Stores the question
 */
class Question{
	private String _question;
	private String[] _answers;
	private int _correctAnswer;

	// question constructor
	Question(String question, String[] answers, int correctAnswer){
		this._question=question;
		this._answers=answers;
		this._correctAnswer=correctAnswer;
	}

	// getter for set question
	public String get_question(){return this._question;}

	// getter for answers
	public String[] get_answers(){return this._answers;}

	// getter for correct answers
	public int get_correctAnswer(){return this._correctAnswer;}
}

public class Test {
	private ArrayList<Question> _testQuestions;
	private String[] _rightAnswerMsgs;
	private String[] _wrongAnswerMsgs;
	private SecureRandom _sRandom;
	private String _name;
	private int _numCorrectAns;

	Test(String name){
		this._testQuestions=new ArrayList<Question>();
		this._rightAnswerMsgs=new String[]{"Excellent!","Good!", "Keep up the good work!", "Nice work!"};
		this._wrongAnswerMsgs=new String[]{"No. Please try again", "Wrong. Try once more", "Don't give up!", "No. Keep trying..."};
		this._sRandom=new SecureRandom();
		this._name=name;
		this._numCorrectAns=0;

		this._testQuestions.add(new Question("Class declaration uses what keyword?",
																					 new String[]{"program","class", "java", "int"},1 ));
		this._testQuestions.add(new Question("When using the Scanner class what does System.in mean?",
																					 new String[]{"Gets mouse input",
																													 "Gets trackpad input",
																													 "Gets USB files",
																													 "Gets Keyboard input"},3));
		this._testQuestions.add(new Question("The Default Initial Value for String Variables?",
																					 new String[]{"nil", "NaN","null", "0"},2));
		this._testQuestions.add(new Question("The correct way to format a float with two digits of precision?",
																					 new String[]{"%f.2","%.f2", "f2%","%.2f "},3));
		this._testQuestions.add(new Question("The correct way to use java's secure random is?",
																					 new String[]{"import java.security.SecureRandom;",
																													 "import java.util.Random;",
																													 "import java.security.Random",
																													 "import jabba.the.Hut;"},0));
	}

	// returns the number of correct question
	public double get_numCorrectAns(){return this._numCorrectAns;}
	public String get_name(){return this._name;}
	/*
		simulateQuestion
		return a question
	 */
	public Question simulateQuestion(){
		return this._testQuestions.remove(0);
	}


	public boolean checkAnswer(Question q, int ans){
		if (q.get_correctAnswer()==ans){
			this._numCorrectAns+=1;
			return true;
		}
		else {
			return false;
		}
	}

	public String simulateMessage(boolean goodMessage){
		if (goodMessage){return "\nCorrect! "+this._rightAnswerMsgs[this._sRandom.nextInt(4)];}
		else {return "\nSorry: "+this._wrongAnswerMsgs[this._sRandom.nextInt(4)];}
	}

}