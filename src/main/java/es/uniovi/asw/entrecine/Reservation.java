package es.uniovi.asw.entrecine;

/**
 * Reservations.
 * @author labra
 *
 */
public class Reservation {

/** Number of seats. */
private int seats;

/** Individual price of each seat. */
private double pricePerSeat;

private String disponibilidad;

public String isDisponibilidad() {
	return disponibilidad;
}
public void setDisponibilidad(String disponibilidad) {
	this.disponibilidad = disponibilidad;
}

/**
 * @param seats Number of seats
 * @param pricePerSeat Price of each seat
 */
public Reservation(int seats, double pricePerSeat) {
 this.seats = seats;
 this.pricePerSeat = pricePerSeat;
}



public Reservation(int seats) {
	this.seats = seats;
}
public Reservation(int seats, double pricePerSeat, String disponibilidad) {
	this.seats = seats;
	this.pricePerSeat = pricePerSeat;
	this.disponibilidad = disponibilidad;
}
/**
 * @return Price of the reservation
 */
public double getPrice() {
 return seats * pricePerSeat;
}

/**
 * @return number of seats.
 */
public final int getSeats() {
 return seats;
}

/**
 * @return price per seat.
 */
public final double getPricePerSeat() {
 return pricePerSeat;
}

}
