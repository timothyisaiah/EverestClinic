package com.everestgauge.bioMedical.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.everestgauge.bioMedical.entity.Appointment;
import com.everestgauge.bioMedical.entity.User;

@Repository("appointmentRepository")
public interface AppointmentRepository extends JpaRepository<Appointment, Integer> {

}