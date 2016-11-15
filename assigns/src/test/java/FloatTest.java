import junit.framework.Assert;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import java.util.ArrayList;

/**
 * Created by Mandisi on 11/14/2016.
 */

public class FloatTest {

    private Staff staff;
    private Students students;

    @Before
    public void setUp() throws Exception {

        staff = new Staff("Rasta", 32 );
        students = new Students("Thembile", 25);

    }

    // test float point
    @Test
    public void FloatTest() throws Exception {

        Assert.assertEquals(12.5, 12.5);

    }
}

