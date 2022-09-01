package com.hei.notehei.RestController;

import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.hei.notehei.model.Groups;
import com.hei.notehei.service.GroupService;
import lombok.AllArgsConstructor;

@RestController
@AllArgsConstructor
public class GroupRestController {
    private GroupService groupService;

    @GetMapping("/groups")
    public List<Groups> getAllGroups(){
        return groupService.getAllGroups();
    }

    @GetMapping("/group/{id}")
    public Optional<Groups> getGroupById(@PathVariable Long idGroup){
        return groupService.getGroup(idGroup); 
    }

    @PostMapping("/group")
    public Groups addGroupById(@RequestBody Groups group){
        return groupService.addGroup(group);
    }

    @DeleteMapping("/group/{id}")
    public void deleteGroupById(@PathVariable Long idGroup){
        groupService.deletGroup(idGroup);
    }
}
