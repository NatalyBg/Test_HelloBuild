import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class Login_success {
    public static WebDriver driver;

    @Given("^User is on LogIn Page$")
    public void user_is_on_LogIn_Page() throws Throwable {
        driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://demoqa.com/login");
    }

    @When("^User enters UserName and Password$")
    public void user_enters_UserName_and_Password() throws Throwable {
        driver.findElement(By.id("userName")).sendKeys("testUser_1");
        driver.findElement(By.id("password")).sendKeys("Test@123.");
        driver.findElement(By.id("login")).click();
    }

    @Then("^Message displayed Login Successfully$")
    public void message_displayed_Login_Successfully() throws Throwable {
        System.out.println("Login Successfully");
    }
}
 //   ___________}_____________________________________________________
public class Login_Failed_EmptyUserName {
    public static WebDriver driver;
    @Given("^User is on LogIn Page$")
    public void user_is_on_LogIn_Page() throws Throwable {
        driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://demoqa.com/login");
    }

    @When("^User enters UserName and Password$")
    public void user_enters_UserName_and_Password() throws Throwable {
        driver.findElement(By.id("userName")).sendKeys(" ");
        driver.findElement(By.id("password")).sendKeys("Test@123.");
        driver.findElement(By.id("login")).click();
    }

    @Then("^Message displayed Login Successfully$")
    public void message_displayed_Login_Successfully() throws Throwable {
        System.out.println("Complete UserName field");
    }
}
 //   _________________________________________________________________________________--
public class Login_Failed_EmptyFields {
    public static WebDriver driver;
    @Given("^User is on LogIn Page$")
    public void user_is_on_LogIn_Page() throws Throwable {
        driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://demoqa.com/login");
    }

    @When("^User enters UserName and Password$")
    public void user_enters_UserName_and_Password() throws Throwable {
        driver.findElement(By.id("userName")).sendKeys("");
        driver.findElement(By.id("password")).sendKeys("");
        driver.findElement(By.id("login")).click();
    }

    @Then("^Message displayed Login Successfully$")
    public void message_displayed_Login_Successfully() throws Throwable {
        System.out.println("Complete UserName and Password field");
    }

}

//______________________________________________________________________________-
public class Login_Failed_EmptyFields {
    public static WebDriver driver;
    @Given("^User is on LogIn Page$")
    public void user_is_on_LogIn_Page() throws Throwable {
        driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://demoqa.com/login");
    }

    @When("^User enters UserName and Password$")
    public void user_enters_UserName_and_Password() throws Throwable {
        driver.findElement(By.id("userName")).sendKeys("user ");
        driver.findElement(By.id("password")).sendKeys("33333");
        driver.findElement(By.id("login")).click();
    }

    @Then("^Message displayed Login Successfully$")
    public void message_displayed_Login_Successfully() throws Throwable {
        System.out.println("Invalid username or password");
    }

}

//______________________________________________________________________________________________________________________
//      New user

public class Register_success {
    public static WebDriver driver;

    @Given("^User is on LogIn Page$")
    public void user_is_on_LogIn_Page() throws Throwable {
        driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://demoqa.com/login");
    }


    @When("^User Navigate to LogIn Page$")
    public void user_Navigate_to_LogIn_Page() throws Throwable {
        driver.findElement(By.id("newUser")).click();
    }

    @When("^User enters First name, Last name, UserName and Password$")
    public void user_enters_UserName_and_Password() throws Throwable {
        driver.findElement(By.id("firstname")).sendKeys("testuser_134");
        driver.findElement(By.id("lastname")).sendKeys("testuser_134");
        driver.findElement(By.id("userName")).sendKeys("testuser_134");
        driver.findElement(By.id("password")).sendKeys("Test@123.*");
        driver.findElement(By.className("recaptcha-checkbox-border")).click;
        //for the reCaptcha is not recomended to be automated because its main purpuse is to avoid automation
        //bots or scripts the way it should be handled is by asking the developers team  to give you a "back-door" - basically a //test-only version of the page that will let you bypass the CAPTCHA feature and continue on.
        driver.findElement(By.id("register")).click();
    }

