package Test;

import Base.Common;
import Page.AI_CLIP;
import Page.Login;
import org.testng.annotations.Test;

public class TestCase extends Common
{
@Test (priority = '1')
public void LoginQuso()
{
    Login Lg =new Login(driver);
    Lg.Login_username();
}
@Test(priority ='2')
    public void EDIT()
{
    AI_CLIP AC= new AI_CLIP(driver);
    AC.Edit_Vid();
}
}
