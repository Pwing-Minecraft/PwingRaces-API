package net.pwing.races.api.race;

import org.bukkit.inventory.ItemStack;

public class RaceItemDefinition {
    private ItemStack itemStack;
    private boolean giveToPlayer;

    public RaceItemDefinition(ItemStack itemStack, boolean giveToPlayer) {
        this.itemStack = itemStack;
        this.giveToPlayer = giveToPlayer;
    }

    public ItemStack itemStack() {
        return itemStack;
    }

    public boolean giveToPlayer() {
        return giveToPlayer;
    }

    public void itemStack(ItemStack itemStack) {
        this.itemStack = itemStack;
    }

    public void giveToPlayer(boolean giveToPlayer) {
        this.giveToPlayer = giveToPlayer;
    }
}
