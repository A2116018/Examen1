package uia.com.contabilidad.gestor;

public class DecoradorCuentas extends Decorador {
	
	public DecoradorCuentas(IGestor gestor, String tipo)
	{
		super(gestor, tipo);
	}
	
	
	public DecoradorCuentas()
	{		
	}
	
	public void validaCuentas()
	{
		super.Print();
	}


}
