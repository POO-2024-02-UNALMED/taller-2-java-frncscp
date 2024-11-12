package test;

public class Auto {
	String modelo;
	int precio;
	Asiento[] asientos;
	String marca;
	Motor motor;
	int registro;
	static String cantidadCreados;
	
int cantidadAsientos() {
	return asientos.length;
}

String verificarIntegridad() {
	
	for (int i = 0; i < asientos.length; i++) {
		if (asientos[i].registro != this.registro) {
			return "Las piezas no son originales";
		}
	}
	
	if (this.motor.registro != this.registro) {
		return "Las piezas no son originales";
	}
	
	return "Auto Original";
}

}
