package com.example.Assignment5.controller;

import com.example.Assignment5.entity.ObjectStorage;
import com.example.Assignment5.repositories.ObjectStorageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ObjectStorageController {

    @Autowired
    ObjectStorageRepository map;
    @PostMapping("/objectstorage")
    public ObjectStorage postobjstorage(@RequestBody ObjectStorage obj)
    {
        map.save(obj);
        return obj;
    }

    @GetMapping("/objectstorage")
    public List<ObjectStorage> getAllobj_storage() {
        List<ObjectStorage> obj_storage = map.findAll();
        return obj_storage;
    }

    @GetMapping("/objectstorage/{id}")
    public ObjectStorage getobj_storageById(@PathVariable int id) {
        ObjectStorage obj_storage = map.findById(id).get();
        return obj_storage;
    }

    @DeleteMapping("/objectstorage/{id}")
    public void deleteobject(@PathVariable int id){
        map.deleteById(id);
    }

    @PutMapping("/objectstorage")
    public ObjectStorage updateObject(@RequestBody ObjectStorage updateobject)
    {
        ObjectStorage obj = map.getById(updateobject.getId());

        obj.setId(updateobject.getId());
        obj.setBucketName(updateobject.getBucketName());
        obj.setRegion(updateobject.getRegion());
        obj.setAccessType(updateobject.getAccessType());
        obj.setEncryption(updateobject.getEncryption());
        obj.setClassEnum(updateobject.getClassEnum());


        map.save(obj);
        return  updateobject;
    }

}
