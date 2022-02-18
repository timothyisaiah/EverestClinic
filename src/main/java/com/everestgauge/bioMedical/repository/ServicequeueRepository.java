package com.everestgauge.bioMedical.repository;

import java.util.Date;

import com.everestgauge.bioMedical.entity.Servicequeue;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface ServicequeueRepository extends JpaRepository<Servicequeue, Long> {

    @Query(value = "SELECT COUNT(servicequeueid) FROM servicequeue  WHERE unitserviceid=?1 AND DATE(timein)=?2 AND serviced=?3 AND ispopped=?4 AND canceled=?5", nativeQuery = true)
    Integer queueSize(Integer serviceid, Date timein,
            Boolean serviced, Boolean ispopped, Boolean canceled);
}
