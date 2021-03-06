package dhbw.karlsruhe.it.yourgame.junit;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;

import dhbw.karlsruhe.it.yourgame.core.YourGame;
import dhbw.karlsruhe.it.yourgame.cucumber.CukeRunnerJUnit;
import dhbw.karlsruhe.it.yourgame.testhelper.TestHelper;

/*
 * 
 * Insert your unit test classes in the @SuiteClasses annotation before CukeRunnerJUnit.class 
 * 
 * Example:
@RunWith(Suite.class)
@SuiteClasses(
		{ ExitGameScreenJUnit.class, LevelDAOJUnit.class, ScreenHelperJUnit.class, ScoreDAOJUnit.class, CukeRunnerJUnit.class}
		)
 * 
 */

@RunWith(Suite.class)
@SuiteClasses(
		{ CukeRunnerJUnit.class}
		)
public class TestSuite {

	private static LwjglApplication app; // only for convenience, keep if you want to

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		app = new LwjglApplication(new YourGame(), TestHelper.createTestConfig());
		TestHelper.wait(1200);
		
		// you have to wait here in order to let libGDX load up everything. It won't hurt you. srsly.
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		app.exit();
	}

}

