package com.example.Assignment5;

import com.example.Assignment5.entity.*;
import com.example.Assignment5.repositories.AccManagerRepository;
import com.example.Assignment5.repositories.ObjectStorageRepository;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EnumSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class Assignment5ApplicationTests {
    @Autowired
    ObjectStorageRepository objmap;
    @Autowired
    AccManagerRepository accmap;

    @Test
    void contextLoads() {
    }
    @ParameterizedTest
    @EnumSource(value= VirtualMachineEnum.class,mode= EnumSource.Mode.MATCH_ANY,names={"General_Purpose"})
    public void testforenum(VirtualMachineEnum test) {
        assertNotNull(test);

    }

    @Test
    @Order(1)
    public void objPost()
    {
        ObjectStorage obj=new ObjectStorage();
        obj.setId(1);
        obj.setBucketName("name");
        obj.setRegion("India");
        obj.setAccessType(ObjectStorageEnum.valueOf("Public"));
        obj.setEncryption("encp");
//		obj.setStorage_Class(obj_storage_enum3.valueOf(" Optimized"));
        objmap.save(obj);
        assertNotNull(objmap.findById(1).get());
    }



    @Test
    @Order(2)
    public void objGetll()
    {
        List<ObjectStorage> list = objmap.findAll();
        assertThat(list.size()).isGreaterThan(0);
    }

    @Test
    @Order(3)
    public void objGetbyid() {
        ObjectStorage obj = objmap.findById(1).get();
        assertEquals(40, obj.getRegion());
    }


    @Test
    @Order(4)
    public void obj_update() {
        ObjectStorage obj = objmap.findById(1).get();
        obj.setBucketName("bucket2");
        objmap.save(obj);
        assertNotEquals("name", objmap.findById(1).get().getBucketName());
    }


    @Test
    @Order(5)
    public void objdelete()
    {
        objmap.deleteById(1);
        assertThat(objmap.existsById(1)).isFalse();
    }




    @Test
    @Order(6)
    public void AccPost()
    {
        AccountManager acc=new AccountManager();
        acc.setId(8);
        acc.setUserName("Alam");
        acc.setAccName("Singh");
        accmap.save(acc);
        assertNotNull(accmap.findById(8).get());

    }

    @Test
    @Order(7)
    public void AccGet()
    {
        List<AccountManager> list = accmap.findAll();
        assertThat(list.size()).isGreaterThan(0);
    }

    @Test
    @Order(8)
    public void AccgetbyId() {
        AccountManager acc = accmap.findById(8).get();
        assertEquals("Alam", acc.getUserName());
    }



    @Test
    @Order(9)
    public void Accupdate() {
        AccountManager acc = accmap.findById(8).get();
        acc.setUserName("Alam");
        accmap.save(acc);
        assertNotEquals("name", accmap.findById(8).get().getUserName());
    }

    @Test
    @Order(10)
    public void Accdelete()
    {
        accmap.deleteById(8);
        assertThat(accmap.existsById(8)).isFalse();
    }

}
