package com.ecos.aplicacion.viewModel.test;


import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;

import org.junit.Before;
import org.junit.Test;

import com.ecos.aplicacion.viewModel.MainViewModel;


public class MainViewModelTest {
	MainViewModel mViewModel;
	
	@Before
	public void setup(){
		mViewModel = new MainViewModel();
		
	} 
	
	@Test
	public void DadaLaPalabra_Perico_CuandoJuegoConLaLetra_A_EntoncesObtengoFalse(){
		//Arrange
		mViewModel.iniciarJuegoConLaPalabra("Perico");
		
		//Act
		boolean formaParteDeLaPalabra = mViewModel.jugarCon("a");
		
		//Assert
		assertThat(false,equalTo(formaParteDeLaPalabra));
	}
	
	@Test
	public void DadaLaPalabra_Perico_CuandoJuegoConLaLetra_P_EntoncesObtengoTrue(){
		//Arrange
		mViewModel.iniciarJuegoConLaPalabra("Perico");
		
		//Act
		boolean formaParteDeLaPalabra = mViewModel.jugarCon("P");
		
		//Assert
		assertThat(true,equalTo(formaParteDeLaPalabra));
	}	
	
	@Test
	public void DadaLaPalabra_Perico_CuandoJuegoConLaLetra_p_EntoncesObtengoTrue(){
		//Arrange
		mViewModel.iniciarJuegoConLaPalabra("Perico");
		
		//Act
		boolean formaParteDeLaPalabra = mViewModel.jugarCon("p");
		
		//Assert
		assertThat(true,equalTo(formaParteDeLaPalabra));
	}	

}
