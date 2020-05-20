package com.tibiainfo.service;

import com.tibiainfo.exception.NotFoundException;
import com.tibiainfo.model.Creature;
import com.tibiainfo.model.dto.CreatureQueryDto;
import com.tibiainfo.model.dto.PageSupportDto;
import com.tibiainfo.model.repository.CreatureRepository;
import com.tibiainfo.model.repository.specification.CreatureSpecification;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

@Service
public class CreatureService {

    @Autowired
    CreatureRepository creatureRepository;

    public Creature getCreature(Long id) throws NotFoundException {
        return creatureRepository.findById(id)
                .orElseThrow(() -> new NotFoundException("Creature not found"));
    }

    public PageSupportDto<Creature> getCreature(CreatureQueryDto queryDto) {
        PageRequest of = PageRequest.of(queryDto.getPage(), queryDto.getSize());

        CreatureSpecification specification = CreatureSpecification.builder()
                .creatureQueryDto(queryDto)
                .build();

        return new PageSupportDto<>(creatureRepository.findAll(specification, of));
    }


}