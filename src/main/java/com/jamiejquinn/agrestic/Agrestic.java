package com.jamiejquinn.agrestic;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Agrestic implements ModInitializer {
  public static final Logger LOGGER = LogManager.getLogger(Constants.MODID);

  public static final ExampleItem EXAMPLE_ITEM = new ExampleItem(new FabricItemSettings().group(ItemGroup.MISC));

  

  @Override
  public void onInitialize() {
    Registry.register(Registry.ITEM, new Identifier(Constants.MODID, "example_item"), EXAMPLE_ITEM);
  }
}
