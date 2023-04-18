package net.namu.awpmod;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;

import java.util.ArrayList;
import java.util.List;

public class ItemModel {
    private static final Item awp = new Item(new FabricItemSettings());
    private static final Item awpAmmo = new Item(new FabricItemSettings());

    public static ArrayList<Item> gatherModItems() {
        return new ArrayList<Item>(List.of(awp, awpAmmo));
    }
}