    @Then("^Message displayed Register Successfully$")
    public void message_displayed_Register_Successfully() throws Throwable {
        System.out.println("Register Successfully");
    }
}
    ______________________________________________________________________________________________________________
    public class Register_Failed_wrong_PWFormat{
        public static WebDriver driver;
        @Given("^User is on LogIn Page$")
        public void user_is_on_LogIn_Page() throws Throwable {
            driver = new FirefoxDriver();
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            driver.get("https://demoqa.com/login");
        }


        @When("^User Navigate to LogIn Page$")
        public void user_Navigate_to_LogIn_Page() throws Throwable {
            driver.findElement(By.id("newUser")).click();
        }

        @When("^User enters First name, Last name, UserName and Password$")
        public void user_enters_UserName_and_Password() throws Throwable {
            driver.findElement(By.id("firstname")).sendKeys("testuser_134");
            driver.findElement(By.id("lastname")).sendKeys("testuser_134");
            driver.findElement(By.id("userName")).sendKeys("testuser_134");
            driver.findElement(By.id("password")).sendKeys("Test123");
            driver.findElement(By.className("recaptcha-checkbox-border")).click;
            //for the reCaptcha is not recomended to be automated because its main purpuse is to avoid automation
            //bots or scripts the way it should be handled is by asking the developers team  to give you a "back-door" - basically a //test-only version of the page that will let you bypass the CAPTCHA feature and continue on.
            driver.findElement(By.id("register")).click();
        }
        @Then("^Message displayed Register Successfully$")
        public void message_displayed_Register_Successfully() throws Throwable {
            System.out.println("Passwords must have at least one non alphanumeric character, one digit ('0'-'9'), one uppercase ('A'-'Z'), one lowercase ('a'-'z'), one special character and Password must be eight characters or longer");
        }}
       // ______________________________________________________________________________________________________________________________

        public class Register_Failed_reCaptcha_unchecked {
            public static WebDriver driver;

            @Given("^User is on LogIn Page$")
            public void user_is_on_LogIn_Page() throws Throwable {
                driver = new FirefoxDriver();
                driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
                driver.get("https://demoqa.com/login");
            }


            @When("^User Navigate to LogIn Page$")
            public void user_Navigate_to_LogIn_Page() throws Throwable {
                driver.findElement(By.id("newUser")).click();
            }

            @When("^User enters First name, Last name, UserName and Password$")
            public void user_enters_UserName_and_Password() throws Throwable {
                driver.findElement(By.id("firstname")).sendKeys("testuser_134");
                driver.findElement(By.id("lastname")).sendKeys("testuser_134");
                driver.findElement(By.id("userName")).sendKeys("testuser_134");
                driver.findElement(By.id("password")).sendKeys("Test@123.*");

                //for the reCaptcha is not recomended to be automated because its main purpuse is to avoid automation
                //bots or scripts the way it should be handled is by asking the developers team  to give you a "back-door" - basically a //test-only version of the page that will let you bypass the CAPTCHA feature and continue on.
                driver.findElement(By.id("register")).click();
            }

            @Then("^Message displayed Register Successfully$")
            public void message_displayed_Register_Successfully() throws Throwable {
                System.out.println("Please verify reCaptcha to register!");
            }
        }
          // ______________________________________________________________________________________________________________-

            public class Register_Failed_emptyFields{
                public static WebDriver driver;
                @Given("^User is on LogIn Page$")
                public void user_is_on_LogIn_Page() throws Throwable {
                    driver = new FirefoxDriver();
                    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
                    driver.get("https://demoqa.com/login");
                }


                @When("^User Navigate to LogIn Page$")
                public void user_Navigate_to_LogIn_Page() throws Throwable {
                    driver.findElement(By.id("newUser")).click();
                }

                @When("^User enters First name, Last name, UserName and Password$")
                public void user_enters_UserName_and_Password() throws Throwable {
                    driver.findElement(By.id("firstname")).sendKeys("");
                    driver.findElement(By.id("lastname")).sendKeys("");
                    driver.findElement(By.id("userName")).sendKeys("");
                    driver.findElement(By.id("password")).sendKeys("");
                    driver.findElement(By.className("recaptcha-checkbox-border")).click;
                    //for the reCaptcha is not recomended to be automated because its main purpuse is to avoid automation
                    //bots or scripts the way it should be handled is by asking the developers team  to give you a "back-door" - basically a //test-only version of the page that will let you bypass the CAPTCHA feature and continue on.
                    driver.findElement(By.id("register")).click();
                }
                @Then("^Message displayed Register Successfully$")
                public void message_displayed_Register_Successfully() throws Throwable {
                    System.out.println(" First Name, Las Name, User Name, and Password field show that the field needs to have a value
                            ");
                }
            }

 // _______________________________________________________________________________________________________________________________________________________