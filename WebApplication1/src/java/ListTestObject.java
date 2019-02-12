
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
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
@XmlRootElement
public class ListTestObject {
    
    //@XmlElement(name = "TestObject")
    private ArrayList<TestObject> list;

    public ListTestObject() {
        list = new ArrayList();
    }
    public void add(TestObject obj){
        list.add(obj);
    }
    
}
