package DemoAnotaciones;

import org.springframework.stereotype.Component;

@Component("ComercialExp")
public class ComercialExperimentado implements Empleados {

	public ComercialExperimentado() {
		
	}
	
	@Override
	public String getTareas() {
		return "Vender y convencer al cliente.";
	}

	@Override
	public String getInforme() {
		return "Informe creado por el comercial.";
	}

}
