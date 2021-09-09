package my_project.control;

import my_project.model.Furnace;
import my_project.model.KebabSkewer;
import my_project.model.SaladStorage;
import my_project.model.Worker;
import my_project.view.startInterface;

import javax.swing.*;

public class Doepi {

    public static void main(String[] args) {
        new Doepi();
        new App();
        Furnace furnace = new Furnace();
        SaladStorage saladStorage = new SaladStorage();
        KebabSkewer kebabSkewer = new KebabSkewer();
    }

    public Doepi(){
    }

    private void createFrame(){
        JFrame myFrame = new JFrame("Doepi App");
        myFrame.setVisible(true);
        startInterface interface1 = new startInterface();
        myFrame.setContentPane(interface1.getPanel());
        myFrame.setBounds(200,200,500,500);
    }

    private void setContentPane(){
        // ToDo: Muss noch programmiert werden, damit wir zwischen mehreren Panels switchen können bei der App.
    }
}
