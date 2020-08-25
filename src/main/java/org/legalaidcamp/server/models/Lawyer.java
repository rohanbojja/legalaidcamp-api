package org.legalaidcamp.server.models;


import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.util.Date;
import java.util.Set;

//TODO: WIP
@Entity
@EntityListeners(AuditingEntityListener.class)
public class Lawyer {
    @Id
    String uid;

    @Column(unique = true, nullable = false)
    @ManyToMany(targetEntity = Language.class)
    Set<Language> languages;

    @ManyToOne(targetEntity = State.class)
    State stateOfPractice;
    String city;

    @ManyToOne(targetEntity = BarCouncil.class)
    BarCouncil barCouncil;

    @Column(unique = true, nullable = false)
    @ManyToMany(targetEntity = AreaOfLaw.class)
    Set<AreaOfLaw> areasOfLaw;

    Long gender;
    String officeAddress;
    String officePincode;
    Boolean allowCalls;
    Boolean allowVisits;
    Boolean profileStatus;
    Boolean isVerified;

    @Column(name = "created_date", nullable = false, updatable = false)
    @CreatedDate
    private Date createdDate;

    @Column(name = "modified_date")
    @LastModifiedDate
    private Date modifiedDate;

    public Lawyer() {
    }

    public Lawyer(String uid, Set<Language> languages, State stateOfPractice, String city, BarCouncil barCouncil, Set<AreaOfLaw> areasOfLaw, Long gender, String officeAddress, String officePincode, Boolean allowCalls, Boolean allowVisits, Boolean profileStatus, Boolean isVerified) {
        this.uid = uid;
        this.languages = languages;
        this.stateOfPractice = stateOfPractice;
        this.city = city;
        this.barCouncil = barCouncil;
        this.areasOfLaw = areasOfLaw;
        this.gender = gender;
        this.officeAddress = officeAddress;
        this.officePincode = officePincode;
        this.allowCalls = allowCalls;
        this.allowVisits = allowVisits;
        this.profileStatus = profileStatus;
        this.isVerified = isVerified;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }


    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }


    public Set<Language> getLanguages() {
        return languages;
    }

    public void setLanguages(Set<Language> languages) {
        this.languages = languages;
    }

    public Set<AreaOfLaw> getAreasOfLaw() {
        return areasOfLaw;
    }

    public void setAreasOfLaw(Set<AreaOfLaw> areasOfLaw) {
        this.areasOfLaw = areasOfLaw;
    }

    public Long getGender() {
        return gender;
    }

    public void setGender(Long gender) {
        this.gender = gender;
    }

    public String getOfficeAddress() {
        return officeAddress;
    }

    public void setOfficeAddress(String officeAddress) {
        this.officeAddress = officeAddress;
    }

    public String getOfficePincode() {
        return officePincode;
    }

    public void setOfficePincode(String officePincode) {
        this.officePincode = officePincode;
    }

    public Boolean getAllowCalls() {
        return allowCalls;
    }

    public void setAllowCalls(Boolean allowCalls) {
        this.allowCalls = allowCalls;
    }

    public Boolean getAllowVisits() {
        return allowVisits;
    }

    public void setAllowVisits(Boolean allowVisits) {
        this.allowVisits = allowVisits;
    }

    public Boolean getProfileStatus() {
        return profileStatus;
    }

    public void setProfileStatus(Boolean profileStatus) {
        this.profileStatus = profileStatus;
    }

    public Boolean getVerified() {
        return isVerified;
    }

    public void setVerified(Boolean verified) {
        isVerified = verified;
    }


    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public Date getModifiedDate() {
        return modifiedDate;
    }

    public void setModifiedDate(Date modifiedDate) {
        this.modifiedDate = modifiedDate;
    }

    public State getStateOfPractice() {
        return stateOfPractice;
    }

    public void setStateOfPractice(State stateOfPractice) {
        this.stateOfPractice = stateOfPractice;
    }

    public BarCouncil getBarCouncil() {
        return barCouncil;
    }

    public void setBarCouncil(BarCouncil barCouncil) {
        this.barCouncil = barCouncil;
    }
}
