package de.fahrradjaeger.codingchallenge;

import android.content.Context;
import android.support.test.InstrumentationRegistry;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.*;

/**
 * Instrumented test, which will execute on an Android device.
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
@RunWith(AndroidJUnit4.class)
public class ExampleInstrumentedTest {
    @Test
    public void useAppContext() {
        // Context of the app under test.
        Context appContext = InstrumentationRegistry.getTargetContext();

        assertEquals("de.fahrradjaeger.codingchallenge", appContext.getPackageName());
    }

    //TODO (Bonus) 1.5 Write a test that verifies the intent to start the detail activity.

    //TODO (Bonus) 2.3 Modify the test to verify the new intent launched from the list.
}
