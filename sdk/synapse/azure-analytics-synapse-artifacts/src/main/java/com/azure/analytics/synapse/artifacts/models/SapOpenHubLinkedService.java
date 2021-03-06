// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.analytics.synapse.artifacts.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/** SAP Business Warehouse Open Hub Destination Linked Service. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonTypeName("SapOpenHub")
@JsonFlatten
@Fluent
public class SapOpenHubLinkedService extends LinkedService {
    /*
     * Host name of the SAP BW instance where the open hub destination is
     * located. Type: string (or Expression with resultType string).
     */
    @JsonProperty(value = "typeProperties.server", required = true)
    private Object server;

    /*
     * System number of the BW system where the open hub destination is
     * located. (Usually a two-digit decimal number represented as a string.)
     * Type: string (or Expression with resultType string).
     */
    @JsonProperty(value = "typeProperties.systemNumber", required = true)
    private Object systemNumber;

    /*
     * Client ID of the client on the BW system where the open hub destination
     * is located. (Usually a three-digit decimal number represented as a
     * string) Type: string (or Expression with resultType string).
     */
    @JsonProperty(value = "typeProperties.clientId", required = true)
    private Object clientId;

    /*
     * Language of the BW system where the open hub destination is located. The
     * default value is EN. Type: string (or Expression with resultType
     * string).
     */
    @JsonProperty(value = "typeProperties.language")
    private Object language;

    /*
     * Username to access the SAP BW server where the open hub destination is
     * located. Type: string (or Expression with resultType string).
     */
    @JsonProperty(value = "typeProperties.userName")
    private Object userName;

    /*
     * Password to access the SAP BW server where the open hub destination is
     * located.
     */
    @JsonProperty(value = "typeProperties.password")
    private SecretBase password;

    /*
     * The encrypted credential used for authentication. Credentials are
     * encrypted using the integration runtime credential manager. Type: string
     * (or Expression with resultType string).
     */
    @JsonProperty(value = "typeProperties.encryptedCredential")
    private Object encryptedCredential;

    /**
     * Get the server property: Host name of the SAP BW instance where the open hub destination is located. Type: string
     * (or Expression with resultType string).
     *
     * @return the server value.
     */
    public Object getServer() {
        return this.server;
    }

    /**
     * Set the server property: Host name of the SAP BW instance where the open hub destination is located. Type: string
     * (or Expression with resultType string).
     *
     * @param server the server value to set.
     * @return the SapOpenHubLinkedService object itself.
     */
    public SapOpenHubLinkedService setServer(Object server) {
        this.server = server;
        return this;
    }

    /**
     * Get the systemNumber property: System number of the BW system where the open hub destination is located. (Usually
     * a two-digit decimal number represented as a string.) Type: string (or Expression with resultType string).
     *
     * @return the systemNumber value.
     */
    public Object getSystemNumber() {
        return this.systemNumber;
    }

    /**
     * Set the systemNumber property: System number of the BW system where the open hub destination is located. (Usually
     * a two-digit decimal number represented as a string.) Type: string (or Expression with resultType string).
     *
     * @param systemNumber the systemNumber value to set.
     * @return the SapOpenHubLinkedService object itself.
     */
    public SapOpenHubLinkedService setSystemNumber(Object systemNumber) {
        this.systemNumber = systemNumber;
        return this;
    }

    /**
     * Get the clientId property: Client ID of the client on the BW system where the open hub destination is located.
     * (Usually a three-digit decimal number represented as a string) Type: string (or Expression with resultType
     * string).
     *
     * @return the clientId value.
     */
    public Object getClientId() {
        return this.clientId;
    }

    /**
     * Set the clientId property: Client ID of the client on the BW system where the open hub destination is located.
     * (Usually a three-digit decimal number represented as a string) Type: string (or Expression with resultType
     * string).
     *
     * @param clientId the clientId value to set.
     * @return the SapOpenHubLinkedService object itself.
     */
    public SapOpenHubLinkedService setClientId(Object clientId) {
        this.clientId = clientId;
        return this;
    }

    /**
     * Get the language property: Language of the BW system where the open hub destination is located. The default value
     * is EN. Type: string (or Expression with resultType string).
     *
     * @return the language value.
     */
    public Object getLanguage() {
        return this.language;
    }

    /**
     * Set the language property: Language of the BW system where the open hub destination is located. The default value
     * is EN. Type: string (or Expression with resultType string).
     *
     * @param language the language value to set.
     * @return the SapOpenHubLinkedService object itself.
     */
    public SapOpenHubLinkedService setLanguage(Object language) {
        this.language = language;
        return this;
    }

    /**
     * Get the userName property: Username to access the SAP BW server where the open hub destination is located. Type:
     * string (or Expression with resultType string).
     *
     * @return the userName value.
     */
    public Object getUserName() {
        return this.userName;
    }

    /**
     * Set the userName property: Username to access the SAP BW server where the open hub destination is located. Type:
     * string (or Expression with resultType string).
     *
     * @param userName the userName value to set.
     * @return the SapOpenHubLinkedService object itself.
     */
    public SapOpenHubLinkedService setUserName(Object userName) {
        this.userName = userName;
        return this;
    }

    /**
     * Get the password property: Password to access the SAP BW server where the open hub destination is located.
     *
     * @return the password value.
     */
    public SecretBase getPassword() {
        return this.password;
    }

    /**
     * Set the password property: Password to access the SAP BW server where the open hub destination is located.
     *
     * @param password the password value to set.
     * @return the SapOpenHubLinkedService object itself.
     */
    public SapOpenHubLinkedService setPassword(SecretBase password) {
        this.password = password;
        return this;
    }

    /**
     * Get the encryptedCredential property: The encrypted credential used for authentication. Credentials are encrypted
     * using the integration runtime credential manager. Type: string (or Expression with resultType string).
     *
     * @return the encryptedCredential value.
     */
    public Object getEncryptedCredential() {
        return this.encryptedCredential;
    }

    /**
     * Set the encryptedCredential property: The encrypted credential used for authentication. Credentials are encrypted
     * using the integration runtime credential manager. Type: string (or Expression with resultType string).
     *
     * @param encryptedCredential the encryptedCredential value to set.
     * @return the SapOpenHubLinkedService object itself.
     */
    public SapOpenHubLinkedService setEncryptedCredential(Object encryptedCredential) {
        this.encryptedCredential = encryptedCredential;
        return this;
    }
}
