package com.tibiainfo.model.dto.achievement;

import com.tibiainfo.model.entity.Achievement;
import lombok.Data;

@Data
public class AchievementDTO {

    Long id;

    String title;

    String name;

    Integer grade;

    Integer points;

    String description;

    String spoiler;

    Boolean secret;

    Boolean premium;

    String version;

    Integer timestamp;

    public AchievementDTO(Achievement achievement) {
        this.id = achievement.getId();
        this.title = achievement.getTitle();
        this.name = achievement.getName();
        this.grade = achievement.getGrade();
        this.points = achievement.getPoints();
        this.description = achievement.getDescription();
        this.spoiler = achievement.getSpoiler();
        this.secret = achievement.getSecret();
        this.premium = achievement.getPremium();
        this.version = achievement.getVersion();
        this.timestamp = achievement.getTimestamp();
    }
}
