package cop2805;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Window extends JFrame {

	JButton button;
	JFrame frame;
	JComboBox operation;

	public Window() {

		button = new JButton();
		frame = new JFrame();
		operation = new JComboBox(new String[] { "Add", "Subtract", "Multiply", "Divide" });
	}

	public static void main(String[] args) {
		WindowRunnable myWindow = new WindowRunnable();
		javax.swing.SwingUtilities.invokeLater(myWindow);
	}

	public static void createAndShowGUI() {
		Window frame = new Window();
		frame.setTitle("Calculator");
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
		frame.addComponentsToPane(frame.getContentPane());
		frame.pack();
		frame.setVisible(true);
	}

	public void addComponentsToPane(Container pane) {
	
		
		JPanel panel = new JPanel();

		pane.add(panel);

		JTextField textField = new JTextField(20);

		panel.add(textField);

		JTextField textField1 = new JTextField(20);

		panel.add(textField1);

		panel.add(operation);

		JButton actionButton = new JButton("Calculate");

		panel.add(actionButton);

		JLabel resultField = new JLabel("");

		panel.add(resultField);

		actionButton.addActionListener(new ActionListener() {
			@Override

			public void actionPerformed(ActionEvent arg0) {
				if (textField.getText().toString().equals("")) {

					JOptionPane.showMessageDialog(panel, "Please enter numbers");
				} else {
					try {
						double first = Double.parseDouble(textField.getText().toString());
						double second = Double.parseDouble(textField1.getText().toString());
						String op = operation.getSelectedItem().toString();
						double ans = 0;
						switch (op) {
						case "Add":
							ans = first + second;
							break;
						case "Subtract":
							ans = first - second;
							break;
						case "Multiply":
							ans = first * second;
							break;
						case "Divide":
							ans = first / second;
							break;
						}
						resultField.setText("Answer is :" + ans);
					} catch (NumberFormatException e) {
						JOptionPane.showMessageDialog(panel, "Please enter numbers only");
					}
				}
			}
		});
		panel.setPreferredSize(new Dimension(250, 200));
	}
}

class WindowRunnable implements Runnable {
	public void run() {
		Window.createAndShowGUI();
	}
}