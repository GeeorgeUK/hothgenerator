package biz.orgin.minecraft.hothgenerator;

import java.util.Random;

import org.bukkit.World;

import biz.orgin.minecraft.hothgenerator.schematic.GreenGarden;
import biz.orgin.minecraft.hothgenerator.schematic.GreyGarden;
import biz.orgin.minecraft.hothgenerator.schematic.Schematic;

// @ToDo: replace this with schematics

/**
 * A generator that places underground gardens into the world.
 * @author orgin
 *
 */
public class GardenGenerator
{
	
	public static void generateGarden(HothGeneratorPlugin plugin, World world, Random random, int chunkX, int chunkZ)
	{
		int rarity = plugin.getStructureGardensRarity();
		
		if(rarity!=0)
		{
			int place = random.nextInt(50*rarity);
		
			if(place==37)
			{
				//Bukkit.getServer().getScheduler().scheduleSyncDelayedTask(plugin, new PlaceGarden(plugin, world, random, chunkX, chunkZ));
				plugin.addTask(new PlaceGarden(plugin, world, random, chunkX, chunkZ));
			}	
		}
	}

	static class PlaceGarden implements HothRunnable
	{
		private final HothGeneratorPlugin plugin;
		private final World world;
		private final Random random;
		private final int chunkx;
		private final int chunkz;

		public PlaceGarden(HothGeneratorPlugin plugin, World world, Random random, int chunkx, int chunkz)
		{
			this.plugin = plugin;
			this.world = world;
			this.random = random;
			this.chunkx = chunkx;
			this.chunkz = chunkz;
		}

		public String getName() {
			return "PlaceGarden";
		}

		public String getParameterString() {
			return "chunkx=" + chunkx + " chunkz=" + chunkz;
		}


		@Override
		public void run()
		{
			int surfaceOffset = this.plugin.getWorldSurfaceoffset();

			int x = random.nextInt(16) + this.chunkx * 16;
			int z = random.nextInt(16) + this.chunkz * 16;
			int y = 9 + random.nextInt(15 + surfaceOffset);
			
			Schematic garden;
			switch(random.nextInt(4))
			{
			case 0:
				garden = GreyGarden.instance; // Mushroom garden
				break;
			case 1:
			case 2:
			case 3:
			default:
				garden = GreenGarden.instance; // Green garden
				break;
			}
			
			HothUtils.placeSchematic(plugin, world, garden, x, y, z, 2, 10);

			this.plugin.logMessage("Placing garden at " + x + "," + y + "," + z, true);
		}

	}

}
