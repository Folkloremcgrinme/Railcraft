/*------------------------------------------------------------------------------
 Copyright (c) CovertJaguar, 2011-2017
 http://railcraft.info

 This code is the property of CovertJaguar
 and may only be used with explicit written
 permission unless otherwise specified on the
 license page at http://railcraft.info/wiki/info:license.
 -----------------------------------------------------------------------------*/
package mods.railcraft.client.gui;

import mods.railcraft.common.blocks.machine.manipulator.TileFluidManipulator;
import mods.railcraft.common.core.RailcraftConstants;
import mods.railcraft.common.gui.containers.ContainerManipulatorCartFluid;
import mods.railcraft.common.plugins.forge.LocalizationPlugin;
import net.minecraft.entity.player.InventoryPlayer;

public class GuiManipulatorCartFluid extends GuiManipulatorCart {

    private final String FILTER_LABEL = LocalizationPlugin.translate("gui.railcraft.filters");
    private final TileFluidManipulator tile;
    private final InventoryPlayer inv;

    public GuiManipulatorCartFluid(InventoryPlayer inv, TileFluidManipulator tile) {
        super(tile, new ContainerManipulatorCartFluid(inv, tile), RailcraftConstants.GUI_TEXTURE_FOLDER + "gui_manipulator_fluid.png");
        this.inv = inv;
        this.tile = tile;
    }

    @Override
    protected void drawGuiContainerForegroundLayer(int mouseX, int mouseY) {
        super.drawGuiContainerForegroundLayer(mouseX, mouseY);
//        fontRenderer.drawString(FILTER_LABEL, 62, 25, 0x404040);
        fontRenderer.drawString(inv.getDisplayName().getUnformattedText(), 8, ySize - 96 + 2, 4210752);
    }
}
