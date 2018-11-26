package com.tws.refactoring.extract_variable;

public class BannerRender {
    private boolean isRendered = false;
    void renderBanner(String platform, String browser) {
        if ((platform.toUpperCase().contains("MAC")) &&
                (browser.toUpperCase().indexOf("IE") > -1)) {
            // do something
            isRendered = true;
        }
    }

    boolean IsRendered(){
        return this.isRendered;
    }
}
