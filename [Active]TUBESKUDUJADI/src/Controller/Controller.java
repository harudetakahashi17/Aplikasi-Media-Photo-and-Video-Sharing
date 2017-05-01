/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.*;
import View.*;
import View2.*;
import db.dbConn;
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
    private HomePage view2;
    private ChoosePhoto cp;
    private ChooseVideo cv;
    
    private String currentView;
    private String currentView2;
    private JPanel mainPanel;
    private JPanel mainPanel2;
    
    private LoginView Login;
    private SignUpView SignUp;
    private wHelp Help;
    private Home home;
    private FriendList FL;
    private Profile prof;
    private Search sch;
    
    
    public Controller(Aplikasi model) {
        this.model = model;
        this.view = new MainLogin();
        this.view2 = new HomePage();
        this.cp = new ChoosePhoto();
        this.cv = new ChooseVideo();

        Login = new LoginView();
        SignUp = new SignUpView();
        Help = new wHelp();
        home = new Home();
        FL = new FriendList();
        prof = new Profile();
        sch = new Search();

        Login.addListener(this);
        SignUp.addListener(this);
        view2.addListener(this);
        
        mainPanel = view.getMainPanel();
        mainPanel.add(Login, "0");
        mainPanel.add(SignUp, "1");
        currentView = "0";
        view.getCardLayout().show(mainPanel, currentView);
        view.setVisible(true);
        
        mainPanel2 = view2.getHomeView();
        mainPanel2.add(home,"0");
        mainPanel2.add(prof,"1");
        mainPanel2.add(sch,"2");
        mainPanel2.add(FL,"3");
        currentView2 = "0";
        view2.getCardLayout2().show(mainPanel2, currentView2);
        //view.addListener(this);
    }
    
    @Override
    public void actionPerformed(ActionEvent ae){
        Object s = ae.getSource();
        if (currentView.equals("0")) {
            //current view = Main Menu
            if (s.equals(Login.getBtnLogin())){
                String uname = Login.getUname();
                String passwd = Login.getPasswd();
                
                view2.setVisible(true);
                view.dispose();
            }
            if (s.equals(Login.getBtnSignUp())) {
                currentView = "1";
                view.getCardLayout().show(mainPanel, currentView);
            }
            if (s.equals(Login.getBtnHelp())){
                Help.setVisible(true);
            }
        } else if (currentView.equals("1")) {
            //current view = Main Menu
            if (s.equals(SignUp.getBtnBack())) {
                currentView = "0";
                view.getCardLayout().show(mainPanel, currentView);
            }
            if (s.equals(SignUp.getBtnSignUp())) {
                int id = Akun.getUID();
                String uname = SignUp.getUsername();
                String password = SignUp.getPassword();
                String rName = SignUp.getRName();
                String email = SignUp.getEmail();
                String phone = SignUp.getPhone();
                String gender = SignUp.getGender();
                model.addAkun(uname,password,rName,email,phone,gender);
                SignUp.reset();
                currentView = "0";
                view.getCardLayout().show(mainPanel, currentView);
            }
        }
        
        if (currentView2.equals("0")){
            if (s.equals(view2.getBtnHome())) {
                currentView2 = "0";
                view2.getCardLayout2().show(mainPanel2, currentView2);
            }
            if (s.equals(view2.getBtnProfile())) {
                currentView2 = "1";
                view2.getCardLayout2().show(mainPanel2, currentView2);
            }
            if (s.equals(view2.getBtnSearch())) {
                currentView2 = "2";
                view2.getCardLayout2().show(mainPanel2, currentView2);
            }
            if (s.equals(view2.getBtnFriends())) {
                currentView2 = "3";
                view2.getCardLayout2().show(mainPanel2, currentView2);
            }
            if (s.equals(view2.getBtnHelp())){
                Help.setVisible(true);
            }
            if (s.equals(view2.getBtnLogout())){
                view2.dispose();
                view.setVisible(true);
            }
            if (s.equals(view2.getBtnNewPhoto())){
                cp.setVisible(true);
            }
            if (s.equals(view2.getBtnNewVideo())){
                cv.setVisible(true);
            }
        }
        if (currentView2.equals("1")){
            if (s.equals(view2.getBtnHome())) {
                currentView2 = "0";
                view2.getCardLayout2().show(mainPanel2, currentView2);
            }
            if (s.equals(view2.getBtnProfile())) {
                currentView2 = "1";
                view2.getCardLayout2().show(mainPanel2, currentView2);
            }
            if (s.equals(view2.getBtnSearch())) {
                currentView2 = "2";
                view2.getCardLayout2().show(mainPanel2, currentView2);
            }
            if (s.equals(view2.getBtnFriends())) {
                currentView2 = "3";
                view2.getCardLayout2().show(mainPanel2, currentView2);
            }
            if (s.equals(view2.getBtnHelp())){
                Help.setVisible(true);
            }
            if (s.equals(view2.getBtnLogout())){
                view2.dispose();
                view.setVisible(true);
            }
            if (s.equals(view2.getBtnNewPhoto())){
                cp.setVisible(true);
            }
            if (s.equals(view2.getBtnNewVideo())){
                cv.setVisible(true);
            }
        }
        if (currentView2.equals("2")){
            if (s.equals(view2.getBtnHome())) {
                currentView2 = "0";
                view2.getCardLayout2().show(mainPanel2, currentView2);
            }
            if (s.equals(view2.getBtnProfile())) {
                currentView2 = "1";
                view2.getCardLayout2().show(mainPanel2, currentView2);
            }
            if (s.equals(view2.getBtnSearch())) {
                currentView2 = "2";
                view2.getCardLayout2().show(mainPanel2, currentView2);
            }
            if (s.equals(view2.getBtnFriends())) {
                currentView2 = "3";
                view2.getCardLayout2().show(mainPanel2, currentView2);
            }
            if (s.equals(view2.getBtnHelp())){
                Help.setVisible(true);
            }
            if (s.equals(view2.getBtnLogout())){
                view2.dispose();
                view.setVisible(true);
            }
            if (s.equals(view2.getBtnNewPhoto())){
                cp.setVisible(true);
            }
            if (s.equals(view2.getBtnNewVideo())){
                cv.setVisible(true);
            }
        }
        if (currentView2.equals("3")){
            if (s.equals(view2.getBtnHome())) {
                currentView2 = "0";
                view2.getCardLayout2().show(mainPanel2, currentView2);
            }
            if (s.equals(view2.getBtnProfile())) {
                currentView2 = "1";
                view2.getCardLayout2().show(mainPanel2, currentView2);
            }
            if (s.equals(view2.getBtnSearch())) {
                currentView2 = "2";
                view2.getCardLayout2().show(mainPanel2, currentView2);
            }
            if (s.equals(view2.getBtnFriends())) {
                currentView2 = "3";
                view2.getCardLayout2().show(mainPanel2, currentView2);
            }
            if (s.equals(view2.getBtnHelp())){
                Help.setVisible(true);
            }
            if (s.equals(view2.getBtnLogout())){
                view2.dispose();
                view.setVisible(true);
            }
            if (s.equals(view2.getBtnNewPhoto())){
                cp.setVisible(true);
            }
            if (s.equals(view2.getBtnNewVideo())){
                cv.setVisible(true);
            }
        }
    }
}
