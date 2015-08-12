package com.rockerjman222.informationOverlay.handler;

import net.minecraftforge.client.event.RenderGameOverlayEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class RenderHandler {

    public static RenderHandler instance = new RenderHandler();

    @SubscribeEvent
    public void onRenderGameOverlay(RenderGameOverlayEvent event){
        if(event.type == RenderGameOverlayEvent.ElementType.TEXT)
            Draw.renderToHud();
    }
}
