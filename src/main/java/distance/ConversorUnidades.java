package distance;

public class ConversorUnidades {
	
	public static double ConverteKmHparaKmMin(double dKmH)
	{
	  return dKmH/60;	
	}
	
	
	public static double DevoleSomaVelocidade(double KmHY,double KmHX)
	{
	  return KmHY + KmHX;
	}
	
	public static double DevolveDeltaVelocidade(double KmHY,double KmHX)
	{
	  return KmHX - KmHY;
	}
		
	public static int QuantidadeMinutosParaChegarDestino(double KmHY,double KmHX, int iDistancia)
	{
		double dkmMinX = ConverteKmHparaKmMin( KmHY);
		double dkmMinY = ConverteKmHparaKmMin(KmHX);
		double dDeltaVelocidade = DevolveDeltaVelocidade(KmHY,KmHX);
		double dCoeficienteVelocidadeRelativa = ConverteKmHparaKmMin(dDeltaVelocidade);
		
		double dVelocidadeRelativa = DevoleSomaVelocidade(dkmMinX,dkmMinY)-dCoeficienteVelocidadeRelativa;
		
		return  (int) (dVelocidadeRelativa * iDistancia);
	
	}
}
