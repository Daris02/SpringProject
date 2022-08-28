package com.hei.notehei.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;

import com.hei.notehei.model.Group;
import com.hei.notehei.repository.GroupRepository;

@Service
@AllArgsConstructor
public class GroupService {
    @Autowired
    private GroupRepository groupRepository;

    public List<Group> getAllGroups(){
        return groupRepository.findAll(); 
    }

    public Optional<Group> getGroup(Long idGroup){
        return groupRepository.findById(idGroup);
    }

    public Group addGroup(Group group){
        return groupRepository.save(group);
    }

    public void deletGroup(Long idGroup){
        groupRepository.deleteById(idGroup);
    }
}
