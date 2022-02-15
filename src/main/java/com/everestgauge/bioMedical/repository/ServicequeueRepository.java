package com.everestgauge.bioMedical.repository;

import java.util.Date;

import com.everestgauge.bioMedical.entity.Servicequeue;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface ServicequeueRepository extends JpaRepository<Servicequeue, Long> {

    @Query(value = "SELECT COUNT servicequeid FROM servicequeue s WHERE s.serviceid=?1,s.timein=?2,s.serviced=?3,s.ispopped=?4,s.canceled=?5", nativeQuery = true)
    Integer queueSize(Integer serviceid, Date timein,
            Boolean serviced, Boolean ispopped, Boolean canceled);
}
