package com.example.Assignment5.entity;

import javax.persistence.*;

@Entity
public class ObjectStorage {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
    String bucketName;
    String region;
    @Enumerated(EnumType.STRING)
    ObjectStorageEnum accessType;

    String encryption;

    @Enumerated(EnumType.STRING)
    ObjectStorageClassEnum classEnum;

    public ObjectStorage() {
    }

    public ObjectStorage(int id, String bucketName, String region, ObjectStorageEnum accessType, String encryption, ObjectStorageClassEnum classEnum) {
        this.id = id;
        this.bucketName = bucketName;
        this.region = region;
        this.accessType = accessType;
        this.encryption = encryption;
        this.classEnum = classEnum;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBucketName() {
        return bucketName;
    }

    public void setBucketName(String bucketName) {
        this.bucketName = bucketName;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public ObjectStorageEnum getAccessType() {
        return accessType;
    }

    public void setAccessType(ObjectStorageEnum accessType) {
        this.accessType = accessType;
    }

    public String getEncryption() {
        return encryption;
    }

    public void setEncryption(String encryption) {
        this.encryption = encryption;
    }

    public ObjectStorageClassEnum getClassEnum() {
        return classEnum;
    }

    public void setClassEnum(ObjectStorageClassEnum classEnum) {
        this.classEnum = classEnum;
    }

    @Override
    public String toString() {
        return "ObjectStorage{" +
                "id=" + id +
                ", bucketName='" + bucketName + '\'' +
                ", region='" + region + '\'' +
                ", accessType=" + accessType +
                ", encryption='" + encryption + '\'' +
                ", classEnum=" + classEnum +
                '}';
    }
}
