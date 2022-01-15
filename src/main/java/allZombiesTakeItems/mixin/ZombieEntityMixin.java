package allZombiesTakeItems.mixin;

import net.minecraft.entity.mob.ZombieEntity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.ModifyArg;

@Mixin(ZombieEntity.class)
public class ZombieEntityMixin {
    @ModifyArg(method= "initialize(Lnet/minecraft/world/ServerWorldAccess;Lnet/minecraft/world/LocalDifficulty;Lnet/minecraft/entity/SpawnReason;Lnet/minecraft/entity/EntityData;Lnet/minecraft/nbt/NbtCompound;)Lnet/minecraft/entity/EntityData;", at = @At(value = "INVOKE", target = "Lnet/minecraft/entity/mob/ZombieEntity;setCanPickUpLoot(Z)V"), index=0)
    private boolean makeAllZombiesTakeItems(boolean par1){
        return true;
    }
}
