package page_objects;

import com.logigear.control.common.imp.Button;
import com.logigear.control.common.imp.Label;
import com.logigear.control.common.imp.Link;
import com.logigear.control.common.imp.TextBox;

public class BasePage {

    private final Link lnkGlobalSetting = new Link("css=li.mn-setting>a");
    private final Label lblOptionInGlobalSetting = new Label("//li[@class='mn-setting']//following-sibling::ul/li/a[text()='%s']");
    private final Button btnChoosePanels = new Button("id=btnChoosepanel");
    private final TextBox txtPageName = new TextBox("id=name");
    private final Button btnOK = new Button("id=OK");

    public void selectGlobalSettingMenu(String optionName) {
        lnkGlobalSetting.waitForDisplay();
        lnkGlobalSetting.moveTo();
        lblOptionInGlobalSetting.setDynamicValue(optionName);
        lblOptionInGlobalSetting.waitForDisplay();
        lblOptionInGlobalSetting.click();
    }

    public void clickChoosePanelsButton() {
        btnChoosePanels.waitForElementClickable();
        btnChoosePanels.click();
    }

    public void addPage(String name) {
        txtPageName.waitForDisplay();
        txtPageName.enter(name);
        btnOK.click();
    }
}
