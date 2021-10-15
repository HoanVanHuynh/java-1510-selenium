package page_objects;

import com.logigear.control.common.imp.Label;

public class DashboardPage {
    private final Label lblWelcome = new Label("css=a[href='#Welcome']");

    public boolean doesWelcomeLabelDisplay() {
        return lblWelcome.isVisible();
    }
}
