package TUGASGUI;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class gui extends JFrame {
    JLabel lblNamaLengkap = new JLabel("Nama Lengkap");
    JTextField txNamaLengkap = new JTextField(30);
    JLabel lblTanggalLahir = new JLabel("Tanggal Lahir");
    JTextField txTanggalLahir = new JTextField(20);
    JLabel lblNomorPendaftaran = new JLabel("Nomor Pendaftaran");
    JTextField txNomorPendaftaran = new JTextField(20);
    JLabel lblNoTelp = new JLabel("No. Telp");
    JTextField txNoTelp = new JTextField(20);
    JLabel lblAlamat = new JLabel("Alamat");
    JTextArea txAlamat = new JTextArea(3, 20);
    JLabel lblEmail = new JLabel("E-mail");
    JTextField txEmail = new JTextField(20);
    JButton submit = new JButton("Submit");

    gui() {
        setTitle("Form Mahasiswa");
        setLocation(300, 100);
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        KomponenVisual();
        AksiReaksi();
    }

    void KomponenVisual() {
        setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.fill = GridBagConstraints.HORIZONTAL;

        gbc.insets = new Insets(5, 5, 5, 5);

        gbc.gridx = 0;
        gbc.gridy = 0;
        add(lblNamaLengkap, gbc);
        gbc.gridx = 1;
        add(txNamaLengkap, gbc);

        gbc.gridx = 0;
        gbc.gridy = 1;
        add(lblTanggalLahir, gbc);
        gbc.gridx = 1;
        add(txTanggalLahir, gbc);

        gbc.gridx = 0;
        gbc.gridy = 2;
        add(lblNomorPendaftaran, gbc);
        gbc.gridx = 1;
        add(txNomorPendaftaran, gbc);

        gbc.gridx = 0;
        gbc.gridy = 3;
        add(lblNoTelp, gbc);
        gbc.gridx = 1;
        add(txNoTelp, gbc);

        gbc.gridx = 0;
        gbc.gridy = 4;
        add(lblAlamat, gbc);
        gbc.gridx = 1;
        add(new JScrollPane(txAlamat), gbc);

        gbc.gridx = 0;
        gbc.gridy = 5;
        add(lblEmail, gbc);
        gbc.gridx = 1;
        add(txEmail, gbc);

        gbc.gridx = 1;
        gbc.gridy = 6;
        add(submit, gbc);
        
        setVisible(true);
    }

    void AksiReaksi() {
        submit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                JFrame resultFrame = new JFrame("Data Mahasiswa");
                resultFrame.setSize(300, 200);
                resultFrame.setLocation(350, 150);
                
                JTextArea hasil = new JTextArea();
                hasil.setEditable(false);
                hasil.append("Nama               : " + txNamaLengkap.getText() + "\n");
                hasil.append("Tanggal Lahir    : " + txTanggalLahir.getText() + "\n");
                hasil.append("No. Pendaftaran   : " + txNomorPendaftaran.getText() + "\n");
                hasil.append("No. Telp           : " + txNoTelp.getText() + "\n");
                hasil.append("Alamat             : " + txAlamat.getText() + "\n");
                hasil.append("E-mail             : " + txEmail.getText() + "\n");

                resultFrame.add(new JScrollPane(hasil));
                resultFrame.setVisible(true);
            }
        });
    }

    public static void main(String args[]) {
        gui form = new gui();
    }
}
