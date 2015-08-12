package com.rockerjman222.informationOverlay.handler;

import com.rockerjman222.informationOverlay.referance.Referance;
import net.minecraftforge.common.config.ConfigCategory;
import net.minecraftforge.common.config.ConfigElement;
import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.fml.client.config.IConfigElement;
import net.minecraftforge.fml.client.event.ConfigChangedEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

import java.io.File;
import java.util.List;

public class ConfigurationHandler {

    public static boolean shouldDisplayX = false;
    public static boolean shouldDisplayY = false;
    public static boolean shouldDisplayZ = false;
    public static boolean shouldDisplayFPS = false;
    public static boolean shouldDisplayPitch = false;
    public static boolean shouldDisplayYaw = false;
    public static int red = 255;
    public static int green = 255;
    public static int blue = 255;

    public static Configuration config;

    public static List<IConfigElement> list;

    public static void init(File configFile){
        if(config == null) {
            config = new Configuration(configFile);
            loadConfig();
        }
    }

    @SubscribeEvent
    public void onConfigChangedEvent(ConfigChangedEvent event){
        if(event.modID.equalsIgnoreCase(Referance.MOD_ID)){
            loadConfig();
        }
    }

    public static void loadConfig(){
        shouldDisplayX = config.getBoolean("Display X", Configuration.CATEGORY_GENERAL, true, "Display x on the screen");
        shouldDisplayY = config.getBoolean("Display Y", Configuration.CATEGORY_GENERAL, true, "Display y on the screen");
        shouldDisplayZ = config.getBoolean("Display Z", Configuration.CATEGORY_GENERAL, true, "Display Z on the screen");
        shouldDisplayFPS = config.getBoolean("Display Fps", Configuration.CATEGORY_GENERAL, true, "Display fps on the screen");
        shouldDisplayPitch = config.getBoolean("Display pitch", Configuration.CATEGORY_GENERAL, false, "Display pitch on the screen");
        shouldDisplayYaw = config.getBoolean("Display Yaw", Configuration.CATEGORY_GENERAL, false, "Display yaw on the screen");
        red = config.getInt("Red", Configuration.CATEGORY_GENERAL, 255, 0, 255, "The red colour for the text");
        green = config.getInt("Green", Configuration.CATEGORY_GENERAL, 255, 0, 255, "The green colour for the text");
        blue = config.getInt("Blue", Configuration.CATEGORY_GENERAL, 255, 0, 255, "The blue colour for the text");


        if(config.hasChanged())
            config.save();
    }
}
