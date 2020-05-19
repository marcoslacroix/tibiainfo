package com.tibiainfo.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
public class Item {

    @Id
    Long articleId;

    String title;

    String name;

    String plural;

    String article;

    Boolean marketable;

    Boolean stackable;

    Boolean pickupable;

    Integer valueSell;

    Integer valueBuy;

    Double weight;

    String itemClass;

    String type;

    String typeSecondary;

    String flavorText;

    Integer lightColor;

    Integer lightRadius;

    String version;

    Integer clientId;

    Integer timestamp;
}