package uia.com.contabilidad;

import uia.com.contabilidad.cheques.Cheque;
import uia.com.contabilidad.clientes.Compra;
import uia.com.contabilidad.clientes.Requisicion;
import uia.com.contabilidad.cuentas.Cuenta;
import uia.com.contabilidad.gestor.DecoradorCheques;
import uia.com.contabilidad.gestor.DecoradorCompras;
import uia.com.contabilidad.gestor.DecoradorProveedores;
import uia.com.contabilidad.gestor.DecoradorRequisicion;
import uia.com.contabilidad.gestor.Gestor;
import uia.com.contabilidad.proveedores.Proveedor;

public class Principal {
	public static void main(String[] args) {				
		System.out.println("Hola UIA");
		Proveedor proveedor=null;
		Compra compra=null;
		Cuenta cuenta=null;
		Requisicion requisicion=null;
		//Factura factura=null;
		Cheque cheque=null;
		
		
		Gestor contabilidad = new Gestor("C:\\Users\\wenty\\Examen1\\Examen1-AS-master\\contabilidadUIA\\ListaProveedores.json");
		
		 DecoradorProveedores gestorProveedores = new DecoradorProveedores(contabilidad, "proveedor");
		 DecoradorCompras gestorCompras = new DecoradorCompras(gestorProveedores, "Compra");
		 DecoradorCompras gestorCuentas = new DecoradorCompras(gestorCompras, "Cuenta");
		 DecoradorRequisicion gestorRequisicion = new DecoradorRequisicion(gestorCuentas, "Requisicion");		 
		 DecoradorCheques gestorCheques = new DecoradorCheques(gestorRequisicion, "Cheque");
		 
		 
		Object registrarCuentasXPagar;
		Object validaAprobacionCuentasXPagar;
	   
		 
		 gestorProveedores.Print();
		 gestorCompras.Print();
		 gestorCuentas.Print();
		 gestorRequisicion.Print();
		 gestorCheques.Print();		 
		 proveedor = (Proveedor) gestorProveedores.busca("Nazir");
		 proveedor.Print();
		 compra = (Compra) gestorCompras.busca("Nazir-compra-A");
		 compra.Print();
		 cuenta = (Cuenta) gestorCuentas.busca("Nazir-compra-A-Cuenta-2");
		 cuenta.Print();
		
		 requisicion = (Requisicion) gestorRequisicion.busca("Nazir-compra-A-cuenta-1-Req-Cheques");
		 requisicion.Print();
		 //requisición.valida();
		 requisicion.Print();
		 cheque = (Cheque) gestorCheques.busca("Nazir-compra-A-cuenta-1-Req-Cheques-ChequesX");
		 cheque.Print();
		 
		
	}


}
