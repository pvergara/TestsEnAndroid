package com.ecos.aplicacion.viewModel.test;


import org.junit.Before;
import org.junit.Test;

import com.ecos.aplicacion.model.EstadoPartida;
import com.ecos.aplicacion.viewModel.MainViewModel;
import com.ecos.mvvm.NotificationHandler;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;


public class MainViewModelTest {
	MainViewModel mViewModel;
	NotificationHandler mMockedNotificationHandler;
	@Before
	public void setup(){
		mViewModel = new MainViewModel();
		mMockedNotificationHandler = mock(NotificationHandler.class);
		mViewModel.setNotificationHandler(mMockedNotificationHandler);
		
	} 
	
	@Test
	public void DadaLaPalabra_Perico_CuandoJuegoConLaLetra_a_EntoncesObtengoFalseYSeNotificaElEstadoDelJuegoIndicandoPrimerFalloLaLetraUsadaYLaRepresentacionDeLaPalabraOcultaHabraCambiado(){
		//Arrange
		mViewModel.iniciarJuegoConLaPalabra("Perico");
		EstadoPartida estadoPartida = EstadoPartida.crearDesde(1,'a');
		
		//Act
		boolean formaParteDeLaPalabra = mViewModel.jugarCon('a');
		
		//Assert
		assertThat(formaParteDeLaPalabra,equalTo(false));				
		verify(mMockedNotificationHandler).notify("estadoPartidaChanged", estadoPartida);
		assertThat(mViewModel.getPalabraOculta(),equalTo("_ _ _ _ _ _"));
	}
	
	@Test
	public void DadaLaPalabra_Perico_CuandoJuegoConLaLetra_P_EntoncesObtengoTrueYSeNotificaElEstadoDelJuegoIndicandoPrimerFalloLaLetraUsadaYLaRepresentacionDeLaPalabraOcultaHabraCambiado(){
		//Arrange
		mViewModel.iniciarJuegoConLaPalabra("Perico");
		char letraUsada = 'P';
		
		//Act
		boolean formaParteDeLaPalabra = mViewModel.jugarCon(letraUsada);
		
		//Assert
		assertThat(formaParteDeLaPalabra,equalTo(true));
		verify(mMockedNotificationHandler).notify("estadoPartidaChanged", EstadoPartida.crearDesde(0,letraUsada));
		assertThat(mViewModel.getPalabraOculta(),equalTo("P _ _ _ _ _"));
	}	
	
	@Test
	public void DadaLaPalabra_Perico_CuandoJuegoConLaLetra_p_EntoncesObtengoTrue(){
		//Arrange
		mViewModel.iniciarJuegoConLaPalabra("Perico");
		
		//Act
		boolean formaParteDeLaPalabra = mViewModel.jugarCon('p');
		
		//Assert
		assertThat(formaParteDeLaPalabra,equalTo(true));
	}	

}
