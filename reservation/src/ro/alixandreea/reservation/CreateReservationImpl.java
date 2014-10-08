package ro.alixandreea.reservation;

import com.babel.core.function.crud.CreateImpl;
import ro.alixandreea.reservation.CreateReservation;
import ro.alixandreea.reservation.Reservation;
public class CreateReservationImpl extends CreateImpl implements CreateReservation {

	
	public CreateReservationImpl() {

	}

	public void finalize() throws Throwable {
		super.finalize();
	}

	/**
	 * 
	 * @param p
	 */
	public Reservation createReservation (Reservation r) {
		return super.create(r);
	}
	
}
