package io.github.vikeshpandey.bulkdata;

public class Spell 
{
	public String name;
    public SpellType type;
    public String description;
    
    public enum SpellType {SPELL, CHARM, CURSE}
    
    public Spell(String spellName, SpellType spellType, String spellDescription)
    {
    	name = spellName;
    	type = spellType;
    	description = spellDescription;
    }

	public String toString()
	{
		return name;
	}
}
