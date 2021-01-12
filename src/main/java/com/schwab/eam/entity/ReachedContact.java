package com.schwab.eam.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class ReachedContact {

    @Id
    private long contactId;
    private String contactName;
    private String org;
    private String status;

    public long getContactId() {
        return contactId;
    }

    public void setContactId(long contactId) {
        this.contactId = contactId;
    }

    public String getContactName() {
        return contactName;
    }

    public void setContactName(String contactName) {
        this.contactName = contactName;
    }

    public String getOrg() {
        return org;
    }

    public void setOrg(String org) {
        this.org = org;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
