package uia.com.contabilidad.cuentas;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

import uia.com.contabilidad.clientes.InfoUIA;

public class Cuenta extends InfoUIA
{
		String fecha = "";
		
		@JsonCreator
	    public Cuenta(@JsonProperty("id")int id, @JsonProperty("name")String name, @JsonProperty("fecha")String p1) 
		{
	        super(id, name);
	        super.type =  this. getClass(). getSimpleName();
	        this.fecha = p1;
	    }

		public String getFecha() {
			return fecha;
		}

		public void setFecha(String fecha) {
			this.fecha = fecha;
		}	
		
		

		public void validaCobranza()
		{
		}
}