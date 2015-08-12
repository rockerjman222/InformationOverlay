package com.rockerjman222.informationOverlay.handler;

import com.rockerjman222.informationOverlay.referance.Referance;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.FontRenderer;
import net.minecraft.client.gui.ScaledResolution;

import java.awt.*;
import java.text.DecimalFormat;

public class Draw {

    private static Minecraft mc = Minecraft.getMinecraft();

    public static void renderToHud(){
        if(mc.inGameHasFocus){
            ScaledResolution res = new ScaledResolution(mc, mc.displayWidth, mc.displayHeight);
            FontRenderer fr = mc.fontRendererObj;
            int width = res.getScaledWidth();
            int height = res.getScaledHeight();
            Color color = new Color(ConfigurationHandler.red, ConfigurationHandler.green, ConfigurationHandler.blue);

            String xPos = "X: " + mc.thePlayer.getPosition().getX();
            String yPos = "Y: " + mc.thePlayer.getPosition().getY();
            String zPos = "Z: " + mc.thePlayer.getPosition().getZ();
            String fps = "Fps: " + Minecraft.getDebugFPS();
            String pitch = "Pitch: " + new DecimalFormat("##.###").format(mc.thePlayer.rotationPitch);
            String yaw = "Yaw: " + new DecimalFormat("##.###").format(mc.thePlayer.rotationYaw);

            if(ConfigurationHandler.shouldDisplayX){
                fr.drawStringWithShadow(xPos, 5, 5, color.getRGB());
            }
            if(ConfigurationHandler.shouldDisplayY) {
                fr.drawStringWithShadow(yPos, 5, 15, color.getRGB());
            }
            if(ConfigurationHandler.shouldDisplayZ) {
                fr.drawStringWithShadow(zPos, 5, 25, color.getRGB());
            }
            if(ConfigurationHandler.shouldDisplayFPS) {
                fr.drawStringWithShadow(fps, 5, 35, color.getRGB());
            }
            if(ConfigurationHandler.shouldDisplayPitch) {
                fr.drawStringWithShadow(pitch, 5, 45, color.getRGB());
            }
            if(ConfigurationHandler.shouldDisplayYaw) {
                fr.drawStringWithShadow(yaw, 5, 55, color.getRGB());
            }
        }
    }
}
