package com.rockerjman222.informationOverlay.handler;

import com.rockerjman222.informationOverlay.referance.Referance;
import net.minecraftforge.common.config.ConfigCategory;
import net.minecraftforge.common.config.ConfigElement;
import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.fml.client.config.IConfigElement;
import net.minecraftforge.fml.client.event.ConfigChangedEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class ConfigurationHandler {

    public static Configuration config;

    public static List<IConfigElement> list;

    public static void init(File configFile){
        if(config == null)
            config = new Configuration(configFile);
    }

    @SubscribeEvent
    public void onConfigChangedEvent(ConfigChangedEvent event){
        if(event.modID.equalsIgnoreCase(Referance.MOD_ID)){
            //Re-Sync Config
        }
    }

    public void loadConfig(){
        boolean x = config.getBoolean("Display X", Configuration.CATEGORY_GENERAL, true, "Display x on the screen");

        if(config.hasChanged())
            config.save();
    }
}
