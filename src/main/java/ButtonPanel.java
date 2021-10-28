import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonPanel extends JPanel {
    private JButton but1;
    private JButton but2;
    private JCheckBox cb1;

    public ButtonPanel() {
//        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        setLayout(new GridLayout(1,3));// One row, one column
        but1 = new JButton("Press me");
        but1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Button 1 pressed");
            }
        });
        add(but1);

        but2 = new JButton("Press me too");
        but2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Button 2 pressed");
            }
        });
        add(but2);

        cb1 = new JCheckBox("I pressed button a button");
        add(cb1);
    }
}
