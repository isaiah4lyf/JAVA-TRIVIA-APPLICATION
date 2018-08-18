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
import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.StyleConstants;
import javax.swing.text.StyleContext;


import java.awt.Component;

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
	public Jframe()
	{
		String[][] questionsArray = new String[9][3];
		questionsArray[0][0] = "What is an operating system?";
		questionsArray[0][1] = "0";
		questionsArray[0][2] = "10000";  //Sleep Time
		
		questionsArray[1][0] = "What are the main components of a modern computer?";
		questionsArray[1][1] = "1";
		questionsArray[1][2] = "10000";  //Sleep Time
		
		questionsArray[2][0] = "One of modern computer's main components: \n "
							+ "1. One or more processors \n -> Management through _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ management, and the management of processes on the machine.";
		questionsArray[2][1] = "2";
		questionsArray[2][2] = "11000";  //Sleep Time
		
		questionsArray[3][0] = "One of modern computer's main components: \n "
							+ "2. Main _ _ _ _ _ _ \n -> Allocation of _ _ _ _ _ _ that is assigned to processes, Adress spaces and Virtual _ _ _ _ _ _";
		questionsArray[3][1] = "3";
		questionsArray[3][2] = "10000";  //Sleep Time
		
		questionsArray[4][0] = "One of modern computer's main components: \n "
							+ "3. _ _ _ _ _ \n -> Files systems, allocation of blocks to files.";
		questionsArray[4][1] = "4";
		questionsArray[4][2] = "10000";  //Sleep Time
		
		questionsArray[5][0] = "One of modern computer's main components: \n "
							+ "4. Various _ _   _ _ _ _ _ _ _  \n -> The interaction between the OS and the hardware, interrupts, etc.";
		questionsArray[5][1] = "5";
		questionsArray[5][2] = "10000";  //Sleep Time
		
		questionsArray[6][0] = "What are the main components of a modern computer? \n"
							+ "1. _ _ _ _ _ _ _ _ _ _  \n"
							+ "2. _ _ _ _ - _ _ _ _ _ _  \n"
							+ "3. _ _ _ _ _  \n"
							+ "4. _ _ - _ _ _ _ _ _ _  \n";
		questionsArray[6][1] = "6";
		questionsArray[6][2] = "30000";  //Sleep Time
		
		questionsArray[7][0] = "The operating acts as _ _ _ _ _ _ _ _ - _ _ _ _ _ _ _ and _ _ _ _ _ _ _ _ - _ _ _ _ _ _ _ ";
		questionsArray[7][1] = "7";
		questionsArray[7][2] = "15000";  //Sleep Time
		
		questionsArray[8][0] = "The operating system as an extended machine: Th OS fits in _ _ _ _ _ _   _ _ _ _";
		questionsArray[8][1] = "8";
		questionsArray[8][2] = "10000";  //Sleep Time
		
		AnswersArray = new String[9];
		AnswersArray[0] = "0,3";
		AnswersArray[1] = "1,4";
		AnswersArray[2] = "multiprocessor";
		AnswersArray[3] = "memory";
		AnswersArray[4] = "disks";
		AnswersArray[5] = "io devices";
		AnswersArray[6] = "processors main-memory disks io-devices";
		AnswersArray[7] = "extended-machine resource-manager";
		AnswersArray[8] = "kernel mode";
		
		String[] multiAnswersArray = new String[3];
		multiAnswersArray[0] = " The operating system is the software component responsible for managing all components \n      of a computer and to provide user files with a better, simpler and cleaner model of the computer.\n"
							+  "~  The operating system is the software component responsible for managing all components \n      of a computer and to provide user programs with a better, simpler and cleaner model of the computer.\n"
							+  "~ The operating system is the software layer responsible for managing all components \n      of a computer and to provide user programs with a better, simpler and cleaner model of the computer.\n "
							+  "~ The operating system is the software component responsible for managing all components \n      of a computer and to provide user programs with a better, simpler and cleaner model of the computer.";
		multiAnswersArray[1] = " One or more processors, Capacitors, Disks and Various IO Devices.\n"
							+  "~ Disk, Main memory, Disks and Capacitors.\n"
							+  "~ One or more processors, hardware, Disks and Various IO Devices.\n"
							+  "~ Various IO Devices, Main Memory, Disks and One or more processors.";
		multiAnswersArray[2] = " answerk 1~ answerk 2~ answerk 3~ answerk 4";
		
		setLayout(new GridLayout(2,1));
		Percentage = 0;
		questionsAnseredInt = 0;
		correctAnswersInt = 0;
		questionAnsweredCorrectly = false;
		questionAnswered = false;
		multiChoiceAnswered = false;
		
		JButton train_specific_model = new JButton("SUBMIT ANSWER");
		text = new JTextField();
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

		add(jsp);
		add(menu_Panel);
		

        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
            		try 
            		{
            			int totalQuestions = 0;
            			while(true)
            			{
            				try
            				{
            					questionAnsweredCorrectly = false;
            					questionAnswered = false;
            					multiChoiceAnswered = false;
                				Random rand = new Random();
                				n = rand.nextInt(9);
                				//n = 8;
                				String[] answer = AnswersArray[n].split(",");
                				if(answer.length == 2)
                				{
                    				appendToPane(console_Like, questionsArray[n][0] + "\n\n", Color.red);
                					String[] answerTokens = multiAnswersArray[Integer.parseInt(answer[0])].split("~");
                					
                       				appendToPane(console_Like, " a. " + answerTokens[0] + "\n", Color.cyan);
                       				appendToPane(console_Like, " b. " + answerTokens[1] + "\n", Color.cyan);
                       				appendToPane(console_Like, " c. " + answerTokens[2] + "\n", Color.cyan);
                       				appendToPane(console_Like, " d. " + answerTokens[3] + "\n\n", Color.cyan);
                				}
                				else
                				{
                    				appendToPane(console_Like, questionsArray[n][0] + "\n\n", Color.red);
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
                					appendToPane(console_Like, "Answer:  "+choice + "\n\n", Color.GREEN);
                				}
                				else
                				{
                					appendToPane(console_Like, "Answer:  "+ AnswersArray[n] + "\n\n", Color.GREEN);
                				}
        

            				}
            				catch(Exception e)
            				{
            					e.printStackTrace();
            				}
            			}

            		} catch (Exception e) {
            			// TODO Auto-generated catch block
            			e.printStackTrace();
            		}
                }
                catch (Exception ex)
                {
                }
            }
        });
        thread.start();

	}
	  private void appendToPane(JTextPane tp, String msg, Color c)
	    {
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
       					appendToPane(console_Like,"Correct! \n\n", Color.yellow);
          				correctAnswersInt += 1;;
          				questionAnsweredCorrectly = true;
       				}
       				else
       				{
       					appendToPane(console_Like,"Wrong!" + "\n\n", Color.gray);
       				}
       				multiChoiceAnswered = true;
				}
				else
				{
                  	if(text.getText().replaceAll(" ", "").equals(AnswersArray[CurrentAnswer].replaceAll(" ", "")))
                  	{
          				appendToPane(console_Like,"Correct! \n\n", Color.yellow);
          				
          				correctAnswersInt += 1;;
          				questionAnsweredCorrectly = true;
                  	}
                  	else
                  	{
          				appendToPane(console_Like,text.getText(), Color.gray);
          				appendToPane(console_Like," - " + "Wrong!" + "\n\n", Color.gray);
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
