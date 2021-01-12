package com.durlabh.services;

import java.io.InputStream;

import com.durlabh.document.Model;

public interface CsvService {
	Model store(InputStream file);

}
