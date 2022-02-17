package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import model.Appointment;
import model.Client;
import model.Pet;
import model.Trainer;

public class ClientDao{
	private SessionFactory sessionFactory;
	{
		sessionFactory=Database.getSessionFactory();
	}
	
	public int register(Client client, Pet pet){
		int clientId=0;
		Session session=sessionFactory.openSession();
		Transaction transaction=session.beginTransaction();
		
		session.save(pet);
		clientId=(int)session.save(client);
		transaction.commit();
		
		session.close();
		
		return clientId;
	}
	
	public List<Appointment> getAppointmentBookings(int id) {
		
	}
	
	public boolean checkSlotAvailability(String date,String type,int slot) {
		
	}
	public int assignTrainer(String type) {
		
	}
	public boolean addAppointment(String date,int slot,int clientId,int trainerId,int petId) {
		
	}
	
	public boolean bookAppointment(String date,int slot,int clientId,int petId,String petType) {
		
	}
	
	public Client login(String userId,String password) {
		
	}
	
	public boolean cancelAppointment(int bookingId) {
		
	}
	protected void finalize() {
		if(sessionFactory!=null)
			sessionFactory=null;
	}
}
