package com.ecos.aplicacion.viewModel.test;


import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;

import org.junit.Test;

import com.ecos.aplicacion.viewModel.MainViewModel;


public class MainViewModelTest {
	@Test
	public void DadaLaPalabra_Perico_CuandoJuegoConLaLetra_A_EntoncesObtengoFalso(){
		//Arrange
		MainViewModel viewModel = new MainViewModel();
		viewModel.iniciarJuegoConLaPalabra("Perico");
		
		//Act
		boolean formaParteDeLaPalabra = viewModel.jugarCon("a");
		
		//Assert
		assertThat(false,equalTo(formaParteDeLaPalabra));
	}
}
