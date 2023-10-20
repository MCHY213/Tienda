package com.tienda.service;

import org.springframework.web.multipart.MultipartFile;

public interface FirebaseStorageService {

    public String cargaImagen(MultipartFile archivoLocalCliente, String carpeta, Long id); 

    //El BuketName es el <id_del_proyecto> + ".appspot.com"
    final String BucketName = "techshop-ace65.appspot.com";

    //Esta es la ruta bÃ¡sica de este proyecto Techshop
    final String rutaSuperiorStorage = "techshop";

    //UbicaciÃ³n donde se encuentra el archivo de configuraciÃ³n Json
    final String rutaJsonFile = "firebase";
    
    //El nombre del archivo Json
    final String archivoJsonFile = "techshop-ace65-firebase-adminsdk-wu8fh-59f0c23a47.json";
}
