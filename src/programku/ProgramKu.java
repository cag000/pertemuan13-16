package programku;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ProgramKu extends JFrame {
    private JPanel programkuPanel;
    private JTextField angkaPertamaText;
    private JButton tambahButton;
    private JButton hapusButton;
    private JButton keluarButton;
    private JTextField angkaKeduaText;
    private JTextField hasilText;
    private JPanel mainPanel;

    public ProgramKu() {
        super("Program Ku");
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(mainPanel);
        this.setSize(854,480);

        tambahButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                float result = Float.parseFloat(angkaPertamaText.getText()) + Float.parseFloat(angkaKeduaText.getText());
                hasilText.setText("Hasilnya " + result);
            }
        });
        hapusButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                angkaPertamaText.setText("");
                angkaKeduaText.setText("");
                hasilText.setText("");
                angkaPertamaText.requestFocus();
            }
        });
        keluarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
    }
}
