package wire;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import org.apache.logging.log4j.Logger;

@Mod(
		modid = "wire", 
		name = "Wire", 
		version = "2018.1.01"
		)
public class Wire
{
	private static Logger logger;
	
    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        logger = event.getModLog();
    }
    
    @EventHandler
    public void init(FMLInitializationEvent event)
    {
    	logger.info("Hello World!");
    }
}