/*------------------------------------------------------------------------------
 Copyright (c) CovertJaguar, 2011-2018
 http://railcraft.info

 This code is the property of CovertJaguar
 and may only be used with explicit written
 permission unless otherwise specified on the
 license page at http://railcraft.info/wiki/info:license.
 -----------------------------------------------------------------------------*/

package mods.railcraft.common.blocks.charge;

import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

/**
 * Created by CovertJaguar on 10/19/2018 for Railcraft.
 *
 * @author CovertJaguar <http://www.railcraft.info>
 */
public interface IChargeNetwork {

    /**
     * Queues the node to be added to the network.
     *
     * If you pass a null chargeDef, nothing will happen.
     *
     * @return return true if the network changed.
     */
    default boolean addNode(IBlockState state, World world, BlockPos pos) {
        return false;
    }

    /**
     * Queues the node to be removed to the network
     */
    default void removeNode(BlockPos pos) {
    }

    /**
     * Get the grid for the position.
     *
     * @return A grid, may be a dummy object if there is no valid grid at the location.
     */
    default ChargeNetwork.ChargeGraph grid(BlockPos pos) {
        // TODO: Add dummy object
        return null;
    }

    /**
     * Get a grid access point for the position.
     *
     * @return A grid access point, may be a dummy object if there is no valid grid at the location.
     */
    default ChargeNetwork.ChargeNode access(BlockPos pos) {
        // TODO: Add dummy object
        return null;
    }

    /**
     * Apply Charge damage to the target entity from the current network.
     */
    default void zap(BlockPos pos, Entity entity, DamageOrigin origin, float damage) {
    }

    enum DamageOrigin {
        BLOCK, TRACK
    }
}
