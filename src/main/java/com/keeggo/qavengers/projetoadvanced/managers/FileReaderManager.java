package com.keeggo.qavengers.projetoadvanced.managers;

import com.keeggo.qavengers.projetoadvanced.dataProvider.ConfigFileReader;
import com.keeggo.qavengers.projetoadvanced.dataProvider.JsonDataReader;

public class FileReaderManager {

	private static FileReaderManager FileManager = new FileReaderManager();
	private static ConfigFileReader ConfigReader;
	private static JsonDataReader JsonReader;

	private FileReaderManager() {
	}

	public static FileReaderManager getInstance() {
		return FileManager;
	}

	public ConfigFileReader getConfigReader() {
		return (ConfigReader == null) ? new ConfigFileReader() : ConfigReader;
	}

	public JsonDataReader getJsonReader() {
		return (JsonReader == null) ? new JsonDataReader() : JsonReader;
	}
}
