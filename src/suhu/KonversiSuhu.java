package suhu;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class KonversiSuhu extends JFrame {
    private JPanel KonversiSuhu;
    private JTextField celsiusTextField;
    private JLabel celsiusLable;
    private JButton convertButton;
    private JLabel fahrenheitLabel;
    private JButton exitButton;
    private JButton clearButton;
    private JPanel mainPanel;

    public KonversiSuhu() {
        super("Konversi Suhu");
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(mainPanel);
        this.setSize(854,480);

        convertButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int tempFahr = (int) ((Double.parseDouble(celsiusTextField.getText()))
                        * 1.8 + 32);
                fahrenheitLabel.setText(tempFahr + " Fahrenheit");
            }
        });
        exitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        clearButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                celsiusTextField.setText("");
                fahrenheitLabel.setText("Fahrenheit");
                celsiusTextField.requestFocus();
            }
        });
    }
}
