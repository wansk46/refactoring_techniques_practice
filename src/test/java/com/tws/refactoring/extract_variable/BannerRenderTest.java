package com.tws.refactoring.extract_variable;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

public class BannerRenderTest {

    @Test
    public void should_not_rendered(){
        BannerRender bannerRender = new BannerRender();
        String platform = "this is platform";
        String browser = "this is browser";

        bannerRender.renderBanner(platform, browser);
        assertFalse(bannerRender.IsRendered());
    }

    @Test
    public void should_rendered(){
        BannerRender bannerRender = new BannerRender();
        String platform = "this is mac";
        String browser = "this is ie";

        bannerRender.renderBanner(platform, browser);
        assertTrue(bannerRender.IsRendered());
    }

}