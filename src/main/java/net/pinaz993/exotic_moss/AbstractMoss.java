package net.pinaz993.exotic_moss;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Fertilizable;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

import java.util.Random;

public abstract class AbstractMoss extends Block implements Fertilizable {
    public AbstractMoss(Settings settings) {
        super(settings);
    }

    @Override
    public boolean canGrow(World world, Random random, BlockPos pos, BlockState state) {return true;}
}
