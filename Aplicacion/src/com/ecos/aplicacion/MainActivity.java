package com.ecos.aplicacion;

import roboguice.activity.RoboActivity;
import roboguice.inject.InjectView;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends RoboActivity {

	@InjectView(R.id.txtLabel) TextView mLabel;
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    
    public void btnClickOnClick(View v){
    	mLabel.setText(R.string.hola_caracola);
    }
    
}
