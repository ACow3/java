package com.projectclass.project;

public class ProjectTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ProjectClass a = new ProjectClass("", "");
		ProjectClass b = new ProjectClass("", "");
		
		
		a.setName("first");
		a.getName();
		
		b.setName("second");
		b.getName();
		
		a.setDescription("monkey-making project");
		a.getDescription();
		
		b.setDescription("passion project");
		b.getDescription();
		
		
		System.out.println(a.getName());
		System.out.println(a.getDescription());
		
		System.out.println(b.getName());
		System.out.println(b.getDescription());
	
	}

}