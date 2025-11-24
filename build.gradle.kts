// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
    alias(libs.plugins.android.application) apply false
    //Implmentacion de complemento de google-service al proyecto.
    // False = No se aplica automaticamente. Solamente se usa como plugin. (Para que el proyecto conosca si existencia).
    id ("com.google.gms.google-services") version "4.4.4" apply false
}