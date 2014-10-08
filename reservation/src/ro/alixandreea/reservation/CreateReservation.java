package ro.alixandreea.reservation;

import com.babel.core.function.crud.Create;
import com.babel.order.Order;

public interface CreateReservation extends Create {

	/**
	 * 
	 * @param p
	 */
	public Reservation createReservation (Reservation r);

}

