import java.awt.Color;
import java.awt.GridLayout;
import java.awt.Insets;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextPane;
import javax.swing.border.*;

import javax.swing.text.AttributeSet;
import javax.swing.text.DefaultCaret;
import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.StyleConstants;
import javax.swing.text.StyleContext;


import java.awt.Component;
import java.awt.Font;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JOptionPane;
import javax.swing.JTextField;


public class Jframe extends JFrame{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTextPane console_Like;
	private JTextField text;
	private int CurrentAnswer;
	private String[] AnswersArray;
	private String[] multiAnswersArray;
	private Label totalQuestionsAsked;
	private Label questionsAnswered;
	private Label correctAnswers;
	private Label percentageLabel;
	private int questionsAnseredInt;
	private int correctAnswersInt;
	private double Percentage;
	private boolean questionAnsweredCorrectly;
	private boolean questionAnswered;
	private boolean multiChoiceAnswered;
	private Label timerLabel;
	private int n;
	private int timerCount;
	private boolean stopTimer;
	private Font QuestionFont;
	private Font answersFont;
	public Jframe()
	{

		Chapter_1_Questions quesArray = new Chapter_1_Questions();

		String[][] questionsArray = quesArray.Questions();
		AnswersArray  = quesArray.Answers();
		String[] multiAnswersArray = quesArray.MultiAnswers();

		setLayout(new GridLayout(2,1));
		Percentage = 0;
		questionsAnseredInt = 0;
		correctAnswersInt = 0;
		questionAnsweredCorrectly = false;
		questionAnswered = false;
		multiChoiceAnswered = false;
		
		text = new JTextField();
		QuestionFont = new Font("sansserif",Font.BOLD, 12);
		answersFont = text.getFont();
		
		JButton train_specific_model = new JButton("SUBMIT ANSWER");
		
		SubmitButton listener = new SubmitButton(text);
		text.addActionListener(listener);
		train_specific_model.addKeyListener(listener);
		train_specific_model.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            	AnswerControl();
            }
        });
		console_Like = new JTextPane();
		DefaultCaret caret = (DefaultCaret)console_Like.getCaret();
		caret.setUpdatePolicy(DefaultCaret.ALWAYS_UPDATE);
		EmptyBorder eb = new EmptyBorder(new Insets(10, 10, 10, 10));
		console_Like.setBorder(eb);
	        //tPane.setBorder(BorderFactory.createLineBorder(Color.DARK_GRAY));
		console_Like.setMargin(new Insets(5, 5, 5, 5));
		JScrollPane jsp = new JScrollPane(console_Like);

		JComboBox models = new JComboBox();
		
		
		JPanel menu_Panel = new JPanel();
		menu_Panel.setLayout(new GridLayout(4,1));
		
		JPanel scoreBoardPanel = new JPanel();
		scoreBoardPanel.setLayout(new GridLayout(2,3));
		timerLabel = new Label();
		totalQuestionsAsked = new Label();
		questionsAnswered = new Label();
		correctAnswers = new Label();
		percentageLabel = new Label();
		scoreBoardPanel.add(timerLabel);
		scoreBoardPanel.add(totalQuestionsAsked);
		scoreBoardPanel.add(questionsAnswered);
		scoreBoardPanel.add(correctAnswers);
		scoreBoardPanel.add(percentageLabel);

		menu_Panel.add(scoreBoardPanel);
		menu_Panel.add(models);
		menu_Panel.add(text);
		menu_Panel.add(train_specific_model);

		//JPanel imgPanel = new JPanel();
		Display_Image_Panel imgPanel = new Display_Image_Panel();

		imgPanel.setBackground(Color.BLACK);
		JPanel quePanel = new JPanel();
		quePanel.setLayout(new GridLayout(1,2));
		quePanel.add(jsp);
		quePanel.add(imgPanel);
		
		add(quePanel);
		add(menu_Panel);
		

        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
            		try 
            		{
            			int totalQuestions = 0;
            			int LinearIndex = 43;
            			while(true)
            			{
            				try
            				{
            					questionAnsweredCorrectly = false;
            					questionAnswered = false;
            					multiChoiceAnswered = false;
                				Random rand = new Random();
                				//n = rand.nextInt(11);			//Random
                				n = LinearIndex; 				//Linear
                				if(LinearIndex == 46)
                				{
                					LinearIndex = 43;
                				}
                				else
                				{
                					LinearIndex++;
                				}
                				
                				String[] answer = AnswersArray[n].split(",");
                				if(answer.length == 2)
                				{
                    				appendToPane(console_Like, questionsArray[n][0] + "\n\n", Color.red,QuestionFont);
                					String[] answerTokens = multiAnswersArray[Integer.parseInt(answer[0])].split("~");
                					
                       				appendToPane(console_Like, " a. " + answerTokens[0] + "\n", Color.cyan,QuestionFont);
                       				appendToPane(console_Like, " b. " + answerTokens[1] + "\n", Color.cyan,QuestionFont);
                       				appendToPane(console_Like, " c. " + answerTokens[2] + "\n", Color.cyan,QuestionFont);
                       				appendToPane(console_Like, " d. " + answerTokens[3] + "\n\n", Color.cyan,QuestionFont);
                       				if(!questionsArray[n][3].equals("NO"))
                       				{
                       					imgPanel.setImage("data/images/"+questionsArray[n][3]);
                       				}                       				
                       				else
                       				{
                       					imgPanel.setImage("data/images/NO.PNG");
                       				}
                       				
                				}
                				else
                				{
                    				appendToPane(console_Like, questionsArray[n][0] + "\n\n", Color.red,QuestionFont);
                       				if(!questionsArray[n][3].equals("NO"))
                       				{
                       					imgPanel.setImage("data/images/"+questionsArray[n][3]);
                       				}                       				
                       				else
                       				{
                       					imgPanel.setImage("data/images/NO.PNG");
                       				}
                				}

                				CurrentAnswer = Integer.parseInt(questionsArray[n][1]);
                				totalQuestions++;
                				totalQuestionsAsked.setText("Total Questions asked: " + String.valueOf(totalQuestions-1));
                				correctAnswers.setText("Correct Answeres: " + String.valueOf(correctAnswersInt));
                				questionsAnswered.setText("Questions Answered: " + String.valueOf(questionsAnseredInt));
                				
                				Percentage = Math.round(((double)correctAnswersInt/(double)(totalQuestions-1)) * 100);
                				percentageLabel.setText("Grade: " + String.valueOf(Percentage) + "%");

                				timerCount = 0;
                				stopTimer = false;
	      				        Thread timerThread = new Thread(new Runnable() {
	      				            @Override
	      				            public void run() {
	      				                try {
	      				            		try 
	      				            		{
	      				            			int timeLeft = Integer.parseInt(questionsArray[n][2])/1000;
	      				            			while(true)
	      				            			{
		      		      						  timerLabel.setText("Time Remaining(s):  " + String.valueOf(timeLeft-timerCount));
		      		      						  timerCount++;
		      		      						  Thread.sleep(1000);
	      				            			}

	      				            		} catch (Exception e) {
	      				            			// TODO Auto-generated catch block
	      				            			//e.printStackTrace();
	      				            		}
	      				                }
	      				                catch (Exception ex)
	      				                {
	      				                }
	      				            }
	      				        });
	      				        timerThread.start();
                				Thread.sleep(Integer.parseInt(questionsArray[n][2]));
                				//stopTimer = true;
                				timerCount = 0;
                				timerThread.interrupt();;
                				if(answer.length == 2)
                				{
                					String choice = "";
                					if(answer[1].equals("1"))
                					{
                						choice = "a";
                					}
                					else if(answer[1].equals("2"))
                					{
                						choice = "b";
                					}
                					else if(answer[1].equals("3"))
                					{
                						choice = "c";
                					}
                					else if(answer[1].equals("4"))
                					{
                						choice = "d";
                					}
                					appendToPane(console_Like, "Answer:  "+choice + "\n\n", Color.GREEN,answersFont);
                				}
                				else
                				{
                					appendToPane(console_Like, "Answer:  "+ AnswersArray[n] + "\n\n", Color.GREEN,answersFont);
                				}
        

            				}
            				catch(Exception e)
            				{
            					//e.printStackTrace();
            				}
            			}

            		} catch (Exception e) {
            			// TODO Auto-generated catch block
            			//e.printStackTrace();
            		}
                }
                catch (Exception ex)
                {
                }
            }
        });
        thread.start();

	}
	  private void appendToPane(JTextPane tp, String msg, Color c,Font font)
	    {
		  
		  	//tp.setFont(font);
		  	tp.setEditable(true);
		  	
		  	tp.setBackground(Color.black);
	        StyleContext sc = StyleContext.getDefaultStyleContext();
	        AttributeSet aset = sc.addAttribute(SimpleAttributeSet.EMPTY, StyleConstants.Foreground, c);

	        aset = sc.addAttribute(aset, StyleConstants.FontFamily, "Lucida Console");
	        aset = sc.addAttribute(aset, StyleConstants.Alignment, StyleConstants.ALIGN_JUSTIFIED);

	        int len = tp.getDocument().getLength();
	        tp.setCaretPosition(len);
	        tp.setCharacterAttributes(aset, false);
	        tp.replaceSelection(msg);

	        tp.setEditable(false);
	    }

	  public void AnswerControl()
	  {
		 	if(questionAnsweredCorrectly == false && multiChoiceAnswered == false)
          	{
          		if(questionAnswered == false)
          		{
          			questionsAnseredInt++;
          		}
				String[] answer = AnswersArray[n].split(",");
				if(answer.length == 2)
				{
					String choice = "";
					if(answer[1].equals("1"))
					{
						choice = "a";
					}
					else if(answer[1].equals("2"))
					{
						choice = "b";
					}
					else if(answer[1].equals("3"))
					{
						choice = "c";
					}
					else if(answer[1].equals("4"))
					{
						choice = "d";
					}
       				if(text.getText().replaceAll(" ", "").equals(choice))
       				{
       					appendToPane(console_Like,"Correct! \n\n", Color.yellow,answersFont);
          				correctAnswersInt += 1;;
          				questionAnsweredCorrectly = true;
       				}
       				else
       				{
       					appendToPane(console_Like,"Wrong!" + "\n\n", Color.gray,answersFont);
       				}
       				multiChoiceAnswered = true;
				}
				else
				{
                  	if(text.getText().replaceAll(" ", "").equals(AnswersArray[CurrentAnswer].replaceAll(" ", "")))
                  	{
          				appendToPane(console_Like,"Correct! \n\n", Color.yellow,answersFont);
          				
          				correctAnswersInt += 1;;
          				questionAnsweredCorrectly = true;
                  	}
                  	else
                  	{
          				appendToPane(console_Like,text.getText(), Color.gray,answersFont);
          				appendToPane(console_Like," - " + "Wrong!" + "\n\n", Color.gray,answersFont);
                  	}
				}

          	}
          	text.setText("");
          	questionAnswered = true;

	  }


	  public class SubmitButton implements ActionListener, KeyListener {

	      JTextField nameInput;


	      public SubmitButton(JTextField textfield){
	          nameInput = textfield;
	      }

	      @Override
	      public void actionPerformed(ActionEvent submitClicked) {
	    	  AnswerControl();

	      }

	      @Override
	      public void keyPressed(KeyEvent e) {
	          if (e.getKeyCode()==KeyEvent.VK_ENTER){
	              System.out.println("Hello");
	          }
	          Component frame = new JFrame();
	          JOptionPane.showMessageDialog(frame , "You've Submitted the name " + nameInput.getText());

	      }

	      @Override
	      public void keyReleased(KeyEvent arg0) {
	          // TODO Auto-generated method stub

	      }

	      @Override
	      public void keyTyped(KeyEvent arg0) {

	      }
	  }
}
