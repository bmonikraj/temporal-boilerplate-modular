package org.example.model.DTO;

import com.fasterxml.jackson.annotation.JsonProperty;

public class DefaultRequest {
    public String getReferenceId() {
        return referenceId;
    }

    public void setReferenceId(String referenceId) {
        this.referenceId = referenceId;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public String getClientId() {
        return clientId;
    }

    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

    @JsonProperty
    String referenceId;

    @JsonProperty
    String info;

    String clientId;
}
