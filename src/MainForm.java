/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 *
 * How To prevent other JFrame forms from closing when one form is closed
 * https://mauricemuteti.info/how-to-prevent-other-jframe-forms-from-closing-when-one-form-is-closed/
 */
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
/**
 *
 * @author HP
 */


public class MainForm extends JFrame {

    public MainForm() {
        setSize(400, 300);
        setTitle("Main Form");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JButton btnOpenOtherForm = new JButton("Open Other Form");
        btnOpenOtherForm.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Open the second form when the button is clicked
                OtherForm otherForm = new OtherForm();
                otherForm.setVisible(true);
            }
        });
        add(btnOpenOtherForm);
    }

    public static void main(String[] args) {
        MainForm mainForm = new MainForm();
        mainForm.setVisible(true);
    }
}