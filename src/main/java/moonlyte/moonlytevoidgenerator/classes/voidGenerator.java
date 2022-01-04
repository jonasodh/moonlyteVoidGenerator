package moonlyte.moonlytevoidgenerator.classes;
import org.bukkit.generator.ChunkGenerator;

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
}
