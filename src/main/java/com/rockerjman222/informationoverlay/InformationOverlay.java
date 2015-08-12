package com.rockerjman222.informationOverlay;

import com.rockerjman222.informationOverlay.handler.ConfigurationHandler;
import com.rockerjman222.informationOverlay.proxy.IProxy;
import com.rockerjman222.informationOverlay.referance.Referance;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Referance.MOD_ID, name = Referance.MOD_NAME, version = Referance.VERSION, guiFactory = Referance.GUIFACTORY)
public class InformationOverlay {

    @Mod.Instance(Referance.MOD_ID)
    public static InformationOverlay instance;

    @SidedProxy(clientSide = Referance.CLIENT_PROXY, serverSide = Referance.SERVER_PROXY)
    public static IProxy proxy;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event){
        ConfigurationHandler.init(event.getSuggestedConfigurationFile());
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event){

    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event){

    }
}
