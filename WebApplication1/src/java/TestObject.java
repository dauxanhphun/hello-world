
import javax.xml.bind.annotation.XmlRootElement;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mBluePea
 */
//@XmlRootElement(name = "ahihi")

public class TestObject{
    private int id;
    private String name;

    public TestObject() {
    }
    

    public TestObject(int id, String name) {
        this.id = id;
        this.name = name;
    }
    

    public int getId() {
        return id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
//    @Override
//    public String toString() {
//        return "TestObject [id=" + id + ", name=" + name +  "]";
//    }
    
    
}
