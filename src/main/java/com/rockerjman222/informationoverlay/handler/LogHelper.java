package com.rockerjman222.informationOverlay.handler;

import com.rockerjman222.informationOverlay.referance.Referance;
import net.minecraftforge.fml.common.FMLLog;
import org.apache.logging.log4j.Level;

public class LogHelper {

    private static void log(Level logLevel, Object o){
        FMLLog.log(Referance.MOD_NAME, logLevel, String.valueOf(o));
    }

    public static void all(Object o){
        log(Level.ALL, o);
    }

    public static void debug(Object o){
        log(Level.DEBUG, o);
    }

    public static void error(Object o){
        log(Level.ERROR, o);
    }

    public static void fatal(Object o){
        log(Level.FATAL, o);
    }

    public static void info(Object o){
        log(Level.INFO, o);
    }

    public static void off(Object o){
        log(Level.OFF, o);
    }

    public static void trace(Object o){
        log(Level.TRACE, o);
    }

    public static void warn(Object o){
        log(Level.WARN, o);
    }
}
