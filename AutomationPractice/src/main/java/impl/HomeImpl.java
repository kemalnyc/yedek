package impl;

import utils.ConfigReader;
import utils.WebdriverUtils;

public class HomeImpl {
public void navigateToHomepage(){
    WebdriverUtils.getDriver().get(ConfigReader.readProperty("url"));
}
}
