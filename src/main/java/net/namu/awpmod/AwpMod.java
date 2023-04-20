package net.namu.awpmod;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.BowItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class AwpMod implements ModInitializer {
    private static final Item AWP = new BowItem(new FabricItemSettings().maxDamage(250));
    private static final Item AWP_AMMO = new Item(new FabricItemSettings().maxCount(25));

    @Override
    public void onInitialize() {
        Registry.register(Registries.ITEM, new Identifier("awpmod", "awp"), AWP);
        Registry.register(Registries.ITEM, new Identifier("awpmod", "awp_ammo"), AWP_AMMO);
    }
}
