package StepDefinitions;

import Pages.AddEmployeePage;
import Pages.LoginPage;

public class PageInitializer {

    public  static LoginPage login;
    public static AddEmployeePage addEmployeePage;
    public  static void initializePageObjects()
    {
        login = new LoginPage();
        addEmployeePage=new AddEmployeePage();
    }

}


// This class will manage the object creation of different page objects in our framework.
// Instead of calling the page objects again and again, this class will take good care of that step