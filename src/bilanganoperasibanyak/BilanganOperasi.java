package bilanganoperasibanyak;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BilanganOperasi extends JFrame {
    private JPanel bilanganOperasiPanel;
    private JTextField angkaPertamaText;
    private JButton tambahButton;
    private JPanel mainPanel;
    private JLabel angkaPertamaLabel;
    private JLabel angaKeduaLabel;
    private JLabel angkaKetigaLabel;
    private JButton kurangButton;
    private JButton kaliButton;
    private JButton bagiButton;
    private JButton clearButton;
    private JButton backHomeButton;
    private JTextField angkaKeduaText;
    private JTextField angkaKetigaText;

    public BilanganOperasi() {
        super("Operasi Dua Angka");
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(mainPanel);
        this.setSize(854,480);

        tambahButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                float a = Float.parseFloat(angkaPertamaText.getText());
                float b = Float.parseFloat(angkaKeduaText.getText());
                float opt = operasi(1, a, b);
                angkaKetigaText.setText(String.valueOf(opt));
            }
        });
        kurangButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                float a = Float.parseFloat(angkaPertamaText.getText());
                float b = Float.parseFloat(angkaKeduaText.getText());
                float opt = operasi(2, a, b);
                angkaKetigaText.setText(String.valueOf(opt));
            }
        });
        kaliButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                float a = Float.parseFloat(angkaPertamaText.getText());
                float b = Float.parseFloat(angkaKeduaText.getText());
                float opt = operasi(3, a, b);
                angkaKetigaText.setText(String.valueOf(opt));
            }
        });
        bagiButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                float a = Float.parseFloat(angkaPertamaText.getText());
                float b = Float.parseFloat(angkaKeduaText.getText());
                float opt = operasi(4, a, b);
                angkaKetigaText.setText(String.valueOf(opt));
            }
        });
        clearButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                angkaPertamaText.setText("");
                angkaKeduaText.setText("");
                angkaKetigaText.setText("");
                angkaPertamaText.requestFocus();
            }
        });
        backHomeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
    }

    float operasi(int opts, float a, float b) {
        switch (opts) {
            case 1:
                return b + a;
            case 2:
                return b - a;
            case 3:
                return b * a;
            case 4:
                return b / a;
        }
        return -1;
    }
}
