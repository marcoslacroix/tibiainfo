package com.tibiainfo.model.repository.specification;

import com.tibiainfo.model.dto.query.AchievementQueryDTO;
import com.tibiainfo.model.entity.achievement.Achievement;
import lombok.experimental.SuperBuilder;

@SuperBuilder
public class AchievementSpecification extends TibiaInfoSpecification<Achievement> {

    AchievementQueryDTO achievementQueryDTO;

    @Override
    public void instructions() {
        equalIgnoreCase("name", achievementQueryDTO.getName());
    }

}
