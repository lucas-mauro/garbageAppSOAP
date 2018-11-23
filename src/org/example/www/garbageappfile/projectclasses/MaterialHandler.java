package org.example.www.garbageappfile.projectclasses;

import java.util.ArrayList;

import org.example.www.garbageappfile.Material;

public class MaterialHandler {
	private static MaterialHandler object;
	private ArrayList<Material> materials = new ArrayList<Material>();
	
	public static MaterialHandler getInstance() {
		if (object != null) {
			return object;
		}
		return object = new MaterialHandler();
	}

	public MaterialHandler() {
		super();
		Material material = new Material();
		material.setId(1);
		material.setName("bottle");
		material.setWeight(0.5f);
		materials.add(material);
		material.setId(2);
		material.setName("tetra");
		material.setWeight(0.2f);
		materials.add(material);
		material.setId(3);
		material.setName("cans");
		material.setWeight(0.1f);
		materials.add(material);
	}

	public ArrayList<Material> getMaterials() {
		return this.materials;
	}

	public void setMaterials(ArrayList<Material> materials) {
		this.materials = materials;
	}

	public Material getMaterial(int id) {
		for(int i=0; i<materials.size() ;i++)
			if(materials.get(i).getId() == id)
				return materials.get(i);
		return null;
	}

	public void addMaterial(Material material) {
		materials.add(material);
	};
	
	
	
	
}
