import  java.awt.*;
import  javax.swing.*;

/**
 * This class models a product sold by the Gourmet Coffee store.
 * It contains the following information:
 * <ol>
 * <li>the code of the product, a <code>String</code></li>
 * <li>a short description of the product, a <code>String</code></li>
 * <li>the price of the product, a <code>double</code></li>
 * </ol>
 *
 * @author author name
 * @version  1.0.0
 */
public class Product {

	/* Code of the product. */
	private String  code;

	/* Description of the product. */
	private String  description;

	/* Price of the product. */
	private double  price;

	/**
	 * Constructs a <code>Product</code> object.
	 *
	 * @param initialCode  the code of the product.
	 * @param initialDescription  the description of the product.
	 * @param initialPrice  the price of the product.
	 */
	public Product(String initialCode, String initialDescription,
	               double initialPrice)  {

		code = initialCode;
		description = initialDescription;
		price = initialPrice;
	}

	/**
	 * Returns the code of this product.
	 *
	 * @return  the code of this product.
	 */
	public String  getCode()  {

		return  code;
	}

	/**
	 * Returns the description of this product.
	 *
	 * @return  the descripton of this product.
	 */
	public String  getDescription()  {

		return  description;
	}

	/**
	 * Returns the price of this product.
	 *
	 * @return  price of this product.
	 */
	public double  getPrice()  {

		return  price;
	}

	/**
	 * Returns <code>true</code> if code of this product is
	 * equal to code of the argument.
	 * </p>
	 *
	 * @param object  object with which this product is compared.
	 * @return  <code>true</code> if code of this product is
	 *          equal to code of the argument; <code>false</code> otherwise.
	 */
	public boolean  equals(Object  object)  {

		return object instanceof Product
		       && getCode().equals(((Product) object).getCode());
	}

	/**
	 * Returns the string representation of this product.
	 *
	 * @return  the string representation of this product.
	 */
	public String  toString()  {

		return  getCode() + "_" + getDescription() + "_" + getPrice();
	}

	/**
	 * Obtains a {@link JPanel} object with the information of this product.
	 *
	 * @return a <code>JPanel</code> with the information of this product.
	 */
	public JPanel getPanel() {

		JPanel productPanel = new JPanel();
		JLabel codeLabel = new JLabel("Code:");
		JLabel descriptionLabel = new JLabel("Description:");
		JLabel priceLabel = new JLabel("Price:");
		JTextField codeField = new JTextField(getCode(),10);
		JTextField descriptionField = new JTextField(getDescription(),10);
		JTextField priceField = new JTextField(String.valueOf(getPrice()),10);

		productPanel.setLayout(new GridLayout(3,2));
		productPanel.add(codeLabel);
		productPanel.add(codeField);
		productPanel.add(descriptionLabel);
		productPanel.add(descriptionField);
		productPanel.add(priceLabel);
		productPanel.add(priceField);

		return productPanel;
	}
}