package com.jamiejquinn.agrestic;

import net.fabricmc.api.ModInitializer;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Agrestic implements ModInitializer {
  public static final Logger LOGGER = LogManager.getLogger(Constants.MODID);

  @Override
  public void onInitialize() {
    LOGGER.info("Hello Fabric world!");
  }
}
