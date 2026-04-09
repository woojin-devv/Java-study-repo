import kr.or.kosa.common.AirPlane;

public class Ex06_AirPlane {
	public static void main(String[] args) {
		AirPlane airPlane = new AirPlane();
		airPlane.makeAirPlane(707,"대한 ");
		
		AirPlane airPlane2 = new AirPlane();
		airPlane.makeAirPlane(708,"아시아나  ");
		
		AirPlane airPlane3 = new AirPlane();
		airPlane.makeAirPlane(907,"  ");
		
		airPlane.airPlaneTotalCount();
		airPlane.airPlaneTotalCount();
		airPlane.airPlaneTotalCount();
	}
}
