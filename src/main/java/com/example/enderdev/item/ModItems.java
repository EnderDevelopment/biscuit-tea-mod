package com.example.enderdev.item;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ModItems {
    public static Item COOKIE;
    public static Item GINGERBREAD;
    public static Item TEA;

    public static void init() {
        COOKIE = new ItemFood(2, 0.3F, false).setRegistryName("cookie").setUnlocalizedName("cookie");
        GINGERBREAD = new ItemFood(4, 0.5F, false).setRegistryName("gingerbread").setUnlocalizedName("gingerbread");
        TEA = new ItemFood(1, 0.1F, false).setRegistryName("tea").setUnlocalizedName("tea");

        GameRegistry.register(COOKIE);
        GameRegistry.register(GINGERBREAD);
        GameRegistry.register(TEA);
    }

    @SideOnly(Side.CLIENT)
    public static void initModels() {
        ModelLoader.setCustomModelResourceLocation(COOKIE, 0, new ModelResourceLocation(COOKIE.getRegistryName(), "inventory"));
        ModelLoader.setCustomModelResourceLocation(GINGERBREAD, 0, new ModelResourceLocation(GINGERBREAD.getRegistryName(), "inventory"));
        ModelLoader.setCustomModelResourceLocation(TEA, 0, new ModelResourceLocation(TEA.getRegistryName(), "inventory"));
    }
}