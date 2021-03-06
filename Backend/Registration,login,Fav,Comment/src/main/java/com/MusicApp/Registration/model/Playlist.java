package com.MusicApp.Registration.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "playlist")
public class Playlist {

	@Id
	private String id;

	private String name;
	private String type;
	private String description;

	public Playlist() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Playlist(String id, String name, String type, String description) {
		super();
		this.id = id;
		this.name = name;
		this.type = type;
		this.description = description;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return "Playlist [id=" + id + ", name=" + name + ", type=" + type + ", description=" + description + "]";
	}

}
