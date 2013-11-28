package com.ecos.aplicacion;

import roboguice.activity.RoboActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends RoboActivity {

	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    
    public void btnClickOnClick(View v){
    }
    
}
