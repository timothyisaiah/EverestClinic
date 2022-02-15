/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.everestgauge.bioMedical.entity;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author timot
 */
@Entity
@Table(name = "servicequeue", catalog = "userauth", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Servicequeue.findAll", query = "SELECT s FROM Servicequeue s"),
    @NamedQuery(name = "Servicequeue.findByServicequeueid", query = "SELECT s FROM Servicequeue s WHERE s.servicequeueid = :servicequeueid"),
    @NamedQuery(name = "Servicequeue.findByAddedby", query = "SELECT s FROM Servicequeue s WHERE s.addedby = :addedby"),
    @NamedQuery(name = "Servicequeue.findByServiced", query = "SELECT s FROM Servicequeue s WHERE s.serviced = :serviced"),
    @NamedQuery(name = "Servicequeue.findByServicedby", query = "SELECT s FROM Servicequeue s WHERE s.servicedby = :servicedby"),
    @NamedQuery(name = "Servicequeue.findByTimein", query = "SELECT s FROM Servicequeue s WHERE s.timein = :timein"),
    @NamedQuery(name = "Servicequeue.findByTimeout", query = "SELECT s FROM Servicequeue s WHERE s.timeout = :timeout"),
    @NamedQuery(name = "Servicequeue.findByServiceid", query = "SELECT s FROM Servicequeue s WHERE s.serviceid = :serviceid"),
    @NamedQuery(name = "Servicequeue.findByPatientvisitid", query = "SELECT s FROM Servicequeue s WHERE s.patientvisitid = :patientvisitid"),
    @NamedQuery(name = "Servicequeue.findByCanceled", query = "SELECT s FROM Servicequeue s WHERE s.canceled = :canceled"),
    @NamedQuery(name = "Servicequeue.findByCanceledby", query = "SELECT s FROM Servicequeue s WHERE s.canceledby = :canceledby"),
    @NamedQuery(name = "Servicequeue.findByTimecanceled", query = "SELECT s FROM Servicequeue s WHERE s.timecanceled = :timecanceled"),
    @NamedQuery(name = "Servicequeue.findByIspopped", query = "SELECT s FROM Servicequeue s WHERE s.ispopped = :ispopped"),
    @NamedQuery(name = "Servicequeue.findByTimepopped", query = "SELECT s FROM Servicequeue s WHERE s.timepopped = :timepopped"),
    @NamedQuery(name = "Servicequeue.findByPoppedby", query = "SELECT s FROM Servicequeue s WHERE s.poppedby = :poppedby")})
public class Servicequeue implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "servicequeueid")
    private Integer servicequeueid;
    @Column(name = "addedby")
    private Integer addedby;
    @Column(name = "serviced")
    private Boolean serviced;
    @Column(name = "servicedby")
    private Integer servicedby;
    @Column(name = "timein")
    @Temporal(TemporalType.TIMESTAMP)
    private Date timein;
    @Column(name = "timeout")
    @Temporal(TemporalType.TIMESTAMP)
    private Date timeout;
    @Column(name = "serviceid")
    private Integer serviceid;
    @Column(name = "patientvisitid")
    private BigInteger patientvisitid;
    @Column(name = "canceled")
    private Integer canceled;
    @Column(name = "canceledby")
    private Integer canceledby;
    @Column(name = "timecanceled")
    @Temporal(TemporalType.TIMESTAMP)
    private Date timecanceled;
    @Column(name = "ispopped")
    private Boolean ispopped;
    @Column(name = "timepopped")
    @Temporal(TemporalType.TIMESTAMP)
    private Date timepopped;
    @Column(name = "poppedby")
    private Integer poppedby;

    public Servicequeue() {
    }

    public Servicequeue(Integer servicequeueid) {
        this.servicequeueid = servicequeueid;
    }

    public Integer getServicequeueid() {
        return servicequeueid;
    }

    public void setServicequeueid(Integer servicequeueid) {
        this.servicequeueid = servicequeueid;
    }

    public Integer getAddedby() {
        return addedby;
    }

    public void setAddedby(Integer addedby) {
        this.addedby = addedby;
    }

    public Boolean getServiced() {
        return serviced;
    }

    public void setServiced(Boolean serviced) {
        this.serviced = serviced;
    }

    public Integer getServicedby() {
        return servicedby;
    }

    public void setServicedby(Integer servicedby) {
        this.servicedby = servicedby;
    }

    public Date getTimein() {
        return timein;
    }

    public void setTimein(Date timein) {
        this.timein = timein;
    }

    public Date getTimeout() {
        return timeout;
    }

    public void setTimeout(Date timeout) {
        this.timeout = timeout;
    }

    public Integer getServiceid() {
        return serviceid;
    }

    public void setServiceid(Integer serviceid) {
        this.serviceid = serviceid;
    }

    public BigInteger getPatientvisitid() {
        return patientvisitid;
    }

    public void setPatientvisitid(BigInteger patientvisitid) {
        this.patientvisitid = patientvisitid;
    }

    public Integer getCanceled() {
        return canceled;
    }

    public void setCanceled(Integer canceled) {
        this.canceled = canceled;
    }

    public Integer getCanceledby() {
        return canceledby;
    }

    public void setCanceledby(Integer canceledby) {
        this.canceledby = canceledby;
    }

    public Date getTimecanceled() {
        return timecanceled;
    }

    public void setTimecanceled(Date timecanceled) {
        this.timecanceled = timecanceled;
    }

    public Boolean getIspopped() {
        return ispopped;
    }

    public void setIspopped(Boolean ispopped) {
        this.ispopped = ispopped;
    }

    public Date getTimepopped() {
        return timepopped;
    }

    public void setTimepopped(Date timepopped) {
        this.timepopped = timepopped;
    }

    public Integer getPoppedby() {
        return poppedby;
    }

    public void setPoppedby(Integer poppedby) {
        this.poppedby = poppedby;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (servicequeueid != null ? servicequeueid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Servicequeue)) {
            return false;
        }
        Servicequeue other = (Servicequeue) object;
        if ((this.servicequeueid == null && other.servicequeueid != null) || (this.servicequeueid != null && !this.servicequeueid.equals(other.servicequeueid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.everestgauge.bioMedical.entity.Servicequeue[ servicequeueid=" + servicequeueid + " ]";
    }
    
}
