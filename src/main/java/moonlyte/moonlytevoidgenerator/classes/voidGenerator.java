package moonlyte.moonlytevoidgenerator.classes;
import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.World;
import org.bukkit.generator.ChunkGenerator;

import java.util.Random;

public class voidGenerator extends ChunkGenerator {
    @Override
    public boolean shouldGenerateBedrock() {
        return false;
    }
    @Override
    public boolean shouldGenerateCaves() {
        return false;
    }
    @Override
    public boolean shouldGenerateDecorations() {
        return false;
    }
    @Override
    public boolean shouldGenerateNoise() {
        return false;
    }
    @Override
    public boolean shouldGenerateStructures() {
        return false;
    }
    @Override
    public boolean shouldGenerateSurface() {
        return false;
    }
    @Override
    public boolean shouldGenerateMobs() {
        return false;
    }

    @Override
    public Location getFixedSpawnLocation(World world, Random random) {
        final Location spawnLocation = new Location(world, 0.0D, 64.0D, 0.0D);
        final Location blockLocation = spawnLocation.clone().subtract(0D, 1D, 0D);
        blockLocation.getBlock().setType(Material.BEDROCK);
        return super.getFixedSpawnLocation(world, random);
    }
}
