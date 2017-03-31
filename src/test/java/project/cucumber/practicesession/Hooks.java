package project.cucumber.practicesession;

import cucumber.api.java.After;
import cucumber.api.java.Before;

import java.sql.DriverManager;

/**
 * Created by SHRADHA on 10/02/2017.
 */
public class Hooks {
    @Before
    public void setUp() throws Throwable {
        new Drivermanager().Openbrowser();

    }
    @After
    public void teardown()
    {
        //new DriverManager().closebrowser();
    }
}
