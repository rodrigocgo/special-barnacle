package distance;

public class ConversorUnidades {
	
	private static double ConverteKmHparaKmMin(double dKmH)
	{
	  return dKmH/60;	
	}
	
	
	private static double DevoleVelocidadeRelativa(double KmHY,double KmHX)
	{
	  return KmHY + KmHX;
	}
	
	private static double DevolveDeltaVelocidade(double KmHY,double KmHX)
	{
	  return KmHX - KmHY;
	}
		
	public static double QuantidadeMinutosParaChegarDestino(double KmHY,double KmHX, int iDistancia)
	{
		double dkmMinX = ConverteKmHparaKmMin( KmHY);
		double dkmMinY = ConverteKmHparaKmMin(KmHX);
		double dDeltaVelocidade = DevolveDeltaVelocidade(KmHY,KmHX);
		double dCoeficienteVelocidadeRelativa = ConverteKmHparaKmMin(dDeltaVelocidade);
		
		double dVelocidadeRelativa = DevoleVelocidadeRelativa(dkmMinX,dkmMinY)-dCoeficienteVelocidadeRelativa;
		
		return dVelocidadeRelativa * iDistancia;
	
	}
}
