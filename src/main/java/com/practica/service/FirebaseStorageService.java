package com.practica.service;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

@Service
public interface FirebaseStorageService {

    public String cargaImagen(MultipartFile archivoLocalCliente, String carpeta, Long id);

    final String BucketName = "practica-785cb.appspot.com";

    final String rutaSuperiorStorage = "practica";

    final String rutaJsonFile = "firebase";
    
    final String archivoJsonFile = "practica-785cb-firebase-adminsdk-zogs5-76fc918982.json";
}
