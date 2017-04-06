package com.example.mobsoft.mobsoftlab3.ui.createevent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.example.mobsoft.mobsoftlab3.MobSoftApplication;
import com.example.mobsoft.mobsoftlab3.R;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


import javax.inject.Inject;

public class CreateEventActivity extends AppCompatActivity implements CreateEventScreen{
	
	@Inject
    CreateEventPresenter createEventPresenter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        MobSoftApplication.injector.inject(this);
    }

    @Override
    protected void onStart() {
        super.onStart();
        createEventPresenter.attachScreen(this);
    }

    @Override
    protected void onStop() {
        super.onStop();
        createEventPresenter.detachScreen();
    }


    @Override
    public void showMessage(String text) {
        Toast.makeText(this, text, Toast.LENGTH_SHORT).show();
    }
	
	@Override
	public void createEvent(String name, String place, List<String> prerequisites){}
	
}
