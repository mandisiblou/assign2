/**
 * Created by 211014486 on 4/17/2016.
 */

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 * To work on unit tests, switch the Test Artifact in the Build Variants view.
 */
// Runs all unit tests.
@RunWith(Suite.class)
@Suite.SuiteClasses({
        FloatTest.class,
        IntergersTest.class,
        NullTest.class,
        ObjectTestTest.class})
public class AppUnitTestSuite {}
