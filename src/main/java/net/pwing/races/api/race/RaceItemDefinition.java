package net.pwing.races.api.race;

import org.bukkit.inventory.ItemStack;

public record RaceItemDefinition(
        ItemStack itemStack,
        boolean giveToPlayer
) {
}
