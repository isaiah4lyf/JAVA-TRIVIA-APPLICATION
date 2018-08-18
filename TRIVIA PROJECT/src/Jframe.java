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
		String[][] questionsArray = new String[47][3];
		questionsArray[0][0] = "What is an operating system?";
		questionsArray[0][1] = "0";
		questionsArray[0][2] = "20000";  //Sleep Time
		
		questionsArray[1][0] = "What are the main components of a modern computer?";
		questionsArray[1][1] = "1";
		questionsArray[1][2] = "15000";  //Sleep Time
		
		questionsArray[2][0] = "One of modern computer's main components: \n "
							+ "1. One or more processors \n -> Management through _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ management, and the management of processes on the machine.";
		questionsArray[2][1] = "2";
		questionsArray[2][2] = "12000";  //Sleep Time
		
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
		questionsArray[5][2] = "12000";  //Sleep Time
		
		questionsArray[6][0] = "What are the main components of a modern computer? \n"
							+ "1. _ _ _ _ _ _ _ _ _ _  \n"
							+ "2. _ _ _ _ - _ _ _ _ _ _  \n"
							+ "3. _ _ _ _ _  \n"
							+ "4. _ _ - _ _ _ _ _ _ _  \n";
		questionsArray[6][1] = "6";
		questionsArray[6][2] = "30000";  //Sleep Time
		
		questionsArray[7][0] = "The operating acts as _ _ _ _ _ _ _ _ - _ _ _ _ _ _ _ and _ _ _ _ _ _ _ _ - _ _ _ _ _ _ _ ";
		questionsArray[7][1] = "7";
		questionsArray[7][2] = "20000";  //Sleep Time
		
		questionsArray[8][0] = "The operating system as an extended machine: Th OS fits in _ _ _ _ _ _   _ _ _ _";
		questionsArray[8][1] = "8";
		questionsArray[8][2] = "10000";  //Sleep Time
		
		questionsArray[9][0] = "Modes of operation of most computers: \n"
							+ "1. _ _ _ _ _ _ - _ _ _ _ \n"
							+ "2. _ _ _ _ - _ _ _ _";
		questionsArray[9][1] = "9";
		questionsArray[9][2] = "20000";  //Sleep Time
		
		questionsArray[10][0] = "kernel mode is sometimes called the _ _ _ _ _ _ _ _ _ _   _ _ _ _";
		questionsArray[10][1] = "10";
		questionsArray[10][2] = "15000";  //Sleep Time
		
		questionsArray[11][0] = "In kernel model, the operating system has complete _ _ _ _ _ _ to all the hardware \n"
							+ "and can _ _ _ _ _ _ _ any instruction the machine is capable of executing.";
		questionsArray[11][1] = "11";
		questionsArray[11][2] = "15000";  //Sleep Time

		questionsArray[12][0] = "The rest of the software runs in _ _ _ _   _ _ _ _, in which only a subset of instructions is available.";
		questionsArray[12][1] = "12";
		questionsArray[12][2] = "12000";  //Sleep Time
		
		questionsArray[13][0] = "The operating system as a resource manager: \n"
							+ "1. Allows multiple programs to _ _ _ at the same time.";
		questionsArray[13][1] = "13";
		questionsArray[13][2] = "8000";  //Sleep Time
		
		questionsArray[14][0] = "The operating system as a resource manager: \n"
							+ "2. Manage and _ _ _ _ _ _ _ memory, IO devices, and _ _ _ _ _ resources.";
		questionsArray[14][1] = "14";
		questionsArray[14][2] = "10000";  //Sleep Time
		
		questionsArray[15][0] = "The operating system as a resource manager: \n"
							+ "3. Include _ _ _ _ _ _ _ _ _ _(sharing) resources in two ways: \n"
							+ "a. time\n"
							+ "b. space\n";
		questionsArray[15][1] = "15";							
		questionsArray[15][2] = "12000";  //Sleep Time
		
		questionsArray[16][0] = "The operating system as a resource manager: \n"
							+ "3. Include multiplexing(sharing) resources in two ways: \n"
							+ "a. _ _ _ _\n"
							+ "b. space\n";
		questionsArray[16][1] = "16";
		questionsArray[16][2] = "10000";  //Sleep Time
		
		questionsArray[17][0] = "The operating system as a resource manager: \n"
							+ "3. Include multiplexing(sharing) resources in two ways: \n"
							+ "a. time\n"
							+ "b. _ _ _ _\n";
		questionsArray[17][1] = "17";
		questionsArray[17][2] = "10000";  //Sleep Time
		
		questionsArray[18][0] = "When a resource is multiplex: \n"
							+ "1. Different programs or users take _ _ _ _ _ using it.";
		questionsArray[18][1] = "18";
		questionsArray[18][2] = "10000";  //Sleep Time
		
		questionsArray[19][0] = "When a resource is multiplex: \n"
							+ "2. First one of them gets to _ _ _ the resource, then the other, and so on.";
		questionsArray[19][1] = "19";
		questionsArray[19][2] = "10000";  //Sleep Time

		questionsArray[20][0] = "When a computer resource is multiplexed: \n"
							+ "1. Instead of programs taking turns, each one gets _ _ _ _ of the resource.";
		questionsArray[20][1] = "20";
		questionsArray[20][2] = "10000";  //Sleep Time

		questionsArray[21][0] = "When a computer resource is multiplexed: \n"
							+ "2. For example, main memory is normarlly _ _ _ _ _ _ _ up among several _ _ _ _ _ _ _ programs\n"
							+ "so each can be _ _ _ _ _ _ _ _ at the same time.";
		questionsArray[21][1] = "21";
		questionsArray[21][2] = "15000";  //Sleep Time

		questionsArray[22][0] = "";
		questionsArray[22][1] = "22";
		questionsArray[22][2] = "10000";  //Sleep Time

		questionsArray[23][0] = "";
		questionsArray[23][1] = "23";
		questionsArray[23][2] = "10000";  //Sleep Time

		questionsArray[24][0] = "";
		questionsArray[24][1] = "24";
		questionsArray[24][2] = "10000";  //Sleep Time

		questionsArray[25][0] = "";
		questionsArray[25][1] = "25";
		questionsArray[25][2] = "10000";  //Sleep Time

		questionsArray[26][0] = "";
		questionsArray[26][1] = "26";
		questionsArray[26][2] = "10000";  //Sleep Time

		questionsArray[27][0] = "";
		questionsArray[27][1] = "27";
		questionsArray[27][2] = "10000";  //Sleep Time

		questionsArray[28][0] = "";
		questionsArray[28][1] = "28";
		questionsArray[28][2] = "10000";  //Sleep Time

		questionsArray[29][0] = "";
		questionsArray[29][1] = "29";
		questionsArray[29][2] = "10000";  //Sleep Time

		questionsArray[30][0] = "";
		questionsArray[30][1] = "30";
		questionsArray[30][2] = "10000";  //Sleep Time

		questionsArray[31][0] = "";
		questionsArray[31][1] = "31";
		questionsArray[31][2] = "10000";  //Sleep Time

		questionsArray[32][0] = "";
		questionsArray[32][1] = "32";
		questionsArray[32][2] = "10000";  //Sleep Time

		questionsArray[33][0] = "";
		questionsArray[33][1] = "33";
		questionsArray[33][2] = "10000";  //Sleep Time

		questionsArray[34][0] = "";
		questionsArray[34][1] = "34";
		questionsArray[34][2] = "10000";  //Sleep Time

		questionsArray[35][0] = "";
		questionsArray[35][1] = "35";
		questionsArray[35][2] = "10000";  //Sleep Time

		questionsArray[36][0] = "";
		questionsArray[36][1] = "36";
		questionsArray[36][2] = "10000";  //Sleep Time

		questionsArray[37][0] = "";
		questionsArray[37][1] = "37";
		questionsArray[37][2] = "10000";  //Sleep Time

		questionsArray[38][0] = "";
		questionsArray[38][1] = "38";
		questionsArray[38][2] = "10000";  //Sleep Time

		questionsArray[39][0] = "";
		questionsArray[39][1] = "39";
		questionsArray[39][2] = "10000";  //Sleep Time

		questionsArray[40][0] = "";
		questionsArray[40][1] = "40";
		questionsArray[40][2] = "10000";  //Sleep Time

		questionsArray[41][0] = "";
		questionsArray[41][1] = "41";
		questionsArray[41][2] = "10000";  //Sleep Time

		questionsArray[42][0] = "";
		questionsArray[42][1] = "42";
		questionsArray[42][2] = "10000";  //Sleep Time

		questionsArray[43][0] = "";
		questionsArray[43][1] = "43";
		questionsArray[43][2] = "10000";  //Sleep Time

		questionsArray[44][0] = "";
		questionsArray[44][1] = "44";
		questionsArray[44][2] = "10000";  //Sleep Time

		questionsArray[45][0] = "";
		questionsArray[45][1] = "45";
		questionsArray[45][2] = "10000";  //Sleep Time
		
		questionsArray[46][0] = "";
		questionsArray[46][1] = "46";
		questionsArray[46][2] = "10000";  //Sleep Time


		
		
		AnswersArray = new String[47];
		AnswersArray[0] = "0,3";
		AnswersArray[1] = "1,4";
		AnswersArray[2] = "multiprocessor";
		AnswersArray[3] = "memory";
		AnswersArray[4] = "disks";
		AnswersArray[5] = "io devices";
		AnswersArray[6] = "processors main-memory disks io-devices";
		AnswersArray[7] = "extended-machine resource-manager";
		AnswersArray[8] = "kernel mode";
		AnswersArray[9] = "kernel-mode user-mode";
		AnswersArray[10] = "supervisor mode";
		AnswersArray[11] = "access execute";
		AnswersArray[12] = "user mode";
		AnswersArray[13] = "run";
		AnswersArray[14] = "protect other";
		AnswersArray[15] = "multiplexing";
		AnswersArray[16] = "time";
		AnswersArray[17] = "space";
		AnswersArray[18] = "turns";
		AnswersArray[19] = "use";
		AnswersArray[20] = "part";
		AnswersArray[21] = "divided running resident";
		AnswersArray[22] = "";
		AnswersArray[23] = "";
		AnswersArray[24] = "";
		AnswersArray[25] = "";
		AnswersArray[26] = "";
		AnswersArray[27] = "";
		AnswersArray[28] = "";
		AnswersArray[29] = "";
		AnswersArray[30] = "";
		AnswersArray[31] = "";
		AnswersArray[32] = "";
		AnswersArray[33] = "";
		AnswersArray[34] = "";
		AnswersArray[35] = "";
		AnswersArray[36] = "";
		AnswersArray[37] = "";
		AnswersArray[38] = "";
		AnswersArray[39] = "";
		AnswersArray[40] = "";
		AnswersArray[41] = "";
		AnswersArray[42] = "";
		AnswersArray[43] = "";
		AnswersArray[44] = "";
		AnswersArray[45] = "";
		AnswersArray[46] = "";
		
		
		
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
                				n = rand.nextInt(22);
                				//n = 8;
                				String[] answer = AnswersArray[n].split(",");
                				if(answer.length == 2)
                				{
                    				appendToPane(console_Like, questionsArray[n][0] + "\n\n", Color.red,QuestionFont);
                					String[] answerTokens = multiAnswersArray[Integer.parseInt(answer[0])].split("~");
                					
                       				appendToPane(console_Like, " a. " + answerTokens[0] + "\n", Color.cyan,QuestionFont);
                       				appendToPane(console_Like, " b. " + answerTokens[1] + "\n", Color.cyan,QuestionFont);
                       				appendToPane(console_Like, " c. " + answerTokens[2] + "\n", Color.cyan,QuestionFont);
                       				appendToPane(console_Like, " d. " + answerTokens[3] + "\n\n", Color.cyan,QuestionFont);
                				}
                				else
                				{
                    				appendToPane(console_Like, questionsArray[n][0] + "\n\n", Color.red,QuestionFont);
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
