package com.tws.refactoring.extract_variable;

import org.junit.Test;

import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

public class BannerRenderTest {

    @Test
    public void should_not_rendered(){
        BannerRender bannerRender = new BannerRender();
        String platform = "this is platform";
        String browser = "this is browser";

        bannerRender.renderBannerForPlatformMACandBrowserIE(platform, browser);
        assertFalse(bannerRender.IsRendered());
    }

    @Test
    public void should_rendered(){
        BannerRender bannerRender = new BannerRender();
        String platform = "this is mac";
        String browser = "this is ie";

        bannerRender.renderBannerForPlatformMACandBrowserIE(platform, browser);
        assertTrue(bannerRender.IsRendered());
    }

}