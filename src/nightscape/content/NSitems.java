package nightscape.content;

import arc.graphics.Color;
import mindustry.type.Item;

public class NSitems {
    public static Item
    tantalum, naturit, velonium, zirconium, streby, dense, cyanid, vanadium;

    public static void load() {
        tantalum = new Item("tantalum", Color.valueOf("7f9da9")){{
            cost = 1f;
            hardness = 2;
        }};

        naturit = new Item("naturit", Color.valueOf("eecd74")){{
            cost = 1f;
            flammability = 0.4f;
        }};

        zirconium = new Item("zirconium", Color.valueOf("9091a8")){{
            cost = 1f;
            hardness = 2;
        }};

        velonium = new Item("velonium", Color.valueOf("abced3")){{
            cost = 2f;
        }};

        streby = new Item("streby", Color.valueOf("bbd3c1")){{
            cost = 2f;
            charge = 1.3f;
        }};

        dense = new Item("dense", Color.valueOf("ba8cc8")){{
            cost = 3f;
        }};

        cyanid = new Item("cyanid", Color.valueOf("8deebb")){{
            cost = 2f;
        }};

        vanadium = new Item("vanadium", Color.valueOf("f8f7c7")){{
            cost = 2f;
        }};
    }
}
