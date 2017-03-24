package com.example.mobsoft.mobsoftlab3.ui.main;

/**
 * Created by mobsoft on 2017. 03. 24..
 */

import com.example.mobsoft.mobsoftlab3.ui.Presenter;

/**
 * Created by Patrik on 2017. 03. 19..
 */

public class MainPresenter extends Presenter<MainScreen> {

   // private MainPresenter instance = null;

    public MainPresenter() {
    }

 //   public MainPresenter getInstance() {
 //       if (instance == null) {
 //           instance = new MainPresenter();
  //      }
  //      return instance;
 //   }

    @Override
    public void attachScreen(MainScreen screen) {
        super.attachScreen(screen);
    }

    @Override
    public void detachScreen() {
        super.detachScreen();
    }
}
