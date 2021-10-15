package page_objects;

import com.logigear.control.common.imp.*;

public class PanelPage extends BasePage {

    private final Button btnCreateNewPanel = new Button("css=div.cpbutton > span");
    private final ComboBox cbxChartType = new ComboBox("id=cbbChartType");
    private final CheckBox chxCategories = new CheckBox("id=chkCategoriesName");
    private final CheckBox chxSeries = new CheckBox("id=chkSeriesName");
    private final CheckBox chxValue = new CheckBox("id=chkValue");
    private final CheckBox chxPercentage = new CheckBox("id=chkPercentage");
    private final ComboBox cmbParentPage = new ComboBox("css=select#parent");
    private final ComboBox cmbNumberOfColumns = new ComboBox("css=select#columnnumber");
    private final ComboBox cmbDisplayAfter = new ComboBox("css=select#afterpage");
    private final CheckBox chkPublic = new CheckBox("id=ispublic");
    private final Button btnOk = new Button("id=OK");
    private final Button btnCancel = new Button("id=Cancel");
    private final Link btnChoosePanel = new Link("id=btnChoosepanel");
    private final RadioButton rdbChart = new RadioButton("id=radPanelType0");
    private final RadioButton rdbIndicator = new RadioButton("id=radPanelType1");
    private final RadioButton rdbReport = new RadioButton("id=radPanelType2");
    private final RadioButton rdbHeatMap = new RadioButton("id=radPanelType3");
    private final ComboBox cmbDataProfile = new ComboBox("id=cbbProfile");
    private final TextBox txtDisplayName = new TextBox("id=txtDisplayName");
    private final TextBox txtChartTitle = new TextBox("id=txtChartTitle");
    private final CheckBox chkShowTitle = new CheckBox("id=chkShowTitle");
    private final ComboBox cmbChartType = new ComboBox("id=cbbChartType");
    private final RadioButton rdb2D = new RadioButton("id=rdoChartStyle2D");
    private final RadioButton rdb3D = new RadioButton("id=rdoChartStyle3D");
    private final Button btnOKOfNewPanel = new Button("div.div_button input[id='OK']");
    private final Button btnCancelOfNewPanel = new Button("div.div_button input[id='Cancel']");
    private final ComboBox cmbSeries = new ComboBox("css=select#cbbSeriesField");
    private final TextBox txtHeight = new TextBox("css=input#txtHeight");
    private final Button btnOkOfPanelConfiguration = new Button("css=div#div_panelConfigurationDlg input#OK");
    private final Button btnNewPanelName = new Button("css=div.al_lft");

    public void clickCreateNewPanelButton() {
        btnCreateNewPanel.waitForElementClickable();
        btnCreateNewPanel.click();
    }

    public void selectChartType(String type) {
        cbxChartType.waitForDisplay();
        cbxChartType.select(type);
    }

    public boolean isSeriesCheckBoxDisabled() {
        return chxSeries.getAttribute("disabled") != null;
    }

    public boolean isCategoriesCheckBoxDisabled() {
        return chxCategories.getAttribute("disabled") != null;
    }

    public boolean isValueCheckBoxDisabled() {
        return chxValue.getAttribute("disabled") != null;
    }

    public boolean isPercentageCheckBoxDisabled() {
        return chxPercentage.getAttribute("disabled") != null;
    }

    public void addNewPanel(String displayName, String series) {
        txtDisplayName.waitForVisibility();
        txtDisplayName.enter(displayName);
        cmbSeries.select(series);
        btnOk.click();
    }

    public void addPanelConfiguration(String height) {
        txtHeight.waitForVisibility();
        txtHeight.enter(height);
        btnOkOfPanelConfiguration.click();
    }

    public boolean isNewPanelNameDisplayed() {
        return btnNewPanelName.isVisible();
    }
}
