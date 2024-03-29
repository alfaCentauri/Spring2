package DemoAnotaciones;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.beans.*;

public class UsoAnotaciones {

	public static void main(String[] args) {
		System.out.println("Demostración del uso de anotaciones en Spring.");
		try {
			ClassPathXmlApplicationContext contexto = new ClassPathXmlApplicationContext("applicationContext.xml");
			Empleados Pedro = contexto.getBean("ComercialExp", Empleados.class);
			Pedro.getInforme();
			Pedro.getTareas();
			contexto.close();
		}catch(BeansException ex){
			System.out.println("Error: Con la creación del bean.");
		}
	}

}
