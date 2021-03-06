
package com.example.myapplication_post.post_object_pojos;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Data {

    @SerializedName("nameFirst")
    @Expose
    private String nameFirst;

    public Data(String nameFirst, String nameLast, String nameMiddle, String name, String namePrefix, String nameSuffix) {
        this.nameFirst = nameFirst;
        this.nameLast = nameLast;
        this.nameMiddle = nameMiddle;
        this.name = name;
        this.namePrefix = namePrefix;
        this.nameSuffix = nameSuffix;
    }

    public Data() {
    }

    @SerializedName("nameLast")
    @Expose
    private String nameLast;
    @SerializedName("nameMiddle")
    @Expose
    private String nameMiddle;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("namePrefix")
    @Expose
    private String namePrefix;
    @SerializedName("nameSuffix")
    @Expose
    private String nameSuffix;

    public String getNameFirst() {
        return nameFirst;
    }

    public void setNameFirst(String nameFirst) {
        this.nameFirst = nameFirst;
    }

    public String getNameLast() {
        return nameLast;
    }

    public void setNameLast(String nameLast) {
        this.nameLast = nameLast;
    }

    public String getNameMiddle() {
        return nameMiddle;
    }

    public void setNameMiddle(String nameMiddle) {
        this.nameMiddle = nameMiddle;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNamePrefix() {
        return namePrefix;
    }

    public void setNamePrefix(String namePrefix) {
        this.namePrefix = namePrefix;
    }

    public String getNameSuffix() {
        return nameSuffix;
    }

    public void setNameSuffix(String nameSuffix) {
        this.nameSuffix = nameSuffix;
    }

}
