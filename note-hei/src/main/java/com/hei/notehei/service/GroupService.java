package com.hei.notehei.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;

import com.hei.notehei.model.Groups;
import com.hei.notehei.repository.GroupRepository;

@Service
@AllArgsConstructor
public class GroupService {
    @Autowired
    private GroupRepository groupRepository;

    public List<Groups> getAllGroups(){
        return groupRepository.findAll(); 
    }

    public Optional<Groups> getGroup(Long idGroup){
        return groupRepository.findById(idGroup);
    }

    public Groups addGroup(Groups group){
        return groupRepository.save(group);
    }

    public void deletGroup(Long idGroup){
        groupRepository.deleteById(idGroup);
    }
}
