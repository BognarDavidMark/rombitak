/*
* File: MainController.java
* Author: Bognár Dávid Márk
* Copyright: 2023, Bognár Dávid Márk
* Group: Szoft II/N
* Date: 2023.01.16.
* Github: https://github.com/BognarDavidMark
* Licenc: GNU GPL
*/

package controllers;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import views.MainWindow;

public class MainController {

    MainWindow mainWindow;

    public MainController() {
        this.mainWindow = new MainWindow();
        this.handleEvents();
    }

    public void handleEvents() {
        JButton calcButton = this.mainWindow.buttonPanel.calcButton;
        JButton aboutButton = this.mainWindow.buttonPanel.aboutButton;

        calcButton.addActionListener(e -> onClickCalcButton());
        aboutButton.addActionListener(e -> onClickAboutButton());

    }

    public void onClickCalcButton() {
        String avalueString = this.mainWindow.asidePanel.getValue();
        String alphaString = this.mainWindow.alphaPanel.getValue();

        double avalue = Double.parseDouble(avalueString);
        double alpha = Double.parseDouble(alphaString);

        Double volume = 4 * avalue;
        Double radian = alpha * Math.PI / 180;
        Double area = Math.pow(avalue, 2) * Math.sin(radian);

        this.mainWindow.districtPanel.setValue(volume.toString());
        this.mainWindow.areaPanel.setValue(area.toString());
    }
    public void onClickAboutButton() {
        String content = "Rombiták\nVerzió: 1.0.0\nBognár Dávid Márk\nSzoft II/N\n2023.01.16.";
        JOptionPane.showMessageDialog(this.mainWindow.getContentPane(), content);
    }
}
