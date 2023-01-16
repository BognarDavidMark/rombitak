/*
* File: MainWindow.java
* Author: Bognár Dávid Márk
* Copyright: 2023, Bognár Dávid Márk
* Group: Szoft II/N
* Date: 2023.01.16.
* Github: https://github.com/BognarDavidMark
* Licenc: GNU GPL
*/

package views;
import java.awt.Component;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

public class MainWindow extends JFrame {

    TitlePanel titlePanel;
    public ASidePanel asidePanel;
    public AlphaPanel alphaPanel;
    public DistrictPanel districtPanel;
    public AreaPanel areaPanel;
    public ButtonPanel buttonPanel;
    public JButton aboutButton;

    public MainWindow() {
        this.titlePanel = new TitlePanel();
        this.asidePanel = new ASidePanel();
        this.alphaPanel = new AlphaPanel();
        this.districtPanel = new DistrictPanel();
        this.areaPanel = new AreaPanel();
        this.buttonPanel = new ButtonPanel();

        this.initWindow();
    }

    public void initWindow() {
        this.setTitle("Rombiták");
        this.setLayout(new BoxLayout(this.getContentPane(), BoxLayout.PAGE_AXIS));
        this.addComponent();
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.pack();
        this.setVisible(true);

    }

    public void addComponent() {
        this.add(this.titlePanel);
        this.add(this.asidePanel);
        this.add(this.alphaPanel);
        this.add(this.buttonPanel);
        this.add(this.districtPanel);
        this.add(this.areaPanel);
    }

}
