package com.oops;

import java.util.ArrayList;
import java.util.Random;

class TravelApp{
	private ArrayList<Flights> flights;
	private ArrayList<Hotels> hotels;
	public TravelApp() {
		this.flights = new ArrayList<Flights>();
		this.hotels = new ArrayList<Hotels>();
	}
	public void searchFlight(String origin,String destination,String date,int passengerNumber) {
		System.out.println("Searching flight from "+origin+" to "+destination+" on "+date+" for "+passengerNumber+" passengers.");
	}
	public void searchHotel(String location,String checkIn,String checkOut,int guestNumber) {
		System.out.println("Searching hotel in "+location+" from "+checkIn+" to "+checkOut+" for "+guestNumber+" guest.");
	}
	public void bookFlight(int flightNumber, String passengerName, String origin, String destination, String date,
			int passengerNumber, double price) {
		Flights flight=new Flights(flightNumber,passengerName,origin,destination,date,passengerNumber,price);
		int confirmationNumber=generateConfirmationNumber();
		flight.setConfirmationNumber(confirmationNumber);
		this.flights.add(flight);
		System.out.println("Flight booked.. confirmation numbers is:"+confirmationNumber);
	}
	public void bookHotel(int hotelId, String name, String location, String checkIn, String checkOut, int guestNumber,
			double price) {
		Hotels hotel=new Hotels(hotelId,name,location,checkIn,checkOut,guestNumber,price);
		int confirmationNumber=generateConfirmationNumber();
		hotel.setConfirmationNumber(confirmationNumber);
		this.hotels.add(hotel);
		System.out.println("Hotel booked.. confirmation numbers is:"+confirmationNumber);
	}
	public void cancelReservation(int confirmationNumber) {
		for(Flights f:this.flights) {
			if(f.getConfirmationNumber()==confirmationNumber) {
				this.flights.remove(confirmationNumber);
				System.out.println("Flight cancelled with confirmation numbers:"+confirmationNumber);
				return;
			}
		}
		for(Hotels h:this.hotels) {
			if(h.getConfirmationNumber()==confirmationNumber) {
				this.hotels.remove(confirmationNumber);
				System.out.println("Flight cancelled with confirmation numbers:"+confirmationNumber);
				return;
			}
		}
		System.out.println("No reservation found with this confirmation number...");
	}
	private int generateConfirmationNumber() {
		Random r=new Random();
		return r.nextInt(9000000)+(100000000);
	}
}
class Flights{
	private int flightNumber;
	private String passengerName;
	private String origin;
	private String destination;
	private String date;
	private int passengerNumber;
	private double price;
	private int confirmationNumber;
	public Flights(int flightNumber, String passengerName, String origin, String destination, String date,
			int passengerNumber, double price) {
		super();
		this.flightNumber = flightNumber;
		this.passengerName = passengerName;
		this.origin = origin;
		this.destination = destination;
		this.date = date;
		this.passengerNumber = passengerNumber;
		this.price = price;
	}
	public int getFlightNumber() {
		return flightNumber;
	}
	public String getPassengerName() {
		return passengerName;
	}
	public String getOrigin() {
		return origin;
	}
	public String getDestination() {
		return destination;
	}
	public String getDate() {
		return date;
	}
	public int getPassengerNumber() {
		return passengerNumber;
	}
	public double getPrice() {
		return price;
	}
	public int getConfirmationNumber() {
		return confirmationNumber;
	}
	public void setConfirmationNumber(int confirmationNumber) {
		this.confirmationNumber = confirmationNumber;
	}
}
class Hotels{
	private int hotelId;
	private String name;
	private String location;
	private String checkIn;
	private String checkOut;
	private int guestNumber;
	private double price;
	private int confirmationNumber;
	public Hotels(int hotelId, String name, String location, String checkIn, String checkOut, int guestNumber,
			double price) {
		super();
		this.hotelId = hotelId;
		this.name = name;
		this.location = location;
		this.checkIn = checkIn;
		this.checkOut = checkOut;
		this.guestNumber = guestNumber;
		this.price = price;
	}
	public int getHotelId() {
		return hotelId;
	}
	public String getName() {
		return name;
	}
	public String getLocation() {
		return location;
	}
	public String getCheckIn() {
		return checkIn;
	}
	public String getCheckOut() {
		return checkOut;
	}
	public int getGuestNumber() {
		return guestNumber;
	}
	public double getPrice() {
		return price;
	}
	public int getConfirmationNumber() {
		return confirmationNumber;
	}
	public void setConfirmationNumber(int confirmationNumber) {
		this.confirmationNumber = confirmationNumber;
	}
}
public class Example19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TravelApp app=new TravelApp();
		app.searchFlight("Bangalore", "Paris", "23-12-2023", 2);
		app.searchHotel("Paris", "24-12-2023", "02-01-2024", 2);
		app.bookFlight(123456, "Himani Kumari", "Blr","Paris", "23-12-2023", 1, 1400.0);
		app.bookFlight(123456, "Soumya", "Blr","Paris", "23-12-2023", 1, 1450.0);
		app.bookHotel(57645735, "Soumya Ranjan", "Paris","24-12-2023", "02-01-2024", 2, 64834.098);
		app.cancelReservation(57645735);
	}

}
