package com.testin.domain;

public class DruidDataSource {
    private String datasource;

    private String createdDate;

    private String commitMetadataSha1;

    private byte[] commitMetadataPayload;

    public String getDatasource() {
        return datasource;
    }

    public void setDatasource(String datasource) {
        this.datasource = datasource == null ? null : datasource.trim();
    }

    public String getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(String createdDate) {
        this.createdDate = createdDate == null ? null : createdDate.trim();
    }

    public String getCommitMetadataSha1() {
        return commitMetadataSha1;
    }

    public void setCommitMetadataSha1(String commitMetadataSha1) {
        this.commitMetadataSha1 = commitMetadataSha1 == null ? null : commitMetadataSha1.trim();
    }

    public byte[] getCommitMetadataPayload() {
        return commitMetadataPayload;
    }

    public void setCommitMetadataPayload(byte[] commitMetadataPayload) {
        this.commitMetadataPayload = commitMetadataPayload;
    }
}