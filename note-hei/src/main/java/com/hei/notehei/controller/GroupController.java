package com.hei.notehei.controller;

import java.util.List;
import java.util.Optional;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.hei.notehei.model.Group;
import com.hei.notehei.service.GroupService;
import lombok.AllArgsConstructor;

@RestController
@AllArgsConstructor
public class GroupController {
    private GroupService groupService;

    @GetMapping("/groups")
    public List<Group> getAllGroups(){
        return groupService.getAllGroups();
    }

    @GetMapping("/group/{id}")
    public Optional<Group> getGroupById(@PathVariable Long idGroup){
        return groupService.getGroup(idGroup); 
    }

    @PostMapping("/group")
    public Group addGroupById(@RequestBody Group group){
        return groupService.addGroup(group);
    }

    @DeleteMapping("/group/{id}")
    public void deleteGroupById(@PathVariable Long idGroup){
        groupService.deletGroup(idGroup);
    }
}
