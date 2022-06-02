import  java.awt.*;
import  javax.swing.*;

/**
 * This class models a coffee brewer. It extends {@link Product} and adds the
 * following information:
 * <ol>
 * <li>the model of the coffee brewer, a <code>String</code></li>
 * <li>the water supply ("Pour-over" or "Automatic")</li>
 * <li>the capacity expressed in number of cups, a <code>int</code></li>
 * </ol>
 *
 * @author kojikoji 1310402980@qq.com
 * @version  1.0.0
 * @see Product
 */
public class CoffeeBrewer extends Product  {

	/* Model of the coffee brewer. */
	private String  model;

	/* The water supply of the coffee brewer ("Pour-over" or "Automatic"). */
	private String  waterSupply;

	/* The capacity expressed in number of cups. */
	private int  numberOfCups;

	/**
	 * Constructs a <code>CoffeeBrewer</code> object.
	 *
	 * @param initialCode  the code of the product.
	 * @param initialDescription  a short description of the product.
	 * @param initialPrice  the price of the product.
	 * @param initialModel  the model of the coffee brewer.
	 * @param initialWaterSupply  the water supply is ("Pour-over" or
	 *                        "Automatic").
	 * @param initialNumberOfCups  the capacity expressed in number of cups.
	 */
	public CoffeeBrewer(String initialCode, String initialDescription,
			double  initialPrice, String initialModel,
			String initialWaterSupply, int initialNumberOfCups)  {

		super(initialCode, initialDescription, initialPrice);

		model = initialModel;
		waterSupply = initialWaterSupply;
		numberOfCups = initialNumberOfCups;
	}

	/**
	 * Returns the model of this coffee brewer.
	 *
	 * @return  the model of this coffee brewer.
	 */
	public String  getModel()  {

		return  model;
	}

	/**
	 * Returns the type of water supply.
	 *
	 * @return  returns "Pour-over" or "Automatic".
	 */
	public String  getWaterSupply()  {

		return  waterSupply;
	}

	/**
	 * Returns the capacity of this coffee brewer expressed in number of cups.
	 *
	 * @return  the capacity of this coffee brewer expressed in number of cups.
	 */
	public int  getNumberOfCups()  {

		return  numberOfCups;
	}

	/**
	 * Returns the string representation of this coffee brewer.
	 *
	 * @return  the string representation of this coffee brewer.
	 */
	public String  toString()  {

		return super.toString() + "_" + getModel() + "_" + getWaterSupply()
		       + "_" + getNumberOfCups();
	}

	/**
	 * Obtains a {@link JPanel} object with the information of this coffee
	 * brewer.
	 *
	 * @return a <code>JPanel</code> with the information of this coffee brewer.
	 */
	public JPanel getPanel() {
		JPanel brewerPanel = new JPanel(new GridLayout(6,2));
		brewerPanel.add(new JLabel("Code:"));
		brewerPanel.add(new JTextField(getCode(),10));
		brewerPanel.add(new JLabel("Description:"));
		brewerPanel.add(new JTextField(getDescription(),10));
		brewerPanel.add(new JLabel("Price:"));
		brewerPanel.add(new JTextField(String.valueOf(getPrice()),10));
		brewerPanel.add(new JLabel("Model:"));
		brewerPanel.add(new JTextField(getModel(),10));
		brewerPanel.add(new JLabel("Source of water:"));
		brewerPanel.add(new JTextField(getWaterSupply(),10));
		brewerPanel.add(new JLabel("Number of cups:"));
		brewerPanel.add(new JTextField(String.valueOf(getNumberOfCups()),10));

		return brewerPanel; // REMOVE; USED SO THIS FILE COMPILES
	}
}