/*
* File: TitlePanel.java
* Author: Bognár Dávid Márk
* Copyright: 2023, Bognár Dávid Márk
* Group: Szoft II/N
* Date: 2023.01.16.
* Github: https://github.com/BognarDavidMark
* Licenc: GNU GPL
*/

package views;

import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class TitlePanel extends JPanel {
    JLabel mainLabel;

    public TitlePanel() {
        this.mainLabel = new JLabel("Rombusz területe és kerülete számítása");
        this.mainLabel.setFont(new Font("Lithos Pro", Font.BOLD, 15));
        this.mainLabel.setHorizontalAlignment(SwingConstants.CENTER);
        this.mainLabel.setBorder(new EmptyBorder(10, 10, 10, 80));

        this.add(this.mainLabel);
    }

}