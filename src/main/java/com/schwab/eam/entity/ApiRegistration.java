package com.schwab.eam.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class ApiRegistration {

    @Id
    private Long apiId;
    private String api;
    private String method;
    private String descriptn;
    private String module;
    private String domain;

    public Long getApiId() {
        return apiId;
    }

    public void setApiId(Long apiId) {
        this.apiId = apiId;
    }

    public String getApi() {
        return api;
    }

    public void setApi(String api) {
        this.api = api;
    }

    public String getDescriptn() {
        return descriptn;
    }

    public void setDescriptn(String descriptn) {
        this.descriptn = descriptn;
    }

    public String getModule() {
        return module;
    }

    public void setModule(String module) {
        this.module = module;
    }

    public String getDomain() {
        return domain;
    }

    public void setDomain(String domain) {
        this.domain = domain;
    }

    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method;
    }
}
