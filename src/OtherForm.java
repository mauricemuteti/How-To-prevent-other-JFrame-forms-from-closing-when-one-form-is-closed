/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 *
 * How To prevent other JFrame forms from closing when one form is closed
 * https://mauricemuteti.info/how-to-prevent-other-jframe-forms-from-closing-when-one-form-is-closed/
 */
import javax.swing.JFrame;

/**
 *
 * @author HP
 */

public class OtherForm extends JFrame {

    public OtherForm() {
        setSize(400, 300);
        setTitle("Other Form");
        setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
    }
}

