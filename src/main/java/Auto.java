package test;

public class Auto {
	String modelo;
	int precio;
	Asiento[] asientos;
	String marca;
	Motor motor;
	int registro;
	static int cantidadCreados;
	
int cantidadAsientos() {
	int counter = 0;
	for (Asiento asiento : asientos) {
		if (asiento != null) {
			counter++;
		}
	}
	return counter;
}

String verificarIntegridad() {
	
	for (Asiento asiento : asientos) {
		if (asiento != null && asiento.registro != this.registro) {
			return "Las piezas no son originales";
		}
	}
	
	if (motor.registro != this.registro) {
		return "Las piezas no son originales";
	}
	
	return "Auto Original";
}

}
