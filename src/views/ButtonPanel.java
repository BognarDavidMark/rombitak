/*
* File: ButtonPanel.java
* Author: Bognár Dávid Márk
* Copyright: 2023, Bognár Dávid Márk
* Group: Szoft II/N
* Date: 2023.01.16.
* Github: https://github.com/BognarDavidMark
* Licenc: GNU GPL
*/

package views;

import javax.swing.JPanel;
import javax.swing.JButton;

public class ButtonPanel extends JPanel{
    public JButton calcButton;
    public JButton aboutButton;

    public ButtonPanel() {
        calcButton = new JButton("Számít");
        aboutButton = new JButton("Névjegy");
        addComponents();
    }

    public void addComponents() {
        add(this.calcButton);
        add(this.aboutButton);
    }
}
