package cn.nukkit.level.generator.standard.registry;

import lombok.experimental.UtilityClass;
import net.daporkchop.lib.common.ref.Ref;

/**
 * Registries for looking up the various different resources required for parsing the config for the NukkitX standard generator.
 *
 * @author DaPorkchop_
 */
@UtilityClass
public class StandardGeneratorRegistries {
    private final Ref<BiomeMapRegistry>       BIOME_MAP_REGISTRY_CACHE       = Ref.late(BiomeMapRegistry::new);
    private final Ref<BlockReplacerRegistry>  BLOCK_REPLACER_REGISTRY_CACHE  = Ref.late(BlockReplacerRegistry::new);
    private final Ref<DecoratorRegistry>      DECORATOR_REGISTRY_CACHE       = Ref.late(DecoratorRegistry::new);
    private final Ref<DensitySourceRegistry>  DENSITY_SOURCE_REGISTRY_CACHE  = Ref.late(DensitySourceRegistry::new);
    private final Ref<NoiseGeneratorRegistry> NOISE_GENERATOR_REGISTRY_CACHE = Ref.late(NoiseGeneratorRegistry::new);
    private final Ref<PopulatorRegistry>      POPULATOR_REGISTRY_CACHE       = Ref.late(PopulatorRegistry::new);

    public BiomeMapRegistry biomeMap() {
        return BIOME_MAP_REGISTRY_CACHE.get();
    }

    public BlockReplacerRegistry blockReplacer() {
        return BLOCK_REPLACER_REGISTRY_CACHE.get();
    }

    public DecoratorRegistry decorator() {
        return DECORATOR_REGISTRY_CACHE.get();
    }

    public DensitySourceRegistry densitySource() {
        return DENSITY_SOURCE_REGISTRY_CACHE.get();
    }

    public NoiseGeneratorRegistry noiseGenerator() {
        return NOISE_GENERATOR_REGISTRY_CACHE.get();
    }

    public PopulatorRegistry populator() {
        return POPULATOR_REGISTRY_CACHE.get();
    }
}
