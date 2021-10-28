import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainMenu extends JMenuBar implements ActionListener {
    JMenu menu; // One menu
    JMenuItem item; // Which has one item
    public MainMenu(){
        menu=new JMenu("The Menu");
        item=new JMenuItem("Item 1");
        JMenuItem item2 = new JMenuItem("Item 2");
        item.addActionListener(this);
        item2.addActionListener(this);
        add(menu); // Add the JMenu to the JMenuBar
        menu.add(item); // Add the JMenuItem to the JMenu
        menu.add(item2);
    }
    @Override
    // If 'this' is set as the ActionListener to all menu items, this method will
    // be called whenever any menu item is selected, but the ActionEvent
    // command will be the text of the menu item selected
    public void actionPerformed(ActionEvent e) {
        System.out.println(e.getActionCommand());
        System.out.println("Item selected");
    }
}
