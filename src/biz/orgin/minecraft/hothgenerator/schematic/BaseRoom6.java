package biz.orgin.minecraft.hothgenerator.schematic;

import biz.orgin.minecraft.hothgenerator.HothUtils;

public class BaseRoom6 implements Schematic
{
	private static final long serialVersionUID = -4144867369080137408L;
	public static Schematic instance = new BaseRoom6();
	private static int WIDTH = 7;
	private static int LENGTH = 10;
	private static int HEIGHT = 5;
	private static String name = "BaseRoom6";
	
	private final int[][][] matrix = new int[][][]
	{
		    //   TYPEID                       DATAID
		{   // Layer 0
			{  4,  4,  4,  4,  4,  4,  4,   0, 0, 0, 0 ,0 ,0 ,0},
			{  4, 43, 43, 43, 43, 43,  4,   0, 0, 0, 0 ,0 ,0 ,0},
			{  4, 43, 43, 43, 43, 43,  4,   0, 0, 0, 0 ,0 ,0 ,0},
			{  4, 43, 43, 43, 43, 43,  4,   0, 0, 0, 0 ,0 ,0 ,0},
			{  4, 43, 43, 43, 43, 43,  4,   0, 0, 0, 0 ,0 ,0 ,0},
			{  4, 43, 43, 43, 43, 43,  4,   0, 0, 0, 0 ,0 ,0 ,0},
			{  4,  4,  4, 43,  4,  4,  4,   0, 0, 0, 0 ,0 ,0 ,0},
			{ -1, -1,  4, 43,  4, -1, -1,   0, 0, 0, 0 ,0 ,0 ,0},
			{ -1, -1,  4, 43,  4, -1, -1,   0, 0, 0, 0 ,0 ,0 ,0},
			{ -1, -1, -1, -1, -1, -1, -1,   0, 0, 0, 0 ,0 ,0 ,0},
		},
		{   // Layer 1
			{  4,  4,  4,  4,  4,  4,  4,   0, 0, 0, 0 ,0 ,0 ,0},
			{  4,  0,  0,  0,  4,  4,  4,   0, 0, 0, 0 ,0 ,0 ,0},
			{  4,  0,  0,  0,  4,  4,  4,   0, 0, 0, 0 ,0 ,0 ,0},
			{  4,  0,  0,  0,  4,  4,  4,   0, 0, 0, 0 ,0 ,0 ,0},
			{  4,  4,  4,  4,  4,  4,  4,   0, 0, 0, 0 ,0 ,0 ,0},
			{  4,  4,  4,  4,  4,  4,  4,   0, 0, 0, 0 ,0 ,0 ,0},
			{  4,  4,  4,  4,  4,  4,  4,   0, 0, 0, 0 ,0 ,0 ,0},
			{ -1, -1,  4,  4,  4, -1, -1,   0, 0, 0, 0 ,0 ,0 ,0},
			{ -1, -1,  4,  4,  4, -1, -1,   0, 0, 0, 0 ,0 ,0 ,0},
			{ -1, -1, -1, -1, -1, -1, -1,   0, 0, 0, 0 ,0 ,0 ,0},
		},
		{   // Layer 2
			{  4,  4,  4,  4,  4,  4,  4,   0, 0, 0, 0 ,0 ,0 ,0},
			{  4,  0,  0,  0,  0,  0,  4,   0, 0, 0, 0 ,0 ,0 ,0},
			{  4, 54,  0, 50,  4,  0,  4,   0, 5, 0, 2 ,0 ,0 ,0},
			{  4,  0,  0,  0,  4,  0,  4,   0, 0, 0, 0 ,0 ,0 ,0},
			{  4,  4,  4,  4,  4,  0,  4,   0, 0, 0, 0 ,0 ,0 ,0},
			{  4,  4, 50,  0,  0,  0,  4,   0, 0, 5, 0 ,0 ,0 ,0},
			{  4,  4,  4,  0,  4, 50,  4,   0, 0, 0, 0 ,0 ,5 ,0},
			{ -1, -1,  4,  0,  4,  4, -1,   0, 0, 0, 0 ,0 ,0 ,0},
			{ -1, -1,  4,  0,  4, -1, -1,   0, 0, 0, 0 ,0 ,0 ,0},
			{ -1, -1, -1,  0, -1, -1, -1,   0, 0, 0, 0 ,0 ,0 ,0},
		},
		{   // Layer 3
			{  4,  4,  4,  4,  4,  4,  4,   0, 0, 0, 0 ,0 ,0 ,0},
			{  4,  0,  0,  0,  0,  0,  4,   0, 0, 0, 0 ,0 ,0 ,0},
			{  4,  5,  0,  0,  4,  0,  4,   0, 0, 0, 0 ,0 ,0 ,0},
			{  4,  0,  0,  0,  4,  0,  4,   0, 0, 0, 0 ,0 ,0 ,0},
			{  4,  4,  4,  4,  4,  0,  4,   0, 0, 0, 0 ,0 ,0 ,0},
			{  4,  4,  4,  0,  0,  0,  4,   0, 0, 0, 0 ,0 ,0 ,0},
			{  4,  4,  4,  0,  4,  4,  4,   0, 0, 0, 0 ,0 ,0 ,0},
			{ -1, -1,  4,  0,  4, -1, -1,   0, 0, 0, 0 ,0 ,0 ,0},
			{ -1, -1,  4,  0,  4, -1, -1,   0, 0, 0, 0 ,0 ,0 ,0},
			{ -1, -1, -1,  0, -1, -1, -1,   0, 0, 0, 0 ,0 ,0 ,0},
		},
		{   // Layer 4
			{  4,  4,  4,  4,  4,  4,  4,   0, 0, 0, 0 ,0 ,0 ,0},
			{  4, 43, 43, 43, 43, 43,  4,   0, 0, 0, 0 ,0 ,0 ,0},
			{  4, 43, 43, 43, 43, 43,  4,   0, 0, 0, 0 ,0 ,0 ,0},
			{  4, 43, 43, 43, 43, 43,  4,   0, 0, 0, 0 ,0 ,0 ,0},
			{  4, 43, 43, 43, 43, 43,  4,   0, 0, 0, 0 ,0 ,0 ,0},
			{  4, 43, 43, 43, 43, 43,  4,   0, 0, 0, 0 ,0 ,0 ,0},
			{  4,  4,  4, 43,  4,  4,  4,   0, 0, 0, 0 ,0 ,0 ,0},
			{ -1, -1,  4, 43,  4, -1, -1,   0, 0, 0, 0 ,0 ,0 ,0},
			{ -1, -1,  4, 43,  4, -1, -1,   0, 0, 0, 0 ,0 ,0 ,0},
			{ -1, -1, -1, 43, -1, -1, -1,   0, 0, 0, 0 ,0 ,0 ,0},
		}
	};
	
	private BaseRoom6()
	{
	}
	
	public int getWidth() // Inner
	{
		return BaseRoom6.WIDTH;
	}
	public int getLength() // Middle
	{
		return BaseRoom6.LENGTH;
	}
	public int getHeight() // Outer
	{
		return BaseRoom6.HEIGHT;
	}
	
	public int[][][] getMatrix()
	{
		return this.matrix;
	}

	@Override
	public String getName()
	{
		return BaseRoom6.name;
	}
	
	public Schematic rotate(int direction)
	{
		return HothUtils.rotateSchematic(direction, this);
	}
}