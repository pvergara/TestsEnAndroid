package com.ecos.aplicacion.test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;

import org.junit.Test;
import org.junit.runner.RunWith;

import com.ecos.aplicacion.MainActivity;
import com.ecos.aplicacion.R;
import com.xtremelabs.robolectric.RobolectricTestRunner;

@RunWith(RobolectricTestRunner.class)
public class MyFirstRobolectricTest {

	@Test
	public void shouldHaveHappySmiles() throws Exception {
		String hello = new MainActivity().getResources().getString(
				R.string.hello_world);
		assertThat(hello, equalTo("Hello world!"));

	}
}
