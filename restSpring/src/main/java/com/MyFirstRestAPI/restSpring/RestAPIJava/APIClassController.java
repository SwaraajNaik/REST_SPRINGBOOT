package com.MyFirstRestAPI.restSpring.RestAPIJava;

import com.MyFirstRestAPI.restSpring.EntityPackage.EntityClass;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/employees")
public class APIClassController {

    private HashMap<Long, EntityClass> entityClassMap = new HashMap<>();

    @GetMapping
    public List<EntityClass> getAll() {
        return new ArrayList<>(entityClassMap.values());
    }

    @GetMapping("/id/{myid}")
    public EntityClass getById(@PathVariable Long myid)
    {
        return entityClassMap.get(myid);
    }

    @PostMapping
    public boolean createEntry(@RequestBody EntityClass myEntry)
    {
        entityClassMap.put(myEntry.getId(),myEntry);
       return true;
    }

    @DeleteMapping("/id/{myid}")
    public EntityClass deleteById(@PathVariable Long myid)
    {
        return entityClassMap.remove(myid);
    }

    @PutMapping("/id/{myid}")
    public EntityClass updateEntry(@PathVariable Long myid, @RequestBody EntityClass myEntry)
    {
        return entityClassMap.put(myid,myEntry);
    }

}
