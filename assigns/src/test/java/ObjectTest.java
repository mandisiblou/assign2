import junit.framework.Assert;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import java.util.ArrayList;
/**
 * Created by Mandisi on 11/15/2016.
 */
public class ObjectTest {
    private Staff staff;
    private Students students;

    @Before
    public void setUp() throws Exception {

        staff = new Staff("Rasta", 30 );
        students = new Students("Thembile", 25);

    }
    //Object
    @Test
    public void ObjectIdentityTest() throws Exception {

        Assert.assertNotSame(staff, students);

    }
}
