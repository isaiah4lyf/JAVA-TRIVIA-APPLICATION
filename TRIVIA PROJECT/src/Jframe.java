import java.awt.Color;
import java.awt.GridLayout;
import java.awt.Insets;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;


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
	public Jframe()
	{
		setLayout(new GridLayout(2,1));
		Percentage = 0;
		questionsAnseredInt = 0;
		correctAnswersInt = 0;
		
		JButton train_specific_model = new JButton("SUBMIT ANSWER");
		text = new JTextField();
		SubmitButton listener = new SubmitButton(text);
		text.addActionListener(listener);
		train_specific_model.addKeyListener(listener);
		train_specific_model.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            	questionsAnseredInt++;
            	if(text.getText().replaceAll(" ", "").equals(AnswersArray[CurrentAnswer]))
            	{
    				appendToPane(console_Like,text.getText(), Color.yellow);
    				appendToPane(console_Like," - " + AnswersArray[CurrentAnswer] + "\n\n", Color.yellow);
    				text.setText("");
    				correctAnswersInt++;
            	}
            	else
            	{
    				appendToPane(console_Like,text.getText(), Color.gray);
    				appendToPane(console_Like," - " + AnswersArray[CurrentAnswer] + "\n\n", Color.gray);
    				text.setText("");
            	}

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
		scoreBoardPanel.setLayout(new GridLayout(2,2));
		totalQuestionsAsked = new Label();
		questionsAnswered = new Label();
		correctAnswers = new Label();
		percentageLabel = new Label();
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
		
		String[][] questionsArray = new String[5][5];
		questionsArray[0][0] = "sd1";
		questionsArray[0][1] = "0";
		
		questionsArray[1][0] = "sd2";
		questionsArray[1][1] = "1";
		
		questionsArray[2][0] = "sd3";
		questionsArray[2][1] = "2";
		
		questionsArray[3][0] = "sd4";
		questionsArray[3][1] = "3";
		
		questionsArray[4][0] = "sd5";
		questionsArray[4][1] = "4";
		
		AnswersArray = new String[5];
		AnswersArray[0] = "answer1";
		AnswersArray[1] = "answer2";
		AnswersArray[2] = "answer3";
		AnswersArray[3] = "1,1";
		AnswersArray[4] = "answer4";
		
		String[] multiAnswersArray = new String[2];
		multiAnswersArray[0] = "answer 1, answer 2, answer 3, answer 4";
		multiAnswersArray[1] = "answerk 1, answerk 2, answerk 3, answerk 4";
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
                				Random rand = new Random();
                				int  n = rand.nextInt(4) + 0;
                				appendToPane(console_Like, questionsArray[n][0] + "\n\n", Color.red);
                				CurrentAnswer = Integer.parseInt(questionsArray[n][1]);
                				totalQuestions++;
                				totalQuestionsAsked.setText("Total Questions asked: " + String.valueOf(totalQuestions));
                				correctAnswers.setText("Total Questions asked: " + String.valueOf(totalQuestions));
                				questionsAnswered.setText("Total Questions asked: " + String.valueOf(totalQuestions));
                				percentageLabel.setText("Total Questions asked: " + String.valueOf(totalQuestions));
                				Thread.sleep(10000);
                				appendToPane(console_Like, AnswersArray[n] + "\n\n", Color.GREEN);


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




	  public class SubmitButton implements ActionListener, KeyListener {

	      JTextField nameInput;


	      public SubmitButton(JTextField textfield){
	          nameInput = textfield;
	      }

	      @Override
	      public void actionPerformed(ActionEvent submitClicked) {
          	questionsAnseredInt++;
          	if(text.getText().replaceAll(" ", "").equals(AnswersArray[CurrentAnswer]))
          	{
  				appendToPane(console_Like,text.getText(), Color.yellow);
  				appendToPane(console_Like," - " + AnswersArray[CurrentAnswer] + "\n\n", Color.yellow);
  				text.setText("");
  				correctAnswersInt++;
          	}
          	else
          	{
  				appendToPane(console_Like,text.getText(), Color.gray);
  				appendToPane(console_Like," - " + AnswersArray[CurrentAnswer] + "\n\n", Color.gray);
  				text.setText("");
          	}
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
