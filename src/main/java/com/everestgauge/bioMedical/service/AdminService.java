package com.everestgauge.bioMedical.service;

import java.util.List;
import com.everestgauge.bioMedical.entity.Admin;
import com.everestgauge.bioMedical.entity.User;

public interface AdminService {

	public List<Admin> findByRole(String user);

	public Admin findByEmail(String user);

	public List<Admin> findAll();

	public void save(Admin admin);

}
