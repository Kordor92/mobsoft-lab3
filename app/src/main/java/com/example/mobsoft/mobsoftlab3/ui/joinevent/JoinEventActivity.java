package com.example.mobsoft.mobsoftlab3.ui.joinevent;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutCompat;
import android.widget.Toast;

import com.example.mobsoft.mobsoftlab3.MobSoftApplication;
import com.example.mobsoft.mobsoftlab3.R;
import com.example.mobsoft.mobsoftlab3.ui.joinevent.JoinEventPresenter;
import com.example.mobsoft.mobsoftlab3.ui.main.MainScreen;

import javax.inject.Inject;


public class JoinEventActivity  extends AppCompatActivity implements JoinEventScreen {
    @Inject
    JoinEventPresenter joinEventPresenter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        MobSoftApplication.injector.inject(this);
    }

    @Override
    protected void onStart() {
        super.onStart();
        joinEventPresenter.attachScreen(this);
    }

    @Override
    protected void onStop() {
        super.onStop();
        joinEventPresenter.detachScreen();
    }

    @Override
    public void showMessage(String text) {
        Toast.makeText(this, text, Toast.LENGTH_SHORT).show();
    }

    @Override
    public void joinEvent(String name, String Phone, String role){}

    public void showEventDetails(String eventName, String eventPlace, String[] eventRoles){}
}
