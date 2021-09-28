package distance;

import static org.junit.Assert.*;

import org.junit.Test;

public class DistanceTest {

	@Test
	public void TestaConversaoKmHparaKmMin() {
		
		double dMinutos = ConversorUnidades.ConverteKmHparaKmMin(60);
		double dExpected = 1;
		
		assertEquals(dExpected,dMinutos,0.1);
	}
	
	@Test
    public void TestaErroConversaoKmHparaKmMin() {
		
		double dMinutos = ConversorUnidades.ConverteKmHparaKmMin(60);
		double dExpected = 2;
		
		assertNotEquals(dExpected,dMinutos);
	}
	
	@Test
    public void TestaDeltaVelocidadeRelativa() {
		
		double dDelta = ConversorUnidades.DevolveDeltaVelocidade(60,90);
		double dExpected = 30;
		
		assertEquals(dExpected,dDelta,0.1);
	}
	
	@Test
    public void TestaErroDeltaVelocidadeRelativa() {
		
		double dDelta = ConversorUnidades.DevolveDeltaVelocidade(60,90);
		double dExpected = 35;
		
		assertNotEquals(dExpected,dDelta,0.1);
	}
	
	@Test
    public void TestaSomaVelocidade() {
		
		double dDelta = ConversorUnidades.DevoleSomaVelocidade(1,3);
		double dExpected = 4;
		
		assertEquals(dExpected,dDelta,0.1);
	}
	
	
	@Test
    public void TestaErroSomaVelocidade() {
		
		double dDelta = ConversorUnidades.DevoleSomaVelocidade(1,3);
		double dExpected = 5;
		
		assertNotEquals(dExpected,dDelta,0.1);
	}
	
	@Test
	
	public void TestaQuantidadeMinutosParaChegarDestino() {
		int iMinutos = ConversorUnidades.QuantidadeMinutosParaChegarDestino(60, 90, 30);
		int iExpected = 60;
		
		assertEquals(iExpected,iMinutos);
		
		assertEquals(220,ConversorUnidades.QuantidadeMinutosParaChegarDestino(60, 90, 110));
		assertEquals(14,ConversorUnidades.QuantidadeMinutosParaChegarDestino(60, 90, 7));
		
	}
	
	@Test
	
	public void TestaErroQuantidadeMinutosParaChegarDestino() {
		int iMinutos = ConversorUnidades.QuantidadeMinutosParaChegarDestino(60, 90, 30);
		int iExpected = 66;
		
		assertNotEquals(iExpected,iMinutos);
		
		assertNotEquals(223,ConversorUnidades.QuantidadeMinutosParaChegarDestino(60, 90, 110));
		assertNotEquals(12,ConversorUnidades.QuantidadeMinutosParaChegarDestino(60, 90, 7));
		
	}
	
}
