package com.tws.refactoring.extract_variable;

public class BannerRender {
    private boolean isRendered = false;
    void renderBannerForPlatformMACandBrowserIE(String platform, String browser) {
        if ((platform.toUpperCase().contains("MAC")) &&
                (browser.toUpperCase().contains("IE"))) {
            // do something
            isRendered = true;
        }
    }

    boolean IsRendered(){
        return this.isRendered;
    }
}
