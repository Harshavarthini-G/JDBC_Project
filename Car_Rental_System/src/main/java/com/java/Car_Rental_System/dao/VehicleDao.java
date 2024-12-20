package com.java.Car_Rental_System.dao;

import java.sql.SQLException;
import java.util.List;

import com.java.Car_Rental_System.model.Vehicle;

public interface VehicleDao {
	List<Vehicle> searchByCapacity(int Capacity) throws ClassNotFoundException,SQLException;

	List<Vehicle> showVehDao() throws SQLException, ClassNotFoundException;

	Vehicle searchByVehId(String vehicleID) throws ClassNotFoundException, SQLException;
	boolean insertVehicle(String vehid,String make,String model,int rate,String status,int pass,String engine) throws ClassNotFoundException, SQLException;

	boolean DelVehicle(String vehid) throws SQLException, ClassNotFoundException;
}
