package com.jamiejquinn.agrestic;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Agrestic implements ModInitializer {
  public static final Logger LOGGER = LogManager.getLogger(Constants.MODID);

  public static final ItemGroup AGRESTIC_GROUP = FabricItemGroupBuilder.create(
          new Identifier(Constants.MODID, "general"))
          .icon(() -> new ItemStack(Items.BOWL))
          .appendItems(stacks -> {
            stacks.add(new ItemStack(Agrestic.EXAMPLE_ITEM));
          })
          .build();

  public static final ExampleItem EXAMPLE_ITEM = new ExampleItem(new FabricItemSettings().group(AGRESTIC_GROUP));

  @Override
  public void onInitialize() {
    Registry.register(Registry.ITEM, new Identifier(Constants.MODID, "example_item"), EXAMPLE_ITEM);
  }
}
