package tconstruct.blocks.logic;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.world.World;
import net.minecraftforge.common.ForgeDirection;
import tconstruct.library.blocks.AdaptiveInventoryLogic;

public class AdaptiveSmelteryLogic extends AdaptiveInventoryLogic
{
    byte direction;

    @Override
    public byte getRenderDirection ()
    {
        return 0;
    }

    @Override
    public ForgeDirection getForgeDirection ()
    {
        return null;
    }

    @Override
    @Deprecated
    public void setDirection (int side)
    {
        
    }

    @Override
    @Deprecated
    public void setDirection (float yaw, float pitch, EntityLivingBase player)
    {
        
    }

    @Override
    protected boolean isValidBlock (int x, int y, int z)
    {
        return false;
    }

    @Override
    public Container getGuiContainer (InventoryPlayer inventoryplayer, World world, int x, int y, int z)
    {
        return null;
    }

    @Override
    public String getDefaultName ()
    {
        return "crafters.Smeltery";
    }

}
