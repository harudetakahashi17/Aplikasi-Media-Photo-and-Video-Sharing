/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Aplikasi;
import View.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import javax.swing.JPanel;

/**
 *
 * @author Harude
 */
public class Controller implements ActionListener {
    private Aplikasi model;
    private MainLogin view;
    
    private String currentView;
    private JPanel mainPanel;
    
    private LoginView Login;
    private SignUpView SignUp;
    
    public Controller(Aplikasi model) {
        this.model = model;
        this.view = new MainLogin();

        Login = new LoginView();
        SignUp = new SignUpView();

        Login.addListener(this);
        SignUp.addListener(this);
        
        mainPanel = view.getMainPanel();
        mainPanel.add(Login, "0");
        mainPanel.add(SignUp, "1");
        currentView = "0";

        view.getCardLayout()
                .show(mainPanel, currentView);
        view.setVisible(true);
        //view.addListener(this);
    }
    
    @Override
    public void actionPerformed(ActionEvent ae){
        Object s = ae.getSource();
        if (currentView.equals("0")) {
            //current view = Main Menu
            if (s.equals(Login.getBtnSignUp())) {
                currentView = "1";
                view.getCardLayout().show(mainPanel, currentView);
            }
        } else if (currentView.equals("1")) {
            //current view = Main Menu
            if (s.equals(SignUp.getBtnBack())) {
                currentView = "0";
                view.getCardLayout().show(mainPanel, currentView);
            }
        }
    }
}
