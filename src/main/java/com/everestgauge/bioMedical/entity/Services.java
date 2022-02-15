/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.everestgauge.bioMedical.entity;

import java.io.Serializable;
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
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author timot
 */
@Entity
@Table(name = "services", catalog = "userauth", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Services.findAll", query = "SELECT s FROM Services s"),
    @NamedQuery(name = "Services.findByServiceid", query = "SELECT s FROM Services s WHERE s.serviceid = :serviceid"),
    @NamedQuery(name = "Services.findByDateadded", query = "SELECT s FROM Services s WHERE s.dateadded = :dateadded"),
    @NamedQuery(name = "Services.findByDateupdated", query = "SELECT s FROM Services s WHERE s.dateupdated = :dateupdated"),
    @NamedQuery(name = "Services.findByServicename", query = "SELECT s FROM Services s WHERE s.servicename = :servicename"),
    @NamedQuery(name = "Services.findByDescription", query = "SELECT s FROM Services s WHERE s.description = :description"),
    @NamedQuery(name = "Services.findByServicekey", query = "SELECT s FROM Services s WHERE s.servicekey = :servicekey"),
    @NamedQuery(name = "Services.findByAddedby", query = "SELECT s FROM Services s WHERE s.addedby = :addedby"),
    @NamedQuery(name = "Services.findByUpdatedby", query = "SELECT s FROM Services s WHERE s.updatedby = :updatedby")})
public class Services implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "serviceid")
    private Integer serviceid;
    @Basic(optional = false)
    @NotNull
    @Column(name = "dateadded")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateadded;
    @Basic(optional = false)
    @NotNull
    @Column(name = "dateupdated")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateupdated;
    @Size(max = 255)
    @Column(name = "servicename")
    private String servicename;
    @Size(max = 255)
    @Column(name = "description")
    private String description;
    @Size(max = 25)
    @Column(name = "servicekey")
    private String servicekey;
    @Column(name = "addedby")
    private Integer addedby;
    @Column(name = "updatedby")
    private Integer updatedby;

    public Services() {
    }

    public Services(Integer serviceid) {
        this.serviceid = serviceid;
    }

    public Services(Integer serviceid, Date dateadded, Date dateupdated) {
        this.serviceid = serviceid;
        this.dateadded = dateadded;
        this.dateupdated = dateupdated;
    }

    public Integer getServiceid() {
        return serviceid;
    }

    public void setServiceid(Integer serviceid) {
        this.serviceid = serviceid;
    }

    public Date getDateadded() {
        return dateadded;
    }

    public void setDateadded(Date dateadded) {
        this.dateadded = dateadded;
    }

    public Date getDateupdated() {
        return dateupdated;
    }

    public void setDateupdated(Date dateupdated) {
        this.dateupdated = dateupdated;
    }

    public String getServicename() {
        return servicename;
    }

    public void setServicename(String servicename) {
        this.servicename = servicename;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getServicekey() {
        return servicekey;
    }

    public void setServicekey(String servicekey) {
        this.servicekey = servicekey;
    }

    public Integer getAddedby() {
        return addedby;
    }

    public void setAddedby(Integer addedby) {
        this.addedby = addedby;
    }

    public Integer getUpdatedby() {
        return updatedby;
    }

    public void setUpdatedby(Integer updatedby) {
        this.updatedby = updatedby;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (serviceid != null ? serviceid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Services)) {
            return false;
        }
        Services other = (Services) object;
        if ((this.serviceid == null && other.serviceid != null) || (this.serviceid != null && !this.serviceid.equals(other.serviceid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.everestgauge.bioMedical.entity.Services[ serviceid=" + serviceid + " ]";
    }
    
}
