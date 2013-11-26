package com.ecos.aplicacion.test.ui;

import android.test.ActivityInstrumentationTestCase2;

import com.ecos.aplicacion.MainActivity;
import com.ecos.aplicacion.R;
import com.jayway.android.robotium.solo.Solo;

public class MainActivityTest extends ActivityInstrumentationTestCase2<MainActivity> {

	private Solo mSolo;

	public MainActivityTest() {
		super(MainActivity.class);
	}

	public void setUp() throws Exception {
		mSolo = new Solo(getInstrumentation(), getActivity());
	}

	public void testCualdoPulsoUnBotonElTextoCambia() throws Exception {

		mSolo.clickOnButton(mSolo.getString(R.string.pulsame));
		
		mSolo.waitForText(mSolo.getString(R.string.hola_caracola));

	}

	@Override
	public void tearDown() throws Exception {
		mSolo.finishOpenedActivities();
	}
}