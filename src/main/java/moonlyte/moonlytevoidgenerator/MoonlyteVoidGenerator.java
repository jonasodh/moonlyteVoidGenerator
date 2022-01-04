package moonlyte.moonlytevoidgenerator;
import moonlyte.moonlytevoidgenerator.classes.voidGenerator;
import org.bukkit.event.Listener;
import org.bukkit.generator.ChunkGenerator;
import org.bukkit.plugin.java.JavaPlugin;

public final class MoonlyteVoidGenerator extends JavaPlugin implements Listener {
    @Override
    public void onEnable() {
        System.out.println("Let go your earthly tether. Enter void, empty, and become wind.");
    }

    @Override
    public ChunkGenerator getDefaultWorldGenerator(String worldName, String id) {
        return new voidGenerator();
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
