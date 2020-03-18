import org.junit.Assert;
import org.junit.Test;

import java.util.*;

import static org.junit.Assert.*;

public class FruitsTest {

    @Test
    public void collection () {
        Stack<String> stk = new Stack<>();
        stk.push("A");
        stk.push("B");
        stk.push("C");
        stk.push("D");

        assertEquals(4, stk.size());
        assertTrue(stk.contains("C"));
        assertEquals(3,stk.lastIndexOf("D"));

        System.out.println(stk);

        Queue q=new Queue();

        q.enq("A");
        q.enq("B");
        q.enq("C");

        q.deq();
        q.deq();
        q.show();

        assertEquals(1, q.size);
        q.show();


    }

    @Test
    public void maps(){

        Map map = new HashMap();

        map.put(1,"A");
        map.put(2,"B");
        map.put(3,"C");
        map.put(4,"D");
        map.put(5,"E");
        map.put(6,"F");

        map.remove(3);
        map.put(3,"G");

assertTrue(map.containsKey(3));
assertTrue("E",map.containsKey(5));

System.out.println(map);
    }

    @Test
    public void sets(){

        Set set = new HashSet<>();

        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        set.add(5);
        set.remove(2);

        assertTrue(set.contains(4));
        assertEquals(4,set.size());

        int result = set.hashCode() + set.size();
        assertEquals(17,result);
    }

    @Test
    public void Lists () {
        List<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");

        assertEquals(4, list.size());
        assertTrue(list.contains("C"));
        assertEquals(3,list.lastIndexOf("D"));

    }

    }
