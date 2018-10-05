package week3;
import org.junit.Test;
import static org.junit.Assert.*;
public class Week3Test {

    // TODO: Viết 5 testcase cho phương thức max()
    @Test
    public void testMax(){
        assertEquals(5,Week3.max(1,5));
        assertEquals(3,Week3.max(1,3));
        assertEquals(1000,Week3.max(1000,4));
        assertEquals(-4,Week3.max(-9,-4));
        assertEquals(20,Week3.max(-3,20));
    }

    // TODO: Viết 5 testcase cho phương thức minOfArray()
    @Test
    public void testMinOfArray(){
        int a[]={0,-3,-7,9,10,10};
        int b[]={2,10,89,78,0,-4,-9,-100};
        int c[]={100,2000,102,-3};
        int d[]={1,7,3,5,4,9,0,1};
        int e[]={4,0,5,7,8,2,-4,-6,-5};
        assertEquals(-7,Week3.minOfArray(a));
        assertEquals(-100,Week3.minOfArray(b));
        assertEquals(-3,Week3.minOfArray(c));
        assertEquals(0,Week3.minOfArray(d));
        assertEquals(-6,Week3.minOfArray(e));

    }

    // TODO: Viết 5 testcase cho phương thức calculateBMI()
    @Test
    public void testCalculateBMI(){
        assertEquals("Bình Thường",Week3.calculateBMI(52, 1.65));
        assertEquals("Béo Phì",Week3.calculateBMI(100, 1.90));
        assertEquals("Bình Thường",Week3.calculateBMI(45, 1.52));
        assertEquals("Thiếu Cân",Week3.calculateBMI(20, 1.50));
        assertEquals("Thừa Cân",Week3.calculateBMI(69, 1.69));
    }
}
