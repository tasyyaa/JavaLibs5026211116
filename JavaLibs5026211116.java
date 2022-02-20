import javax.swing.*;
public class JavaLibs5026211116{
	public static void main(String[] args) {
		//Welcome message
		JOptionPane.showMessageDialog(null, "Hello, Welcome to Let's Make a Drink with NeNa! Are you ready to start our story?",
                	"Let's Make a Drink with NeNa!", JOptionPane.INFORMATION_MESSAGE);

		//name
		String name = (String)JOptionPane.showInputDialog(null, "Before we start, let me introduce myself first! My name is NeNa and now I'm gonna help you to make your own favourite drink!"+ 
			"\nHow can I call you?", "Let's Make a Drink with NeNa!", JOptionPane.QUESTION_MESSAGE, null, null, "Enter your name here!");

		//drink
		String drink = (String)JOptionPane.showInputDialog(null, "Okay " + name + ", can you tell me what is your favourite drink? except water!",
                	"Let's Make a Drink with NeNa!", JOptionPane.QUESTION_MESSAGE, null, null, "Enter you favourite drink here!");

		//hot or ice
		String[]  acceptableValues = {"choose one!", "hot", "ice"};
		String mode = (String)JOptionPane.showInputDialog(null, "Wow, I love " + drink + " too! How you like " + drink + " to be served?",
                	"Let's Make a Drink with NeNa!", JOptionPane.QUESTION_MESSAGE,null, acceptableValues, acceptableValues[0]);
		if (mode=="hot")
			JOptionPane.showMessageDialog(null, "You don't need to put anything", "Let's Make a Drink with NeNa!", JOptionPane.INFORMATION_MESSAGE);
		else
			JOptionPane.showMessageDialog(null, "Put your ice to the blender", "Let's Make a Drink with NeNa!", JOptionPane.INFORMATION_MESSAGE);

		//quantity
		int quantity  = Integer.parseInt(JOptionPane.showInputDialog(null, "How many " + mode +" "+ drink + " you want to make?", "Let's Make a Drink with NeNa!", JOptionPane.QUESTION_MESSAGE));

		//powder
		int quantityPowder = Integer.parseInt(JOptionPane.showInputDialog(null,"Great! now tell me how many teaspoon of " + drink + " powder you want to use per glass?",
			 "Let's Make a Drink with NeNa!", JOptionPane.QUESTION_MESSAGE));

        	int Powder = quantity * quantityPowder;

		//sugar
		double quantitySugar = Double.parseDouble(JOptionPane.showInputDialog(null, "Okay, you need to prepare " + quantity+
                	" glass(es) and "+ Powder + " teaspoon(s) of "+ drink + ". "+ quantityPowder + " teaspoon(s) for each glass."+ "\nNow between 0 to 0.5, how many gram sugar that you want to put in your " + mode + " "+ drink +"? Don't put it too much!", 
			"Let's Make a Drink with NeNa!", JOptionPane.QUESTION_MESSAGE));

        	double sugar = quantity * quantitySugar;
		
		//water
		double water = Double.parseDouble(JOptionPane.showInputDialog(null, "So you want to put "+quantitySugar+" gram(s) of sugar?"+
                	"\nThat means you need to prepare " + sugar +" gram(s) of sugar in total!"+ "\nHow many mL of water you want to put in your " + mode + " "+ drink+"?", "Let's Make a Drink with NeNa!", JOptionPane.QUESTION_MESSAGE));

		//blender
		Object[] options = {"Yes", "Of Course!"};
        	JOptionPane.showOptionDialog(null,"Just like " + drink + " powder and sugar before, you need to prepare " + water +" mL of water!" +
                	"\nAfter it all set put all of the ingredients to blender on your left, close and turn on the blender!"+
                	"\nhave you turn on the blender?", "Let's Make a Drink With NeNa!", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE,
                	null, options, options[0]);

		int time= Integer.parseInt(JOptionPane.showInputDialog(null, "I'm sure you have turned on the blender!"+"\nNow how many minutes you want to blend it?","Let's Make a Drink with NeNa!", JOptionPane.QUESTION_MESSAGE));

		//time
		JOptionPane.showMessageDialog(null, "Great! Now wait for "+ time +" minutes. After "+ time +" minutes turn off the blender and put it to the glass that you prepared before"+
                	"\nBe careful, don't spoil it!", "Let's Make a Drink with NeNa!", JOptionPane.INFORMATION_MESSAGE);

		//straw
		String[] strawWant = {"choose one", "straw", "tissue"};
		String Straw = (String)JOptionPane.showInputDialog(null, "What do you want?", "Let's Make a Drink with NeNa!", 
				2, null, strawWant, strawWant[0]);
		if (Straw=="straw")
			JOptionPane.showMessageDialog(null,"Okay, wait I'm gonna search for the straw!", "Let's Make a Drink with NeNa!", 3);
		else
			JOptionPane.showMessageDialog(null, "Okay, I will bring you tissue.", "let's Make a Drink with NeNa!", 3);
		if (Straw=="straw")
			JOptionPane.showMessageDialog(null, "Okay, " + name + ". Here is your " + Straw + " ! You can put it in your drink!"+ 
				"\nCongratulations, Your drink is ready! You did it^^"+"\nYou can try your "+ mode+ " " + drink + " now!", 
				"Let's Make a Drink with NeNa!", JOptionPane.INFORMATION_MESSAGE);
		else
			JOptionPane.showMessageDialog(null, "Okay, " + name + ". Here is your tissue. You can put it in your drink!"+ 
				"\nCongratulations, Your drink is ready! You did it^^"+"\nYou can try your "+ mode+ " " + drink + " now!", 
				"Let's Make a Drink with NeNa!", JOptionPane.INFORMATION_MESSAGE);

		//feel
		String feel = (String)JOptionPane.showInputDialog(null,"How do you fell about your " + mode + " "+ drink + "?", "Let's Make a Drink with NeNa!", JOptionPane.QUESTION_MESSAGE,
                	null, null, "Tell your feeling here!");

		//rate
		int satisfactory = Integer.parseInt(JOptionPane.showInputDialog(null, "From 1-10 how much you rate your drink?", "Let's Make a Drink with NeNa!", JOptionPane.QUESTION_MESSAGE));
		
		//end
		if (mode=="hot")
			JOptionPane.showMessageDialog(null, "Wow, " + name + ". You have finished making " + quantity +" "+ mode + " " + drink + " with "+ Powder + " teaspoon(s) of " + drink + ", "+ quantityPowder +" teaspoon(s) for each glass and "+ sugar +
					" gram(s) of sugar, "+ quantitySugar + " gram(s) for each glass." + "\nYou also use "+ water + " mL of hot water for all. You blend it for "+ time + " minutes. You chose a "+ Straw +". You have tasted the drink that you made and it makes you " + feel +
					". You said it's " + satisfactory + "/10!", "Let's Make a Drink with NeNa!", JOptionPane.INFORMATION_MESSAGE);
		else
			JOptionPane.showMessageDialog(null, "Wow, " + name + ". You have finished making " + quantity +" "+ mode + " " + drink + " with "+ Powder + " teaspoon(s) of " + drink + ", "+ quantityPowder +" teaspoon(s) for each glass and "+ sugar +
					" gram(s) of sugar, "+ quantitySugar + " gram(s) for each glass." + "\nYou also use "+ water + " mL of water for all. You blend it for "+ time + " minutes. You chose a "+ Straw +". You have tasted the drink that you made and it makes you " + feel +
					". You said it's " + satisfactory + "/10!", "Let's Make a Drink with NeNa!", JOptionPane.INFORMATION_MESSAGE);


		JOptionPane.showMessageDialog(null, "I hope you love our journey today! Glad to help you, Let's make another drink soon, "+name+ "!" + "\nThank you for your time!", "Let's Make a Drink with NeNa!", JOptionPane.INFORMATION_MESSAGE);

	}
}