package nilaimahasiswa;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class NilaiMahasiswa extends JFrame {
    private JPanel mainPanel;
    private JTextField realisasiText;
    private JTextField kehadiranText;
    private JButton hitungButton;
    private JButton clearButton;
    private JLabel realisasiLabel;
    private JLabel kehadiranLabel;
    private JLabel tugasLabel;
    private JLabel utsLabel;
    private JLabel uasLabel;
    private JTextField tugasText;
    private JTextField utsText;
    private JTextField uasText;
    private JLabel resKesimpulanLable;
    private JLabel resGradeLabel;
    private JLabel resNilaiLabel;
    private JLabel resKehadiranLabel;
    private JLabel title;

    public NilaiMahasiswa() {
        super("Nilai Mahasiswa");
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(mainPanel);
        this.setSize(854, 480);
        clearButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                realisasiText.setText("");
                kehadiranText.setText("");
                tugasText.setText("");
                utsText.setText("");
                uasText.setText("");
                resKesimpulanLable.setText("");
                resGradeLabel.setText("");
                resNilaiLabel.setText("");
                resKehadiranLabel.setText("");

                realisasiText.requestFocus();
            }
        });
        hitungButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                float realisasiPertemuan = Float.parseFloat(realisasiText.getText());
                float kehadiran = Float.parseFloat(kehadiranText.getText());
                float tugas = Float.parseFloat(tugasText.getText());
                float uts = Float.parseFloat(utsText.getText());
                float uas = Float.parseFloat(uasText.getText());
                float nilaiAkhirMahasiswa = nilaiAkhir(realisasiPertemuan, kehadiran, tugas, uts, uas);
                String grade = defineGrade(nilaiAkhirMahasiswa);

                resKehadiranLabel.setText("Total Kehadiran: " + kehadiran);
                resNilaiLabel.setText("Total Nilai: " + nilaiAkhirMahasiswa);
                resGradeLabel.setText("Grade: " + grade);
                resKesimpulanLable.setText("Kesimpulan: Lulus");

                if (grade == "E" || grade == "D") {
                    resKesimpulanLable.setText("Kesimpulan: Tidak Lulus");
                }
            }
        });
    }

    float nilaiAkhir(float realisasiPertemuan, float kehadiran,
                     float tugas, float uts, float uas) {
        float nilaiAkhir = 0;
        float nilaiKehadiran = (float) ((kehadiran / realisasiPertemuan) * 10);
        float nilaiTugasMahasiswa = (float) (tugas * 0.2);
        float nilaiUtsMahasiwa = (float) (uts * 0.3);
        float nilaiUasMahasiswa = (float) (uas * 0.4);

        nilaiAkhir = nilaiKehadiran +
                nilaiTugasMahasiswa +
                nilaiUtsMahasiwa +
                nilaiUasMahasiswa;

        return nilaiAkhir;
    }

    String defineGrade(float nilaiAkhir) {
        if (nilaiAkhir >= 80) {
            return "A";
        }
        if (nilaiAkhir >= 70 && nilaiAkhir < 80) {
            return "B";
        }
        if (nilaiAkhir >= 60 && nilaiAkhir < 70) {
            return "C";
        }
        if (nilaiAkhir >= 55 && nilaiAkhir < 60) {
            return "D";
        }
        return "E";
    }
}
